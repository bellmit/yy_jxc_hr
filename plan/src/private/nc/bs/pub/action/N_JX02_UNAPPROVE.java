package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2UnApproveBP;
import nc.bs.jxc_hr.jx02.pgd2.plugin.bpplugin.PGD2PluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx02.PGDVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX02_UNAPPROVE extends AbstractPfAction<PGDVO> {

	public N_JX02_UNAPPROVE() {
		super();
	}

	@Override
	protected CompareAroundProcesser<PGDVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<PGDVO> processor = new CompareAroundProcesser<PGDVO>(
				PGD2PluginPoint.UNAPPROVE);
		// TODO �ڴ˴����ǰ�����
		IRule<PGDVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule();
		processor.addBeforeRule(rule);
		
		rule=new nc.bs.jxc_hr.jx02.pgd2.rule.BeforeUnApproveRule();
		processor.addBeforeRule(rule);

		return processor;
	}

	@Override
	protected PGDVO[] processBP(Object userObj, PGDVO[] clientFullVOs,
			PGDVO[] originBills) {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		PGDVO[] bills = null;
		try {
			nc.itf.jxc_hr.jx02.IPGD2Maintain operator = NCLocator.getInstance()
					.lookup(nc.itf.jxc_hr.jx02.IPGD2Maintain.class);
			bills = operator.unapprove(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
