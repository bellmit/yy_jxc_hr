package nc.bs.jxc_hr.jx08.orderend.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼�����ջص�BP
 */
public class AceOrderendUnSendApproveBP {
  public AggOrderEndVO[] unSend(AggOrderEndVO[] clientBills,
      AggOrderEndVO[] originBills) {
    // ��VO�־û������ݿ���
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
