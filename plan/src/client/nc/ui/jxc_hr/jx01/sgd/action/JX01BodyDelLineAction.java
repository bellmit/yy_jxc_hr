package nc.ui.jxc_hr.jx01.sgd.action;

import nc.a.tools.all.BodySumUtil;
import nc.ui.pubapp.uif2app.actions.BodyDelLineAction;
import nc.vo.plan.jx01.SGDBVO;
import nc.vo.plan.jx01.SGDHVO;

public class JX01BodyDelLineAction extends BodyDelLineAction {

	public void doAction() {
		super.doAction();
		BodySumUtil.BodySum(getCardPanel(), SGDHVO.TOTALGS, SGDBVO.GS);

	}
}
