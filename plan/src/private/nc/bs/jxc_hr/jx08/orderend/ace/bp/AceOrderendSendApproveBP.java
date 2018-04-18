package nc.bs.jxc_hr.jx08.orderend.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * 标准单据送审的BP
 */
public class AceOrderendSendApproveBP {
  /**
   * 送审动作
   * 
   * @param vos 单据VO数组
   * @param script 单据动作脚本对象
   * @return 送审后的单据VO数组
   */
  
  public AggOrderEndVO[] sendApprove(AggOrderEndVO[] clientBills,
      AggOrderEndVO[] originBills) {
      for(AggOrderEndVO clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approve_state", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // 数据持久化
    AggOrderEndVO[] returnVos =
        new BillUpdate<AggOrderEndVO>().update(clientBills, originBills);
    return returnVos;
  }
}
