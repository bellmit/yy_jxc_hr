package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDUnApproveBP;
import nc.bs.jxc_hr.jx06.bgd.plugin.bpplugin.BGDPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx06.BGDVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX06_UNAPPROVE extends AbstractPfAction<BGDVO> {

  public N_JX06_UNAPPROVE() {
    super();
  }

  @Override
  protected CompareAroundProcesser<BGDVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<BGDVO> processor =
        new CompareAroundProcesser<BGDVO>(
            BGDPluginPoint.UNAPPROVE);
   // TODO 在此处添加前后规则
		   IRule<BGDVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.UnapproveStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				      return processor;
  }

  @Override
  protected BGDVO[] processBP(Object userObj,
      BGDVO[] clientFullVOs, BGDVO[] originBills) {
    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			        clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		    }
		    BGDVO[] bills = null;
      try {
          nc.itf.jxc_hr.jx06.IBGDMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx06.IBGDMaintain.class);
          bills=operator.unapprove(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return bills;
  }

}
