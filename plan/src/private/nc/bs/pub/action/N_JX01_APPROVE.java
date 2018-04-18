package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDApproveBP;
import nc.bs.jxc_hr.jx01.sgd.plugin.bpplugin.SGDPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx01.SGDVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX01_APPROVE extends AbstractPfAction<SGDVO> {

	public N_JX01_APPROVE() {
		super();
	}

	@Override
	protected CompareAroundProcesser<SGDVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<SGDVO> processor = new CompareAroundProcesser<SGDVO>(
				SGDPluginPoint.APPROVE);
		IRule<SGDVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.ApproveStatusCheckRule();

		processor.addBeforeRule(rule);

		return processor;
	}

	@Override
	protected SGDVO[] processBP(Object userObj, SGDVO[] clientFullVOs,
			SGDVO[] originBills) {
		SGDVO[] bills = null;
		nc.itf.jxc_hr.jx01.ISGDMaintain operator = NCLocator.getInstance()
				.lookup(nc.itf.jxc_hr.jx01.ISGDMaintain.class);
		try {
			bills = operator.approve(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
