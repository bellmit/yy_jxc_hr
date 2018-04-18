package nc.bs.pub.action;

import nc.bs.framework.common.NCLocator;
import nc.bs.jxc_hr.jx07.orderstart.plugin.bpplugin.OrderstartPluginPoint;
import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class N_JX07_SAVEBASE extends AbstractPfAction<AggOrderStartVO> {

  @Override
  protected CompareAroundProcesser<AggOrderStartVO> getCompareAroundProcesserWithRules(
      Object userObj) {
      CompareAroundProcesser<AggOrderStartVO> processor = null;
		AggOrderStartVO[] clientFullVOs = (AggOrderStartVO[]) this.getVos();
		/*BillTransferTool<AggOrderStartVO> tool = new BillTransferTool<AggOrderStartVO>(
				clientFullVOs);
		clientFullVOs = tool.getClientFullInfoBill();*/
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<AggOrderStartVO>(
					OrderstartPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<AggOrderStartVO>(
					OrderstartPluginPoint.SCRIPT_INSERT);
		}
		   // TODO 在此处添加前后规则
		   IRule<AggOrderStartVO> rule=null;
					  
				  		
    return processor;
  }

  @Override
  protected AggOrderStartVO[] processBP(Object userObj,
      AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) {
      
      AggOrderStartVO[] bills = null;
      try {
            nc.itf.jxc_hr.jx07.IOrderstartMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx07.IOrderstartMaintain.class);
            if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO().getPrimaryKey())) {
              bills = operator.update(clientFullVOs,originBills);
		            } else {
              bills = operator.insert(clientFullVOs,originBills);
		            }
      } catch (BusinessException e) {
				          ExceptionUtils.wrappBusinessException(e.getMessage());
			      }
		      return bills;
  }
}
