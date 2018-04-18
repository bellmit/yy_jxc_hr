package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addSendApproveBP;
import nc.bs.jxc_hr.jx04.sgd_add.plugin.bpplugin.SGD_addPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.pf.IPfRetCheckInfo;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX04_SAVE extends AbstractPfAction<SGDVO_ADD> {
  public N_JX04_SAVE() {
    super();
  }

  protected CompareAroundProcesser<SGDVO_ADD> getCompareAroundProcesserWithRules(
	      Object userObj) {
	    CompareAroundProcesser<SGDVO_ADD> processor = new CompareAroundProcesser<SGDVO_ADD>(
	        		SGD_addPluginPoint.SEND_APPROVE);
	    // TODO 在此处添加审核前后规则
	   IRule<SGDVO_ADD> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.CommitStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				  	    return processor;
	  }
  @Override
  protected SGDVO_ADD[] processBP(Object userObj,SGDVO_ADD[] clientFullVOs,
		      SGDVO_ADD[] originBills) {
		      nc.itf.jxc_hr.jx04.ISGD_addMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx04.ISGD_addMaintain.class);
      SGDVO_ADD[] bills = null;
      try {
          bills=operator.save(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
