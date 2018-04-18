package nc.bs.jxc_hr.jx03.swlgs.ace.bp;

import nc.bs.jxc_hr.jx03.swlgs.plugin.bpplugin.SWLGSPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.plan.jx03.SWLGSBVO;

/**
 * �޸ı����BP
 * 
 */
public class AceSWLGSUpdateBP {

	public SWLGSVO[] update(SWLGSVO[] bills, SWLGSVO[] originBills) {

		// �����޸�ģ��
		UpdateBPTemplate<SWLGSVO> bp = new UpdateBPTemplate<SWLGSVO>(
				SWLGSPluginPoint.UPDATE);

		// ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ִ�к����
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<SWLGSVO> processer) {
		IRule<SWLGSVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("JX03");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
		
		processer.addAfterRule(rule);
		rule =new nc.bs.jxc_hr.jx03.swlgs.rule.CheckSwlgsAfterUpdateRule();
		processer.addAfterRule(rule);

	}

	private void addBeforeRule(CompareAroundProcesser<SWLGSVO> processer) {
		IRule<SWLGSVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
		ICompareRule<SWLGSVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCbilltype("JX03");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setOrgItem("pk_org");
		processer.addBeforeRule(ruleCom);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
	}

}
