package nc.ui.jxc_hr.jx08.orderend.ace.handler;

import nc.ui.jxc_hr.jx07.ref.DeptRefModel;
import nc.ui.jxc_hr.jx08.ref.GlRefModel;
import nc.ui.pub.beans.UIRefPane;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyBeforeEditEvent;
import nc.vo.jxc_hr.ordersheet.OrderEndSubVO;
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
//    	if("gl".equals(e.getKey())){
//    		//���蹤��Ų���
//            UIRefPane refPane=(UIRefPane) e.getBillCardPanel().getBodyItem("gl").getComponent();
//        	refPane.setRefModel(new GlRefModel());
//        	refPane.getRefModel().setRefTitle("�Զ��幤�����");
//    	}
    	
    }

}
