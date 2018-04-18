package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglUnApproveBP;
import nc.bs.jxc_hr.ht01.htgl.plugin.bpplugin.HtglPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.ht01.HTVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_HT01_UNAPPROVE extends AbstractPfAction<HTVO> {

  public N_HT01_UNAPPROVE() {
    super();
  }

  @Override
  protected CompareAroundProcesser<HTVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<HTVO> processor =
        new CompareAroundProcesser<HTVO>(
            HtglPluginPoint.UNAPPROVE);
   // TODO 在此处添加前后规则
		   IRule<HTVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				      return processor;
  }

  @Override
  protected HTVO[] processBP(Object userObj,
      HTVO[] clientFullVOs, HTVO[] originBills) {
    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		    }
		    HTVO[] bills = null;
      try {
          nc.itf.jxc_hr.ht01.IHtglMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.ht01.IHtglMaintain.class);
          bills=operator.unapprove(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return bills;
  }

}
