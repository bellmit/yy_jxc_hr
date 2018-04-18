package nc.a.tools.all;

import java.awt.Color;
import java.util.Arrays;

import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pub.bill.BillItem;
import nc.ui.pub.bill.BillListPanel;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class PublicTools {

	public static String[] keys = { "gs", "zgs", "zbgs", "swlgs", "addhours",
			"exchours" };

	public static void changeGsColor(BillListPanel billListPanel)
			throws BusinessException {
		// ������20170216 ��ӱ��幤ʱ�Ƿ������ж�
		if (billListPanel == null) {
			throw new BusinessException("�б���ͼΪ�գ�");
		}
		BillListPanel blp = billListPanel;
		BillItem[] bis = blp.getBodyBillModel().getBodyItems();
		for (int i = 0; i < bis.length; i++) {
			int row = blp.getBodyBillModel().getRowCount();// ��ȡ��������
			if (Arrays.asList(keys).contains(bis[i].getKey())) {// �ж��Ƿ�Ϊ��ʱ
				if (row > 0) {
					for (int j = 0; j < row; j++) {
						Object value = blp.getBodyBillModel().getValueAt(j,
								bis[i].getKey());
						if (value != null
								&& Double.parseDouble(value.toString()) < 0) {
							blp.getBodyBillModel().setForeground(Color.red, j,
									i);
						} else {
							blp.getBodyBillModel().setForeground(Color.black,
									j, i);
						}
					}
				}
			}
		}
	}

	public static void changeCardGsColor(
			nc.ui.pub.bill.BillCardPanel billCardPanel, BillIteamInfo billInfo) {
		// ������20170216 ��ӱ��幤ʱ�Ƿ������ж�
		if (billCardPanel == null) {
			ExceptionUtils.wrappBusinessException("��Ƭ��ͼ����Ϊ��");
		}
		Boolean errorFlag = false;
		BillCardPanel bcp = billCardPanel;
		if ("head".equals(billInfo.getValue())) {
			for (String key : keys) {
				BillItem headItem = bcp.getHeadItem(key);
				if (headItem != null) {
					Object value = headItem.getValueObject();
					if (value != null
							&& Double.parseDouble(value.toString()) < 0) {
						errorFlag = true;
						// bcp.getBillModel().setForeground(Color.red,
						// j,
						// i);
						bcp.setHeadItem(key, null);
					}
				}
			}
		}
		if ("body".equals(billInfo.getValue())) {
			BillItem[] bis = bcp.getBodyItems();
			for (int i = 0; i < bis.length; i++) {
				int rows = bcp.getRowCount();// ��ȡ��������
				if (Arrays.asList(keys).contains(bis[i].getKey())) {// �ж��Ƿ�Ϊ��ʱ
					if (rows > 0) {
						for (int j = 0; j < rows; j++) {
							Object value = bcp.getBodyValueAt(j,
									bis[i].getKey());
							if (value != null
									&& Double.parseDouble(value.toString()) < 0) {
								errorFlag = true;
								// bcp.getBillModel().setForeground(Color.red,
								// j,
								// i);
								bcp.setBodyValueAt(null, j, bis[i].getKey());
							} else {
								bcp.getBillModel().setForeground(Color.black,
										j, i);
							}
						}
					}
				}
			}
		}
		if (errorFlag) {
			ExceptionUtils.wrappBusinessException("��ʱ����Ϊ����");
		}
	}
}
