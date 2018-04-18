package nc.bs.jxc_hr.jx07.orderstart.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AceOrderstartSendApproveBP {
  /**
   * ������
   * 
   * @param vos ����VO����
   * @param script ���ݶ����ű�����
   * @return �����ĵ���VO����
   */
  
  public AggOrderStartVO[] sendApprove(AggOrderStartVO[] clientBills,
      AggOrderStartVO[] originBills) {
      for(AggOrderStartVO clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approve_state", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // ���ݳ־û�
    AggOrderStartVO[] returnVos =
        new BillUpdate<AggOrderStartVO>().update(clientBills, originBills);
    return returnVos;
  }
}
