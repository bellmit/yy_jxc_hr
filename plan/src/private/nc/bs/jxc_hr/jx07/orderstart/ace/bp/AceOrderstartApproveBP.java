package nc.bs.jxc_hr.jx07.orderstart.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.VOStatus;

/**
 * ��׼������˵�BP
 */
public class AceOrderstartApproveBP {

  /**
   * ��˶���
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public AggOrderStartVO[] approve(AggOrderStartVO[] clientBills,
      AggOrderStartVO[] originBills) {
    BillUpdate<AggOrderStartVO> update = new BillUpdate<AggOrderStartVO>();
    AggOrderStartVO[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
  
}
