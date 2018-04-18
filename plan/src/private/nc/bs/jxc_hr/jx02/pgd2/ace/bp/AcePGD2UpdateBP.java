package nc.bs.jxc_hr.jx02.pgd2.ace.bp;

import nc.bs.jxc_hr.jx02.pgd2.plugin.bpplugin.PGD2PluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.plan.jx02.PGDBVO01;

/**
 * �޸ı����BP
 * 
 */
public class AcePGD2UpdateBP {

	public PGDVO[] update(PGDVO[] bills, PGDVO[] originBills) {

		// �����޸�ģ��
		UpdateBPTemplate<PGDVO> bp = new UpdateBPTemplate<PGDVO>(
				PGD2PluginPoint.UPDATE);

		// ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ִ�к����
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<PGDVO> processer) {
		IRule<PGDVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("JX02");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");
		processer.addAfterRule(rule);

	}

	private void addBeforeRule(CompareAroundProcesser<PGDVO> processer) {
		IRule<PGDVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
		ICompareRule<PGDVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCbilltype("JX02");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setOrgItem("pk_org");
		processer.addBeforeRule(ruleCom);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
		//�޸ı���ǰ����У�鹤ʱ
//		rule=new nc.bs.jxc_hr.jx02.pgd2.rule.CheckGS();
//		processer.addBeforeRule(rule);
		rule =new nc.bs.jxc_hr.jx02.pgd2.rule.CheckGSBeforeInsertOrUpdate();
		processer.addBeforeRule(rule);
	}

}
