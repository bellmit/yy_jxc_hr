package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSInsertBP;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSUpdateBP;
import nc.bs.jxc_hr.jx03.swlgs.plugin.bpplugin.SWLGSPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jcom.lang.StringUtil;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX03_SAVEBASE extends AbstractPfAction<SWLGSVO> {

  @Override
  protected CompareAroundProcesser<SWLGSVO> getCompareAroundProcesserWithRules(
      Object userObj) {
      CompareAroundProcesser<SWLGSVO> processor = null;
		SWLGSVO[] clientFullVOs = (SWLGSVO[]) this.getVos();
		/*BillTransferTool<SWLGSVO> tool = new BillTransferTool<SWLGSVO>(
				clientFullVOs);
		clientFullVOs = tool.getClientFullInfoBill();*/
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<SWLGSVO>(
					SWLGSPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<SWLGSVO>(
					SWLGSPluginPoint.SCRIPT_INSERT);
		}
		   // TODO 在此处添加前后规则
		   IRule<SWLGSVO> rule=null;
					  
				  		
    return processor;
  }

  @Override
  protected SWLGSVO[] processBP(Object userObj,
      SWLGSVO[] clientFullVOs,SWLGSVO[] originBills) {
      
      SWLGSVO[] bills = null;
      try {
            nc.itf.jxc_hr.jx03.ISWLGSMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx03.ISWLGSMaintain.class);
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
