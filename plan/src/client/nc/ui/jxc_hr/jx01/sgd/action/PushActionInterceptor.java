package nc.ui.jxc_hr.jx01.sgd.action;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uif2.actions.ActionInterceptor;
import nc.vo.plan.jx01.SGDBVO;
import nc.vo.pub.BusinessException;

public class PushActionInterceptor implements ActionInterceptor {
	private ShowUpableBillForm editor;
	private BillManageModel model;
	private ShowUpableBillListView listview;
	public ShowUpableBillListView getListview() {
		return listview;
	}

	public void setListview(ShowUpableBillListView listview) {
		this.listview = listview;
	}

	public ShowUpableBillForm getEditor() {
		return editor;
	}

	public void setEditor(ShowUpableBillForm editor) {
		this.editor = editor;
	}

	public BillManageModel getModel() {
		return model;
	}

	public void setModel(BillManageModel model) {
		this.model = model;
	}

	@Override
	public boolean afterDoActionFailed(Action arg0, ActionEvent arg1,
			Throwable arg2) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public void afterDoActionSuccessed(Action arg0, ActionEvent arg1) {
		// TODO 自动生成的方法存根

	}

	@Override
	public boolean beforeDoAction(Action arg0, ActionEvent arg1) {
		Object[] srcVos = model.getSelectedOperaDatas();
		if (srcVos == null || srcVos.length == 0) {
			return false;
		}
		int brow=listview.getBillListPanel().getBodyTable().getSelectedRow();
		if(brow<0){
			int res=MessageDialog.showWarningDlg(null, "提示", "请选中表体数据<工种>");
			return false;
		}
		return true;
	}
}
