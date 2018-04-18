package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.jxc_hr.jx04.sgd_add.plugin.bpplugin.SGD_addPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_JX04_APPROVE extends AbstractPfAction<SGDVO_ADD> {

  public N_JX04_APPROVE() {
    super();
  }

  @Override
  protected CompareAroundProcesser<SGDVO_ADD> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<SGDVO_ADD> processor =
        new CompareAroundProcesser<SGDVO_ADD>(
            SGD_addPluginPoint.APPROVE);
   IRule<SGDVO_ADD> rule=null;
	rule = new nc.bs.pubapp.pub.rule.ApproveStatusCheckRule();				   				   				    				   				   
	processor.addBeforeRule(rule);
	rule = new nc.bs.jxc_hr.jx04.sgd_add.rule.JX04AfterApproveRule();//施工增补单取消审批时回写增补工时
	processor.addAfterRule(rule);
	return processor;
  }
  
  @Override
  protected SGDVO_ADD[] processBP(Object userObj,
		  SGDVO_ADD[] clientFullVOs, SGDVO_ADD[] originBills) {
	  SGDVO_ADD[] bills = null;
		      nc.itf.jxc_hr.jx04.ISGD_addMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx04.ISGD_addMaintain.class);
      try {
          bills=operator.approve(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
