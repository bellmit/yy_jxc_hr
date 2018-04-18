package nc.ui.jxc_hr.jx01.sgd.ace.handler;

import java.awt.Color;

import nc.a.tools.all.BillIteamInfo;
import nc.a.tools.all.PublicTools;
import nc.pub.templet.converter.util.helper.ExceptionUtils;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uif2.AppEvent;
import nc.ui.uif2.UIState;
import nc.ui.uif2.model.AppEventConst;
import nc.vo.pub.BusinessException;

public class AceHeadRowChangedHandler implements IAppEventHandler<AppEvent> {
	private ShowUpableBillListView listview;
	private nc.ui.pubapp.uif2app.model.BillManageModel model;
	private nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor;
	
	public nc.ui.pubapp.uif2app.view.ShowUpableBillForm getBillFormEditor() {
		return billFormEditor;
	}
	public void setBillFormEditor(
			nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor) {
		this.billFormEditor = billFormEditor;
	}
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
		if(e!=null&&AppEventConst.SELECTION_CHANGED.equals(e.getType())){
			if(e.getSource()!=null &&e.getSource() instanceof nc.ui.pubapp.uif2app.model.BillManageModel){
				try {
					if(getListview()==null){
						PublicTools.changeCardGsColor(getBillFormEditor().getBillCardPanel(),BillIteamInfo.Body);
					}else{
						PublicTools.changeGsColor(getListview().getBillListPanel());
					}					
				} catch (BusinessException e1) {
					ExceptionUtils.wrapException(e1);
					e1.printStackTrace();
				}

				getListview().getBillListPanel().repaint();	
			}
		}    	
    }

}
