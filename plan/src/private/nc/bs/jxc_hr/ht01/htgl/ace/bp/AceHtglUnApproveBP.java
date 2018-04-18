package nc.bs.jxc_hr.ht01.htgl.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.ht01.HTVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceHtglUnApproveBP {

  public HTVO[] unApprove(HTVO[] clientBills,
      HTVO[] originBills) {
    BillUpdate<HTVO> update = new BillUpdate<HTVO>();
    HTVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(HTVO[] clientBills) {
        for (HTVO clientBill : clientBills) {
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
