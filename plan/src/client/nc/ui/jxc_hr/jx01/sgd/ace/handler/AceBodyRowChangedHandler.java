package nc.ui.jxc_hr.jx01.sgd.ace.handler;

import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.list.ListBodyRowChangedEvent;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
/**
 *单据表体字段编辑后事件
 * 
 * @since 6.0
 * @version 2011-7-12 下午08:17:33
 * @author duy
 */
public class AceBodyRowChangedHandler implements IAppEventHandler<ListBodyRowChangedEvent> {
	
	private nc.ui.jxc_hr.jx01.sgd.action.PushAction pushaction;

	public nc.ui.jxc_hr.jx01.sgd.action.PushAction getPushaction() {
		return pushaction;
	}

	public void setPushaction(nc.ui.jxc_hr.jx01.sgd.action.PushAction pushaction) {
		this.pushaction = pushaction;
	}
    @Override
    public void handleAppEvent(ListBodyRowChangedEvent e) {
    	int brow = getPushaction().getListview().getBillListPanel().getBodyTable().getSelectedRowCount();
    	if(brow!=1){
    		getPushaction().setEnabled(false);
    	}else{
    		getPushaction().setEnabled(true);
    	}	
    }

}
