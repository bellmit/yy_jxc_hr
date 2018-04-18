package nc.bs.jxc_hr.jx15.sgd_exc.rule;

import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx15.SGDBVO_EXC;
import nc.vo.plan.jx15.SGDHVO_EXC;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.lang.UFDouble;
/**
 * ����ʱ�ϼƱ��幤ʱ�ܺ͵���ͷEXCHours�ֶ�
 * @author Admin
 *
 */
public class JX15CheckEXCHours implements IRule<SGDVO_EXC> {

	@Override
	public void process(SGDVO_EXC[] vos) {
		// TODO �Զ����ɵķ������
		if (vos == null ||vos.length == 0 ) {
			return;
		}
		SGDBVO_EXC[] bvos = (SGDBVO_EXC[])vos[0].getChildrenVO();
		SGDHVO_EXC hvo = (SGDHVO_EXC)vos[0].getParentVO();
		UFDouble hgs = new UFDouble();
		for (int i = 0; i < bvos.length; i++) {
			SGDBVO_EXC bvo = bvos[i];
			 hgs.add(bvo.getGs()==null?UFDouble.ZERO_DBL:bvo.getGs());
		}
		hvo.setExchours(hgs);
		
				
	}

}
