package nc.ui.jxc_hr.jx15.sgd_exc.ace.handler;

import nc.a.tools.all.BillIteamInfo;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardHeadTailAfterEditEvent;
import nc.vo.plan.jx15.SGDHVO_EXC;
/**
 * 单据表头表尾字段编辑后事件处理类
 * 
 * @since 6.0
 * @version 2011-7-7 下午02:52:22
 * @author duy
 */
public class AceHeadTailAfterEditHandler implements IAppEventHandler<CardHeadTailAfterEditEvent> {

    @Override
    public void handleAppEvent(CardHeadTailAfterEditEvent e) {
    	BillCardPanel blp=e.getBillCardPanel();
		nc.a.tools.all.PublicTools.changeCardGsColor(blp, BillIteamInfo.Body);
    }

}
