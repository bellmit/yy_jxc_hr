package nc.bs.jxc_hr.bg.orderend.ace.rule;

import java.util.ArrayList;

import nc.bs.dao.BaseDAO;
import nc.impl.pubapp.pattern.rule.IRule;

import nc.pubitf.bd.reportitem.pub.SqlUtils;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.jxc_hr.ordersheet.OrderEndSubVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author xiashsh
 * @date 2017-5-19
 * @description 工令完工单审核通过后
 */
public class AfterApproveRule implements IRule<AggOrderEndVO> {

	@Override
	public void process(AggOrderEndVO[] vos) {
		try {
			if (vos == null || vos.length == 0) {
				return;
			}
			ArrayList<String> list = new ArrayList<String>();
//			ArrayList<String> listgl = new ArrayList<String>();
			String srcbillbid = null;
			String gl = null;
			for (AggOrderEndVO vo : vos) {
				if (vo.getParentVO().getApprove_state() != 1) {// 1表示审核通过，-1表示自由态，3表示审核中
					continue;
				}
				OrderEndSubVO[] bvos = (OrderEndSubVO[]) vo.getChildrenVO();
				for (OrderEndSubVO bvo : bvos) {
					srcbillbid = bvo.getSrcbillbid();
					gl = bvo.getGl();
					if (gl == null || "".equals(gl) || "".equals(srcbillbid)
							|| srcbillbid == null) {
						throw new BusinessException("工令号或者来源单据表体ID为空！审核失败！");
					}
					list.add(srcbillbid);
//					listgl.add(gl);
				}
			}

			if (list.size() == 0) {
				return;
			}
			// 回写上游单据的实际完工日期和工令状态；
			UFDateTime date = AppContext.getInstance().getServerTime();
			String inStr = SqlUtils.getInStr("B.Srcbillbid", list, true);
			String sql = "update jxc_hr_orderstartsub A set orderstatus='2',actcompletdate='"+ date
					+ "' where exists (select 1 from jxc_hr_orderendsub B where A.Pk_Ordersub=B.Srcbillbid and"
					+ inStr + ")";
			getBaseDAO().executeUpdate(sql);
			// 回写自定义档案的工令状态
			String inStr2 = SqlUtils.getInStr("pk_defdoc", list, true);
			String sql2 = "update bd_defdoc set enablestate ='3' where nvl(dr,0)=0 and "+ inStr2;
			getBaseDAO().executeUpdate(sql2);
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
	}

	private BaseDAO bd = null;

	private BaseDAO getBaseDAO() {
		if (bd == null) {
			bd = new BaseDAO();
		}
		return bd;
	}

}
