package nc.impl.jxc_hr.jx03;

import java.util.HashMap;

import nc.impl.pub.ace.AceSWLGSPubServiceImpl;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.plan.jx03.SWLGSVO;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.bill.pagination.PaginationTransferObject;
import nc.vo.pubapp.bill.pagination.util.PaginationUtils;
import nc.impl.pubapp.pattern.data.bill.BillQuery;

public class SWLGSMaintainImpl extends AceSWLGSPubServiceImpl implements nc.itf.jxc_hr.jx03.ISWLGSMaintain {

      @Override
    public void delete(SWLGSVO[] clientFullVOs,SWLGSVO[] originBills) throws BusinessException {
        super.pubdeleteBills(clientFullVOs,originBills);
    }
  
      @Override
    public SWLGSVO[] insert(SWLGSVO[] clientFullVOs,SWLGSVO[] originBills) throws BusinessException {
        return super.pubinsertBills(clientFullVOs,originBills);
    }
    
      @Override
    public SWLGSVO[] update(SWLGSVO[] clientFullVOs,SWLGSVO[] originBills) throws BusinessException {
        return super.pubupdateBills(clientFullVOs,originBills);    
    }
  

  @Override
  public SWLGSVO[] query(IQueryScheme queryScheme)
      throws BusinessException {
      return super.pubquerybills(queryScheme);
  }



  @Override
  public SWLGSVO[] save(SWLGSVO[] clientFullVOs,SWLGSVO[] originBills)
      throws BusinessException {
      return super.pubsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public SWLGSVO[] unsave(SWLGSVO[] clientFullVOs,SWLGSVO[] originBills)
      throws BusinessException {
      return super.pubunsendapprovebills(clientFullVOs,originBills);
  }

  @Override
  public SWLGSVO[] approve(SWLGSVO[] clientFullVOs,SWLGSVO[] originBills)
      throws BusinessException {
      return super.pubapprovebills(clientFullVOs,originBills);
  }

  @Override
  public SWLGSVO[] unapprove(SWLGSVO[] clientFullVOs,SWLGSVO[] originBills)
      throws BusinessException {
      return super.pubunapprovebills(clientFullVOs,originBills);
  }

@Override
public SWLGSVO[] insert(SWLGSVO[] originBills) throws BusinessException {
	
	return super.insert(originBills);
}

@Override
public HashMap<String, UFDouble> queryPGDRemainGS(String[] pk_pgd_h,String[] pk_pgd_b) throws BusinessException {
	
	return super.queryPGDRemainGS(pk_pgd_h,pk_pgd_b);
}

@Override
public String[] queryPKs(IQueryScheme queryScheme) throws BusinessException {
	return super.pubquerypkbills(queryScheme);
}

@Override
public SWLGSVO[] queryBillByPK(String[] pks) throws BusinessException {
	return super.pubquerybillbypkbills(pks);
}

}
