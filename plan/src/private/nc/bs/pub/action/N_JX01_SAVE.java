package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDSendApproveBP;
import nc.bs.jxc_hr.jx01.sgd.plugin.bpplugin.SGDPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.pf.IPfRetCheckInfo;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX01_SAVE extends AbstractPfAction<SGDVO> {
  public N_JX01_SAVE() {
    super();
  }

  protected CompareAroundProcesser<SGDVO> getCompareAroundProcesserWithRules(
	      Object userObj) {
	    CompareAroundProcesser<SGDVO> processor = new CompareAroundProcesser<SGDVO>(
	        		SGDPluginPoint.SEND_APPROVE);
	    // TODO �ڴ˴�������ǰ�����
	   IRule<SGDVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.CommitStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				  	    return processor;
	  }
  @Override
  protected SGDVO[] processBP(Object userObj,SGDVO[] clientFullVOs,
		      SGDVO[] originBills) {
		      nc.itf.jxc_hr.jx01.ISGDMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx01.ISGDMaintain.class);
      SGDVO[] bills = null;
      try {
          bills=operator.save(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
