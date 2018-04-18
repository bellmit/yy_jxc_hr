package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSSendApproveBP;
import nc.bs.jxc_hr.jx03.swlgs.plugin.bpplugin.SWLGSPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.pf.IPfRetCheckInfo;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX03_SAVE extends AbstractPfAction<SWLGSVO> {
  public N_JX03_SAVE() {
    super();
  }

  protected CompareAroundProcesser<SWLGSVO> getCompareAroundProcesserWithRules(
	      Object userObj) {
	    CompareAroundProcesser<SWLGSVO> processor = new CompareAroundProcesser<SWLGSVO>(
	        		SWLGSPluginPoint.SEND_APPROVE);
	    // TODO 在此处添加审核前后规则
	   IRule<SWLGSVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.CommitStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				  	    return processor;
	  }
  @Override
  protected SWLGSVO[] processBP(Object userObj,SWLGSVO[] clientFullVOs,
		      SWLGSVO[] originBills) {
		      nc.itf.jxc_hr.jx03.ISWLGSMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx03.ISWLGSMaintain.class);
      SWLGSVO[] bills = null;
      try {
          bills=operator.save(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
