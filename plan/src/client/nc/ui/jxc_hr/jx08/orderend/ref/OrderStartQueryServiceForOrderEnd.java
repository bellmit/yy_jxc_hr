package nc.ui.jxc_hr.jx08.orderend.ref;

import nc.bs.framework.common.NCLocator;
import nc.itf.jxc_hr.jx07.IOrderstartMaintain;
import nc.ui.pubapp.uif2app.query2.model.IRefQueryService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * 上游单据查询服务
 * 
 * @author shidl
 * 
 */
public class OrderStartQueryServiceForOrderEnd implements IRefQueryService {

	@Override
	public Object[] queryByWhereSql(String whereSql) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] queryByQueryScheme(IQueryScheme queryScheme)
			throws Exception {
		AggOrderStartVO[] retbills = null;
		IOrderstartMaintain service = NCLocator.getInstance().lookup(
				IOrderstartMaintain.class);
		try {
			String[] queryPKs = service.queryPKs(queryScheme);
			retbills = service.queryBillByPK(queryPKs);
		} catch (BusinessException e) {
			ExceptionUtils.wrappException(e);
		}
		return retbills;
	}

}
