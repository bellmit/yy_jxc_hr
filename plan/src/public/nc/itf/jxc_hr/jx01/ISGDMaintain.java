package nc.itf.jxc_hr.jx01;

import java.util.Map;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public interface ISGDMaintain {

	public void delete(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException;

	public SGDVO[] insert(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException;

	public SGDVO[] update(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException;

	public String[] queryPKs(IQueryScheme queryScheme) throws BusinessException;

	public SGDVO[] queryBillByPK(String[] pks) throws BusinessException;

	public SGDVO[] save(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException;

	public SGDVO[] unsave(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException;

	public SGDVO[] approve(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException;

	public SGDVO[] unapprove(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException;

	/**
	 * ������ѯ����ʩ����ϵ�����ù�ʱ shidl
	 * 
	 * @return<ʩ�����ӱ����������ù�ʱ>
	 * @throws BusinessException
	 */
	public Map<String, UFDouble> queryActiveManHours(String[] pk_sgd_bs)
			throws BusinessException;
}
