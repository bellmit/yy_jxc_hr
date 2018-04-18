package nc.itf.jxc_hr.jx04;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.BusinessException;

public interface ISGD_addMaintain {

    public void delete(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException;

    public SGDVO_ADD[] insert(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException;
  
    public SGDVO_ADD[] update(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException;


    public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException;
    public SGDVO_ADD[] queryBillByPK(String[] pks)
      throws BusinessException ;

  public SGDVO_ADD[] save(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills)
      throws BusinessException ;

  public SGDVO_ADD[] unsave(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills)
      throws BusinessException ;

  public SGDVO_ADD[] approve(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills)
      throws BusinessException ;

  public SGDVO_ADD[] unapprove(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills)
      throws BusinessException ;
}
