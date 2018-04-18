package nc.impl.jxc_hr.jx04;

import nc.impl.pub.ace.AceSGD_addPubServiceImpl;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.plan.jx04.SGDVO_ADD;
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

public class SGD_addMaintainImpl extends AceSGD_addPubServiceImpl implements nc.itf.jxc_hr.jx04.ISGD_addMaintain {

      @Override
    public void delete(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException {
        super.pubdeleteBills(clientFullVOs,originBills);
    }
  
      @Override
    public SGDVO_ADD[] insert(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException {
        return super.pubinsertBills(clientFullVOs,originBills);
    }
    
      @Override
    public SGDVO_ADD[] update(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException {
        return super.pubupdateBills(clientFullVOs,originBills);    
    }
  


	  @Override
  public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException {
      return super.pubquerypkbills(queryScheme);
  }
  @Override
  public SGDVO_ADD[] queryBillByPK(String[] pks)
      throws BusinessException {
      return super.pubquerybillbypkbills(pks);
  }

  @Override
  public SGDVO_ADD[] save(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills)
      throws BusinessException {
      return super.pubsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public SGDVO_ADD[] unsave(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills)
      throws BusinessException {
      return super.pubunsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public SGDVO_ADD[] approve(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills)
      throws BusinessException {
      return super.pubapprovebills(clientFullVOs,originBills);
  }

  @Override
  public SGDVO_ADD[] unapprove(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills)
      throws BusinessException {
      return super.pubunapprovebills(clientFullVOs,originBills);
  }

}
