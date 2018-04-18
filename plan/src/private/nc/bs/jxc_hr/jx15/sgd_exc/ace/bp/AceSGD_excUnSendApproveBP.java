package nc.bs.jxc_hr.jx15.sgd_exc.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceSGD_excUnSendApproveBP {
  public SGDVO_EXC[] unSend(SGDVO_EXC[] clientBills,
      SGDVO_EXC[] originBills) {
    // 把VO持久化到数据库中
    this.setHeadVOStatus(clientBills);
    BillUpdate<SGDVO_EXC> update = new BillUpdate<SGDVO_EXC>();
    SGDVO_EXC[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(SGDVO_EXC[] clientBills) {
        for (SGDVO_EXC clientBill : clientBills) {
        clientBill.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.FREE.value());
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
