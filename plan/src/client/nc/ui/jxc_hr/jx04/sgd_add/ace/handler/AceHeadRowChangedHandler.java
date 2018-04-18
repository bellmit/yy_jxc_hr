package nc.ui.jxc_hr.jx04.sgd_add.ace.handler;

import java.awt.Color;

import nc.a.tools.all.PublicTools;
import nc.pub.templet.converter.util.helper.ExceptionUtils;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
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

public class AceHeadRowChangedHandler implements IAppEventHandler<AppEvent> {
	private ShowUpableBillListView listview;
	private nc.ui.pubapp.uif2app.model.BillManageModel model;

	public nc.ui.pubapp.uif2app.model.BillManageModel getModel() {
		return model;
	}

	public void setModel(nc.ui.pubapp.uif2app.model.BillManageModel model) {
		this.model = model;
	}

	public ShowUpableBillListView getListview() {
		return listview;
	}

	public void setListview(ShowUpableBillListView listview) {
		this.listview = listview;
	}

	@Override
	public void handleAppEvent(AppEvent e) {
		Object o = e.getType();
		if (e != null && AppEventConst.SELECTION_CHANGED.equals(e.getType())) {
			if (e.getSource() != null
					&& e.getSource() instanceof nc.ui.pubapp.uif2app.model.BillManageModel) {
				try {
					PublicTools.changeGsColor(getListview().getBillListPanel());
				} catch (BusinessException e1) {
					ExceptionUtils.wrapException(e1);
					e1.printStackTrace();
				}

				getListview().getBillListPanel().repaint();
			}
		} else if (e != null && "Show_Editor".equals(e.getType().toString())) {
			e = e;
		}

	}

}
