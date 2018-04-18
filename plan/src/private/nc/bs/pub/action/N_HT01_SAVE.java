package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglSendApproveBP;
import nc.bs.jxc_hr.ht01.htgl.plugin.bpplugin.HtglPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.ht01.HTVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.pf.IPfRetCheckInfo;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_HT01_SAVE extends AbstractPfAction<HTVO> {
  public N_HT01_SAVE() {
    super();
  }

  protected CompareAroundProcesser<HTVO> getCompareAroundProcesserWithRules(
	      Object userObj) {
	    CompareAroundProcesser<HTVO> processor = new CompareAroundProcesser<HTVO>(
	        		HtglPluginPoint.SEND_APPROVE);
	    // TODO 在此处添加审核前后规则
	   IRule<HTVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.CommitStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				  	    return processor;
	  }
  @Override
  protected HTVO[] processBP(Object userObj,HTVO[] clientFullVOs,
		      HTVO[] originBills) {
		      nc.itf.jxc_hr.ht01.IHtglMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.ht01.IHtglMaintain.class);
      HTVO[] bills = null;
      try {
          bills=operator.save(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
