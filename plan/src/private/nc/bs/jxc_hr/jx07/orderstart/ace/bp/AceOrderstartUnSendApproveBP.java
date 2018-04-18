package nc.bs.jxc_hr.jx07.orderstart.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.VOStatus;
import nc.vo.pub.pf.BillStatusEnum;

/**
 * ��׼�����ջص�BP
 */
public class AceOrderstartUnSendApproveBP {
  public AggOrderStartVO[] unSend(AggOrderStartVO[] clientBills,
      AggOrderStartVO[] originBills) {
    // ��VO�־û������ݿ���
    this.setHeadVOStatus(clientBills);
    BillUpdate<AggOrderStartVO> update = new BillUpdate<AggOrderStartVO>();
    AggOrderStartVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(AggOrderStartVO[] clientBills) {
        for (AggOrderStartVO clientBill : clientBills) {
        clientBill.getParentVO().setAttributeValue("approve_state", BillStatusEnum.FREE.value());
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
