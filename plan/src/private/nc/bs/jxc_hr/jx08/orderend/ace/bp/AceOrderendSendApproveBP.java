package nc.bs.jxc_hr.jx08.orderend.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AceOrderendSendApproveBP {
  /**
   * ������
   * 
   * @param vos ����VO����
   * @param script ���ݶ����ű�����
   * @return �����ĵ���VO����
   */
  
  public AggOrderEndVO[] sendApprove(AggOrderEndVO[] clientBills,
      AggOrderEndVO[] originBills) {
      for(AggOrderEndVO clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approve_state", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // ���ݳ־û�
    AggOrderEndVO[] returnVos =
        new BillUpdate<AggOrderEndVO>().update(clientBills, originBills);
    return returnVos;
  }
}
