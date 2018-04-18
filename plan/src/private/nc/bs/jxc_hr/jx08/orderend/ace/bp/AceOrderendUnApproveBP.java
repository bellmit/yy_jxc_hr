package nc.bs.jxc_hr.jx08.orderend.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceOrderendUnApproveBP {

  public AggOrderEndVO[] unApprove(AggOrderEndVO[] clientBills,
      AggOrderEndVO[] originBills) {
    BillUpdate<AggOrderEndVO> update = new BillUpdate<AggOrderEndVO>();
    AggOrderEndVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(AggOrderEndVO[] clientBills) {
        for (AggOrderEndVO clientBill : clientBills) {
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
