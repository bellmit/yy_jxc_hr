package nc.ui.jxc_hr.jx03.swlgs.ace.handler;

import nc.a.tools.all.BillIteamInfo;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.vo.plan.jx03.SWLGSBVO;
/**
 *单据表体字段编辑后事件
 * 
 * @since 6.0
 * @version 2011-7-12 下午08:17:33
 * @author duy
 */
public class AceBodyAfterEditHandler implements IAppEventHandler<CardBodyAfterEditEvent> {

    @Override
    public void handleAppEvent(CardBodyAfterEditEvent e) {
    	BillCardPanel blp = e.getBillCardPanel();
    	nc.a.tools.all.PublicTools.changeCardGsColor(blp, BillIteamInfo.Body);
    }

}
