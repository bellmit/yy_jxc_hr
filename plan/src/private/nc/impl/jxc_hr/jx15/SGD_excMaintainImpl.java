package nc.impl.jxc_hr.jx15;

import nc.impl.pub.ace.AceSGD_excPubServiceImpl;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.plan.jx15.SGDVO_EXC;
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

public class SGD_excMaintainImpl extends AceSGD_excPubServiceImpl implements nc.itf.jxc_hr.jx15.ISGD_excMaintain {

      @Override
    public void delete(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) throws BusinessException {
        super.pubdeleteBills(clientFullVOs,originBills);
    }
  
      @Override
    public SGDVO_EXC[] insert(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) throws BusinessException {
        return super.pubinsertBills(clientFullVOs,originBills);
    }
    
      @Override
    public SGDVO_EXC[] update(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) throws BusinessException {
        return super.pubupdateBills(clientFullVOs,originBills);    
    }
  


	  @Override
  public String[] queryPKs(IQueryScheme queryScheme)
      throws BusinessException {
      return super.pubquerypkbills(queryScheme);
  }
  @Override
  public SGDVO_EXC[] queryBillByPK(String[] pks)
      throws BusinessException {
      return super.pubquerybillbypkbills(pks);
  }

  @Override
  public SGDVO_EXC[] save(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills)
      throws BusinessException {
      return super.pubsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public SGDVO_EXC[] unsave(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills)
      throws BusinessException {
      return super.pubunsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public SGDVO_EXC[] approve(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills)
      throws BusinessException {
      return super.pubapprovebills(clientFullVOs,originBills);
  }

  @Override
  public SGDVO_EXC[] unapprove(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills)
      throws BusinessException {
      return super.pubunapprovebills(clientFullVOs,originBills);
  }

}
