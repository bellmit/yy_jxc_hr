package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excDeleteBP;
import nc.bs.jxc_hr.jx15.sgd_exc.plugin.bpplugin.SGD_excPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX15_DELETE extends AbstractPfAction<SGDVO_EXC> {

  @Override
  protected CompareAroundProcesser<SGDVO_EXC> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<SGDVO_EXC> processor =
      new CompareAroundProcesser<SGDVO_EXC>(SGD_excPluginPoint.SCRIPT_DELETE);
    // TODO 在此处添加前后规则
   IRule<SGDVO_EXC> rule=null;
				  
				      return processor;
  }

  @Override
  protected SGDVO_EXC[] processBP(Object userObj,
      SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) {
    nc.itf.jxc_hr.jx15.ISGD_excMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx15.ISGD_excMaintain.class);
    try {
          operator.delete(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return clientFullVOs;
  }

}
