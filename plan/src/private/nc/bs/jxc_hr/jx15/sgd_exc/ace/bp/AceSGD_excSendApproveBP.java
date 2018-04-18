package nc.bs.jxc_hr.jx15.sgd_exc.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * 标准单据送审的BP
 */
public class AceSGD_excSendApproveBP {
  /**
   * 送审动作
   * 
   * @param vos 单据VO数组
   * @param script 单据动作脚本对象
   * @return 送审后的单据VO数组
   */
  
  public SGDVO_EXC[] sendApprove(SGDVO_EXC[] clientBills,
      SGDVO_EXC[] originBills) {
      for(SGDVO_EXC clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // 数据持久化
    SGDVO_EXC[] returnVos =
        new BillUpdate<SGDVO_EXC>().update(clientBills, originBills);
    return returnVos;
  }
}
