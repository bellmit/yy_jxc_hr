package nc.bs.jxc_hr.jx07.orderstart.ace.bp;

import nc.bs.jxc_hr.jx07.orderstart.plugin.bpplugin.OrderstartPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.jxc_hr.ordersheet.OrderStartSubVO;

/**
 * 修改保存的BP
 * 
 */
public class AceOrderstartUpdateBP {

	public AggOrderStartVO[] update(AggOrderStartVO[] bills,
			AggOrderStartVO[] originBills) {

		// 调用修改模板
		UpdateBPTemplate<AggOrderStartVO> bp = new UpdateBPTemplate<AggOrderStartVO>(
				OrderstartPluginPoint.UPDATE);

		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<AggOrderStartVO> processer) {
		IRule<AggOrderStartVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("JX07");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setCodeItem("applycode");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");

		processer.addAfterRule(rule);
		
		rule=new nc.bs.jxc_hr.bg.orderstart.ace.rule.AfterUpdateRule();
		processer.addAfterRule(rule);
	}

	private void addBeforeRule(CompareAroundProcesser<AggOrderStartVO> processer) {
		IRule<AggOrderStartVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
		ICompareRule<AggOrderStartVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCbilltype("JX07");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCodeItem("applycode");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setOrgItem("pk_org");
		processer.addBeforeRule(ruleCom);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
		
		
	}

}
