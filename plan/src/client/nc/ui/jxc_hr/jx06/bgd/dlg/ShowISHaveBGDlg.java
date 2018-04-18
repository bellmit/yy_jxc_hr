package nc.ui.jxc_hr.jx06.bgd.dlg;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import nc.bs.framework.common.NCLocator;
import nc.itf.jxc_hr.jx06.IBGDMaintain;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.beans.UIButton;
import nc.ui.pub.beans.UIDialog;
import nc.ui.pub.beans.UIPanel;
import nc.ui.pub.bill.BillItem;
import nc.ui.pub.bill.BillListData;
import nc.ui.pub.bill.BillListPanel;
import nc.ui.pub.bill.IBillItem;
import nc.vo.plan.jx06.BGDHVO;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;

public class ShowISHaveBGDlg extends UIDialog implements ActionListener {
	// 界面主Panel
	private UIPanel mainpanel = null;
	private BillListPanel listPanel1;
	private BillListPanel listPanel2;
	private UIPanel rightPanel;
	private UIPanel buttonPanel;
	// 确定btn
	private UIButton btnOk = null;
	// 取消btn
	private UIButton btnCancel = null;
	private BillItem[] items = null;
	private BGDVO[] retvos;

	public BGDVO[] getRetvos() {
		return retvos;
	}

	public ShowISHaveBGDlg(Container parent, BGDHVO[] bghvos, Object nbghvos,
			Object busiDate) {
		super(parent);
		initialize(busiDate);
		setDefaultData(bghvos, nbghvos);
	}

	private void setDefaultData(BGDHVO[] bghvos, Object nbghvos) {
		listPanel1.setHeaderValueVO(bghvos);
		listPanel1.getHeadBillModel().loadLoadRelationItemValue();
		// listPanel2.getBillListData().setHeaderValueVO(nbghvos);
		ArrayList li = (ArrayList) nbghvos;
		listPanel2.setBodyValueVO(new BGDHVO[li.size()]);
		for (int i = 0; i < li.size(); i++) {
			listPanel2.getBodyBillModel().setValueAt(
					((HashMap) li.get(i)).get("bgd_people"), i, "peoplename");
			listPanel2.getBodyBillModel().setValueAt(
					((HashMap) li.get(i)).get("bgd_dept"), i, "deptname");
			listPanel2.getBodyBillModel().setValueAt(
					((HashMap) li.get(i)).get("pk_psndoc"), i, "pk_psndoc");
			listPanel2.getBodyBillModel().setValueAt(
					((HashMap) li.get(i)).get("pk_dept"), i, "pk_dept");
		}
	}

	private void initialize(Object busiDate) {
		setTitle(busiDate.toString().substring(0, 10) + " 报工信息");
		setName("ShowISHaveBGDlg");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(800, 500);
		setContentPane(getMainPanel());
		setResizable(false);
	}

	private UIPanel getMainPanel() {
		if (mainpanel == null) {
			mainpanel = new UIPanel();
			mainpanel.setName("mainpanel");
			// mainpanel.setLayout(new BorderLayout());
			// mainpanel.add(getListPanel("listPanel1"), BorderLayout.WEST);
			// mainpanel.add(getListPanel("listPanel2"), BorderLayout.EAST);
			mainpanel.setLayout(new GridLayout(0, 2));
			mainpanel.add(getListPanel("listPanel1"));
			// mainpanel.add(getListPanel("listPanel2"));
			mainpanel.add(getRightPanel());

		}
		return mainpanel;
	}

	private UIPanel getRightPanel() {
		if (rightPanel == null) {
			rightPanel = new UIPanel();
			rightPanel.setLayout(new BorderLayout());
			rightPanel.add(getListPanel("listPanel2"), BorderLayout.CENTER);
			rightPanel.add(getButtonPanel(), BorderLayout.SOUTH);
		}
		return rightPanel;
	}

	private UIPanel getButtonPanel() {
		if (buttonPanel == null) {
			try {
				buttonPanel = new UIPanel();
				buttonPanel.setName("buttonPanel");
				buttonPanel.setPreferredSize(new Dimension(810, 38));
				FlowLayout fl = new FlowLayout();
				fl.setAlignment(FlowLayout.CENTER);
				buttonPanel.setLayout(fl);
				buttonPanel.add(getBtnOk(), getBtnOk().getName());
				buttonPanel.add(getBtnCancel(), getBtnCancel().getName());
				getBtnOk().addActionListener(this);
				getBtnCancel().addActionListener(this);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
		return buttonPanel;
	}

	private UIButton getBtnOk() {
		if (btnOk == null) {
			try {
				btnOk = new nc.ui.pub.beans.UIButton();
				btnOk.setName("bnOk");
				btnOk.setText("生成报工单");
				btnOk.setPreferredSize(new Dimension(100, 25));
			} catch (java.lang.Throwable ivjExc) {
				ivjExc.printStackTrace();
			}
		}
		return btnOk;
	}

	private UIButton getBtnCancel() {
		if (btnCancel == null) {
			try {
				btnCancel = new UIButton();
				btnCancel.setName("bnCancel");
				btnCancel.setText("关 闭");
				btnCancel.setPreferredSize(new Dimension(100, 25));
			} catch (java.lang.Throwable ivjExc) {
				ivjExc.printStackTrace();
			}
		}
		return btnCancel;
	}

	private Component getListPanel(String name) {
		try {
			if (name.equals("listPanel1")) {
				if (listPanel1 == null) {
					listPanel1 = new BillListPanel();
					listPanel(listPanel1, name);
				}
				return listPanel1;
			} else if (name.equals("listPanel2")) {
				if (listPanel2 == null) {
					listPanel2 = new BillListPanel();
					BillListData bld = new BillListData();
					bld.setBodyItems(getbodyItems());
					listPanel2.setPreferredSize(new Dimension(200, 60));
					listPanel2.setListData(bld);
					// listPanel(listPanel2,name);
				}
				return listPanel2;
			}
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return null;
	}

	private void listPanel(BillListPanel listPanel, String name) {

		listPanel.setName(name);
		listPanel.setPreferredSize(new Dimension(600, 455));
		// 加载模板
		// listPanel.setListData(new
		// BillListData(listPanel.getTempletData(""+
		// CreatePGKDLGConstant.getpkBilltemplet() + "")));//

		// 2017-03-27修改
		listPanel.loadTemplet("JX06", null, AppContext.getInstance()
				.getPkUser(), AppContext.getInstance().getPkGroup(), "btinfo");
		// 2017-03-27修改
		listPanel.getBodyBillModel().setEnabled(true);
		listPanel.removeListener();
		listPanel.getBodyBillModel().execLoadFormula();
	}

	private BillItem[] getbodyItems() {
		if (items == null) {
			items = new BillItem[5];
			items[0] = new BillItem();
			items[0].setKey("peoplename");
			items[0].setName("未报工人员");
			items[0].setEnabled(false);
			items[0].setShow(true);
			items[0].setWidth(100);
			items[1] = new BillItem();
			items[1].setKey("deptname");
			items[1].setName("部门");
			items[1].setEnabled(true);
			items[1].setShow(true);
			items[1].setWidth(200);
			items[1].setEdit(true);
			items[2] = new BillItem();
			items[2].setKey("isselect");
			items[2].setName("选中");
			items[2].setEnabled(true);
			items[2].setShow(true);
			items[2].setWidth(50);
			items[2].setDataType(IBillItem.BOOLEAN);
			items[2].setEdit(true);
			items[3] = new BillItem();
			items[3].setKey("pk_psndoc");
			items[3].setName("pk_psndoc");
			items[3].setEnabled(false);
			items[3].setShow(true);
			items[3].setWidth(100);
			items[4] = new BillItem();
			items[4].setKey("pk_dept");
			items[4].setName("pk_dept");
			items[4].setEnabled(false);
			items[4].setShow(true);
			items[4].setWidth(100);
			// items[5] = new BillItem();
			// items[5].setKey("generated");
			// items[5].setName("是否已生成");
			// items[5].setEnabled(false);
			// items[5].setShow(false);
			// items[5].setWidth(100);
		}
		return items;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(getBtnCancel())) {
			closeCancel();
		} else if (e.getSource().equals(getBtnOk())) {
			int resin = MessageDialog.showOkCancelDlg(null, "提示",
					"选中的人员将生成报工单，是否继续？");
			if (resin != MessageDialog.ID_OK) {
				return;
			}
			try {
				BGDVO[] vos = selectData();
				IBGDMaintain ibg = NCLocator.getInstance().lookup(IBGDMaintain.class);
				BGDVO[] retvos = ibg.insert(vos);
				this.setRetVos(retvos);
				MessageDialog.showHintDlg(null, "保存成功", "已成功生成[ "+retvos.length+" ]张报工单");
				closeCancel();
			} catch (Exception e1) {
				e1.printStackTrace();
				MessageDialog.showErrorDlg(null, "保存出错", e1.getMessage());
				closeCancel();
				return;
			}
		}

	}

	private void setRetVos(BGDVO[] retvos) {
		this.retvos=retvos;
		
	}

	private BGDVO[] selectData() throws BusinessException {
		int rowcount = listPanel2.getBodyBillModel().getRowCount();
		if (rowcount == 0) {
			throw new BusinessException("数据为空");
		}
		ArrayList<BGDVO> listVos = new ArrayList<BGDVO>();
		
		for (int i = 0; i < rowcount; i++) {
			Object isselect = listPanel2.getBodyBillModel().getValueAt(i,
					"isselect");
			if (isselect == null || isselect.toString().equals("false")) {
				continue;
			}
			String pk_psndoc = listPanel2.getBodyBillModel().getValueAt(i,"pk_psndoc") == null ? "" : listPanel2.getBodyBillModel().getValueAt(i, "pk_psndoc").toString();
			String pk_dept = listPanel2.getBodyBillModel().getValueAt(i,"pk_dept") == null ? "" : listPanel2.getBodyBillModel().getValueAt(i, "pk_dept").toString();
			
			BGDVO vos = new BGDVO();
			BGDHVO hvo = new BGDHVO();
			hvo.setBgd_date(AppContext.getInstance().getServerTime());
			hvo.setBgd_dept(pk_dept);
			hvo.setBgd_people(pk_psndoc);
			hvo.setApprovestatus(-1);
			hvo.setBilldate(AppContext.getInstance().getBusiDate());
			hvo.setBillmaker(AppContext.getInstance().getPkUser());
			hvo.setBilltype("JX06");
			hvo.setCreationtime(AppContext.getInstance().getServerTime());
			hvo.setCreator(AppContext.getInstance().getPkUser());
			hvo.setPk_group(AppContext.getInstance().getPkGroup());
			hvo.setPk_org("0001W110000000002LWQ");
			hvo.setPk_org_v("0001W110000000002LWP");
			vos.setParentVO(hvo);
			vos.setChildrenVO(null);
			listVos.add(vos);
		}
		return listVos.toArray(new BGDVO[listVos.size()]);
	}

}
