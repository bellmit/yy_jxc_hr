package nc.bs.jxc_hr.jx03.swlgs.rule;

import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.plan.jx03.SWLGSBVO;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * 实物量工时拉单派工卡，保存实物量前校验派工卡的工时是否报完，派工卡 实物量工时  1对多
 */
public class CheckSwlgsBeforeRule implements IRule<SWLGSVO> {

	@Override
	public void process(SWLGSVO[] vos) {
		if(vos==null||vos.length==0){
			return;
		}
		StringBuffer sf=new StringBuffer();
		for(SWLGSVO vo:vos){
			SWLGSBVO[] bvos = (SWLGSBVO[]) vo.getChildrenVO();
			if(bvos!=null&&bvos.length>0){
				for(SWLGSBVO bvo:bvos){
					sf.append("'");
					String srcbillid_b = bvo.getSrcbillid_b()==null?"":bvo.getSrcbillid_b();
					sf.append(srcbillid_b);
					sf.append("',");
				}
			}
		}
		sf.deleteCharAt(sf.length()-1);
		String sql=" select pk_pgd_czz,(nvl(addgs,0)+zgs-XY.xygs)  surplus_hours from jxc_hr_pgk_czz SY,(select srcbillid_b srcbid,sum(swlgs) xygs from jxc_hr_swlgs_b where nvl(dr,0)=0 and srcbillid_b in("+sf.toString()+")group by srcbillid_b) XY where nvl(SY.dr,0)=0 and (SY.pk_pgd_czz=XY.srcbid)  and (nvl(addgs, 0) + zgs - XY.xygs)<=0";
		BaseDAO bd=new BaseDAO();
		Object res=null;
		try {
			res = bd.executeQuery(sql, new ColumnProcessor());
		} catch (DAOException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		if(res!=null){
			//派工卡工时已报完!
			ExceptionUtils.wrappBusinessException("<%"+res.toString()+"$>");
		}
		
		
	}

}
