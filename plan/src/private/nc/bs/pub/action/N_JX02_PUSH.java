package nc.bs.pub.action;

import nc.bs.pubapp.pf.action.AbstractPfAction;
import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2InsertBP;
import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2UpdateBP;
import nc.bs.jxc_hr.jx02.pgd2.plugin.bpplugin.PGD2PluginPoint;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.jcom.lang.StringUtil;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.bs.framework.common.NCLocator;

public class N_JX02_PUSH extends AbstractPfAction<PGDVO> {

  @Override
  protected CompareAroundProcesser<PGDVO> getCompareAroundProcesserWithRules(
      Object userObj) {
      CompareAroundProcesser<PGDVO> processor = null;
		PGDVO[] clientFullVOs = (PGDVO[]) this.getVos();
		/*BillTransferTool<PGDVO> tool = new BillTransferTool<PGDVO>(
				clientFullVOs);
		clientFullVOs = tool.getClientFullInfoBill();*/
		if (!StringUtil.isEmptyWithTrim(clientFullVOs[0].getParentVO()
				.getPrimaryKey())) {
			processor = new CompareAroundProcesser<PGDVO>(
					PGD2PluginPoint.SCRIPT_UPDATE);
		} else {
			processor = new CompareAroundProcesser<PGDVO>(
					PGD2PluginPoint.SCRIPT_INSERT);
		}
		   // TODO 在此处添加前后规则
		   IRule<PGDVO> rule=null;
					  
				  		
    return processor;
  }

  @Override
  protected PGDVO[] processBP(Object userObj,
      PGDVO[] clientFullVOs,PGDVO[] originBills) {
      
      PGDVO[] bills = null;
      try {
            nc.itf.jxc_hr.jx02.IPGD2Maintain operator = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx02.IPGD2Maintain.class);
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
