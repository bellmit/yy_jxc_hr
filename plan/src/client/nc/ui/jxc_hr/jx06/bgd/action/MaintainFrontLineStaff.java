package nc.ui.jxc_hr.jx06.bgd.action;

import java.awt.event.ActionEvent;

import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uif2.NCAction;

/**
 * @author zhangshjf
 * 维护一线员工名单
 *
 */
public class MaintainFrontLineStaff extends NCAction {
	private BillManageModel model;
	private ShowUpableBillListView listview;
	public BillManageModel getModel() {
		return model;
	}
	public void setModel(BillManageModel model) {
		this.model = model;
	}
	public ShowUpableBillListView getListview() {
		return listview;
	}
	public void setListview(ShowUpableBillListView listview) {
		this.listview = listview;
	}
	public MaintainFrontLineStaff(){
		super();
		setBtnName("维护一线人员");
		setCode("maintainFrontLineStaff");
	}
	@Override
	public void doAction(ActionEvent arg0) throws Exception {
		

	}

}
