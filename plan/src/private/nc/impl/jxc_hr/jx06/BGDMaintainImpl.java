package nc.impl.jxc_hr.jx06;

import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDInsertBP;
import nc.impl.pub.ace.AceBGDPubServiceImpl;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.plan.jx06.BGDVO;
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

public class BGDMaintainImpl extends AceBGDPubServiceImpl implements nc.itf.jxc_hr.jx06.IBGDMaintain {

      @Override
    public void delete(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException {
        super.pubdeleteBills(clientFullVOs,originBills);
    }
  
      @Override
    public BGDVO[] insert(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException {
        return super.pubinsertBills(clientFullVOs,originBills);
    }
    
      @Override
    public BGDVO[] update(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException {
        return super.pubupdateBills(clientFullVOs,originBills);    
    }
  

  @Override
  public BGDVO[] query(IQueryScheme queryScheme)
      throws BusinessException {
      return super.pubquerybills(queryScheme);
  }



  @Override
  public BGDVO[] save(BGDVO[] clientFullVOs,BGDVO[] originBills)
      throws BusinessException {
      return super.pubsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public BGDVO[] unsave(BGDVO[] clientFullVOs,BGDVO[] originBills)
      throws BusinessException {
      return super.pubunsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public BGDVO[] approve(BGDVO[] clientFullVOs,BGDVO[] originBills)
      throws BusinessException {
      return super.pubapprovebills(clientFullVOs,originBills);
  }

  @Override
  public BGDVO[] unapprove(BGDVO[] clientFullVOs,BGDVO[] originBills)
      throws BusinessException {
      return super.pubunapprovebills(clientFullVOs,originBills);
  }

@Override
public BGDVO[] insert(BGDVO[] vos) throws BusinessException {
	  AceBGDInsertBP action = new AceBGDInsertBP();
      BGDVO[] retvos = action.insert(vos);
      return retvos;
}

}
