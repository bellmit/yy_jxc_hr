package nc.ui.jxc_hr.jx01.sgd.ace.handler;

import java.awt.Color;

import nc.a.tools.all.PublicTools;
import nc.pub.templet.converter.util.helper.ExceptionUtils;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pub.bill.BillModel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyBeforeTabChangedEvent;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uif2.AppEvent;
import nc.ui.uif2.UIState;
import nc.ui.uif2.model.AppEventConst;
import nc.vo.pub.BusinessException;

public class AceCeShiHandler implements IAppEventHandler<CardBodyBeforeTabChangedEvent> {
	private ShowUpableBillListView listview;
	private nc.ui.pubapp.uif2app.model.BillManageModel model;
	
	public nc.ui.pubapp.uif2app.model.BillManageModel getModel() {
		return model;
	}
	public void setModel(nc.ui.pubapp.uif2app.model.BillManageModel model) {
		this.model = model;
	}
	private nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor;
	
	public nc.ui.pubapp.uif2app.view.ShowUpableBillForm getBillFormEditor() {
		return billFormEditor;
	}
	public void setBillFormEditor(
			nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor) {
		this.billFormEditor = billFormEditor;
	}
	public ShowUpableBillListView getListview() {
		return listview;
	}
	public void setListview(ShowUpableBillListView listview) {
		this.listview = listview;
	}
	@Override
    public void handleAppEvent(CardBodyBeforeTabChangedEvent e) {
		getBillFormEditor().getBillCardPanel().getBillModel().setForeground(Color.red, 1, 4);
	}

}
