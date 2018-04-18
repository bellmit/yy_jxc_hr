package nc.bs.jxc_hr.jx06.bgd.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据审核的BP
 */
public class AceBGDApproveBP {

  /**
   * 审核动作
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public BGDVO[] approve(BGDVO[] clientBills,
      BGDVO[] originBills) {
    BillUpdate<BGDVO> update = new BillUpdate<BGDVO>();
    BGDVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
}
