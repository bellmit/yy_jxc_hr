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
	 * 批量查询下游施工联系单可用工时 shidl
	 * 
	 * @return<施工单子表主键，可用工时>
	 * @throws BusinessException
	 */
	public Map<String, UFDouble> queryActiveManHours(String[] pk_sgd_bs)
			throws BusinessException;
}
