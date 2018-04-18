package nc.ui.jxc_hr.jx01.sgd.ace.handler;

import nc.ui.jxc_hr.jx01.ref.DeptRefModel;
import nc.ui.pub.beans.UIRefPane;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyBeforeEditEvent;

/**
 * 表体字段编辑前事件处理类
 * 
 * @since 6.0
 * @version 2011-7-7 下午02:52:57
 * @author duy
 */
public class AceBodyBeforeEditHandler implements IAppEventHandler<CardBodyBeforeEditEvent> {

    @Override
    public void handleAppEvent(CardBodyBeforeEditEvent e) {
    	BillCardPanel panel=e.getBillCardPanel();
    	if("pk_dept".equals(e.getKey())){
    		UIRefPane refPane=(UIRefPane) panel.getBodyItem("pk_dept").getComponent();
    		refPane.setRefModel(new DeptRefModel());
    		refPane.getRefModel().setRefTitle("班组参照");
    	}
    	
    }

}
