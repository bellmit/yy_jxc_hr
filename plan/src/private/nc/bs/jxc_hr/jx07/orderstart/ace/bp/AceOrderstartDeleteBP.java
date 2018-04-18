package nc.bs.jxc_hr.jx07.orderstart.ace.bp;

import nc.bs.jxc_hr.jx07.orderstart.plugin.bpplugin.OrderstartPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.DeleteBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;

/**
 * ��׼����ɾ��BP
 */
public class AceOrderstartDeleteBP {

  public void delete(AggOrderStartVO[] bills) {

      DeleteBPTemplate<AggOrderStartVO> bp =
          new DeleteBPTemplate<AggOrderStartVO>(OrderstartPluginPoint.DELETE);
     
	      // ����ִ��ǰ����
      this.addBeforeRule(bp.getAroundProcesser());
      // ����ִ�к�ҵ�����
      this.addAfterRule(bp.getAroundProcesser());
      bp.delete(bills);
  }
	   private void addBeforeRule(AroundProcesser<AggOrderStartVO> processer) {
	   IRule<AggOrderStartVO> rule=null;
					  				   				     rule = new nc.bs.pubapp.pub.rule.BillDeleteStatusCheckRule();
				   				   				    				   				   
				   				     processer.addBeforeRule(rule);
				   				   
      }
  /**
   * ɾ����ҵ�����
   * 
   * @param processer
   */
  private void addAfterRule(AroundProcesser<AggOrderStartVO> processer) {
  IRule<AggOrderStartVO> rule=null;
				  				   				     rule = new nc.bs.pubapp.pub.rule.ReturnBillCodeRule();
				   				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCbilltype("JX07");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setCodeItem("applycode");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setGroupItem("pk_group");
				    				   				    				     ((nc.bs.pubapp.pub.rule.ReturnBillCodeRule)rule).setOrgItem("pk_org");
				    				   				   
				   				     processer.addAfterRule(rule);
				   				   
    }
}
