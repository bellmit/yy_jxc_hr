package nc.bs.jxc_hr.jx07.orderstart.ace.bp;

import nc.bs.jxc_hr.jx07.orderstart.plugin.bpplugin.OrderstartPluginPoint;
import nc.impl.pubapp.pattern.data.bill.template.UpdateBPTemplate;
import nc.impl.pubapp.pattern.rule.ICompareRule;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.impl.pubapp.pattern.rule.processer.CompareAroundProcesser;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.jxc_hr.ordersheet.OrderStartSubVO;

/**
 * �޸ı����BP
 * 
 */
public class AceOrderstartUpdateBP {

	public AggOrderStartVO[] update(AggOrderStartVO[] bills,
			AggOrderStartVO[] originBills) {

		// �����޸�ģ��
		UpdateBPTemplate<AggOrderStartVO> bp = new UpdateBPTemplate<AggOrderStartVO>(
				OrderstartPluginPoint.UPDATE);

		// ִ��ǰ����
		this.addBeforeRule(bp.getAroundProcesser());
		// ִ�к����
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
