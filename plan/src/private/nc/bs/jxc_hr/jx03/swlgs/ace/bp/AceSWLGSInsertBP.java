package nc.bs.jxc_hr.jx03.swlgs.ace.bp;

import nc.bs.jxc_hr.jx03.swlgs.plugin.bpplugin.SWLGSPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.InsertBPTemplate;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.AroundProcesser;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.plan.jx03.SWLGSBVO;

/**
 * 标准单据新增BP
 */
public class AceSWLGSInsertBP {

	public SWLGSVO[] insert(SWLGSVO[] bills) {

		InsertBPTemplate<SWLGSVO> bp = new InsertBPTemplate<SWLGSVO>(
				SWLGSPluginPoint.INSERT);
		this.addBeforeRule(bp.getAroundProcesser());
		this.addAfterRule(bp.getAroundProcesser());
		return bp.insert(bills);

	}

	/**
	 * 新增后规则
	 * 
	 * @param processor
	 */
	private void addAfterRule(AroundProcesser<SWLGSVO> processor) {
		IRule<SWLGSVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("JX03");
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
	private void addBeforeRule(AroundProcesser<SWLGSVO> processer) {
		IRule<SWLGSVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillInsertDataRule();
		processer.addBeforeRule(rule);
		rule = new nc.bs.pubapp.pub.rule.CreateBillCodeRule();
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCbilltype("JX03");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.CreateBillCodeRule) rule).setOrgItem("pk_org");
		processer.addBeforeRule(rule);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
		rule = new nc.bs.pubapp.pub.rule.CheckNotNullRule();
		processer.addBeforeRule(rule);
		//实物量工时拉单派工卡，保存实物量前校验派工卡的工时是否报完，派工卡 实物量工时  1对多
		rule= new nc.bs.jxc_hr.jx03.swlgs.rule.CheckSwlgsBeforeRule();
		processer.addBeforeRule(rule);
	}
}
