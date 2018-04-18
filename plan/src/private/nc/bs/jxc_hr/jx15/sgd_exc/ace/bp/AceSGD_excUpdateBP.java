package nc.bs.jxc_hr.jx15.sgd_exc.ace.bp;

import nc.bs.jxc_hr.jx15.sgd_exc.plugin.bpplugin.SGD_excPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx15.SGDVO_EXC;

/**
 * 修改保存的BP
 * 
 */
public class AceSGD_excUpdateBP {

	public SGDVO_EXC[] update(SGDVO_EXC[] bills, SGDVO_EXC[] originBills) {

		// 调用修改模板
		UpdateBPTemplate<SGDVO_EXC> bp = new UpdateBPTemplate<SGDVO_EXC>(
				SGD_excPluginPoint.UPDATE);
		// 执行前规则
		this.addBeforeRule(bp.getAroundProcesser());
		// 执行后规则
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<SGDVO_EXC> processer) {
		IRule<SGDVO_EXC> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("JX15");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");

		processer.addAfterRule(rule);

	}



	private void addBeforeRule(CompareAroundProcesser<SGDVO_EXC> processer) {
		IRule<SGDVO_EXC> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
		ICompareRule<SGDVO_EXC> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCbilltype("JX15");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setOrgItem("pk_org");
		processer.addBeforeRule(ruleCom);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
		/*rule = new  nc.bs.jxc_hr.jx15.sgd_exc.rule.JX15CheckEXCHours();
		processer.addBeforeRule(rule);*/
		rule =new nc.bs.jxc_hr.jx15.sgd_exc.rule.JX15BeforeInsertOrUpdateRule();
		processer.addBeforeRule(rule);
		rule=new nc.bs.jxc_hr.bg.sgdexc.ace.rule.BeforeSaveRule();
		processer.addBeforeRule(rule);
	}

}
