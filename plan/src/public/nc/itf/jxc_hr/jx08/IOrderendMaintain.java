package nc.itf.jxc_hr.jx08;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pub.BusinessException;

public interface IOrderendMaintain {

    public void delete(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException;

    public AggOrderEndVO[] insert(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException;
  
    public AggOrderEndVO[] update(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException;


    public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException;
    public AggOrderEndVO[] queryBillByPK(String[] pks)
      throws BusinessException ;

  public AggOrderEndVO[] save(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills)
      throws BusinessException ;

  public AggOrderEndVO[] unsave(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills)
      throws BusinessException ;

  public AggOrderEndVO[] approve(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills)
      throws BusinessException ;

  public AggOrderEndVO[] unapprove(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills)
      throws BusinessException ;
}
