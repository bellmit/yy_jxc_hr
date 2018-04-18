package nc.itf.jxc_hr.jx06;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.pub.BusinessException;

public interface IBGDMaintain {

    public void delete(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException;

    public BGDVO[] insert(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException;
  
    public BGDVO[] update(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException;


    public BGDVO[] query(IQueryScheme queryScheme)
      throws BusinessException;

  public BGDVO[] save(BGDVO[] clientFullVOs,BGDVO[] originBills)
      throws BusinessException ;

  public BGDVO[] unsave(BGDVO[] clientFullVOs,BGDVO[] originBills)
      throws BusinessException ;

  public BGDVO[] approve(BGDVO[] clientFullVOs,BGDVO[] originBills)
      throws BusinessException ;

  public BGDVO[] unapprove(BGDVO[] clientFullVOs,BGDVO[] originBills)
      throws BusinessException ;
  
  public BGDVO[] insert(BGDVO[] vos) throws BusinessException;
}
