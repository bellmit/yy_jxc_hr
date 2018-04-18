/**
 * 
 */
package nc.bs.jxc_hr.bg.orderstart.ace.rule;

import java.util.ArrayList;

import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.jxc_hr.ordersheet.OrderStartVO;
import nc.vo.bd.defdoc.DefdocVO;
import nc.vo.jxc_hr.ordersheet.OrderStartSubVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author zhangshj
 * @date 2017-2-26上午11:22:04
 * @description
 */
public class InsertGLdefdocRule implements IRule<AggOrderStartVO> {

	/*
	 * （非 Javadoc）
	 * 
	 * @see nc.impl.pubapp.pattern.rule.IRule#process(E[])
	 */
	@Override
	public void process(AggOrderStartVO[] vos) {
		if (vos == null || vos.length == 0) {
			return;
		}
		OrderStartVO vo = vos[0].getParentVO();
		if (vo == null) {
			ExceptionUtils.wrappBusinessException("获取的Aggvo为空，回写工令自定义档案失败！");
		}
		if (vo.getApprove_state() == 1) {
			//
			String group = vo.getPk_group();
			// String org=vo.getPk_org();
			String org = vo.getPk_group();// 我看他原来的组织和集团就是一样的
			String creator = vo.getCreator();
			OrderStartSubVO[] bvos = (OrderStartSubVO[]) vos[0].getChildrenVO();
			ArrayList<DefdocVO> listhvo = transferVos(bvos, creator, org, group);
			BaseDAO bd = new BaseDAO();
			try {
				bd.insertVOArrayWithPK(listhvo.toArray(new DefdocVO[listhvo
						.size()]));
			} catch (DAOException e) {
				ExceptionUtils.wrappBusinessException("回写工令自定义档案时插入数据异常！");
				e.printStackTrace();
			}

			// 回写发布日期 by 陈晓敏
			vo.setPublishdate(new UFDate());
			try {
				bd.updateVO(vo, new String[] { OrderStartVO.PUBLISHDATE });
			} catch (DAOException e) {
				ExceptionUtils.wrappBusinessException("回写工令申请发布日期更新数据异常！");
				e.printStackTrace();
			}

		}

	}

	private ArrayList<DefdocVO> transferVos(OrderStartSubVO[] bvos,
			String creator, String org, String group) {
		ArrayList<DefdocVO> list = new ArrayList<DefdocVO>();
		for (int i = 0; i < bvos.length; i++) {
			DefdocVO destvo = new DefdocVO();
			destvo.setCode(bvos[i].getOrdercode());// 工令号
			destvo.setName(bvos[i].getOrdercode());// 工令号
			destvo.setCreationtime(AppContext.getInstance().getServerTime());
			destvo.setCreator(creator);	
			destvo.setMemo(bvos[i].getNote());// 备注
//			destvo.setMnecode(bvos[i].getDef1());// def1是工令名称，设置到自定义档案的助记码中去
			destvo.setMnecode(bvos[i].getProductname());
			destvo.setPk_group(group == null ? "0001W110000000000NH6" : group);
			destvo.setPk_org(org == null ? "0001W110000000000NH6" : org);
			destvo.setPk_defdoc(bvos[i].getPk_ordersub());
			IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(
					IUAPQueryBS.class.getName());
			String sql = "select pk_defdoclist from bd_defdoclist where nvl(dr,0)=0 and name='工令号';";
			try {
				Object pk_defdoclist = ibs.executeQuery(sql,
						new ColumnProcessor());
				if (pk_defdoclist == null) {
					ExceptionUtils.wrappBusinessException("工令号参照不存在！");
				} else {
					destvo.setPk_defdoclist(pk_defdoclist.toString());// 数据库查，不能写死
				}
			} catch (BusinessException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			destvo.setPk_defdoclist("1001W1100000000001JP");// 数据库查，不能写死
			destvo.setDatatype(1);
			destvo.setEnablestate(2);
			list.add(destvo);
		}
		return list;

	}

}
