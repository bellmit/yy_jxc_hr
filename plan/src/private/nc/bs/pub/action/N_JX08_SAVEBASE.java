package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendInsertBP;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendUpdateBP;
import nc.bs.jxc_hr.jx08.orderend.plugin.bpplugin.OrderendPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jcom.lang.StringUtil;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX08_SAVEBASE extends AbstractPfAction<AggOrderEndVO> {

  @Override
  protected CompareAroundProcesser<AggOrderEndVO> getCompareAroundProcesserWithRules(
      Object userObj) {
      CompareAroundProcesser<AggOrderEndVO> processor = null;
		AggOrderEndVO[] clientFullVOs = (AggOrderEndVO[]) this.getVos();
		/*BillTransferTool<AggOrderEndVO> tool = new BillTransferTool<AggOrderEndVO>(
				clientFullVOs);
		clientFullVOs = tool.getClientFullInfoBill();*/
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<AggOrderEndVO>(
					OrderendPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<AggOrderEndVO>(
					OrderendPluginPoint.SCRIPT_INSERT);
		}
		   // TODO 在此处添加前后规则
		   IRule<AggOrderEndVO> rule=null;
					  
				  		
    return processor;
  }

  @Override
  protected AggOrderEndVO[] processBP(Object userObj,
      AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) {
      
      AggOrderEndVO[] bills = null;
      try {
            nc.itf.jxc_hr.jx08.IOrderendMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx08.IOrderendMaintain.class);
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
