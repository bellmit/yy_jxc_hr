package nc.bs.jxc_hr.ht01.htgl.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.ht01.HTVO;
import nc.vo.pub.VOStatus;

/**
 * ��׼������˵�BP
 */
public class AceHtglApproveBP {

  /**
   * ��˶���
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public HTVO[] approve(HTVO[] clientBills,
      HTVO[] originBills) {
    BillUpdate<HTVO> update = new BillUpdate<HTVO>();
    HTVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
}
