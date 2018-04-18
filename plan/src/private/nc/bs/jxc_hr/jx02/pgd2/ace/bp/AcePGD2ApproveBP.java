package nc.bs.jxc_hr.jx02.pgd2.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.VOStatus;

/**
 * 标准单据审核的BP
 */
public class AcePGD2ApproveBP {

  /**
   * 审核动作
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public PGDVO[] approve(PGDVO[] clientBills,
      PGDVO[] originBills) {
    BillUpdate<PGDVO> update = new BillUpdate<PGDVO>();
    PGDVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
}
