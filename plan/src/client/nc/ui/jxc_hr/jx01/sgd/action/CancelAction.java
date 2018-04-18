package nc.ui.jxc_hr.jx01.sgd.action;

import java.awt.event.ActionEvent;

import nc.a.tools.all.BillIteamInfo;
import nc.a.tools.all.PublicTools;
import nc.ui.pub.beans.UIDialog;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.ui.uif2.UIState;
import nc.ui.uif2.actions.EventFromClosingHandlerJudger;
import nc.ui.uif2.components.CommonConfirmDialogUtils;

public class CancelAction extends nc.ui.uif2.actions.CancelAction {
	private static final long serialVersionUID = 6772677649190155374L;
	private ShowUpableBillListView listview;
	private nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor;

	public nc.ui.pubapp.uif2app.view.ShowUpableBillForm getBillFormEditor() {
		return billFormEditor;
	}

	public void setBillFormEditor(
			nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor) {
		this.billFormEditor = billFormEditor;
	}

	public ShowUpableBillListView getListview() {
		return listview;
	}

	public void setListview(ShowUpableBillListView listview) {
		this.listview = listview;
	}

	/**
	 * �Ƿ�����ȡ��
	 */
	protected boolean canceled = false;

	@Override
	public void doAction(ActionEvent e) throws Exception {
		// ����Ǵ�ClosingHandler������CancelAction����ѯ�ʣ�ֱ��ȡ��
		// ����ڶ�ҳǩ������������ġ� ����һ��Ľڵ㣬���ֱ�ӹر��ˣ��Ƿ����setUiState��ʵ�޹ؽ�Ҫ
		if (EventFromClosingHandlerJudger.isFromClosingHandler(e)
				|| UIDialog.ID_YES == CommonConfirmDialogUtils
						.showConfirmCancelDialog(this.getModel().getContext()
								.getEntranceUI()))

		{

			this.doBeforeCancel();
			this.getModel().setUiState(UIState.NOT_EDIT);
			// ȡ��ʱ��������״̬�仯�⣬����Ҫ��������ѡ������
			this.doResetSelectedData();
			ShowStatusBarMsgUtil.showStatusBarMsg(nc.vo.ml.NCLangRes4VoTransl
					.getNCLangRes().getStrByID("pubapp_0", "0pubapp-0125")/*
																		 * @res
																		 * "��ȡ��"
																		 */,
					this.getModel().getContext());
			this.canceled = true;

			// ������ changecolor
			if (getListview() == null) {
				PublicTools.changeCardGsColor(getBillFormEditor()
						.getBillCardPanel(),BillIteamInfo.Body);
			} else {
				PublicTools.changeGsColor(getListview().getBillListPanel());
			}
		} else {
			this.canceled = false;
		}
	}

	public boolean isCanceled() {
		return this.canceled;
	}

}
