package nc.ui.jxc_hr.jx08.orderend.ref;

import nc.ui.pubapp.billref.dest.DefaultBillDataLogic;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.pubapp.AppContext;

/**
 * ת���߼�����
 * 
 * @author shidl
 * 
 */
public class OrderStartRefOrderEndTransferBillDataLogic extends
		DefaultBillDataLogic {

	@Override
	public void doTransferAddLogic(Object selectedData) {
		// 1.��䵥��������Ϣ
		AggOrderEndVO agg = (AggOrderEndVO) selectedData;
		agg.getParentVO().setBilltype("JX08");
		agg.getParentVO().setBilldate(AppContext.getInstance().getBusiDate());
		// �����������ڽ�����
		super.doTransferAddLogic(selectedData);
	}

}
