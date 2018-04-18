package nc.ui.jxc_hr.jx08.orderend.ace.handler;

import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardHeadTailAfterEditEvent;
import nc.vo.jxc_hr.ordersheet.OrderEndVO;
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
    	System.out.println(e.getKey());
    }

}
