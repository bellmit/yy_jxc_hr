package nc.bs.jxc_hr.jx07.orderstart.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据弃审的BP
 */
public class AceOrderstartUnApproveBP {

  public AggOrderStartVO[] unApprove(AggOrderStartVO[] clientBills,
      AggOrderStartVO[] originBills) {
    BillUpdate<AggOrderStartVO> update = new BillUpdate<AggOrderStartVO>();
    AggOrderStartVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
  private void setHeadVOStatus(AggOrderStartVO[] clientBills) {
        for (AggOrderStartVO clientBill : clientBills) {
            clientBill.getParentVO().setStatus(VOStatus.UPDATED);
        }
    }
}
