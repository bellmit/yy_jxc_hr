package nc.ui.jxc_hr.jx06.bgd.ace.handler;

import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardHeadTailAfterEditEvent;
import nc.vo.plan.jx06.BGDHVO;
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
		System.out.println(e.getValue());
    }

}
