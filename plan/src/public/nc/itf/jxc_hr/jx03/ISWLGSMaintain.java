package nc.itf.jxc_hr.jx03;

import java.util.HashMap;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public interface ISWLGSMaintain {

	public void delete(SWLGSVO[] clientFullVOs, SWLGSVO[] originBills)
			throws BusinessException;

	public SWLGSVO[] insert(SWLGSVO[] clientFullVOs, SWLGSVO[] originBills)
			throws BusinessException;

	public SWLGSVO[] update(SWLGSVO[] clientFullVOs, SWLGSVO[] originBills)
			throws BusinessException;

	public SWLGSVO[] query(IQueryScheme queryScheme) throws BusinessException;
	
	public String[] queryPKs(IQueryScheme queryScheme)
		      throws BusinessException;
	public SWLGSVO[] queryBillByPK(String[] pks) throws BusinessException ;
	

	public SWLGSVO[] save(SWLGSVO[] clientFullVOs, SWLGSVO[] originBills)
			throws BusinessException;

	public SWLGSVO[] unsave(SWLGSVO[] clientFullVOs, SWLGSVO[] originBills)
			throws BusinessException;

	public SWLGSVO[] approve(SWLGSVO[] clientFullVOs, SWLGSVO[] originBills)
			throws BusinessException;

	public SWLGSVO[] unapprove(SWLGSVO[] clientFullVOs, SWLGSVO[] originBills)
			throws BusinessException;

	/**
	 * @param originBills
	 * @return
	 * @throws BusinessException
	 *             实物量工时拉派工卡调用此insert方法
	 */
	public SWLGSVO[] insert(SWLGSVO[] originBills) throws BusinessException;
	
	
	
	/**
	 * @param 派工单表头主键数组
	 * 			pk_pgd_h
	 * @param 派工单表体主键数组
	 * 			pk_pgd_b
	 * @return 主键——剩余工时
	 * @throws BusinessException
	 */
	public HashMap<String,UFDouble> queryPGDRemainGS(String[] pk_pgd_h,String[] pk_pgd_b) throws BusinessException;
}
