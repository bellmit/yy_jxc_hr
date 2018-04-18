package nc.ui.jxc_hr.jx08.orderend.ref;

import nc.ui.pubapp.billref.dest.DefaultBillDataLogic;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pubapp.AppContext;

/**
 * 转换逻辑处理
 * 
 * @author shidl
 * 
 */
public class OrderStartRefOrderEndTransferBillDataLogic extends
		DefaultBillDataLogic {

	@Override
	public void doTransferAddLogic(Object selectedData) {
		// 1.填充单据类型信息
		AggOrderEndVO agg = (AggOrderEndVO) selectedData;
		agg.getParentVO().setBilltype("JX08");
		agg.getParentVO().setBilldate(AppContext.getInstance().getBusiDate());
		// 把数据设置在界面上
		super.doTransferAddLogic(selectedData);
	}

}
