package nc.bs.jxc_hr.jx15.sgd_exc.rule;

import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class JX15BeforeUnApproveRule implements IRule<SGDVO_EXC> {

	/** 
	 * ʩ����ϵ��ȡ������ǰУ�� �Ƿ��������ɵ����ε����ɹ���
	 */
	@Override
	public void process(SGDVO_EXC[] vos) {
		if (vos == null || vos.length == 0) {
			return;
		}
		String pk_sgd_exc_h=vos[0].getParentVO()==null?"":vos[0].getParentVO().getPk_sgd_exc_h();
		String sql="select pk_pgk_h from jxc_hr_pgk_h where nvl(dr,0)=0 and srcbillid='"+pk_sgd_exc_h+"'";
		IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
		Object res=null;
		try {
			res=ibs.executeQuery(sql, new ColumnProcessor());
		} catch (BusinessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		if(res!=null){
			ExceptionUtils.wrappBusinessException("�õ�������ͨ�����������ɹ���������ɾ���ɹ�����");
		}
	}

	

}
