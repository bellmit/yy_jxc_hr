package nc.bs.jxc_hr.jx06.bgd.ace.bp;

import nc.bs.jxc_hr.jx06.bgd.plugin.bpplugin.BGDPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.plan.jx06.BGDVO;

/**
 * 标准单据删除BP
 */
public class AceBGDDeleteBP {

  public void delete(BGDVO[] bills) {

      DeleteBPTemplate<BGDVO> bp =
          new DeleteBPTemplate<BGDVO>(BGDPluginPoint.DELETE);
     
	      // 增加执行前规则
      this.addBeforeRule(bp.getAroundProcesser());
      // 增加执行后业务规则
      this.addAfterRule(bp.getAroundProcesser());
      bp.delete(bills);
  }
	   private void addBeforeRule(AroundProcesser<BGDVO> processer) {
	   IRule<BGDVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
				   				   				    				   				   
				   				     processer.addBeforeRule(rule);
				   				   
      }
  /**
   * 删除后业务规则
   * 
   * @param processer
   */
  private void addAfterRule(AroundProcesser<BGDVO> processer) {
  IRule<BGDVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.ReturnBillCodeRule();
				   				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCbilltype("JX06");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCodeItem("billno");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setOrgItem("pk_org");
				    				   				   
				   				     processer.addAfterRule(rule);
				   				   
    }
}
