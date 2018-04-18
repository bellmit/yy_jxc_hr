package nc.bs.jxc_hr.jx08.orderend.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据审核的BP
 */
public class AceOrderendApproveBP {

  /**
   * 审核动作
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public AggOrderEndVO[] approve(AggOrderEndVO[] clientBills,
      AggOrderEndVO[] originBills) {
    BillUpdate<AggOrderEndVO> update = new BillUpdate<AggOrderEndVO>();
    AggOrderEndVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
}
