package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendUnSendApproveBP;
import nc.bs.jxc_hr.jx08.orderend.plugin.bpplugin.OrderendPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX08_UNSAVEBILL extends AbstractPfAction<AggOrderEndVO> {

  public N_JX08_UNSAVEBILL() {
    super();
  }

  @Override
  protected CompareAroundProcesser<AggOrderEndVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<AggOrderEndVO> processor =
        new CompareAroundProcesser<AggOrderEndVO>(
            OrderendPluginPoint.UNSEND_APPROVE);
   // TODO 在此处添加前后规则
		   IRule<AggOrderEndVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.UncommitStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				      return processor;
  }

  @Override
  protected AggOrderEndVO[] processBP(Object userObj,
      AggOrderEndVO[] clientFullVOs, AggOrderEndVO[] originBills) {
    nc.itf.jxc_hr.jx08.IOrderendMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx08.IOrderendMaintain.class);
    AggOrderEndVO[] bills = null;
      try {
          bills=operator.unsave(clientFullVOs, originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return bills;
  }

}
