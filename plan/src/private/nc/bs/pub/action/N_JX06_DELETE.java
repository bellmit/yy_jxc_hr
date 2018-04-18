package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDDeleteBP;
import nc.bs.jxc_hr.jx06.bgd.plugin.bpplugin.BGDPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX06_DELETE extends AbstractPfAction<BGDVO> {

  @Override
  protected CompareAroundProcesser<BGDVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<BGDVO> processor =
      new CompareAroundProcesser<BGDVO>(BGDPluginPoint.SCRIPT_DELETE);
    // TODO 在此处添加前后规则
   IRule<BGDVO> rule=null;
				  
				      return processor;
  }

  @Override
  protected BGDVO[] processBP(Object userObj,
      BGDVO[] clientFullVOs,BGDVO[] originBills) {
    nc.itf.jxc_hr.jx06.IBGDMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx06.IBGDMaintain.class);
    try {
          operator.delete(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return clientFullVOs;
  }

}
