package nc.ui.jxc_hr.jx01.sgd.ace.handler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import nc.a.tools.all.BillIteamInfo;
import nc.a.tools.all.PublicTools;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.list.ListBillItemHyperlinkEvent;
import nc.ui.pubapp.uif2app.model.IAppModelEx;
import nc.ui.pubapp.uif2app.view.BillListView;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.ui.uif2.components.IAutoShowUpComponent;

/**
 * Ϊ�˱��⿨Ƭ���б��ֱ��������ʵ��˫���б��¼ʱ�л�����Ƭ���Ĺ��ܽ���
 * ����ʵ�֣�ֻ��Ҫ�������ļ��н��б�Ϳ�Ƭ�������ý�ȥ���Ϳ���ʵ�����˫���л�����Ĺ��ܣ�
 * 
 * @author ��ǿ��
 * @since 2009-5-15
 */
public class MouseClickShowPanelMediator {
	class ListHyperLinkListener implements
			IAppEventHandler<ListBillItemHyperlinkEvent> {
		private nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor;

		public nc.ui.pubapp.uif2app.view.ShowUpableBillForm getBillFormEditor() {
			return billFormEditor;
		}

		public void setBillFormEditor(
				nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor) {
			this.billFormEditor = billFormEditor;
		}

		@Override
		public void handleAppEvent(ListBillItemHyperlinkEvent e) {
			// �����˶��MouseClickShowPanelMediatorʱ�����ν���˷�������Ҫ�����¼�Դ�ıȶԣ�������ø���
			if (e.getItem()
					.getKey()
					.equals(MouseClickShowPanelMediator.this
							.getHyperLinkColumn())
					&& e.getBillListPanel() == MouseClickShowPanelMediator.this
							.getListView().getBillListPanel()) {
				MouseClickShowPanelMediator.this.showUpComponent.showMeUp();
				MouseClickShowPanelMediator.this
						.setCardSelectedTabedPaneFromList();
				MouseClickShowPanelMediator.this.showSuccessInfo();

			}
		}

	}

	class MouseListenerHandler extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() > 1) {
				MouseClickShowPanelMediator.this.showUpComponent.showMeUp();
				MouseClickShowPanelMediator.this
						.setCardSelectedTabedPaneFromList();
				MouseClickShowPanelMediator.this.showSuccessInfo();
				nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor = (ShowUpableBillForm) getShowUpComponent();
				PublicTools.changeCardGsColor(
						billFormEditor.getBillCardPanel(), BillIteamInfo.Body);
			}
		}
	}

	// ���ÿ�Ƭ�������ѡ��ҳǩΪ�б�������ѡ��ҳǩ
	protected void setCardSelectedTabedPaneFromList() {
		int tabIndex = listView.getBillListPanel().getBodyTabbedPane()
				.getSelectedIndex();
		if (showUpComponent instanceof nc.ui.uif2.editor.BillForm) {
			((nc.ui.uif2.editor.BillForm) showUpComponent).getBillCardPanel()
					.getBodyTabbedPane().setSelectedIndex(tabIndex);
		}
	}

	IAutoShowUpComponent showUpComponent;

	private String hyperLinkColumn;

	private BillListView listView;

	public String getHyperLinkColumn() {
		return this.hyperLinkColumn;
	}

	public BillListView getListView() {
		return this.listView;
	}

	public IAutoShowUpComponent getShowUpComponent() {
		return this.showUpComponent;
	}

	public void setHyperLinkColumn(String hyperLinkColumn) {
		this.hyperLinkColumn = hyperLinkColumn;
	}

	public void setListView(BillListView listView) {
		this.listView = listView;
		this.match();
	}

	public void setShowUpComponent(IAutoShowUpComponent showUpComponent) {
		this.showUpComponent = showUpComponent;
		this.match();
	}

	/**
	 * �л�����ʱ���״̬����ʾ��Ϣ
	 */
	void showSuccessInfo() {
		ShowStatusBarMsgUtil.showStatusBarMsg(null, this.listView.getModel()
				.getContext());
	}

	private void match() {
		if (null == this.listView || null == this.showUpComponent) {
			return;
		}
		MouseListenerHandler l = new MouseListenerHandler();
		this.listView.getBillListPanel().getHeadTable().addMouseListener(l);
		// listView.getBillListPanel().getBodyTable().addMouseListener(l);
		((IAppModelEx) this.listView.getModel()).addAppEventListener(
				ListBillItemHyperlinkEvent.class, new ListHyperLinkListener());
	}
}
