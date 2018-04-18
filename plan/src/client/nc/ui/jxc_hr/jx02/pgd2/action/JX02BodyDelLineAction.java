package nc.ui.jxc_hr.jx02.pgd2.action;

import nc.a.tools.all.BodySumUtil;
import nc.vo.plan.jx02.PGDBVO01;
import nc.vo.plan.jx02.PGDHVO;
import nc.ui.pubapp.uif2app.actions.BodyDelLineAction;

public class JX02BodyDelLineAction extends BodyDelLineAction {

	public void doAction() {
		super.doAction();
		BodySumUtil.BodySum(getCardPanel(), PGDHVO.BODYGSTOTAL, PGDBVO01.ZGS);

	}

}
