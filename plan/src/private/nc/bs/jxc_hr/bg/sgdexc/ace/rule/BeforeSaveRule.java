package nc.bs.jxc_hr.bg.sgdexc.ace.rule;

import java.util.ArrayList;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.vo.plan.jx15.SGDBVO_EXC;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author xiashsh
 * @date 2017-5-23
 * @description ʩ����ϵ������ǰ
 */
public class BeforeSaveRule implements IRule<SGDVO_EXC> {

	@Override
	public void process(SGDVO_EXC[] vos) {
		if (vos == null || vos.length == 0) {
			return;
		}
		for (SGDVO_EXC vo : vos) {
			SGDBVO_EXC[] bvos=(SGDBVO_EXC[]) vo.getChildrenVO();
			UFDouble excgs=new UFDouble();
			for (SGDBVO_EXC bvo : bvos) {
				excgs=excgs.add( (bvo.getExchours_b()==null?UFDouble.ZERO_DBL:bvo.getExchours_b()));
			}
			//
			if (vo.getParentVO().getOldhours().compareTo(excgs)<0) {
				try {
					throw new BusinessException("���幤ʱ�ۼӲ��ܳ�����ͷԴ��ʱ��");
				} catch (BusinessException e) {
					e.printStackTrace();
					ExceptionUtils.wrappBusinessException(e.getMessage());
				}
			}
		}

	}

}
