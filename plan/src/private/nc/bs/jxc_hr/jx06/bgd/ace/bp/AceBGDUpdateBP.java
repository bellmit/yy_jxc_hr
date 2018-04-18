package nc.bs.jxc_hr.jx06.bgd.ace.bp;

import nc.bs.jxc_hr.jx06.bgd.plugin.bpplugin.BGDPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.plan.jx06.BGDBVO;

/**
 * �޸ı����BP
 * 
 */
public class AceBGDUpdateBP {

	public BGDVO[] update(BGDVO[] bills, BGDVO[] originBills) {

		// �����޸�ģ��
		UpdateBPTemplate<BGDVO> bp = new UpdateBPTemplate<BGDVO>(
				BGDPluginPoint.UPDATE);

		// ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ִ�к����
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<BGDVO> processer) {
		IRule<BGDVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("JX06");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");

		processer.addAfterRule(rule);

	}

	private void addBeforeRule(CompareAroundProcesser<BGDVO> processer) {
		IRule<BGDVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
		ICompareRule<BGDVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCbilltype("JX06");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setOrgItem("pk_org");
		processer.addBeforeRule(ruleCom);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
		
		rule=new nc.bs.jxc_hr.jx06.bgd.plugin.rule.BeforeInsertGsRule();
		processer.addBeforeRule(rule);
	}

}
