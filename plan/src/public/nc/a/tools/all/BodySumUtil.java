package nc.a.tools.all;

import nc.ui.pub.bill.BillCardPanel;
import nc.vo.pub.lang.UFDouble;

/**
 * 表体工时合计
 * 
 * @author shidl
 * 
 */
public class BodySumUtil {

	/**
	 * 
	 * @param cpanel 卡片panel
	 * @param headKey 表头合计字段编码
	 * @param bodyKey 表体合计字段编码
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
