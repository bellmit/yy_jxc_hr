package nc.ui.jxc_hr.jx08.orderend.ace.handler;

import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardHeadTailAfterEditEvent;
import nc.vo.jxc_hr.ordersheet.OrderEndVO;
/**
 * ���ݱ�ͷ��β�ֶα༭���¼�������
 * 
 * @since 6.0
 * @version 2011-7-7 ����02:52:22
 * @author duy
 */
public class AceHeadTailAfterEditHandler implements IAppEventHandler<CardHeadTailAfterEditEvent> {

    @Override
    public void handleAppEvent(CardHeadTailAfterEditEvent e) {
    	System.out.println(e.getKey());
    }

}
