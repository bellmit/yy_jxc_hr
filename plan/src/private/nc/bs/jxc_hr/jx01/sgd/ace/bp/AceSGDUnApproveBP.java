package nc.bs.jxc_hr.jx01.sgd.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceSGDUnApproveBP {

  public SGDVO[] unApprove(SGDVO[] clientBills,
      SGDVO[] originBills) {
    BillUpdate<SGDVO> update = new BillUpdate<SGDVO>();
    SGDVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(SGDVO[] clientBills) {
        for (SGDVO clientBill : clientBills) {
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
