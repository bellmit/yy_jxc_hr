package nc.ui.jxc_hr.jx04.sgd_add.ace.handler;

import java.awt.Color;

import nc.a.tools.all.BillIteamInfo;
import nc.a.tools.all.PublicTools;
import nc.pub.templet.converter.util.helper.ExceptionUtils;
import nc.ui.pubapp.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardPanelEvent;
import nc.ui.pubapp.uif2app.event.card.CardPanelLoadEvent;
import nc.ui.pubapp.uif2app.event.list.ListBodyRowChangedEvent;
import nc.ui.pubapp.uif2app.event.list.ListBodyRowStateChangeEvent;
import nc.ui.pubapp.uif2app.event.list.ListBodyTotalEvent;
import nc.ui.pubapp.uif2app.event.list.ListHeadRowChangedEvent;
import nc.ui.pubapp.uif2app.event.list.ListHeadRowStateChangeEvent;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uif2.AppEvent;
import nc.ui.uif2.model.AppEventConst;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;

public class AceCardLoadHandler implements IAppEventHandler<CardPanelEvent> {
	@Override
	public void handleAppEvent(CardPanelEvent e) {
		PublicTools.changeCardGsColor(e.getBillCardPanel(), BillIteamInfo.Head);
	}

}
