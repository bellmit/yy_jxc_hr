package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addInsertBP;
import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addUpdateBP;
import nc.bs.jxc_hr.jx04.sgd_add.plugin.bpplugin.SGD_addPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jcom.lang.StringUtil;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX04_SAVEBASE extends AbstractPfAction<SGDVO_ADD> {

	@Override
	protected CompareAroundProcesser<SGDVO_ADD> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<SGDVO_ADD> processor = null;
		SGDVO_ADD[] clientFullVOs = (SGDVO_ADD[]) this.getVos();
		/*
		 * BillTransferTool<SGDVO_ADD> tool = new BillTransferTool<SGDVO_ADD>(
		 * clientFullVOs); clientFullVOs = tool.getClientFullInfoBill();
		 */
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<SGDVO_ADD>(
					SGD_addPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<SGDVO_ADD>(
					SGD_addPluginPoint.SCRIPT_INSERT);
		}
		// TODO 在此处添加前后规则
		IRule<SGDVO_ADD> rule = null;

		return processor;
	}

	@Override
	protected SGDVO_ADD[] processBP(Object userObj, SGDVO_ADD[] clientFullVOs,
			SGDVO_ADD[] originBills) {

		SGDVO_ADD[] bills = null;
		try {
			nc.itf.jxc_hr.jx04.ISGD_addMaintain operator = NCLocator
					.getInstance().lookup(
							nc.itf.jxc_hr.jx04.ISGD_addMaintain.class);
			if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
					.getPrimaryKey())) {
				bills = operator.update(clientFullVOs, originBills);
			} else {
				bills = operator.insert(clientFullVOs, originBills);
			}
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		return bills;
	}
}
