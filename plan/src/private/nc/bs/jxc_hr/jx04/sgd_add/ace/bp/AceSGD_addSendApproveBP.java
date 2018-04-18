package nc.bs.jxc_hr.jx04.sgd_add.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AceSGD_addSendApproveBP {
  /**
   * ������
   * 
   * @param vos ����VO����
   * @param script ���ݶ����ű�����
   * @return �����ĵ���VO����
   */
  
  public SGDVO_ADD[] sendApprove(SGDVO_ADD[] clientBills,
      SGDVO_ADD[] originBills) {
      for(SGDVO_ADD clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // ���ݳ־û�
    SGDVO_ADD[] returnVos =
        new BillUpdate<SGDVO_ADD>().update(clientBills, originBills);
    return returnVos;
  }
}
