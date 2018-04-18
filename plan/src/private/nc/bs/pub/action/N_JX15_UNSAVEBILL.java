package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excUnSendApproveBP;
import nc.bs.jxc_hr.jx15.sgd_exc.plugin.bpplugin.SGD_excPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX15_UNSAVEBILL extends AbstractPfAction<SGDVO_EXC> {

  public N_JX15_UNSAVEBILL() {
    super();
  }

  @Override
  protected CompareAroundProcesser<SGDVO_EXC> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<SGDVO_EXC> processor =
        new CompareAroundProcesser<SGDVO_EXC>(
            SGD_excPluginPoint.UNSEND_APPROVE);
   // TODO 在此处添加前后规则
		   IRule<SGDVO_EXC> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.UncommitStatusCheckRule();
				   				   				    				   				   
				   				     processor.addBeforeRule(rule);
				   				   
  
				      return processor;
  }

  @Override
  protected SGDVO_EXC[] processBP(Object userObj,
      SGDVO_EXC[] clientFullVOs, SGDVO_EXC[] originBills) {
    nc.itf.jxc_hr.jx15.ISGD_excMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx15.ISGD_excMaintain.class);
    SGDVO_EXC[] bills = null;
      try {
          bills=operator.unsave(clientFullVOs, originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return bills;
  }

}
