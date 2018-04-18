package nc.bs.jxc_hr.jx15.sgd_exc.ace.bp;

import nc.bs.jxc_hr.jx15.sgd_exc.plugin.bpplugin.SGD_excPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.plan.jx15.SGDBVO_EXC;

/**
 * 标准单据新增BP
 */
public class AceSGD_excInsertBP {

	public SGDVO_EXC[] insert(SGDVO_EXC[] bills) {

		InsertBPTemplate<SGDVO_EXC> bp = new InsertBPTemplate<SGDVO_EXC>(
				SGD_excPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<SGDVO_EXC> processor) {
		IRule<SGDVO_EXC> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("JX15");
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
	private void addBeforeRule(AroundProcesser<SGDVO_EXC> processer) {
		IRule<SGDVO_EXC> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
		rule = new nc.bs.pubapp.pub.rule.CreateBillCodeRule();
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCbilltype("JX15");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setOrgItem("pk_org");
		processer.addBeforeRule(rule);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
		rule = new nc.bs.pubapp.pub.rule.CheckNotNullRule();
		processer.addBeforeRule(rule);
		/*rule = new  nc.bs.jxc_hr.jx15.sgd_exc.rule.JX15CheckEXCHours();
		processer.addBeforeRule(rule);*/
		rule =new nc.bs.jxc_hr.jx15.sgd_exc.rule.JX15BeforeInsertOrUpdateRule();
		processer.addBeforeRule(rule);
		rule=new nc.bs.jxc_hr.bg.sgdexc.ace.rule.BeforeSaveRule();
		processer.addBeforeRule(rule);
	}
}
