package nc.bs.jxc_hr.jx01.sgd.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据审核的BP
 */
public class AceSGDApproveBP {

  /**
   * 审核动作
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public SGDVO[] approve(SGDVO[] clientBills,
      SGDVO[] originBills) {
    BillUpdate<SGDVO> update = new BillUpdate<SGDVO>();
    SGDVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
}
