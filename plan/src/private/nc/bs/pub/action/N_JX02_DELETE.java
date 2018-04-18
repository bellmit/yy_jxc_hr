package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2DeleteBP;
import nc.bs.jxc_hr.jx02.pgd2.plugin.bpplugin.PGD2PluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX02_DELETE extends AbstractPfAction<PGDVO> {

  @Override
  protected CompareAroundProcesser<PGDVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<PGDVO> processor =
      new CompareAroundProcesser<PGDVO>(PGD2PluginPoint.SCRIPT_DELETE);
    // TODO �ڴ˴����ǰ�����
   IRule<PGDVO> rule=null;
				  
				      return processor;
  }

  @Override
  protected PGDVO[] processBP(Object userObj,
      PGDVO[] clientFullVOs,PGDVO[] originBills) {
    nc.itf.jxc_hr.jx02.IPGD2Maintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx02.IPGD2Maintain.class);
    try {
          operator.delete(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return clientFullVOs;
  }

}
