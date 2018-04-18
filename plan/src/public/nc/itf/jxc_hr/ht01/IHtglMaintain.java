package nc.itf.jxc_hr.ht01;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.plan.ht01.HTVO;
import nc.vo.pub.BusinessException;

public interface IHtglMaintain {

    public void delete(HTVO[] clientFullVOs,HTVO[] originBills) throws BusinessException;

    public HTVO[] insert(HTVO[] clientFullVOs,HTVO[] originBills) throws BusinessException;
  
    public HTVO[] update(HTVO[] clientFullVOs,HTVO[] originBills) throws BusinessException;


    public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException;
    public HTVO[] queryBillByPK(String[] pks)
      throws BusinessException ;

  public HTVO[] save(HTVO[] clientFullVOs,HTVO[] originBills)
      throws BusinessException ;

  public HTVO[] unsave(HTVO[] clientFullVOs,HTVO[] originBills)
      throws BusinessException ;

  public HTVO[] approve(HTVO[] clientFullVOs,HTVO[] originBills)
      throws BusinessException ;

  public HTVO[] unapprove(HTVO[] clientFullVOs,HTVO[] originBills)
      throws BusinessException ;
}
