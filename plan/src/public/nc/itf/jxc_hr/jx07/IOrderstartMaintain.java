package nc.itf.jxc_hr.jx07;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.BusinessException;

public interface IOrderstartMaintain {

    public void delete(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) throws BusinessException;

    public AggOrderStartVO[] insert(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) throws BusinessException;
  
    public AggOrderStartVO[] update(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) throws BusinessException;


    public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException;
    public AggOrderStartVO[] queryBillByPK(String[] pks)
      throws BusinessException ;

  public AggOrderStartVO[] save(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills)
      throws BusinessException ;

  public AggOrderStartVO[] unsave(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills)
      throws BusinessException ;

  public AggOrderStartVO[] approve(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills)
      throws BusinessException ;

  public AggOrderStartVO[] unapprove(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills)
      throws BusinessException ;
}
