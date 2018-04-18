package nc.bs.jxc_hr.jx02.pgd2.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AcePGD2UnApproveBP {

  public PGDVO[] unApprove(PGDVO[] clientBills,
      PGDVO[] originBills) {
    BillUpdate<PGDVO> update = new BillUpdate<PGDVO>();
    PGDVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(PGDVO[] clientBills) {
        for (PGDVO clientBill : clientBills) {
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
