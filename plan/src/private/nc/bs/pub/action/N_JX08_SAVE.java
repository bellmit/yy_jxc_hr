package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendSendApproveBP;
import nc.bs.jxc_hr.jx08.orderend.plugin.bpplugin.OrderendPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.VOStatus;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.pf.IPfRetCheckInfo;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX08_SAVE extends AbstractPfAction<AggOrderEndVO> {
  public N_JX08_SAVE() {
    super();
  }

  protected CompareAroundProcesser<AggOrderEndVO> getCompareAroundProcesserWithRules(
	      Object userObj) {
	    CompareAroundProcesser<AggOrderEndVO> processor = new CompareAroundProcesser<AggOrderEndVO>(
	        		OrderendPluginPoint.SEND_APPROVE);
	    // TODO 在此处添加审核前后规则
	   IRule<AggOrderEndVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.CommitStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				  	    return processor;
	  }
  @Override
  protected AggOrderEndVO[] processBP(Object userObj,AggOrderEndVO[] clientFullVOs,
		      AggOrderEndVO[] originBills) {
		      nc.itf.jxc_hr.jx08.IOrderendMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx08.IOrderendMaintain.class);
      AggOrderEndVO[] bills = null;
      try {
          bills=operator.save(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
      return bills;
  }

}
