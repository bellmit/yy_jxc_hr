package nc.bs.jxc_hr.jx04.sgd_add.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * 标准单据送审的BP
 */
public class AceSGD_addSendApproveBP {
  /**
   * 送审动作
   * 
   * @param vos 单据VO数组
   * @param script 单据动作脚本对象
   * @return 送审后的单据VO数组
   */
  
  public SGDVO_ADD[] sendApprove(SGDVO_ADD[] clientBills,
      SGDVO_ADD[] originBills) {
      for(SGDVO_ADD clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // 数据持久化
    SGDVO_ADD[] returnVos =
        new BillUpdate<SGDVO_ADD>().update(clientBills, originBills);
    return returnVos;
  }
}
