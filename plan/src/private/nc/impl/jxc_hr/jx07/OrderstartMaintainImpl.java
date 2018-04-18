package nc.impl.jxc_hr.jx07;

import nc.impl.pub.ace.AceOrderstartPubServiceImpl;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
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

public class OrderstartMaintainImpl extends AceOrderstartPubServiceImpl implements nc.itf.jxc_hr.jx07.IOrderstartMaintain {

      @Override
    public void delete(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) throws BusinessException {
        super.pubdeleteBills(clientFullVOs,originBills);
    }
  
      @Override
    public AggOrderStartVO[] insert(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) throws BusinessException {
        return super.pubinsertBills(clientFullVOs,originBills);
    }
    
      @Override
    public AggOrderStartVO[] update(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) throws BusinessException {
        return super.pubupdateBills(clientFullVOs,originBills);    
    }
  


	  @Override
  public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException {
      return super.pubquerypkbills(queryScheme);
  }
  @Override
  public AggOrderStartVO[] queryBillByPK(String[] pks)
      throws BusinessException {
      return super.pubquerybillbypkbills(pks);
  }

  @Override
  public AggOrderStartVO[] save(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills)
      throws BusinessException {
      return super.pubsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggOrderStartVO[] unsave(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills)
      throws BusinessException {
      return super.pubunsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggOrderStartVO[] approve(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills)
      throws BusinessException {
      return super.pubapprovebills(clientFullVOs,originBills);
  }

  @Override
  public AggOrderStartVO[] unapprove(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills)
      throws BusinessException {
      return super.pubunapprovebills(clientFullVOs,originBills);
  }

}
