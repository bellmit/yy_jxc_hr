package nc.bs.jxc_hr.jx08.orderend.ace.bp;

import nc.bs.jxc_hr.jx08.orderend.plugin.bpplugin.OrderendPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;

/**
 * 标准单据删除BP
 */
public class AceOrderendDeleteBP {

  public void delete(AggOrderEndVO[] bills) {

      DeleteBPTemplate<AggOrderEndVO> bp =
          new DeleteBPTemplate<AggOrderEndVO>(OrderendPluginPoint.DELETE);
     
	      // 增加执行前规则
      this.addBeforeRule(bp.getAroundProcesser());
      // 增加执行后业务规则
      this.addAfterRule(bp.getAroundProcesser());
      bp.delete(bills);
  }
	   private void addBeforeRule(AroundProcesser<AggOrderEndVO> processer) {
	   IRule<AggOrderEndVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
				   				   				    				   				   
				   				     processer.addBeforeRule(rule);
				   				   
      }
  /**
   * 删除后业务规则
   * 
   * @param processer
   */
  private void addAfterRule(AroundProcesser<AggOrderEndVO> processer) {
  IRule<AggOrderEndVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.ReturnBillCodeRule();
				   				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCbilltype("JX08");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCodeItem("overcode");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setOrgItem("pk_org");
				    				   				   
				   				     processer.addAfterRule(rule);
				   				   
    }
}
