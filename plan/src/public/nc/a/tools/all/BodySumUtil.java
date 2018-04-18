package nc.a.tools.all;

import nc.ui.pub.bill.BillCardPanel;
import nc.vo.pub.lang.UFDouble;

/**
 * ���幤ʱ�ϼ�
 * 
 * @author shidl
 * 
 */
public class BodySumUtil {

	/**
	 * 
	 * @param cpanel ��Ƭpanel
	 * @param headKey ��ͷ�ϼ��ֶα���
	 * @param bodyKey ����ϼ��ֶα���
	 */
	public static void BodySum(BillCardPanel cpanel, String headKey,
			String bodyKey) {

		int count = cpanel.getBillModel().getRowCount();

		UFDouble sumGS = UFDouble.ZERO_DBL;

		for (int i = 0; i < count; i++) {
			UFDouble gs = (UFDouble) cpanel.getBodyValueAt(i, bodyKey);
			if (null == gs) {
				gs = UFDouble.ZERO_DBL;
			}
			sumGS = sumGS.add(gs);
		}
		cpanel.setHeadItem(headKey, sumGS);
	}

}
