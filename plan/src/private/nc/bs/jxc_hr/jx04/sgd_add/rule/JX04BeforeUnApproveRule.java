package nc.bs.jxc_hr.jx04.sgd_add.rule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.jxc_hr.jx01.ISGDMaintain;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class JX04BeforeUnApproveRule implements IRule<SGDVO_ADD> {

	/** 
	 * 施工增补单取消审批前校验 可用工时是否大于回滚的增补工时
	 * 如果是、可回滚
	 * 不是、不可回滚
	 */
	@Override
	public void process(SGDVO_ADD[] vos) {
		if (vos == null || vos.length == 0) {
			return;
		}
		ArrayList<String> sgdbid=new ArrayList<String>();
		HashMap<String,UFDouble> kv=new HashMap<String,UFDouble>();
		String pk=null;
		for(SGDVO_ADD vo:vos){
			pk=vo.getParentVO().getFirstbillbid()==null?"":vo.getParentVO().getFirstbillbid();
			if("".equals(pk)){continue;}
			sgdbid.add(pk);
			kv.put(pk, vo.getParentVO().getAddhours()==null?UFDouble.ZERO_DBL:vo.getParentVO().getAddhours());
		}
		if(sgdbid.size()>0){
			try {
				Map<String, UFDouble> queryActiveManHours = NCLocator.getInstance().lookup(ISGDMaintain.class).queryActiveManHours(sgdbid.toArray(new String[sgdbid.size()]));
				for(Entry<String, UFDouble> entry:kv.entrySet()){
					if(entry.getValue().compareTo(queryActiveManHours.get(entry.getKey()))>0){
						throw new BusinessException("增补工时已被使用，不可弃审！");
					}
				}
			
			} catch (BusinessException e) {
				e.printStackTrace();
				ExceptionUtils.wrappBusinessException(e.getMessage());
			}
		}
	}
}
