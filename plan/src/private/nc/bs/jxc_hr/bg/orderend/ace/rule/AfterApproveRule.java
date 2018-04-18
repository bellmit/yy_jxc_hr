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
 * @description �����깤�����ͨ����
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
				if (vo.getParentVO().getApprove_state() != 1) {// 1��ʾ���ͨ����-1��ʾ����̬��3��ʾ�����
					continue;
				}
				OrderEndSubVO[] bvos = (OrderEndSubVO[]) vo.getChildrenVO();
				for (OrderEndSubVO bvo : bvos) {
					srcbillbid = bvo.getSrcbillbid();
					gl = bvo.getGl();
					if (gl == null || "".equals(gl) || "".equals(srcbillbid)
							|| srcbillbid == null) {
						throw new BusinessException("����Ż�����Դ���ݱ���IDΪ�գ����ʧ�ܣ�");
					}
					list.add(srcbillbid);
//					listgl.add(gl);
				}
			}

			if (list.size() == 0) {
				return;
			}
			// ��д���ε��ݵ�ʵ���깤���ں͹���״̬��
			UFDateTime date = AppContext.getInstance().getServerTime();
			String inStr = SqlUtils.getInStr("B.Srcbillbid", list, true);
			String sql = "update jxc_hr_orderstartsub A set orderstatus='2',actcompletdate='"+ date
					+ "' where exists (select 1 from jxc_hr_orderendsub B where A.Pk_Ordersub=B.Srcbillbid and"
					+ inStr + ")";
			getBaseDAO().executeUpdate(sql);
			// ��д�Զ��嵵���Ĺ���״̬
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
