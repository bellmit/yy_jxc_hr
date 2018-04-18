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
 * 单据表体字段编辑后事件
 * 
 * @since 6.0
 * @version 2011-7-12 下午08:17:33
 * @author duy
 */
public class AceBodyAfterEditHandler implements
		IAppEventHandler<CardBodyAfterEditEvent> {

	@Override
	public void handleAppEvent(CardBodyAfterEditEvent e) {
		BillCardPanel blp = e.getBillCardPanel();
		// 表体工时汇总
		if ("zgs".equals(e.getKey())) {
			// BillItem[] bis = blp.getBodyItems();
			// for (int i = 0; i < bis.length; i++) {
			// if (bis[i].getKey().equals("zgs")) {// 判断是否为总工时
			// int row = blp.getRowCount();// 获取表体行数
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
		 
			
		// 表头员工，默认为表体设置的加工人 20170524
		if ("people".equals(e.getKey())) {
			String people = e.getValue().toString() == null ? "" : e.getValue().toString();
			BillItem[] bis = blp.getHeadItems(); // 获取表头上的所有字段
			for (int i = 0; i < bis.length; i++) {
				if (bis[i].getKey().equals("people")) {// 判断是员工
					blp.setHeadItem("people", people); // 把表体人员添加到表头
					
				}
			}
		}
	}

}
