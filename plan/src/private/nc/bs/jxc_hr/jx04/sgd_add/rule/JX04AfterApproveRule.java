package nc.bs.jxc_hr.jx04.sgd_add.rule;

import java.util.ArrayList;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uap.pf.IPfExchangeService;
import nc.itf.uap.pf.busiflow.PfButtonClickContext;
import nc.pubitf.bd.reportitem.pub.SqlUtils;
import nc.vo.plan.jx02.PGDHVO;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.plan.jx04.SGDBVO_ADD;
import nc.vo.plan.jx04.SGDHVO_ADD;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.ValidationException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author zhangshjf@yonyou.com
 * @todo 施工增补单审批通过后回写，派工单表体的增补工时字段(addgs) 和 施工单表体工时字段
 */
public class JX04AfterApproveRule implements IRule<SGDVO_ADD> {
	private BaseDAO baseDao=null;
	private BaseDAO getBaseDao(){
		if(baseDao==null){
			baseDao = new BaseDAO();
		}
		return baseDao;
	}

	@Override
	public void process(SGDVO_ADD[] vos) {
		if (vos == null || vos.length == 0) {
			return;
		}
		try {
			// 回写派工单表体的增补工时字段
			// 1.获得来源单据表体id 为了去找派工单的表体2、更新派工单的表体的增补工时(addgs)字段
			ArrayList<String> list = new ArrayList<String>(vos.length);
			ArrayList<String> listh = new ArrayList<String>(vos.length);	//add	xiashsh	2017-06-13	获取派工单表头id
			ArrayList<String> pklist = new ArrayList<String>(vos.length);
			for (int i = 0; i < vos.length; i++) {
				list.add(vos[i].getParentVO().getSrcbillid_b());
				pklist.add(vos[i].getParentVO().getPk_sgd_add_h());
				listh.add(vos[i].getParentVO().getSrcbillid());		//add	xiashsh	2017-06-13	获取派工单表头id
			}
			/*
			 * update jxc_hr_pgk_czz A set addgs=(select addhours from
			 * jxc_hr_sgd_add_h B where A.Pk_Pgd_Czz=B.Srcbillid_b  ) where
			 * exists(select 1 from jxc_hr_sgd_add_h B where
			 * A.Pk_Pgd_Czz=B.Srcbillid_b ) and A.Pk_Pgd_Czz
			 * in('1001ZZ1000000006ER41')
			 */
			String inStr = SqlUtils.getInStr("pk_pgd_czz", list, true);
			String reWritePGDSql = "update jxc_hr_pgk_czz A set addgs=(select sum(nvl(addhours,0)) from jxc_hr_sgd_add_h B where B.approvestatus=1 and nvl(B.dr,0)=0 and A.Pk_Pgd_Czz=B.Srcbillid_b )"
					+ " where nvl(A.dr,0)=0 and exists(select 1 from jxc_hr_sgd_add_h B where nvl(A.dr,0)=0 and A.Pk_Pgd_Czz=B.Srcbillid_b ) and A."
					+ inStr;
			
			getBaseDao().executeUpdate(reWritePGDSql);
			
			//回写施工单表体工时(GS)字段  规则：GS=GS+增补单的addhours字段
			String pkinStr=SqlUtils.getInStr("B.Pk_Sgd_Add_h", pklist, true);
			
			/*
			 * update jxc_hr_sgd_b A set A.gs=(A.gs+(select addhours from
			 * jxc_hr_sgd_add_h B where A.pk_sgd_b=B.Firstbillbid and  "+pkinStr+")) where exists
			 * (select 1 from jxc_hr_sgd_add_h B where A.pk_sgd_b=B.Firstbillbid
			 * and B.Pk_Sgd_Add_h in ('1001ZZ1000000006ER43'))
			 */
			
			String reWriteSGDSql="update jxc_hr_sgd_b A set A.gs=(A.gs+(select addhours from jxc_hr_sgd_add_h B where A.pk_sgd_b=B.Firstbillbid and "+pkinStr+")) where exists (select 1 from jxc_hr_sgd_add_h B where A.pk_sgd_b=B.Firstbillbid and "+pkinStr+")";
			
			getBaseDao().executeUpdate(reWriteSGDSql);
			
			
			//回写到表头 表体工时汇总字段	表体工时汇总=表体工时汇总+增补工时	派工单表头	add	xiashsh	2017-06-13
			String inStrh=SqlUtils.getInStr("pk_pgk_h", listh, true);
//			String reWritePGDHSql="update jxc_hr_pgk_h A set bodygstotal=(nvl(A.bodygstotal,0)+(select nvl(B.addhours,0) from jxc_hr_sgd_add_h B where A.pk_pgk_h=B.srcbillid and "+pkinStr+")) where nvl(A.dr,0)=0 and "+inStrh;
			String reWritePGDHSql="update jxc_hr_pgk_h set def10=(select sum(nvl(zgs,0))+sum(nvl(addgs,0)) addgs  from jxc_hr_pgk_czz where nvl(dr,0)=0 and "+inStrh+") where nvl(dr,0)=0 and "+inStrh;
			getBaseDao().executeUpdate(reWritePGDHSql);
			
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}

	}

}
