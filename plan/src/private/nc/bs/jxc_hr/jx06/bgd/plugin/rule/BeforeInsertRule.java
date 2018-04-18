package nc.bs.jxc_hr.jx06.bgd.plugin.rule;

import java.util.ArrayList;


import nc.bs.dao.BaseDAO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.pubitf.bd.reportitem.pub.SqlUtils;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author zhangshj
 * 报工单新增保存前校验：当月，该人员是否已存在报工单，如果已存在，此人不允许再生成报工单
 */
public class BeforeInsertRule implements IRule<BGDVO> {

	@SuppressWarnings("unchecked")
	@Override
	public void process(BGDVO[] vos) {
		if(vos==null||vos.length==0){
			return;
		}
		ArrayList<String> list=new ArrayList<String>();
		for(BGDVO vo:vos){
			list.add(vo.getParentVO().getBgd_people());
		}
		if(list.size()==0){
			return;
		}
		try {
			String inStr = SqlUtils.getInStr("A.bgd_people", list, true);
			Object busiDate = AppContext.getInstance().getBusiDate();
			String sql ="select B.name from jxc_hr_bgd_h A inner join bd_psndoc B on A.bgd_people=B.pk_psndoc where nvl(A.dr,0)=0 and  bgd_date like '"+busiDate.toString().substring(0, 7)+"%' and "+inStr;
			BaseDAO bd=new BaseDAO();
			ArrayList<String> listname=(ArrayList)bd.executeQuery(sql, new ColumnListProcessor());
			if(listname.size()>0){
				throw new BusinessException("以下人员在当月报工单中已存在：【"+listname.toString()+"】");
			}
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		
	}

}
