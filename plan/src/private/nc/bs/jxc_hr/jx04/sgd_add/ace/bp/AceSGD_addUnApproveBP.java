package nc.bs.jxc_hr.jx04.sgd_add.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceSGD_addUnApproveBP {

  public SGDVO_ADD[] unApprove(SGDVO_ADD[] clientBills,
      SGDVO_ADD[] originBills) {
    BillUpdate<SGDVO_ADD> update = new BillUpdate<SGDVO_ADD>();
    SGDVO_ADD[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(SGDVO_ADD[] clientBills) {
        for (SGDVO_ADD clientBill : clientBills) {
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
