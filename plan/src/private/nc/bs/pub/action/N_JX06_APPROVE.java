package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDApproveBP;
import nc.bs.jxc_hr.jx06.bgd.plugin.bpplugin.BGDPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx06.BGDVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.VOStatus;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX06_APPROVE extends AbstractPfAction<BGDVO> {

  public N_JX06_APPROVE() {
    super();
  }

  @Override
  protected CompareAroundProcesser<BGDVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<BGDVO> processor =
        new CompareAroundProcesser<BGDVO>(
            BGDPluginPoint.APPROVE);
   IRule<BGDVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.ApproveStatusCheckRule();
				   				   				    				   				   
	   				     processor.addBeforeRule(rule);
				   				   
  
				      return processor;
  }
  
  @Override
  protected BGDVO[] processBP(Object userObj,
      BGDVO[] clientFullVOs, BGDVO[] originBills) {
		      BGDVO[] bills = null;
		      nc.itf.jxc_hr.jx06.IBGDMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx06.IBGDMaintain.class);
      try {
          bills=operator.approve(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
