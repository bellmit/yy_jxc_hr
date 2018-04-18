package nc.bs.jxc_hr.ht01.htgl.ace.bp;

import nc.bs.jxc_hr.ht01.htgl.plugin.bpplugin.HtglPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.ht01.HTVO;
import nc.vo.plan.ht01.HtBVO;

/**
 * 修改保存的BP
 * 
 */
public class AceHtglUpdateBP {

  public HTVO[] update(HTVO[] bills, HTVO[] originBills) {

    		    // 调用修改模板
        UpdateBPTemplate<HTVO> bp = new UpdateBPTemplate<HTVO>(HtglPluginPoint.UPDATE);

        // 执行前规则
        this.addBeforeRule(bp.getAroundProcesser());
        // 执行后规则
        this.addAfterRule(bp.getAroundProcesser());
        return bp.update(bills, originBills);
  }
  private void addAfterRule(CompareAroundProcesser<HTVO> processer) {
  IRule<HTVO> rule=null;
				  				   				    				     rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
				    				   				   				    				     				      ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setCbilltype("HT01");
				     				    				   				    				     				      ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setCodeItem("billno");
				     				    				   				    				     				      ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setGroupItem("pk_group");
				     				    				   				    				     				      ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setOrgItem("pk_org");
				     				    				   				   
				   				     processer.addAfterRule(rule);
				   				     
    }
  private void addBeforeRule(CompareAroundProcesser<HTVO> processer) {
   IRule<HTVO> rule=null;
					  				   				   				     rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
				    				   				   				    				     				    				   				    				      				       processer.addBeforeRule(rule);
				      				      				   				   				     ICompareRule<HTVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
				    				   				   				    				     ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule)ruleCom).setCbilltype("HT01");
				    				   				    				     ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule)ruleCom).setCodeItem("billno");
				    				   				    				     ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule)ruleCom).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.UpdateBillCodeRule)ruleCom).setOrgItem("pk_org");
				    				   				    				      				       processer.addBeforeRule(ruleCom);
				      				      				   				   				     rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
				    				   				   				    				     				    				   				    				      				       processer.addBeforeRule(rule);
				      				        }

}
