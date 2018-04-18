package nc.bs.jxc_hr.bg.orderstart.ace.rule;

import java.util.ArrayList;
import java.util.HashSet;

import nc.bs.dao.BaseDAO;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.pubitf.bd.reportitem.pub.SqlUtils;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.jxc_hr.ordersheet.OrderStartSubVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author xiashsh
 * @date 2017-5-25
 * @description 工令申请单修改保存后
 */
public class AfterUpdateRule implements IRule<AggOrderStartVO> {

	@SuppressWarnings("unchecked")
	@Override
	public void process(AggOrderStartVO[] vos) {
		try {
			if (vos == null || vos.length == 0) {
				return;
			}
			ArrayList<String> list = new ArrayList<String>();
			for (AggOrderStartVO vo : vos) {
				OrderStartSubVO[] bvos = (OrderStartSubVO[]) vo.getChildrenVO();
				HashSet<String> set = new HashSet<String>();
				for (OrderStartSubVO bvo : bvos) {
					set.add(bvo.getOrdercode());
					list.add(bvo.getOrdercode());
				}
				if (set.size() < bvos.length) {
					throw new BusinessException("当前界面的工令号存在重复！");
				}

				String inStr = SqlUtils.getInStr("ordercode", list, true);
				// ordercode in();
				String sql = "select ordercode from (select count(ordercode) as a,ordercode from jxc_hr_orderstartsub where nvl(dr,0)=0 and  "
						+ inStr + " group by ordercode) where a>1 ";
				BaseDAO bd = new BaseDAO();
				Object res = bd.executeQuery(sql, new ColumnProcessor());
				if (res!=null) {
					throw new BusinessException("该工令号已经存在 "+res.toString());
				}
			}
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
	}

}
