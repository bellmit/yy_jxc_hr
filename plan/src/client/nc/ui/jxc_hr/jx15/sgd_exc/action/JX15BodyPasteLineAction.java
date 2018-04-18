package nc.ui.jxc_hr.jx15.sgd_exc.action;

import nc.a.tools.all.BodySumUtil;
import nc.ui.pubapp.uif2app.actions.BodyPasteLineAction;
import nc.vo.plan.jx15.SGDBVO_EXC;
import nc.vo.plan.jx15.SGDHVO_EXC;

public class JX15BodyPasteLineAction extends BodyPasteLineAction {

	public void doAction() {
		super.doAction();
		BodySumUtil.BodySum(getCardPanel(), SGDHVO_EXC.EXCHOURS, SGDBVO_EXC.EXCHOURS_B);

	}
}
