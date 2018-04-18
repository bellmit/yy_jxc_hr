package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDDeleteBP;
import nc.bs.jxc_hr.jx01.sgd.plugin.bpplugin.SGDPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX01_DELETE extends AbstractPfAction<SGDVO> {

  @Override
  protected CompareAroundProcesser<SGDVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<SGDVO> processor =
      new CompareAroundProcesser<SGDVO>(SGDPluginPoint.SCRIPT_DELETE);
    // TODO 在此处添加前后规则
   IRule<SGDVO> rule=null;
				  
				      return processor;
  }

  @Override
  protected SGDVO[] processBP(Object userObj,
      SGDVO[] clientFullVOs,SGDVO[] originBills) {
    nc.itf.jxc_hr.jx01.ISGDMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx01.ISGDMaintain.class);
    try {
          operator.delete(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return clientFullVOs;
  }

}
