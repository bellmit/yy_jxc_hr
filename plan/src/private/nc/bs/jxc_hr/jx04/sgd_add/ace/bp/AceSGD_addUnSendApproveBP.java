package nc.bs.jxc_hr.jx04.sgd_add.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceSGD_addUnSendApproveBP {
  public SGDVO_ADD[] unSend(SGDVO_ADD[] clientBills,
      SGDVO_ADD[] originBills) {
    // 把VO持久化到数据库中
    this.setHeadVOStatus(clientBills);
    BillUpdate<SGDVO_ADD> update = new BillUpdate<SGDVO_ADD>();
    SGDVO_ADD[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(SGDVO_ADD[] clientBills) {
        for (SGDVO_ADD clientBill : clientBills) {
        clientBill.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.FREE.value());
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
