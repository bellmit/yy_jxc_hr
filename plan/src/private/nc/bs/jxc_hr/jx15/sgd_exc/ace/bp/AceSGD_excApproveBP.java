package nc.bs.jxc_hr.jx15.sgd_exc.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.VOStatus;

/**
 * ��׼������˵�BP
 */
public class AceSGD_excApproveBP {

  /**
   * ��˶���
   * 
   * @param vos
   * @param script
   * @return
   */
  

  public SGDVO_EXC[] approve(SGDVO_EXC[] clientBills,
      SGDVO_EXC[] originBills) {
    BillUpdate<SGDVO_EXC> update = new BillUpdate<SGDVO_EXC>();
    SGDVO_EXC[] returnVos = update.update(clientBills, originBills);
    return returnVos;
  }
}
