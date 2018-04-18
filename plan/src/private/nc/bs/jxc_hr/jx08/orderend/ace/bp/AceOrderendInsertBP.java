package nc.bs.jxc_hr.jx08.orderend.ace.bp;

import nc.bs.jxc_hr.jx08.orderend.plugin.bpplugin.OrderendPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.jxc_hr.ordersheet.OrderEndSubVO;
/**
 * ��׼��������BP
 */
public class AceOrderendInsertBP {

  public AggOrderEndVO[] insert(AggOrderEndVO[] bills) {

    InsertBPTemplate<AggOrderEndVO> bp =
        new InsertBPTemplate<AggOrderEndVO>(OrderendPluginPoint.INSERT);
    this.addBeforeRule(bp.getAroundProcesser());
    this.addAfterRule(bp.getAroundProcesser());
    return bp.insert(bills);
    
  }
  /**
   * ���������
   * 
   * @param processor
   */
  private void addAfterRule(AroundProcesser<AggOrderEndVO> processor) {
  IRule<AggOrderEndVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
				   				   				    				     ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setCbilltype("JX08");
				    				   				    				     ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setCodeItem("overcode");
				    				   				    				     ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.BillCodeCheckRule)rule).setOrgItem("pk_org");
				    				   				   
				   				     processor.addAfterRule(rule);
				   				   
    }
  /**
   * ����ǰ����
   * 
   * @param processor
   */
  private void addBeforeRule(AroundProcesser<AggOrderEndVO> processer) {
  IRule<AggOrderEndVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
				   				   				    				   				   processer.addBeforeRule(rule);
  				   				     rule = new nc.bs.pubapp.pub.rule.CreateBillCodeRule();
				   				   				    				     ((nc.bs.pubapp.pub.rule.CreateBillCodeRule)rule).setCbilltype("JX08");
				    				   				    				     ((nc.bs.pubapp.pub.rule.CreateBillCodeRule)rule).setCodeItem("overcode");
				    				   				    				     ((nc.bs.pubapp.pub.rule.CreateBillCodeRule)rule).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.CreateBillCodeRule)rule).setOrgItem("pk_org");
				    				   				   processer.addBeforeRule(rule);
  				   				     rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
				   				   				    				   				   processer.addBeforeRule(rule);
  				   				     rule = new nc.bs.pubapp.pub.rule.CheckNotNullRule();
				   				   				    				   				   processer.addBeforeRule(rule);
    }
}
