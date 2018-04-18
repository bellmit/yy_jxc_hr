package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addUnApproveBP;
import nc.bs.jxc_hr.jx04.sgd_add.plugin.bpplugin.SGD_addPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX04_UNAPPROVE extends AbstractPfAction<SGDVO_ADD> {

  public N_JX04_UNAPPROVE() {
    super();
  }

  @Override
  protected CompareAroundProcesser<SGDVO_ADD> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<SGDVO_ADD> processor =
        new CompareAroundProcesser<SGDVO_ADD>(
            SGD_addPluginPoint.UNAPPROVE);
   // TODO 在此处添加前后规则
		   IRule<SGDVO_ADD> rule=null;
		rule = new nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule();				   				   				    				   				   
		processor.addBeforeRule(rule);
		rule =new nc.bs.jxc_hr.jx04.sgd_add.rule.JX04BeforeUnApproveRule();		
		processor.addBeforeRule(rule);
		rule =new nc.bs.jxc_hr.jx04.sgd_add.rule.JX04AfterUNApproveRule();//施工增补单取消审批时回滚增补工时
		processor.addAfterRule(rule);
		return processor;
  }

  @Override
  protected SGDVO_ADD[] processBP(Object userObj,
      SGDVO_ADD[] clientFullVOs, SGDVO_ADD[] originBills) {
    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		    }
		    SGDVO_ADD[] bills = null;
      try {
          nc.itf.jxc_hr.jx04.ISGD_addMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx04.ISGD_addMaintain.class);
          bills=operator.unapprove(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return bills;
  }

}
