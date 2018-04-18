package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.jxc_hr.jx07.orderstart.plugin.bpplugin.OrderstartPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_JX07_DELETE extends AbstractPfAction<AggOrderStartVO> {

  @Override
  protected CompareAroundProcesser<AggOrderStartVO> getCompareAroundProcesserWithRules(
      Object userObj) {
    CompareAroundProcesser<AggOrderStartVO> processor =
      new CompareAroundProcesser<AggOrderStartVO>(OrderstartPluginPoint.SCRIPT_DELETE);
    // TODO 在此处添加前后规则
   IRule<AggOrderStartVO> rule=null;
				  
				      return processor;
  }

  @Override
  protected AggOrderStartVO[] processBP(Object userObj,
      AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) {
    nc.itf.jxc_hr.jx07.IOrderstartMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx07.IOrderstartMaintain.class);
    try {
          operator.delete(clientFullVOs,originBills);
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
    return clientFullVOs;
  }

}
