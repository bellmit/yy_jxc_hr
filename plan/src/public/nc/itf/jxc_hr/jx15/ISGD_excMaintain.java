package nc.itf.jxc_hr.jx15;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.BusinessException;

public interface ISGD_excMaintain {

    public void delete(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) throws BusinessException;

    public SGDVO_EXC[] insert(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) throws BusinessException;
  
    public SGDVO_EXC[] update(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) throws BusinessException;


    public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException;
    public SGDVO_EXC[] queryBillByPK(String[] pks)
      throws BusinessException ;

  public SGDVO_EXC[] save(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills)
      throws BusinessException ;

  public SGDVO_EXC[] unsave(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills)
      throws BusinessException ;

  public SGDVO_EXC[] approve(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills)
      throws BusinessException ;

  public SGDVO_EXC[] unapprove(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills)
      throws BusinessException ;
}
