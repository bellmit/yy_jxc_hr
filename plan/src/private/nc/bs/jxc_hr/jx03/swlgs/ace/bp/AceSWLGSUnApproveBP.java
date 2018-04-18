package nc.bs.jxc_hr.jx03.swlgs.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceSWLGSUnApproveBP {

  public SWLGSVO[] unApprove(SWLGSVO[] clientBills,
      SWLGSVO[] originBills) {
    BillUpdate<SWLGSVO> update = new BillUpdate<SWLGSVO>();
    SWLGSVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(SWLGSVO[] clientBills) {
        for (SWLGSVO clientBill : clientBills) {
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
