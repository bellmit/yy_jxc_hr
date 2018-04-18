package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDInsertBP;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDUpdateBP;
import nc.bs.jxc_hr.jx06.bgd.plugin.bpplugin.BGDPluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jcom.lang.StringUtil;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX06_SAVEBASE extends AbstractPfAction<BGDVO> {

  @Override
  protected CompareAroundProcesser<BGDVO> getCompareAroundProcesserWithRules(
      Object userObj) {
      CompareAroundProcesser<BGDVO> processor = null;
		BGDVO[] clientFullVOs = (BGDVO[]) this.getVos();
		/*BillTransferTool<BGDVO> tool = new BillTransferTool<BGDVO>(
				clientFullVOs);
		clientFullVOs = tool.getClientFullInfoBill();*/
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<BGDVO>(
					BGDPluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<BGDVO>(
					BGDPluginPoint.SCRIPT_INSERT);
		}
		   // TODO 在此处添加前后规则
		   IRule<BGDVO> rule=null;
					  
				  		
    return processor;
  }

  @Override
  protected BGDVO[] processBP(Object userObj,
      BGDVO[] clientFullVOs,BGDVO[] originBills) {
      
      BGDVO[] bills = null;
      try {
            nc.itf.jxc_hr.jx06.IBGDMaintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx06.IBGDMaintain.class);
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
