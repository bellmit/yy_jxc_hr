package nc.bs.jxc_hr.jx15.sgd_exc.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AceSGD_excSendApproveBP {
  /**
   * ������
   * 
   * @param vos ����VO����
   * @param script ���ݶ����ű�����
   * @return �����ĵ���VO����
   */
  
  public SGDVO_EXC[] sendApprove(SGDVO_EXC[] clientBills,
      SGDVO_EXC[] originBills) {
      for(SGDVO_EXC clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // ���ݳ־û�
    SGDVO_EXC[] returnVos =
        new BillUpdate<SGDVO_EXC>().update(clientBills, originBills);
    return returnVos;
  }
}
