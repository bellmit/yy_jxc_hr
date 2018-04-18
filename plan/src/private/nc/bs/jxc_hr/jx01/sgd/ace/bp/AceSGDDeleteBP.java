package nc.bs.jxc_hr.jx01.sgd.ace.bp;

import nc.bs.jxc_hr.jx01.sgd.plugin.bpplugin.SGDPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.plan.jx01.SGDVO;

/**
 * ��׼����ɾ��BP
 */
public class AceSGDDeleteBP {

  public void delete(SGDVO[] bills) {

      DeleteBPTemplate<SGDVO> bp =
          new DeleteBPTemplate<SGDVO>(SGDPluginPoint.DELETE);
     
	      // ����ִ��ǰ����
      this.addBeforeRule(bp.getAroundProcesser());
      // ����ִ�к�ҵ�����
      this.addAfterRule(bp.getAroundProcesser());
      bp.delete(bills);
  }
	   private void addBeforeRule(AroundProcesser<SGDVO> processer) {
	   IRule<SGDVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
				   				   				    				   				   
				   				     processer.addBeforeRule(rule);
				   				   
      }
  /**
   * ɾ����ҵ�����
   *  
   * @param processer
   */
  private void addAfterRule(AroundProcesser<SGDVO> processer) {
  IRule<SGDVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.ReturnBillCodeRule();
				   				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCbilltype("JX01");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCodeItem("taskno");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setOrgItem("pk_org");
				    				   				   
				   				     processer.addAfterRule(rule);
				   				   
    }
}
