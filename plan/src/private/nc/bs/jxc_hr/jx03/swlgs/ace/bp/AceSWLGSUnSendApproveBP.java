package nc.bs.jxc_hr.jx03.swlgs.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceSWLGSUnSendApproveBP {
  public SWLGSVO[] unSend(SWLGSVO[] clientBills,
      SWLGSVO[] originBills) {
    // 把VO持久化到数据库中
    this.setHeadVOStatus(clientBills);
    BillUpdate<SWLGSVO> update = new BillUpdate<SWLGSVO>();
    SWLGSVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(SWLGSVO[] clientBills) {
        for (SWLGSVO clientBill : clientBills) {
        clientBill.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.FREE.value());
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
