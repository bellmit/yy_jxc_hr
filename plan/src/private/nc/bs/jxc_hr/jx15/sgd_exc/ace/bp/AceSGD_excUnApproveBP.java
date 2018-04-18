package nc.bs.jxc_hr.jx15.sgd_exc.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceSGD_excUnApproveBP {

  public SGDVO_EXC[] unApprove(SGDVO_EXC[] clientBills,
      SGDVO_EXC[] originBills) {
    BillUpdate<SGDVO_EXC> update = new BillUpdate<SGDVO_EXC>();
    SGDVO_EXC[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(SGDVO_EXC[] clientBills) {
        for (SGDVO_EXC clientBill : clientBills) {
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
