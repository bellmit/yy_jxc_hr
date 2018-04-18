package nc.bs.jxc_hr.jx03.swlgs.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据审核的BP
 */
public class AceSWLGSApproveBP {

  /**
   * 审核动作
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public SWLGSVO[] approve(SWLGSVO[] clientBills,
      SWLGSVO[] originBills) {
    BillUpdate<SWLGSVO> update = new BillUpdate<SWLGSVO>();
    SWLGSVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
}
