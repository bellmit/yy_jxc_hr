package nc.ui.jxc_hr.jx01.sgd.action;

import nc.a.tools.all.BodySumUtil;
import nc.ui.pubapp.uif2app.actions.BodyPasteLineAction;
import nc.vo.plan.jx01.SGDBVO;
import nc.vo.plan.jx01.SGDHVO;

public class JX01BodyPasteLineAction extends BodyPasteLineAction {

	public void doAction() {
		super.doAction();
		BodySumUtil.BodySum(getCardPanel(), SGDHVO.TOTALGS, SGDBVO.GS);

	}
}
