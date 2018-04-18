package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSDeleteBP;
import nc.bs.jxc_hr.jx03.swlgs.plugin.bpplugin.SWLGSPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX03_DELETE extends AbstractPfAction<SWLGSVO> {

  @Override
  protected CompareAroundProcesser<SWLGSVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<SWLGSVO> processor =
      new CompareAroundProcesser<SWLGSVO>(SWLGSPluginPoint.SCRIPT_DELETE);
    // TODO 在此处添加前后规则
   IRule<SWLGSVO> rule=null;
				  
				      return processor;
  }

  @Override
  protected SWLGSVO[] processBP(Object userObj,
      SWLGSVO[] clientFullVOs,SWLGSVO[] originBills) {
    nc.itf.jxc_hr.jx03.ISWLGSMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx03.ISWLGSMaintain.class);
    try {
          operator.delete(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return clientFullVOs;
  }

}
