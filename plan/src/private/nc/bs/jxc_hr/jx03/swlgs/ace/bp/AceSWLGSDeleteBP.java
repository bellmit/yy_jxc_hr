package nc.bs.jxc_hr.jx03.swlgs.ace.bp;

import nc.bs.jxc_hr.jx03.swlgs.plugin.bpplugin.SWLGSPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.plan.jx03.SWLGSVO;

/**
 * ��׼����ɾ��BP
 */
public class AceSWLGSDeleteBP {

  public void delete(SWLGSVO[] bills) {

      DeleteBPTemplate<SWLGSVO> bp =
          new DeleteBPTemplate<SWLGSVO>(SWLGSPluginPoint.DELETE);
     
	      // ����ִ��ǰ����
      this.addBeforeRule(bp.getAroundProcesser());
      // ����ִ�к�ҵ�����
      this.addAfterRule(bp.getAroundProcesser());
      bp.delete(bills);
  }
	   private void addBeforeRule(AroundProcesser<SWLGSVO> processer) {
	   IRule<SWLGSVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
				   				   				    				   				   
				   				     processer.addBeforeRule(rule);
				   				   
      }
  /**
   * ɾ����ҵ�����
   * 
   * @param processer
   */
  private void addAfterRule(AroundProcesser<SWLGSVO> processer) {
  IRule<SWLGSVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.ReturnBillCodeRule();
				   				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCbilltype("JX03");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCodeItem("billno");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setOrgItem("pk_org");
				    				   				   
				   				     processer.addAfterRule(rule);
				   				   
    }
}
