package nc.bs.jxc_hr.jx04.sgd_add.ace.bp;

import nc.impl.jxc_hr.tools.PushActionImpl;
import nc.impl.pubapp.pattern.data.bill.BillUpdate;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * ��׼������˵�BP
 */
public class AceSGD_addApproveBP {

	/**
	 * ��˶���
	 * 
	 * @param vos
	 * @param script
	 * @return
	 */

	public SGDVO_ADD[] approve(SGDVO_ADD[] clientBills, SGDVO_ADD[] originBills) {
		BillUpdate<SGDVO_ADD> update = new BillUpdate<SGDVO_ADD>();
		SGDVO_ADD[] returnVos = update.update(clientBills, originBills);
		return returnVos;
	}

	/**
	 * ���������
	 * 
	 * @author ������20170217
	 * @param processor
	 */
	private void addAfterRule(SGDVO_ADD[] clientBills) {
		PushActionImpl pushimpl = new PushActionImpl();
		try {
			pushimpl.insert((SuperVO[]) clientBills[0].getChildrenVO(), null,
					null);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException("ʩ�����������ɹ����쳣��");
			e.printStackTrace();
		}
	}

}
