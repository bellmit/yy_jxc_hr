package nc.bs.jxc_hr.jx07.orderstart.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * 标准单据送审的BP
 */
public class AceOrderstartSendApproveBP {
  /**
   * 送审动作
   * 
   * @param vos 单据VO数组
   * @param script 单据动作脚本对象
   * @return 送审后的单据VO数组
   */
  
  public AggOrderStartVO[] sendApprove(AggOrderStartVO[] clientBills,
      AggOrderStartVO[] originBills) {
      for(AggOrderStartVO clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approve_state", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // 数据持久化
    AggOrderStartVO[] returnVos =
        new BillUpdate<AggOrderStartVO>().update(clientBills, originBills);
    return returnVos;
  }
}
