package nc.bs.jxc_hr.jx08.orderend.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * 标准单据收回的BP
 */
public class AceOrderendUnSendApproveBP {
  public AggOrderEndVO[] unSend(AggOrderEndVO[] clientBills,
      AggOrderEndVO[] originBills) {
    // 把VO持久化到数据库中
    this.setHeadVOStatus(clientBills);
    BillUpdate<AggOrderEndVO> update = new BillUpdate<AggOrderEndVO>();
    AggOrderEndVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(AggOrderEndVO[] clientBills) {
        for (AggOrderEndVO clientBill : clientBills) {
        clientBill.getParentVO().setAttributeValue("approve_state", BillStatusEnum.FREE.value());
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
