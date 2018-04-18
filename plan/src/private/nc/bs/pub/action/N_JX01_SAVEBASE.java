package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDInsertBP;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDUpdateBP;
import nc.bs.jxc_hr.jx01.sgd.plugin.bpplugin.SGDPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jcom.lang.StringUtil;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX01_SAVEBASE extends AbstractPfAction<SGDVO> {

	@Override
	protected CompareAroundProcesser<SGDVO> getCompareAroundProcesserWithRules(
			Object userObj) {
		CompareAroundProcesser<SGDVO> processor = null;
		SGDVO[] clientFullVOs = (SGDVO[]) this.getVos();
		/*
		 * BillTransferTool<SGDVO> tool = new BillTransferTool<SGDVO>(
		 * clientFullVOs); clientFullVOs = tool.getClientFullInfoBill();
		 */
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<SGDVO>(
					SGDPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<SGDVO>(
					SGDPluginPoint.SCRIPT_INSERT);
		}
		// TODO 在此处添加前后规则
		IRule<SGDVO> rule = null;

		return processor;
	}

	@Override
	protected SGDVO[] processBP(Object userObj, SGDVO[] clientFullVOs,
			SGDVO[] originBills) {

		SGDVO[] bills = null;
		try {
			nc.itf.jxc_hr.jx01.ISGDMaintain operator = NCLocator.getInstance()
					.lookup(nc.itf.jxc_hr.jx01.ISGDMaintain.class);
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
