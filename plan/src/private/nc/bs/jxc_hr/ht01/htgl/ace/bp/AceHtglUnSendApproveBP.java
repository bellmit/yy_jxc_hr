package nc.bs.jxc_hr.ht01.htgl.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.ht01.HTVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceHtglUnSendApproveBP {
  public HTVO[] unSend(HTVO[] clientBills,
      HTVO[] originBills) {
    // 把VO持久化到数据库中
    this.setHeadVOStatus(clientBills);
    BillUpdate<HTVO> update = new BillUpdate<HTVO>();
    HTVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(HTVO[] clientBills) {
        for (HTVO clientBill : clientBills) {
        clientBill.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.FREE.value());
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
