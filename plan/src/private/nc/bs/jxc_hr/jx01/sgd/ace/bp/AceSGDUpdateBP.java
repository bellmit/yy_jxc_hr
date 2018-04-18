package nc.bs.jxc_hr.jx01.sgd.ace.bp;

import nc.bs.jxc_hr.jx01.sgd.plugin.bpplugin.SGDPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.plan.jx01.SGDBVO;

/**
 * �޸ı����BP
 * 
 */
public class AceSGDUpdateBP {

	public SGDVO[] update(SGDVO[] bills, SGDVO[] originBills) {

		// �����޸�ģ��
		UpdateBPTemplate<SGDVO> bp = new UpdateBPTemplate<SGDVO>(
				SGDPluginPoint.UPDATE);

		// ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ִ�к����
		this.addAfterRule(bp.getAroundProcesser());
		return bp.update(bills, originBills);
	}

	private void addAfterRule(CompareAroundProcesser<SGDVO> processer) {
		IRule<SGDVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.BillCodeCheckRule();
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCbilltype("JX01");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setCodeItem("billno");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.BillCodeCheckRule) rule).setOrgItem("pk_org");

		processer.addAfterRule(rule);
		
		//ʩ���������		add	xiashsh 2017-05-24
		rule=new nc.bs.jxc_hr.bg.sgd.ace.rule.AfterSaveRule();
		processer.addAfterRule(rule);

	}

	private void addBeforeRule(CompareAroundProcesser<SGDVO> processer) {
		IRule<SGDVO> rule = null;
		rule = new nc.bs.pubapp.pub.rule.FillUpdateDataRule();
		processer.addBeforeRule(rule);
		ICompareRule<SGDVO> ruleCom = new nc.bs.pubapp.pub.rule.UpdateBillCodeRule();
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCbilltype("JX01");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setCodeItem("taskno");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setGroupItem("pk_group");
		((nc.bs.pubapp.pub.rule.UpdateBillCodeRule) ruleCom)
				.setOrgItem("pk_org");
		processer.addBeforeRule(ruleCom);
		rule = new nc.bs.pubapp.pub.rule.FieldLengthCheckRule();
		processer.addBeforeRule(rule);
	}

}
