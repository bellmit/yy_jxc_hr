package nc.bs.jxc_hr.jx08.orderend.ace.bp;

import nc.bs.jxc_hr.jx08.orderend.plugin.bpplugin.OrderendPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.jxc_hr.ordersheet.OrderEndSubVO;

/**
 * 修改保存的BP
 * 
 */
public class AceOrderendUpdateBP {

  public AggOrderEndVO[] update(AggOrderEndVO[] bills, AggOrderEndVO[] originBills) {

    		    // 调用修改模板
        UpdateBPTemplate<AggOrderEndVO> bp = new UpdateBPTemplate<AggOrderEndVO>(OrderendPluginPoint.UPDATE);

        // 执行前规则
        this.addBeforeRule(bp.getAroundProcesser());
        // 执行后规则
        this.addAfterRule(bp.getAroundProcesser());
        return bp.update(bills, originBills);
  }
  private void addAfterRule(CompareAroundProcesser<AggOrderEndVO> processer) {
  IRule<AggOrderEndVO> rule=null;
				  				   				    				     rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
				    				   				   				    				     				      ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setCbilltype("JX08");
				     				    				   				    				     				      ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setCodeItem("overcode");
				     				    				   				    				     				      ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setGroupItem("pk_group");
				     				    				   				    				     				      ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setOrgItem("pk_org");
				     				    				   				   
				   				     processer.addAfterRule(rule);
				   				     
    }
  private void addBeforeRule(CompareAroundProcesser<AggOrderEndVO> processer) {
   IRule<AggOrderEndVO> rule=null;
					  				   				   				     rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
				    				   				   				    				     				    				   				    				      				       processer.addBeforeRule(rule);
				      				      				   				   				     ICompareRule<AggOrderEndVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
				    				   				   				    				     ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule)ruleCom).setCbilltype("JX08");
				    				   				    				     ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule)ruleCom).setCodeItem("overcode");
				    				   				    				     ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule)ruleCom).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule)ruleCom).setOrgItem("pk_org");
				    				   				    				      				       processer.addBeforeRule(ruleCom);
				      				      				   				   				     rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
				    				   				   				    				     				    				   				    				      				       processer.addBeforeRule(rule);
				      				        }

}
