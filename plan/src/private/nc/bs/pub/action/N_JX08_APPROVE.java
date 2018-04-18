package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendApproveBP;
import nc.bs.jxc_hr.jx08.orderend.plugin.bpplugin.OrderendPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX08_APPROVE extends AbstractPfAction<AggOrderEndVO> {

	public N_JX08_APPROVE() {
		super();
	}

	@Override
	protected CompareAroundProcesser<AggOrderEndVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<AggOrderEndVO> processor = new CompareAroundProcesser<AggOrderEndVO>(
				OrderendPluginPoint.APPROVE);
		IRule<AggOrderEndVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.ApproveStatusCheckRule();

		processor.addBeforeRule(rule);
		
		rule = new nc.bs.jxc_hr.bg.orderend.ace.rule.StopGLdefdocRule();
		
		processor.addAfterRule(rule);
		
		rule=new nc.bs.jxc_hr.bg.orderend.ace.rule.AfterApproveRule();
		processor.addAfterRule(rule);

		return processor;
	}

	@Override
	protected AggOrderEndVO[] processBP(Object userObj,
			AggOrderEndVO[] clientFullVOs, AggOrderEndVO[] originBills) {
		AggOrderEndVO[] bills = null;
		nc.itf.jxc_hr.jx08.IOrderendMaintain operator = NCLocator.getInstance()
				.lookup(nc.itf.jxc_hr.jx08.IOrderendMaintain.class);
		try {
			bills = operator.approve(clientFullVOs, originBills);
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}

}
