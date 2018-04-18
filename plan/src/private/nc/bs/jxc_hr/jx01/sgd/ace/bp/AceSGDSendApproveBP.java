package nc.bs.jxc_hr.jx01.sgd.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AceSGDSendApproveBP {
  /**
   * ������
   * 
   * @param vos ����VO����
   * @param script ���ݶ����ű�����
   * @return �����ĵ���VO����
   */
  
  public SGDVO[] sendApprove(SGDVO[] clientBills,
      SGDVO[] originBills) {
      for(SGDVO clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // ���ݳ־û�
    SGDVO[] returnVos =
        new BillUpdate<SGDVO>().update(clientBills, originBills);
    return returnVos;
  }
}
