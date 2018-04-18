package nc.impl.jxc_hr.ht01;

import nc.impl.pub.ace.AceHtglPubServiceImpl;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.plan.ht01.HTVO;
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

public class HtglMaintainImpl extends AceHtglPubServiceImpl implements nc.itf.jxc_hr.ht01.IHtglMaintain {

      @Override
    public void delete(HTVO[] clientFullVOs,HTVO[] originBills) throws BusinessException {
        super.pubdeleteBills(clientFullVOs,originBills);
    }
  
      @Override
    public HTVO[] insert(HTVO[] clientFullVOs,HTVO[] originBills) throws BusinessException {
        return super.pubinsertBills(clientFullVOs,originBills);
    }
    
      @Override
    public HTVO[] update(HTVO[] clientFullVOs,HTVO[] originBills) throws BusinessException {
        return super.pubupdateBills(clientFullVOs,originBills);    
    }
  


	  @Override
  public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException {
      return super.pubquerypkbills(queryScheme);
  }
  @Override
  public HTVO[] queryBillByPK(String[] pks)
      throws BusinessException {
      return super.pubquerybillbypkbills(pks);
  }

  @Override
  public HTVO[] save(HTVO[] clientFullVOs,HTVO[] originBills)
      throws BusinessException {
      return super.pubsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public HTVO[] unsave(HTVO[] clientFullVOs,HTVO[] originBills)
      throws BusinessException {
      return super.pubunsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public HTVO[] approve(HTVO[] clientFullVOs,HTVO[] originBills)
      throws BusinessException {
      return super.pubapprovebills(clientFullVOs,originBills);
  }

  @Override
  public HTVO[] unapprove(HTVO[] clientFullVOs,HTVO[] originBills)
      throws BusinessException {
      return super.pubunapprovebills(clientFullVOs,originBills);
  }

}
