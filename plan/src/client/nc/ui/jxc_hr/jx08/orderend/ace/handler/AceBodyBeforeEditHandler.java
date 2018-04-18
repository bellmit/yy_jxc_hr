package nc.ui.jxc_hr.jx08.orderend.ace.handler;

import nc.ui.jxc_hr.jx07.ref.DeptRefModel;
import nc.ui.jxc_hr.jx08.ref.GlRefModel;
import nc.ui.pub.beans.UIRefPane;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyBeforeEditEvent;
import nc.vo.jxc_hr.ordersheet.OrderEndSubVO;
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
//    	if("gl".equals(e.getKey())){
//    		//重设工令号参照
//            UIRefPane refPane=(UIRefPane) e.getBillCardPanel().getBodyItem("gl").getComponent();
//        	refPane.setRefModel(new GlRefModel());
//        	refPane.getRefModel().setRefTitle("自定义工令参照");
//    	}
    	
    }

}
