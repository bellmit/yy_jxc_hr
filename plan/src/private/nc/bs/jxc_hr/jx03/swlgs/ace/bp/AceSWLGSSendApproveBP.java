package nc.bs.jxc_hr.jx03.swlgs.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AceSWLGSSendApproveBP {
  /**
   * ������
   * 
   * @param vos ����VO����
   * @param script ���ݶ����ű�����
   * @return �����ĵ���VO����
   */
  
  public SWLGSVO[] sendApprove(SWLGSVO[] clientBills,
      SWLGSVO[] originBills) {
      for(SWLGSVO clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // ���ݳ־û�
    SWLGSVO[] returnVos =
        new BillUpdate<SWLGSVO>().update(clientBills, originBills);
    return returnVos;
  }
}
