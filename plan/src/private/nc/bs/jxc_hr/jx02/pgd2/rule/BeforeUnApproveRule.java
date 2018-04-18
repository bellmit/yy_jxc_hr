package nc.bs.jxc_hr.jx02.pgd2.rule;

import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.plan.jx01.SGDBVO;
import nc.vo.plan.jx01.SGDHVO;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.plan.jx02.PGDBVO01;
import nc.vo.plan.jx02.PGDHVO;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author xiashsh
 * @date 2017-06-01
 * @description 
 */
public class BeforeUnApproveRule implements IRule<PGDVO> {

	/* ���� Javadoc��
	 * @see nc.impl.pubapp.pattern.rule.IRule#process(E[])
	 */
	@Override
	public void process(PGDVO[] vos) {
		if(vos == null || vos.length == 0||vos[0].getParentVO().getBilltype().equals("JX02-Cxx-02")){
			return ;
		}
		//JX02-Cxx-02 ��ʱ�����鵥��ʶ��  ����Ǳ� ����
		PGDHVO vo=vos[0].getParentVO();
		if(vo==null){
			ExceptionUtils.wrappBusinessException("��ȡ��AggvoΪ�գ�");
		}
		String sqlpk=getbvopk((PGDBVO01[])vos[0].getChildrenVO());
		IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
		String sgdaddSql="select pk_sgd_add_h from JXC_HR_SGD_ADD_H where nvl(dr,0)=0 and srcbillid ='"+vo.getPk_pgk_h()+"'";
		String swlgsSql="select PK_SWLGS_B from JXC_HR_SWLGS_B where nvl(dr,0)=0 and srcbillid_b in ("+sqlpk+")";
		Object res=null;
		Object res2=null;
		try {
			res=ibs.executeQuery(sgdaddSql, new ColumnProcessor());
			res2=ibs.executeQuery(swlgsSql, new ColumnProcessor());
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException("��ѯ���ݿ��쳣��");
			e.printStackTrace();
		}
		//add	xiashsh	2017-06-01
		if (res2!=null) {
			ExceptionUtils.wrappBusinessException("�õ������������ε��� ʵ������ʱ������ɾ��ʵ������ʱ����ȡ��������");
		}
		if(res!=null){
			ExceptionUtils.wrappBusinessException("�õ������������ε��� ʩ��������������ɾ��ʩ������������ȡ��������");
		}
	}

	/**
	 * TODO
	 * @param childrenVO
	 * @return
	 * 
	 */
	private String getbvopk(PGDBVO01[] bvos) {
		String sqlpk=" '";
		for(int i=0;i<bvos.length;i++){
			if(i==bvos.length-1){
				sqlpk=sqlpk+bvos[i].getPk_pgd_czz()+"'";
			}
			else{
				sqlpk=sqlpk+bvos[i].getPk_pgd_czz()+"','";
			}
			
		}
		return sqlpk;
	}

}
