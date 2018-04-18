package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglInsertBP;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglUpdateBP;
import nc.bs.jxc_hr.ht01.htgl.plugin.bpplugin.HtglPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jcom.lang.StringUtil;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.ht01.HTVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_HT01_SAVEBASE extends AbstractPfAction<HTVO> {

  @Override
  protected CompareAroundProcesser<HTVO> getCompareAroundProcesserWithRules(
      Object userObj) {
      CompareAroundProcesser<HTVO> processor = null;
		HTVO[] clientFullVOs = (HTVO[]) this.getVos();
		/*BillTransferTool<HTVO> tool = new BillTransferTool<HTVO>(
				clientFullVOs);
		clientFullVOs = tool.getClientFullInfoBill();*/
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<HTVO>(
					HtglPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<HTVO>(
					HtglPluginPoint.SCRIPT_INSERT);
		}
		   // TODO 在此处添加前后规则
		   IRule<HTVO> rule=null;
					  
				  		
    return processor;
  }

  @Override
  protected HTVO[] processBP(Object userObj,
      HTVO[] clientFullVOs,HTVO[] originBills) {
      
      HTVO[] bills = null;
      try {
            nc.itf.jxc_hr.ht01.IHtglMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.ht01.IHtglMaintain.class);
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
