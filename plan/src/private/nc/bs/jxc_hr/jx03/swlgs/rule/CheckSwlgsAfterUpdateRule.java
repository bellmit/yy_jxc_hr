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
 * @author 实物量工时修改保存后校验剩余工时(remaings)是否大于0,剩余工时=派工卡表体工时汇总+增补工时-实物量工时
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
				throw new BusinessException("不存在来源单据！");
			}
			String srcbillid1 = (String) srcbillid;
			HashMap<String, UFDouble> queryPGDRemainGS = NCLocator.getInstance().lookup(ISWLGSMaintain.class).queryPGDRemainGS(new String[]{srcbillid1}, null);
			if(queryPGDRemainGS.size()>0){
				if(queryPGDRemainGS.get(srcbillid1).compareTo(UFDouble.ZERO_DBL)<0){
					throw new BusinessException("该实物量工时对应的派工卡剩余工时不足，保存失败！");
				}
			}
			else{
				throw new BusinessException("未查询到派工卡！nc.bs.jxc_hr.jx03.swlgs.rule.CheckSwlgsAfterUpdateRule");
			}
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}

	}

}
