package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.jxc_hr.jx07.orderstart.plugin.bpplugin.OrderstartPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_JX07_SAVE extends AbstractPfAction<AggOrderStartVO> {
  public N_JX07_SAVE() {
    super();
  }

  protected CompareAroundProcesser<AggOrderStartVO> getCompareAroundProcesserWithRules(
	      Object userObj) {
	    CompareAroundProcesser<AggOrderStartVO> processor = new CompareAroundProcesser<AggOrderStartVO>(
	        		OrderstartPluginPoint.SEND_APPROVE);
	    // TODO 在此处添加审核前后规则
	   IRule<AggOrderStartVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.CommitStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				  	    return processor;
	  }
  @Override
  protected AggOrderStartVO[] processBP(Object userObj,AggOrderStartVO[] clientFullVOs,
		      AggOrderStartVO[] originBills) {
		      nc.itf.jxc_hr.jx07.IOrderstartMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx07.IOrderstartMaintain.class);
      AggOrderStartVO[] bills = null;
      try {
          bills=operator.save(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
