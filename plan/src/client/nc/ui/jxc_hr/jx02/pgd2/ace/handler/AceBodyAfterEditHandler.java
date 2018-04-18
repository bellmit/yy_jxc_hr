package nc.ui.jxc_hr.jx02.pgd2.ace.handler;

import nc.a.tools.all.BillIteamInfo;
import nc.a.tools.all.BodySumUtil;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pub.bill.BillItem;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.vo.plan.jx02.PGDBVO01;
import nc.vo.plan.jx02.PGDHVO;

/**
 * ���ݱ����ֶα༭���¼�
 * 
 * @since 6.0
 * @version 2011-7-12 ����08:17:33
 * @author duy
 */
public class AceBodyAfterEditHandler implements
		IAppEventHandler<CardBodyAfterEditEvent> {

	@Override
	public void handleAppEvent(CardBodyAfterEditEvent e) {
		BillCardPanel blp = e.getBillCardPanel();
		// ���幤ʱ����
		if ("zgs".equals(e.getKey())) {
			// BillItem[] bis = blp.getBodyItems();
			// for (int i = 0; i < bis.length; i++) {
			// if (bis[i].getKey().equals("zgs")) {// �ж��Ƿ�Ϊ�ܹ�ʱ
			// int row = blp.getRowCount();// ��ȡ��������
			// double sum = 0;
			// for (int j = 0; j < row; j++) {
			// Object temp = blp.getBodyValueAt(j, bis[i].getKey());
			// if (temp == null) {
			// temp = 0;4555
			// }
			// sum = Double.parseDouble(temp.toString()) + sum;
			// }
			// blp.setHeadItem("bodygstotal", sum);
			// }
			// }
			BodySumUtil.BodySum(blp, PGDHVO.BODYGSTOTAL, PGDBVO01.ZGS);
		}		
			nc.a.tools.all.PublicTools.changeCardGsColor(blp, BillIteamInfo.Body);
		 
			
		// ��ͷԱ����Ĭ��Ϊ�������õļӹ��� 20170524
		if ("people".equals(e.getKey())) {
			String people = e.getValue().toString() == null ? "" : e.getValue().toString();
			BillItem[] bis = blp.getHeadItems(); // ��ȡ��ͷ�ϵ������ֶ�
			for (int i = 0; i < bis.length; i++) {
				if (bis[i].getKey().equals("people")) {// �ж���Ա��
					blp.setHeadItem("people", people); // �ѱ�����Ա��ӵ���ͷ
					
				}
			}
		}
	}

}
