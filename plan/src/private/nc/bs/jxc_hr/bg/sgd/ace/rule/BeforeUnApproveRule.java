/**
 * 
 */
package nc.bs.jxc_hr.bg.sgd.ace.rule;

import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.plan.jx01.SGDBVO;
import nc.vo.plan.jx01.SGDHVO;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author xiashsh
 * @date 2017-06-01
 * @description ȡ������
 */
public class BeforeUnApproveRule implements IRule<SGDVO> {

	/* ���� Javadoc��
	 * @see nc.impl.pubapp.pattern.rule.IRule#process(E[])
	 */
	@Override
	public void process(SGDVO[] vos) {
		if(vos == null || vos.length == 0){
			return ;
		}
		SGDHVO vo=vos[0].getParentVO();
		if(vo==null){
			ExceptionUtils.wrappBusinessException("��ȡ��AggvoΪ�գ�");
		}
		String sqlpk=getbvopk((SGDBVO[])vos[0].getChildrenVO());
		IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
		String sgd_excSql="select pk_sgd_exc_h from jxc_hr_sgd_exc_h where nvl(dr,0)=0 and srcbillid_b in ("+sqlpk+")";
		String pgdSql="select pk_pgk_h from jxc_hr_pgk_h where nvl(dr,0)=0 and srcbillbodyid in ("+sqlpk+")";
		Object res=null;
		Object res2=null;
		try {
			res=ibs.executeQuery(sgd_excSql, new ColumnProcessor());
			res2=ibs.executeQuery(pgdSql, new ColumnProcessor());
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException("��ѯ���ݿ��쳣��");
			e.printStackTrace();
		}
		//add	xiashsh	2017-06-01
		if (res2!=null) {
			ExceptionUtils.wrappBusinessException("�õ������������ε��� �ɹ���������ɾ���ɹ�������ȡ��������");
		}
		if(res!=null){
			ExceptionUtils.wrappBusinessException("�õ������������ε��� ʩ����ϵ��������ɾ��ʩ����ϵ������ȡ��������");
		}
	}

	/**
	 * TODO
	 * @param childrenVO
	 * @return
	 * 
	 */
	private String getbvopk(SGDBVO[] bvos) {
		String sqlpk=" '";
		for(int i=0;i<bvos.length;i++){
			if(i==bvos.length-1){
				sqlpk=sqlpk+bvos[i].getPk_sgd_b()+"'";
			}
			else{
				sqlpk=sqlpk+bvos[i].getPk_sgd_b()+"','";
			}
			
		}
		return sqlpk;
	}

}
