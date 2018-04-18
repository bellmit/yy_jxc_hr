package nc.bs.jxc_hr.jx02.pgd2.ace.bp;

import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;

/**
 * ��׼���������BP
 */
public class AcePGD2SendApproveBP {
  /**
   * ������
   * 
   * @param vos ����VO����
   * @param script ���ݶ����ű�����
   * @return �����ĵ���VO����
   */
  
  public PGDVO[] sendApprove(PGDVO[] clientBills,
      PGDVO[] originBills) {
      for(PGDVO clientFullVO:clientBills){
		          clientFullVO.getParentVO().setAttributeValue("approvestatus", BillStatusEnum.COMMIT.value());
		          clientFullVO.getParentVO().setStatus(VOStatus.UPDATED);
	      }
    // ���ݳ־û�
    PGDVO[] returnVos =
        new BillUpdate<PGDVO>().update(clientBills, originBills);
    return returnVos;
  }
}
