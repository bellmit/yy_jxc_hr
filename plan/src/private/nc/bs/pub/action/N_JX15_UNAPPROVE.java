package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excUnApproveBP;
import nc.bs.jxc_hr.jx15.sgd_exc.plugin.bpplugin.SGD_excPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX15_UNAPPROVE extends AbstractPfAction<SGDVO_EXC> {

	public N_JX15_UNAPPROVE() {
		super();
	}

	@Override
	protected CompareAroundProcesser<SGDVO_EXC> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<SGDVO_EXC> processor = new CompareAroundProcesser<SGDVO_EXC>(
				SGD_excPluginPoint.UNAPPROVE);
		// TODO 在此处添加前后规则
		IRule<SGDVO_EXC> rule = null;
		rule = new nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule();

		processor.addBeforeRule(rule);
		rule =new nc.bs.jxc_hr.jx15.sgd_exc.rule.JX15BeforeUnApproveRule();
		processor.addBeforeRule(rule);
		return processor;
	}

	@Override
	protected SGDVO_EXC[] processBP(Object userObj, SGDVO_EXC[] clientFullVOs,
			SGDVO_EXC[] originBills) {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		SGDVO_EXC[] bills = null;
		try {
			nc.itf.jxc_hr.jx15.ISGD_excMaintain operator = NCLocator
					.getInstance().lookup(
							nc.itf.jxc_hr.jx15.ISGD_excMaintain.class);
			bills = operator.unapprove(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
