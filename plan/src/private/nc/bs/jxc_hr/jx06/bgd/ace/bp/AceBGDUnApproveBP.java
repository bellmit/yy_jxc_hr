package nc.bs.jxc_hr.jx06.bgd.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceBGDUnApproveBP {

  public BGDVO[] unApprove(BGDVO[] clientBills,
      BGDVO[] originBills) {
    BillUpdate<BGDVO> update = new BillUpdate<BGDVO>();
    BGDVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(BGDVO[] clientBills) {
        for (BGDVO clientBill : clientBills) {
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
