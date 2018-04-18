package nc.ui.jxc_hr.jx07.orderstart.ace.handler;

import nc.ui.jxc_hr.jx07.ref.DeptRefModel;
import nc.ui.pub.beans.UIRefPane;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyBeforeEditEvent;
import nc.vo.jxc_hr.ordersheet.OrderStartSubVO;
/**
 * �����ֶα༭ǰ�¼�������
 * 
 * @since 6.0
 * @version 2011-7-7 ����02:52:57
 * @author duy
 */
public class AceBodyBeforeEditHandler implements IAppEventHandler<CardBodyBeforeEditEvent> {

    @Override
    public void handleAppEvent(CardBodyBeforeEditEvent e) {
    	//���蹤��Ų���
        UIRefPane refPane=(UIRefPane) e.getBillCardPanel().getHeadItem("applydept").getComponent();
    		refPane.setRefModel(new DeptRefModel());
    		refPane.getRefModel().setRefTitle("���Ų���");
    }

}
