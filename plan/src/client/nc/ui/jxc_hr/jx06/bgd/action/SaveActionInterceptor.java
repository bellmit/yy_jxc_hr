package nc.ui.jxc_hr.jx06.bgd.action;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.Action;

import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uif2.actions.ActionInterceptor;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;


public class SaveActionInterceptor implements ActionInterceptor {
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
		// TODO �Զ����ɵķ������
		return true;
	}

	@Override
	public void afterDoActionSuccessed(Action arg0, ActionEvent arg1) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public boolean beforeDoAction(Action arg0, ActionEvent arg1) {
		BillCardPanel panel = editor.getBillCardPanel();
		int row=panel.getRowCount();
		for(int i=0;i<row;i++){
			Object gs=panel.getBillModel().getValueAt(i, "gs");
			Object name=panel.getBillModel().getValueAt(i, "name");
			Object res_gs=panel.getBillModel().getValueAt(i, "def8");
			Object date_begin=panel.getBillModel().getValueAt(i, "date_begin");
			Object date_end=panel.getBillModel().getValueAt(i, "date_end");
			if(gs!=null&&name!=null&&date_begin!=null&&date_end!=null&&res_gs!=null){
				if(date_begin.toString().compareTo(date_end.toString())>0){
					MessageDialog.showWarningDlg(null, "��ʾ", "��"+row+"�У��������ڲ���С�ڿ�ʼ����");
					return false;
				
				}else if(Double.parseDouble(res_gs.toString())<Double.parseDouble(gs.toString())){
					MessageDialog.showWarningDlg(null, "��ʾ", "��"+row+"�У���ʱ��Ϣ������˶Կ��ڹ�ʱ����д");
					return false;
				}
			}
		}
		
		return true;
		
	}

}
