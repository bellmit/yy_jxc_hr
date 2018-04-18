package nc.bs.jxc_hr.jx03.swlgs.rule;

import java.util.HashMap;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.jxc_hr.jx03.ISWLGSMaintain;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author ʵ������ʱ�޸ı����У��ʣ�๤ʱ(remaings)�Ƿ����0,ʣ�๤ʱ=�ɹ������幤ʱ����+������ʱ-ʵ������ʱ
 */
public class CheckSwlgsAfterUpdateRule implements IRule<SWLGSVO> {
	@Override
	public void process(SWLGSVO[] vos) {
		try {
			if (vos == null || vos.length == 0) {
				return;
			}
			SWLGSVO swlgsvo = vos[0];
			Object srcbillid = swlgsvo.getParentVO().getSrcbillid();
			if (srcbillid == null) {
				throw new BusinessException("��������Դ���ݣ�");
			}
			String srcbillid1 = (String) srcbillid;
			HashMap<String, UFDouble> queryPGDRemainGS = NCLocator.getInstance().lookup(ISWLGSMaintain.class).queryPGDRemainGS(new String[]{srcbillid1}, null);
			if(queryPGDRemainGS.size()>0){
				if(queryPGDRemainGS.get(srcbillid1).compareTo(UFDouble.ZERO_DBL)<0){
					throw new BusinessException("��ʵ������ʱ��Ӧ���ɹ���ʣ�๤ʱ���㣬����ʧ�ܣ�");
				}
			}
			else{
				throw new BusinessException("δ��ѯ���ɹ�����nc.bs.jxc_hr.jx03.swlgs.rule.CheckSwlgsAfterUpdateRule");
			}
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}

	}

}
