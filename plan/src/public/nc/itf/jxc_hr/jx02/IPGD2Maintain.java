package nc.itf.jxc_hr.jx02;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.BusinessException;

public interface IPGD2Maintain {

    public void delete(PGDVO[] clientFullVOs,PGDVO[] originBills) throws BusinessException;

    public PGDVO[] insert(PGDVO[] clientFullVOs,PGDVO[] originBills) throws BusinessException;
  
    public PGDVO[] update(PGDVO[] clientFullVOs,PGDVO[] originBills) throws BusinessException;


    public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException;
    public PGDVO[] queryBillByPK(String[] pks)
      throws BusinessException ;

  public PGDVO[] save(PGDVO[] clientFullVOs,PGDVO[] originBills)
      throws BusinessException ;

  public PGDVO[] unsave(PGDVO[] clientFullVOs,PGDVO[] originBills)
      throws BusinessException ;

  public PGDVO[] approve(PGDVO[] clientFullVOs,PGDVO[] originBills)
      throws BusinessException ;

  public PGDVO[] unapprove(PGDVO[] clientFullVOs,PGDVO[] originBills)
      throws BusinessException ;
  
	/*
	 * ����VO��ܵ�ʹ��
	 * �ɹ�����ӡʹ��
	 * 2017 0527
	 * 
	 */
	

	public PGDVO[] ClientBillToServer(PGDVO[] vos)
			throws BusinessException;
  
  
}
