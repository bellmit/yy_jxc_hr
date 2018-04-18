package nc.ui.jxc_hr.jx04.sgd_add.ace.handler;

import nc.a.tools.all.BillIteamInfo;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardHeadTailAfterEditEvent;
import nc.vo.plan.jx04.SGDHVO_ADD;

/**
 * ���ݱ�ͷ��β�ֶα༭���¼�������
 * 
 * @since 6.0
 * @version 2011-7-7 ����02:52:22
 * @author duy
 */
public class AceHeadTailAfterEditHandler implements
		IAppEventHandler<CardHeadTailAfterEditEvent> {

	@Override
	public void handleAppEvent(CardHeadTailAfterEditEvent e) {
		if ("addhours".equals(e.getKey())) {
			nc.a.tools.all.PublicTools.changeCardGsColor(e.getBillCardPanel(),
					BillIteamInfo.Head);
		}
	}

}
