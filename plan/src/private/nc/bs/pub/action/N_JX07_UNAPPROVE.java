package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.jxc_hr.jx07.orderstart.plugin.bpplugin.OrderstartPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_JX07_UNAPPROVE extends AbstractPfAction<AggOrderStartVO> {

	public N_JX07_UNAPPROVE() {
		super();
	}

	@Override
	protected CompareAroundProcesser<AggOrderStartVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggOrderStartVO> processor = new CompareAroundProcesser<AggOrderStartVO>(
				OrderstartPluginPoint.UNAPPROVE);
		// TODO 在此处添加前后规则
		IRule<AggOrderStartVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule();

		processor.addBeforeRule(rule);
		
		rule = new nc.bs.jxc_hr.bg.orderstart.ace.rule.BeforeUnApproveRule();
		
		processor.addBeforeRule(rule);

		return processor;
	}

	@Override
	protected AggOrderStartVO[] processBP(Object userObj,
			AggOrderStartVO[] clientFullVOs, AggOrderStartVO[] originBills) {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AggOrderStartVO[] bills = null;
		try {
			nc.itf.jxc_hr.jx07.IOrderstartMaintain operator = NCLocator
					.getInstance().lookup(
							nc.itf.jxc_hr.jx07.IOrderstartMaintain.class);
			bills = operator.unapprove(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
