package nc.bs.jxc_hr.jx02.pgd2.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * 标准单据送审的BP
 */
public class AcePGD2SendApproveBP {
  /**
   * 送审动作
   * 
   * @param vos 单据VO数组
   * @param script 单据动作脚本对象
   * @return 送审后的单据VO数组
   */
  
  public PGDVO[] sendApprove(PGDVO[] clientBills,
      PGDVO[] originBills) {
      for(PGDVO clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // 数据持久化
    PGDVO[] returnVos =
        new BillUpdate<PGDVO>().update(clientBills, originBills);
    return returnVos;
  }
}
