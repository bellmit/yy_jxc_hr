package nc.impl.jxc_hr.jx08;

import nc.impl.pub.ace.AceOrderendPubServiceImpl;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.bill.pagination.PaginationTransferObject;
import nc.vo.pubapp.bill.pagination.util.PaginationUtils;
import nc.impl.pubapp.pattern.data.bill.BillQuery;

public class OrderendMaintainImpl extends AceOrderendPubServiceImpl implements nc.itf.jxc_hr.jx08.IOrderendMaintain {

      @Override
    public void delete(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException {
        super.pubdeleteBills(clientFullVOs,originBills);
    }
  
      @Override
    public AggOrderEndVO[] insert(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException {
        return super.pubinsertBills(clientFullVOs,originBills);
    }
    
      @Override
    public AggOrderEndVO[] update(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException {
        return super.pubupdateBills(clientFullVOs,originBills);    
    }
  


	  @Override
  public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException {
      return super.pubquerypkbills(queryScheme);
  }
  @Override
  public AggOrderEndVO[] queryBillByPK(String[] pks)
      throws BusinessException {
      return super.pubquerybillbypkbills(pks);
  }

  @Override
  public AggOrderEndVO[] save(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills)
      throws BusinessException {
      return super.pubsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggOrderEndVO[] unsave(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills)
      throws BusinessException {
      return super.pubunsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggOrderEndVO[] approve(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills)
      throws BusinessException {
      return super.pubapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggOrderEndVO[] unapprove(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills)
      throws BusinessException {
      return super.pubunapprovebills(clientFullVOs,originBills);
  }

}
