package nc.bs.jxc_hr.bg.sgd.ace.rule;

import java.util.ArrayList;
import java.util.HashSet;

import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.pubitf.bd.reportitem.pub.SqlUtils;
import nc.vo.plan.jx01.SGDBVO;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author xiashsh
 * @date 2017-5-24
 * @description 施工单保存后
 */
public class AfterSaveRule implements IRule<SGDVO> {

	@Override
	public void process(SGDVO[] vos) {
		try {
			if (vos == null || vos.length == 0) {
				return;
			}
			ArrayList<String> list = new ArrayList<String>();
			for (SGDVO vo : vos) {
				String gl = vo.getParentVO().getGl();
				String sql = "select count(gl) from jxc_hr_sgd_h where nvl(dr,0)=0 and gl='"
						+ gl + "'";

				int res =Integer.parseInt( (getBaseDAO().executeQuery(sql, new ColumnProcessor())).toString());
				if (res >1) {
					throw new BusinessException("该工令号已经制成施工单！");
				}
				SGDBVO[] bvos = (SGDBVO[]) vo.getChildrenVO();
				HashSet<String> set = new HashSet<String>();
				for (SGDBVO bvo : bvos) {
					String str=gl + "_" + bvo.getPk_dept() + "_" + bvo.getGz();
					list.add(str);
					set.add(str);
				}
				if (set.size() < bvos.length) {
					throw new BusinessException("当前界面表体部门，工种存在重复！");
				}
				//主键联合查询
				String inStr = SqlUtils.getInStr(
						"h.gl||'_'||b.dept||'_'||b.gz", list, true);
				String sql2 = "select count(gl) from jxc_hr_sgd_h h left join jxc_hr_sgd_b b on h.pk_sgd_h=b.pk_sgd_h  where nvl(h.dr,0)=0 and"
						+ inStr;
				int res2 = Integer.parseInt( (getBaseDAO().executeQuery(sql2, new ColumnProcessor())).toString());

				if (res2>bvos.length) {
					throw new BusinessException("表体部门，工种存在重复！");
				}
			}
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
	}

	private BaseDAO bd = null;

	private BaseDAO getBaseDAO() {
		if (bd == null) {
			bd = new BaseDAO();
		}
		return bd;
	}

}
