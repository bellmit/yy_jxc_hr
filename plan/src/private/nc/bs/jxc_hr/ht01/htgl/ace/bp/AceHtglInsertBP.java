package nc.bs.jxc_hr.ht01.htgl.ace.bp;

import nc.bs.jxc_hr.ht01.htgl.plugin.bpplugin.HtglPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.plan.ht01.HTVO;
import nc.vo.plan.ht01.HtBVO;
/**
 * 标准单据新增BP
 */
public class AceHtglInsertBP {

  public HTVO[] insert(HTVO[] bills) {

    InsertBPTemplate<HTVO> bp =
        new InsertBPTemplate<HTVO>(HtglPluginPoint.INSERT);
    this.addBeforeRule(bp.getAroundProcesser());
    this.addAfterRule(bp.getAroundProcesser());
    return bp.insert(bills);
    
  }
  /**
   * 新增后规则
   * 
   * @param processor
   */
  private void addAfterRule(AroundProcesser<HTVO> processor) {
  IRule<HTVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
				   				   				    				     ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setCbilltype("HT01");
				    				   				    				     ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setCodeItem("billno");
				    				   				    				     ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setOrgItem("pk_org");
				    				   				   
				   				     processor.addAfterRule(rule);
				   				   
    }
  /**
   * 新增前规则
   * 
   * @param processor
   */
  private void addBeforeRule(AroundProcesser<HTVO> processer) {
  IRule<HTVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
				   				   				    				   				   processer.addBeforeRule(rule);
  				   				     rule = new nc.bs.pubapp.pub.rule.CreateBillCodeRule();
				   				   				    				     ((nc.bs.pubapp.pub.rule.CreateBillCodeRule)rule).setCbilltype("HT01");
				    				   				    				     ((nc.bs.pubapp.pub.rule.CreateBillCodeRule)rule).setCodeItem("billno");
				    				   				    				     ((nc.bs.pubapp.pub.rule.CreateBillCodeRule)rule).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.CreateBillCodeRule)rule).setOrgItem("pk_org");
				    				   				   processer.addBeforeRule(rule);
  				   				     rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
				   				   				    				   				   processer.addBeforeRule(rule);
  				   				     rule = new nc.bs.pubapp.pub.rule.CheckNotNullRule();
				   				   				    				   				   processer.addBeforeRule(rule);
    }
}
