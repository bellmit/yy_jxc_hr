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
 * @date 2017-5-25
 * @description  工令完工单弃审后
 */
public class AfterUnApproveRule implements IRule<AggOrderEndVO> {

	@Override
	public void process(AggOrderEndVO[] vos) {
		if (vos == null || vos.length == 0) {
			return;
		}
		ArrayList<String> list = new ArrayList<String>();
//		ArrayList<String> listgl= new ArrayList<String>();
		for (AggOrderEndVO vo : vos) {
			
			OrderEndSubVO[] bvos=(OrderEndSubVO[]) vo.getChildrenVO();
			for (OrderEndSubVO bvo : bvos) {
				list.add(bvo.getSrcbillbid());
//				listgl.add(bvo.getGl());
			}
		}
		
		try {
			if(list.size()==0){
				return;
			}
			//回写上游单据的实际完工日期和工令状态；
			String inStr = SqlUtils.getInStr("B.Srcbillbid", list,true);
			String sql="update jxc_hr_orderstartsub A set orderstatus='1',actcompletdate='' where exists (select 1 from jxc_hr_orderendsub B where A.Pk_Ordersub=B.Srcbillbid and"+inStr+")";
			getBaseDAO().executeUpdate(sql);
			//回写自定义档案的工令状态
			String inStr2 = SqlUtils.getInStr("pk_defdoc", list, true);
			String sql2="update bd_defdoc set enablestate ='2' where nvl(dr,0)=0 and "+inStr2;
			getBaseDAO().executeUpdate(sql2);
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
	}
	private BaseDAO bd=null;
	private BaseDAO getBaseDAO(){
		if(bd==null){
			bd=new BaseDAO();
		}
		return bd;
	}

}
