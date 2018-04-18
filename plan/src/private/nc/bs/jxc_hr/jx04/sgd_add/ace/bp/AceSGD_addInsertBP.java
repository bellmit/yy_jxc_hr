package nc.bs.jxc_hr.jx04.sgd_add.ace.bp;

import nc.bs.jxc_hr.jx04.sgd_add.plugin.bpplugin.SGD_addPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.plan.jx04.SGDBVO_ADD;

/**
 * 标准单据新增BP
 */
public class AceSGD_addInsertBP {

	public SGDVO_ADD[] insert(SGDVO_ADD[] bills) {

		InsertBPTemplate<SGDVO_ADD> bp = new InsertBPTemplate<SGDVO_ADD>(
				SGD_addPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<SGDVO_ADD> processor) {
		IRule<SGDVO_ADD> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("JX04");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");

		processor.addAfterRule(rule);

	}

	/**
	 * 新增前规则
	 * 
	 * @param processor
	 */
	private void addBeforeRule(AroundProcesser<SGDVO_ADD> processer) {
		IRule<SGDVO_ADD> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
		rule = new nc.bs.pubapp.pub.rule.CreateBillCodeRule();
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCbilltype("JX04");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setOrgItem("pk_org");
		processer.addBeforeRule(rule);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
		//检查表体为空校验
//		rule = new nc.bs.pubapp.pub.rule.CheckNotNullRule();
//		processer.addBeforeRule(rule);
	}
}
