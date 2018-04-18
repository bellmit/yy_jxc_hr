package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglDeleteBP;
import nc.bs.jxc_hr.ht01.htgl.plugin.bpplugin.HtglPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.ht01.HTVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_HT01_DELETE extends AbstractPfAction<HTVO> {

  @Override
  protected CompareAroundProcesser<HTVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<HTVO> processor =
      new CompareAroundProcesser<HTVO>(HtglPluginPoint.SCRIPT_DELETE);
    // TODO 在此处添加前后规则
   IRule<HTVO> rule=null;
				  
				      return processor;
  }

  @Override
  protected HTVO[] processBP(Object userObj,
      HTVO[] clientFullVOs,HTVO[] originBills) {
    nc.itf.jxc_hr.ht01.IHtglMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.ht01.IHtglMaintain.class);
    try {
          operator.delete(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return clientFullVOs;
  }

}
