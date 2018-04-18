package nc.bs.jxc_hr.jx04.sgd_add.ace.bp;

import nc.bs.jxc_hr.jx04.sgd_add.plugin.bpplugin.SGD_addPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.plan.jx04.SGDVO_ADD;

/**
 * ��׼����ɾ��BP
 */
public class AceSGD_addDeleteBP {

  public void delete(SGDVO_ADD[] bills) {

      DeleteBPTemplate<SGDVO_ADD> bp =
          new DeleteBPTemplate<SGDVO_ADD>(SGD_addPluginPoint.DELETE);
     
	      // ����ִ��ǰ����
      this.addBeforeRule(bp.getAroundProcesser());
      // ����ִ�к�ҵ�����
      this.addAfterRule(bp.getAroundProcesser());
      bp.delete(bills);
  }
	   private void addBeforeRule(AroundProcesser<SGDVO_ADD> processer) {
	   IRule<SGDVO_ADD> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
				   				   				    				   				   
				   				     processer.addBeforeRule(rule);
				   				   
      }
  /**
   * ɾ����ҵ�����
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
