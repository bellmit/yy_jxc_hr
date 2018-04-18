package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excApproveBP;
import nc.bs.jxc_hr.jx15.sgd_exc.plugin.bpplugin.SGD_excPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX15_APPROVE extends AbstractPfAction<SGDVO_EXC> {

	public N_JX15_APPROVE() {
		super();
	}

	@Override
	protected CompareAroundProcesser<SGDVO_EXC> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<SGDVO_EXC> processor = new CompareAroundProcesser<SGDVO_EXC>(
				SGD_excPluginPoint.APPROVE);
		IRule<SGDVO_EXC> rule = null;
		rule = new nc.bs.pubapp.pub.rule.ApproveStatusCheckRule();

		processor.addBeforeRule(rule);
		rule=new nc.bs.jxc_hr.jx15.sgd_exc.rule.JX15AfterApproveRule();
		processor.addAfterRule(rule);

		return processor;
	}

	@Override
	protected SGDVO_EXC[] processBP(Object userObj, SGDVO_EXC[] clientFullVOs,
			SGDVO_EXC[] originBills) {
		SGDVO_EXC[] bills = null;
		nc.itf.jxc_hr.jx15.ISGD_excMaintain operator = NCLocator.getInstance()
				.lookup(nc.itf.jxc_hr.jx15.ISGD_excMaintain.class);
		try {
			bills = operator.approve(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
