package nc.bs.jxc_hr.jx04.sgd_add.rule;

import java.util.ArrayList;

import nc.bs.dao.BaseDAO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.pubitf.bd.reportitem.pub.SqlUtils;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class JX04AfterUNApproveRule implements IRule<SGDVO_ADD> {
	private BaseDAO baseDao = null;

	private BaseDAO getBaseDao() {
		if (baseDao == null) {
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
			// �ع��ɹ��������������ʱ�ֶ�  ������Ҫ������
			// 1.�����Դ���ݱ���id Ϊ��ȥ���ɹ����ı���2�������ɹ����ı����������ʱ(addgs)�ֶ�
			ArrayList<String> list = new ArrayList<String>(vos.length);
			ArrayList<String> listh = new ArrayList<String>(vos.length);	//add	xiashsh	2017-06-13	��ȡ�ɹ�����ͷid
			ArrayList<String> pklist = new ArrayList<String>(vos.length);
			for (int i = 0; i < vos.length; i++) {
				list.add(vos[i].getParentVO().getSrcbillid_b());
				pklist.add(vos[i].getParentVO().getPk_sgd_add_h());
				listh.add(vos[i].getParentVO().getSrcbillid());		//add	xiashsh	2017-06-13	��ȡ�ɹ�����ͷid
			}
			/*
			 * update jxc_hr_pgk_czz A set addgs=(select addhours from
			 * jxc_hr_sgd_add_h B where A.Pk_Pgd_Czz=B.Srcbillid_b ) where
			 * exists(select 1 from jxc_hr_sgd_add_h B where
			 * A.Pk_Pgd_Czz=B.Srcbillid_b ) and A.Pk_Pgd_Czz
			 * in('1001ZZ1000000006ER41')
			 */
			String inStr = SqlUtils.getInStr("pk_pgd_czz", list, true);
			String pkinStr = SqlUtils.getInStr("B.Pk_Sgd_Add_h", pklist, true);
			/*String reWritePGDSql = "update jxc_hr_pgk_czz A set A.addgs=(nvl(A.addgs,0)-(select nvl(addhours,0) from jxc_hr_sgd_add_h B  where "+pkinStr+"and  nvl(B.dr,0)=0 and A.Pk_Pgd_Czz=B.Srcbillid_b ))"
					+ " where nvl(A.dr,0)=0 and exists(select 1 from jxc_hr_sgd_add_h B where nvl(A.dr,0)=0 and A.Pk_Pgd_Czz=B.Srcbillid_b and "+pkinStr+" ) and A."
					+ inStr;*/
			
			String reWritePGDSql = "update jxc_hr_pgk_czz A set A.addgs=(nvl(A.addgs,0)-(select nvl(addhours,0) from jxc_hr_sgd_add_h B where "+pkinStr+" and  nvl(B.dr,0)=0 and A.Pk_Pgd_Czz=B.Srcbillid_b ))"
					+ " where nvl(A.dr,0)=0 and exists(select 1 from jxc_hr_sgd_add_h B where nvl(A.dr,0)=0 and A.Pk_Pgd_Czz=B.Srcbillid_b and  "+pkinStr+" ) and A."
					+ inStr;

			getBaseDao().executeUpdate(reWritePGDSql);

			// �ع�ʩ�������幤ʱ(GS)�ֶ� ����GS=GS-��������addhours�ֶ�
			

			/*
			 * update jxc_hr_sgd_b A set A.gs=(A.gs+(select addhours from
			 * jxc_hr_sgd_add_h B where A.pk_sgd_b=B.Firstbillbid and "+pkinStr+")) where exists
			 * (select 1 from jxc_hr_sgd_add_h B where A.pk_sgd_b=B.Firstbillbid
			 * and B.Pk_Sgd_Add_h in ('1001ZZ1000000006ER43'))
			 */

			String reWriteSGDSql = "update jxc_hr_sgd_b A set A.gs=(nvl(A.gs,0)-(select nvl(addhours,0) from jxc_hr_sgd_add_h B where A.pk_sgd_b=B.Firstbillbid and "+ pkinStr + ")) where exists (select 1 from jxc_hr_sgd_add_h B where A.pk_sgd_b=B.Firstbillbid and "
					+ pkinStr + ")";
			getBaseDao().executeUpdate(reWriteSGDSql);
			
			//�����д����ͷ ���幤ʱ�����ֶ�	���幤ʱ����=���幤ʱ����-������ʱ	�ɹ�����ͷ	add	xiashsh	2017-06-13
			String inStrh=SqlUtils.getInStr("pk_pgk_h", listh, true);
//			String reWritePGDHSql="update jxc_hr_pgk_h A set bodygstotal=(nvl(A.bodygstotal,0)-(select nvl(B.addhours,0) from jxc_hr_sgd_add_h B where A.pk_pgk_h=B.srcbillid and "+pkinStr+")) where nvl(A.dr,0)=0 and "+inStrh;
			String reWritePGDHSql="update jxc_hr_pgk_h a set a.def10=(a.def10-(select nvl(b.addhours,0) from jxc_hr_sgd_add_h b where nvl(b.dr,0)=0 and a.pk_pgk_h=b.srcbillid and "+pkinStr+")) where nvl(a.dr,0)=0 and a."+inStrh;
			
			getBaseDao().executeUpdate(reWritePGDHSql);
			
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}

	}
}
