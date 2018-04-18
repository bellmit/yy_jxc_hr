package nc.bs.jxc_hr.jx04.sgd_add.ace.bp;

import nc.bs.jxc_hr.jx04.sgd_add.plugin.bpplugin.SGD_addPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.plan.jx04.SGDVO_ADD;

/**
 * 标准单据删除BP
 */
public class AceSGD_addDeleteBP {

  public void delete(SGDVO_ADD[] bills) {

      DeleteBPTemplate<SGDVO_ADD> bp =
          new DeleteBPTemplate<SGDVO_ADD>(SGD_addPluginPoint.DELETE);
     
	      // 增加执行前规则
      this.addBeforeRule(bp.getAroundProcesser());
      // 增加执行后业务规则
      this.addAfterRule(bp.getAroundProcesser());
      bp.delete(bills);
  }
	   private void addBeforeRule(AroundProcesser<SGDVO_ADD> processer) {
	   IRule<SGDVO_ADD> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
				   				   				    				   				   
				   				     processer.addBeforeRule(rule);
				   				   
      }
  /**
   * 删除后业务规则
   * 
   * @param processer
   */
  private void addAfterRule(AroundProcesser<SGDVO_ADD> processer) {
  IRule<SGDVO_ADD> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.ReturnBillCodeRule();
				   				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCbilltype("JX04");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCodeItem("sgdno");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setOrgItem("pk_org");
				    				   				   
				   				     processer.addAfterRule(rule);
				   				   
    }
}
