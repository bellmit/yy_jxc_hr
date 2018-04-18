package nc.ui.jxc_hr.jx01.sgd.action;

import java.awt.event.ActionEvent;

import nc.a.tools.all.BillIteamInfo;
import nc.a.tools.all.PublicTools;
import nc.ui.pub.beans.UIDialog;
import nc.ui.pubapp.uif2app.AppUiState;
import nc.ui.pubapp.uif2app.model.IAppModelEx;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uif2.DefaultExceptionHanler;
import nc.ui.uif2.IExceptionHandler;
import nc.ui.uif2.NCAction;
import nc.ui.uif2.UIState;
import nc.ui.uif2.actions.ShowMeUpAction;
import nc.ui.uif2.components.CommonConfirmDialogUtils;
import nc.ui.uif2.model.AbstractUIAppModel;

public class UEReturnAction extends ShowMeUpAction {

	private static final long serialVersionUID = 7770796906771341232L;
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

	private DefaultExceptionHanler exceptionHandler = new DefaultExceptionHanler();

	// private BillManageModel model;

	private NCAction saveAction;

	@Override
	public void doAction(ActionEvent e) throws Exception {
		if (this.canBeReturned()) {
			super.doAction(e);
			if (getListview() == null) {
				PublicTools.changeCardGsColor(getBillFormEditor()
						.getBillCardPanel(),BillIteamInfo.Body);
			} else {
				PublicTools.changeGsColor(getListview().getBillListPanel());
			}
		}
	}

	// @Override
	// public BillManageModel getModel() {
	// return this.model;
	// }

	public NCAction getSaveAction() {
		return this.saveAction;
	}

	// public void setModel(BillManageModel model) {
	// this.model = model;
	// }

	@Override
	public void setModel(AbstractUIAppModel model) {
		model.addAppEventListener(this);
		super.setModel(model);
	}

	public void setSaveAction(NCAction saveAction) {
		this.saveAction = saveAction;
	}

	@Override
	protected boolean isActionEnable() {
		if (this.getModel() instanceof IAppModelEx) {
			AppUiState uiState = ((IAppModelEx) this.getModel())
					.getAppUiState();
			if (uiState == AppUiState.ADD || uiState == AppUiState.EDIT
					|| uiState == AppUiState.COPY_ADD
			// || uiState == AppUiState.TRANSFERBILL_ADD //by NCdp204646823
			// modified
			) {
				return false;
			}
			return true;
		}
		return super.isActionEnable();
	}

	private boolean canBeReturned() {
		if (this.getModel().getUiState() == UIState.ADD
				|| this.getModel().getUiState() == UIState.EDIT) {

			int i = CommonConfirmDialogUtils.showConfirmSaveDialog(this
					.getModel().getContext().getEntranceUI());

			this.exceptionHandler.setContext(this.getModel().getContext());
			switch (i) {
			case UIDialog.ID_YES: {
				IExceptionHandler handler = null;
				try {
					handler = this.saveAction.getExceptionHandler();
					// ±£´æ²Ù×÷
					if (handler != null) {
						this.saveAction.setExceptionHandler(null);
					}
				} catch (Exception e) {
					this.exceptionHandler.handlerExeption(e);
					return false;
				}
				try {
					this.saveAction.actionPerformed(new ActionEvent(
							this.saveAction, 0, null));
				} catch (Exception e) {
					if (handler != null) {
						handler.handlerExeption(e);
					} else {
						this.exceptionHandler.handlerExeption(e);
					}
					return false;
				} finally {
					this.saveAction.setExceptionHandler(handler);
				}
				return true;
			}
			case UIDialog.ID_NO: {
				return true;
			}
			case UIDialog.ID_CANCEL: {
				return false;
			}

			default:
				return true;
			}
		}
		return true;

	}
}
