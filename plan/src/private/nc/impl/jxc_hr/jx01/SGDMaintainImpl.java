package nc.impl.jxc_hr.jx01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.bs.dao.BaseDAO;
import nc.impl.pub.ace.AceSGDPubServiceImpl;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.MapListProcessor;
import nc.pubitf.bd.reportitem.pub.SqlUtils;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.plan.jx02.JX02DTO;
import nc.vo.plan.jx15.JX15DTO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.SqlBuilder;

public class SGDMaintainImpl extends AceSGDPubServiceImpl implements
		nc.itf.jxc_hr.jx01.ISGDMaintain {

	@Override
	public void delete(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		super.pubdeleteBills(clientFullVOs, originBills);
	}

	@Override
	public SGDVO[] insert(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		return super.pubinsertBills(clientFullVOs, originBills);
	}

	@Override
	public SGDVO[] update(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		return super.pubupdateBills(clientFullVOs, originBills);
	}

	@Override
	public String[] queryPKs(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerypkbills(queryScheme);
	}

	@Override
	public SGDVO[] queryBillByPK(String[] pks) throws BusinessException {
		return super.pubquerybillbypkbills(pks);
	}

	@Override
	public SGDVO[] save(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		return super.pubsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public SGDVO[] unsave(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		return super.pubunsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public SGDVO[] approve(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		return super.pubapprovebills(clientFullVOs, originBills);
	}

	@Override
	public SGDVO[] unapprove(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		return super.pubunapprovebills(clientFullVOs, originBills);
	}

	/**
	 * 批量查询可用工时 可用工时=源头工时（施工单表体工时）-历史已耗用工时（下游JX15工时累加（未审批）+下游JX02工时累加=工时+增补工时）
	 */
	@Override
	public Map<String, UFDouble> queryActiveManHours(String[] pk_sgd_bs)
			throws BusinessException {
		HashMap<String, UFDouble> primaryKey2ActiveManHours = new HashMap<String, UFDouble>();
		SqlBuilder sqlBuilder = new SqlBuilder();
		sqlBuilder
				.append("	  select t1.pk_sgd_b, (t1.gs - nvl(t2.gs,0) - nvl(t3.gs,0) - nvl(t4.gs,0)) activehour	");
//				.append("	  select t1.pk_sgd_b, (t1.gs - nvl(t2.gs,0) - nvl(t4.gs,0)) activehour	");		//	xiashsh	2017-06-15
		sqlBuilder.append("	    from jxc_hr_sgd_b t1	");
		sqlBuilder
				.append("	    left join (select m1.srcbillid_b, nvl(sum(m1.exchours), 0) gs	");
		sqlBuilder.append("	                 from jxc_hr_sgd_exc_h m1	");
		sqlBuilder.append("	                where nvl(m1.dr, 0) = 0	and m1.approvestatus != 1");
		sqlBuilder.append("	                group by m1.srcbillid_b) t2	");
		sqlBuilder.append("	      on t1.pk_sgd_b = t2.srcbillid_b	");
		sqlBuilder
				.append("	    left join (select m2.firstbillbid, nvl(sum(m2.addhours), 0) gs	");
		sqlBuilder.append("	                 from jxc_hr_sgd_add_h m2	");
		sqlBuilder.append("	                where nvl(m2.dr, 0) = 0	");
		sqlBuilder.append("	                  and m2.approvestatus = 1	");
		sqlBuilder.append("	                group by m2.firstbillbid) t3	");
		sqlBuilder.append("	      on t1.pk_sgd_b = t3.firstbillbid	");
		sqlBuilder
				.append("	    left join (select m3.srcbillbodyid, nvl(sum(m3.bodygstotal), 0) gs	");
		sqlBuilder.append("	                 from jxc_hr_pgk_h m3	");
		sqlBuilder.append("	                where nvl(m3.dr, 0) = 0	");
		sqlBuilder.append("	                group by m3.srcbillbodyid) t4	");
		sqlBuilder.append("	      on t1.pk_sgd_b = t4.srcbillbodyid	");
		sqlBuilder.append("	   where nvl(t1.dr, 0) = 0	and ");
		sqlBuilder.append(SqlUtils.getInStr("t1.pk_sgd_b", pk_sgd_bs, true));
		BaseDAO dao = new BaseDAO();
		List list = (List) dao.executeQuery(sqlBuilder.toString(),
				new MapListProcessor());
		if (list.size() > 0) {
			for (Object obj : list) {
				Map map = (Map) obj;
				String key = map.get("pk_sgd_b") == null ? "" : map.get(
						"pk_sgd_b").toString();
				UFDouble value = map.get("activehour") == null ? UFDouble.ZERO_DBL
						: new UFDouble(map.get("activehour").toString());
				primaryKey2ActiveManHours.put(key, value);
			}
		}
		return primaryKey2ActiveManHours;
	}
}
