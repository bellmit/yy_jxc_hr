package nc.ui.jxc_hr.jx03.swlgs.billref;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import nc.a.tools.all.MyTransfer;
import nc.bs.framework.common.NCLocator;
import nc.itf.jxc_hr.jx03.ISWLGSMaintain;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.MapListProcessor;
import nc.pubitf.bd.reportitem.pub.SqlUtils;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.beans.UIButton;
import nc.ui.pub.beans.UIDialog;
import nc.ui.pub.beans.UIPanel;
import nc.ui.pub.beans.UIRefPane;
import nc.ui.pub.beans.constenum.DefaultConstEnum;
import nc.ui.pub.bill.BillEditEvent;
import nc.ui.pub.bill.BillEditListener;
import nc.ui.pub.bill.BillEditListener2;
import nc.ui.pub.bill.BillItem;
import nc.ui.pub.bill.BillListPanel;
import nc.ui.pub.bill.BillModel;
import nc.ui.pub.bill.IBillModelRowStateChangeEventListener;
import nc.ui.pub.bill.RowStateChangeEvent;
import nc.vo.plan.jx02.PGDBVO01;
import nc.vo.plan.jx02.PGDBVO02;
import nc.vo.plan.jx02.PGDHVO;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author 张少军 实物量工时拉单，查询后的结果，显示到这个Dlg上
 * 
 */
public class ShowJX02BodyDlg extends UIDialog implements ActionListener,
		BillEditListener2 {
	// 界面主Panel
	private UIPanel mainpanel = null;
	// 数据Panel
	private BillListPanel listPanel;
	// 按钮Panel
	private UIPanel buttonPanel;
	// 确定btn
	private UIButton btnOk = null;
	// 取消btn
	private UIButton btnCancel = null;
	// 存放剩余工时的Map，Dlg
	private HashMap<String, String> surplus_hours;
	private HashMap<Integer, String> oldvalue = new HashMap<Integer, String>();
	private HashMap<Integer, String> peopleMap = new HashMap<Integer, String>();
	private HashMap<String, Integer> pk_row = new HashMap<String, Integer>();
	private HashMap<Integer, PGDBVO01> bvoMap = new HashMap<Integer, PGDBVO01>();
	// 存放界面上的所有clientbvos
	private PGDBVO01[] clientbvos = null;

	public ShowJX02BodyDlg(Container parent, PGDBVO01[] bvos) {
		super(parent);
		initialize();
		setDefaultData(bvos);
		try {
			surplus_hours = getSurplusHours(bvos);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}

	private void setDefaultData(PGDBVO01[] bvos) {
		clientbvos = bvos;
		// 初始化实际加工人信息
		if (bvos != null && bvos.length > 0) {
			for (PGDBVO01 bvo : bvos) {
				bvo.setSjjg_people(bvo.getPeople());
			}
		}
		listPanel.setBodyValueVO(bvos);
		listPanel.getBodyBillModel().execLoadFormula();
		listPanel.getBodyBillModel().loadLoadRelationItemValue();

	}

	private void initialize() {
		setTitle("<派工单>查询结果");
		setName("ShowJX02BodyDlg");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(1000, 600);
		setContentPane(getMainPanel());
		setResizable(false);

	}

	private UIPanel getMainPanel() {
		if (mainpanel == null) {
			mainpanel = new UIPanel();
			mainpanel.setName("mainpanel");
			mainpanel.setLayout(new BorderLayout());
			mainpanel.add(getListPanel(), BorderLayout.CENTER);
			mainpanel.add(getButtonPanel(), BorderLayout.SOUTH);

		}
		return mainpanel;
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
				btnOk.setText("生成实物量工时");
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
				btnCancel.setText("取 消");
				btnCancel.setPreferredSize(new Dimension(100, 25));
			} catch (java.lang.Throwable ivjExc) {
				ivjExc.printStackTrace();
			}
		}
		return btnCancel;
	}

	private Component getListPanel() {
		if (listPanel == null) {
			try {
				listPanel = new BillListPanel();
				listPanel.setName("listPanel");
				listPanel.setPreferredSize(new Dimension(920, 455));
				// 2017-03-27修改
				listPanel.loadTemplet("JX02", null, AppContext.getInstance()
						.getPkUser(), AppContext.getInstance().getPkGroup(),
						"btref");
				// 2017-03-27修改
				listPanel.setMultiSelect(true);// 是否有勾选框
				listPanel
						.getHeadTable()
						.setSelectionMode(
								javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);// 是否ctrl全选
				listPanel.getBodyBillModel().setEnabled(true);
				listPanel.removeListener();
				listPanel
						.addBodyEditListener(new ShowJX02BodyDlg_BodyEditListener());
				listPanel.getBodyScrollPane("arr_pgk_czz").addEditListener2(
						this);
				listPanel.getBodyBillModel().addRowStateChangeEventListener(
						new ShowJX02BodyDlg_RowStateChangeEventListener());
				listPanel.getBodyBillModel().execLoadFormula();
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
		return listPanel;
	}

	private PGDVO[] getSelectAggVos() {
		ArrayList<PGDBVO01> list = new ArrayList<PGDBVO01>();
		int rc = listPanel.getBodyTable().getRowCount();
		String srcbillbodyid = null;
		for (int i = 0; i < rc; i++) {
			if (listPanel.getBodyBillModel().getRowState(i) == BillModel.SELECTED) {
				srcbillbodyid = listPanel.getBodyBillModel().getValueAt(i,
						"pk_pgd_czz") == null ? "" : listPanel
						.getBodyBillModel().getValueAt(i, "pk_pgd_czz")
						.toString();
				// 存放派工卡操作者页签的PK和行号，为了报错
				pk_row.put(
						listPanel.getBodyBillModel()
								.getValueAt(i, "pk_pgd_czz").toString(),
						(i + 1));
				bvoMap.put(i, (PGDBVO01) listPanel.getBodyBillModel()
						.getBodyValueRowVO(i, PGDBVO01.class.getName()));
				// 先把工时放到oldvalue，为了把字段的值设回原来的值
				oldvalue.put(i,
						listPanel.getBodyBillModel().getValueAt(i, "zgs")
								.toString());
				Object swlgs = listPanel.getBodyBillModel().getValueAt(i,
						"swlgs");
				// 复选框勾选，但是派工工时未填 或者 填写的实物量工时是0，跳过
				if (swlgs == null
						|| new UFDouble(swlgs.toString()).isTrimZero()) {
					continue;
				}
				listPanel.getBodyBillModel().setValueAt(swlgs, i, "zgs");
				// 实际加工人存在值的时候会替换原有加工人字段信息
				// String sjjg_people =
				// listPanel.getBodyItem("sjjg_people").getValue();
				listPanel.getBodyBillModel().getBodySelectedVOs(
						PGDBVO01.class.getName());
				String sjjg_people = listPanel.getBodyBillModel().getValueAt(i,
						"sjjg_people") == null ? "" : listPanel
						.getBodyBillModel().getValueAt(i, "sjjg_people")
						.toString();
				if (sjjg_people == null || sjjg_people.toString().equals("")) {
					continue;
				}
				PGDBVO01 newbvo = (PGDBVO01) listPanel.getBodyBillModel()
						.getBodyValueRowVO(i, PGDBVO01.class.getName());
				newbvo.setPeople(sjjg_people);
				list.add(newbvo);
			}
		}
		// 复选框一个都没选
		if (list.size() == 0) {
			return null;
		}
		PGDBVO01[] bvos = list.toArray(new PGDBVO01[list.size()]);
		HashMap<String, ArrayList<PGDBVO01>> bvoMap = new HashMap<String, ArrayList<PGDBVO01>>();
		ArrayList<PGDBVO01> blist = null;
		for (int i = 0; i < bvos.length; i++) {
			String pk_pgk_h = bvos[i].getPk_pgk_h();
			if (bvoMap.containsKey(pk_pgk_h)) {
				blist = bvoMap.get(pk_pgk_h);
			} else {
				blist = new ArrayList<PGDBVO01>();
			}
			blist.add(bvos[i]);
			bvoMap.put(pk_pgk_h, blist);
		}
		HashMap<String, PGDHVO> hvoMap = getPGDHvoMap(bvos);
		PGDVO[] pgdVos = conbineAggvo(hvoMap, bvoMap);
		return pgdVos.length > 0 ? pgdVos : null;
	}

	private PGDVO[] conbineAggvo(HashMap<String, PGDHVO> hvoMap,
			HashMap<String, ArrayList<PGDBVO01>> bvoMap) {
		if (hvoMap == null || hvoMap.size() == 0 || bvoMap == null
				|| bvoMap.size() == 0) {
			return null;
		}
		PGDVO[] srcVo = new PGDVO[hvoMap.size()];
		int i = 0;
		for (Entry<String, ArrayList<PGDBVO01>> entry : bvoMap.entrySet()) {
			String hpk = entry.getKey();
			ArrayList<PGDBVO01> bvoList = entry.getValue();
			PGDHVO hvo = hvoMap.get(hpk);
			srcVo[i] = new PGDVO();
			srcVo[i].setParentVO(hvo);
			// srcVo[i].setChildrenVO(bvoList.toArray(new
			// PGDBVO01[bvoList.size()]));
			srcVo[i].setChildren(PGDBVO01.class,
					bvoList.toArray(new PGDBVO01[bvoList.size()]));
			srcVo[i].setChildren(PGDBVO02.class, null);
			i++;

		}
		return srcVo.length > 0 ? srcVo : null;
	}

	/**
	 * @param bvos
	 *            根据选中的表体，重新查询表头，为了组装AggVo
	 */
	@SuppressWarnings("unchecked")
	private HashMap<String, PGDHVO> getPGDHvoMap(PGDBVO01[] bvos) {
		HashMap<String, PGDHVO> hvoMap = new HashMap<String, PGDHVO>();
		if (bvos == null || bvos.length == 0) {
			return null;
		}
		HashSet<String> set = new HashSet<String>();
		for (PGDBVO01 bvo : bvos) {
			set.add(bvo.getPk_pgk_h());
		}
		String inStr = null;
		try {
			inStr = SqlUtils.getInStr("pk_pgk_h",
					set.toArray(new String[set.size()]), true);
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		String sql = "select * from jxc_hr_pgk_h  where nvl(dr,0)=0 and "
				+ inStr;
		IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(
				IUAPQueryBS.class.getName());
		ArrayList<PGDHVO> res = null;
		try {
			res = (ArrayList<PGDHVO>) ibs.executeQuery(sql,
					new BeanListProcessor(PGDHVO.class));
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException(e.getMessage());
		}
		if (res != null && res.size() > 0) {
			for (int i = 0; i < res.size(); i++) {
				hvoMap.put(res.get(i).getPk_pgk_h(), res.get(i));
			}
		}
		if (hvoMap != null && hvoMap.size() > 0) {
			return hvoMap;
		} else {
			return null;
		}
	}

	class ShowJX02BodyDlg_BodyEditListener implements BillEditListener {
		@Override
		public void afterEdit(BillEditEvent e) {
			if (!e.getKey().equals("swlgs")) {
				return;
			}
			String hours = surplus_hours.get(listPanel.getBodyBillModel()
					.getValueAt(e.getRow(), "pk_pgd_czz")) == null ? listPanel
					.getBodyBillModel().getValueAt(e.getRow(), "zgs")
					.toString() : surplus_hours.get(listPanel
					.getBodyBillModel().getValueAt(e.getRow(), "pk_pgd_czz"));
			Object clientv = listPanel.getBodyBillModel().getValueAt(
					e.getRow(), "swlgs");
			if (clientv != null) {
				UFDouble a = new UFDouble(clientv.toString());
				UFDouble b = new UFDouble(hours);
				if (a.compareTo(UFDouble.ZERO_DBL) >= 0) {
					if (a.sub(b).compareTo(UFDouble.ZERO_DBL) > 0) {
						listPanel.getBodyBillModel().setRowState(e.getRow(),
								e.getRow(), BillModel.UNSTATE);
						// listPanel.getBodyBillModel().setForeground(Color.RED,e.getRow(),
						// getSwlgsColumn());
						// Object
						// hour=surplus_hours.get(listPanel.getBodyBillModel().getValueAt(e.getRow(),
						// "pk_pgd_czz"));
						listPanel.getBodyBillModel().setValueAt(null,
								e.getRow(), getSwlgsColumn());
						MessageDialog.showErrorDlg(null, "提示", "实物量工时超过剩余工时！");
						return;
					}

					// listPanel.getBodyBillModel().setForeground(Color.BLACK,e.getRow(),
					// getPg_hoursColumn());
				} else {
					listPanel.getBodyBillModel().setValueAt(null, e.getRow(),
							"swlgs");
					listPanel.getBodyBillModel().setRowState(e.getRow(),
							e.getRow(), BillModel.UNSTATE);
					MessageDialog.showErrorDlg(null, "提示", "实物量工时不能为负数！");
					return;
				}

			}
		}

		@Override
		public void bodyRowChange(BillEditEvent e) {

		}
	}

	class ShowJX02BodyDlg_RowStateChangeEventListener implements
			IBillModelRowStateChangeEventListener {
		@Override
		public void valueChanged(RowStateChangeEvent e) {
			int startRow = e.getRow();
			int endRow = e.getEndRow();
			if (e.isSelectState()) {
				for (int i = startRow; i <= endRow; i++) {
					String hours = surplus_hours.get(listPanel
							.getBodyBillModel().getValueAt(i, "pk_pgd_czz")) == null ? listPanel
							.getBodyBillModel().getValueAt(i, "zgs").toString()
							: surplus_hours.get(listPanel.getBodyBillModel()
									.getValueAt(i, "pk_pgd_czz"));
					listPanel.getBodyBillModel().setValueAt(hours, i, "swlgs");
					/*PGDBVO01[] selectedBVO = (PGDBVO01[]) listPanel
							.getBodyBillModel().getBodySelectedVOs(
									PGDBVO01.class.getName());*/
					// 默认把加工人带到实际加工人中
					// String people =
					// listPanel.getBodyBillModel().getValueAt(i,
					// "people") == null ? "" : listPanel
					// .getBodyBillModel().getValueAt(i, "people")
					// .toString();
					// String people = selectedBVO[i].getPeople();
					// listPanel.getBodyBillModel().setValueAt(people, i,
					// "sjjg_people");
					// listPanel.getBodyBillModel().loadLoadRelationItemValue(i,
					// "sjjg_people");
					// 结束
					// 设置字体颜色，如果是正确的时候要设置成正常的颜色，
					// getPg_hoursColumn()获取最后一列实物量工时的列数
					listPanel.getBodyBillModel().setForeground(Color.BLACK, i,
							getSwlgsColumn());
				}

			} else {
				// 取消勾选时实物量工时和实际加工人设为空
				for (int i = startRow; i <= endRow; i++) {
					listPanel.getBodyBillModel().setValueAt(null, i, "swlgs");
					listPanel.getBodyBillModel().setValueAt(null, i,
							"sjjg_people");
				}
			}
		}
	}

	private HashMap<String, String> getSurplusHours(PGDBVO01[] bvos)
			throws BusinessException {
		StringBuffer buffer = new StringBuffer();
		buffer.append(" select pk_pgd_czz,(nvl(addgs,0)+zgs-XY.xygs)  surplus_hours from jxc_hr_pgk_czz SY,(select srcbillid_b srcbid,sum(swlgs) xygs from jxc_hr_swlgs_b where nvl(dr,0)=0 and srcbillid_b in(");
		for (int i = 0; i < bvos.length; i++) {
			buffer.append("'");
			buffer.append(bvos[i].getPk_pgd_czz());
			buffer.append("'");
			buffer.append(",");
		}
		int length = buffer.length();
		buffer.deleteCharAt(length - 1);
		buffer.append(")group by srcbillid_b) XY where nvl(SY.dr,0)=0 and (SY.pk_pgd_czz=XY.srcbid)");

		IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(
				IUAPQueryBS.class.getName());
		Object res = ibs
				.executeQuery(buffer.toString(), new MapListProcessor());
		HashMap<String, String> retmp = new HashMap<String, String>();
		if (res != null) {
			ArrayList<HashMap<String, String>> re = (ArrayList<HashMap<String, String>>) res;
			for (int i = 0; i < re.size(); i++) {
				HashMap<String, String> mp = re.get(i);
				retmp.put(mp.get("pk_pgd_czz"),
						String.valueOf(mp.get("surplus_hours")));
			}
		}
		return retmp;
	}

	// 获取“swlgs”字段的列数
	private int getSwlgsColumn() {
		BillItem[] bodyItems = listPanel.getBodyBillModel().getBodyItems();
		for (int i = 0; i < bodyItems.length; i++) {
			if (bodyItems[i].getKey().equals("swlgs")) {
				return i;
			}

		}
		return -1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource().equals(getBtnCancel())) {
				closeCancel();
			} else if (e.getSource().equals(getBtnOk())) {
				int msgres = MessageDialog.showOkCancelDlg(null, "提示",
						"生成实物量工时，是否继续？");
				if (msgres != MessageDialog.ID_OK) {
					return;
				}
				// 获得选中的派工单vos

				PGDVO[] srcVos = getSelectAggVos();

				// 派工单vos转换成实物量
				MyTransfer tr = new nc.a.tools.all.MyTransfer();
				SWLGSVO[] destVos = (SWLGSVO[]) tr.VOtransfer("JX02", "JX03",
						srcVos); // vo转换 JX02派工卡->JX03实物量工时

				// 保存到后台
				if (destVos != null && destVos.length > 0) {
					ISWLGSMaintain ipk = (ISWLGSMaintain) NCLocator
							.getInstance().lookup(
									nc.itf.jxc_hr.jx03.ISWLGSMaintain.class
											.getName());
					try {
						ipk.insert(destVos);
						// closeCancel();
						MessageDialog.showHintDlg(null, "提示", "实物量工时保存成功！");
					} catch (Exception e1) {
						if (e1.toString().contains("<%")) {
							String msg = getErrorMessage(e1.toString());
							MessageDialog.showErrorDlg(null, "提示", msg);
						} else {
							MessageDialog.showErrorDlg(null, "生成实物量工时出错",
									e1.getMessage());
						}

					}
				}
				return;
			}
		} catch (BusinessException e1) {
			e1.printStackTrace();
			ExceptionUtils.wrappBusinessException(e1.getMessage());
		} finally {
			// 获取剩余工时
			try {
				surplus_hours = getSurplusHours(clientbvos);
			} catch (BusinessException e2) {
				e2.printStackTrace();
			}

			// 把派工卡的总工时（zgs）字段的值再塞回去，为了界面好看
			Iterator<Entry<Integer, String>> ite = oldvalue.entrySet()
					.iterator();
			while (ite.hasNext()) {
				Map.Entry entry = (Map.Entry) ite.next();
				listPanel.getBodyBillModel().setValueAt(entry.getValue(),
						Integer.parseInt(entry.getKey().toString()), "zgs");
			}

			// 勾选状态重置
			listPanel.getBodyBillModel().setRowState(0,
					listPanel.getBodyBillModel().getRowCount() - 1,
					BillModel.UNSTATE);
		}
	}

	private String getErrorMessage(String ermsg) {
		String splitstr = ermsg.substring(ermsg.indexOf("%") + 1,
				ermsg.indexOf("$"));
		return "【派工卡剩余工时不足：第" + pk_row.get(splitstr) + "行】";
	}

	/**
	 * 
	 */
	@Override
	public boolean beforeEdit(BillEditEvent e) {
		String people = ((DefaultConstEnum) listPanel.getBodyTable()
				.getValueAt(e.getRow(), getColumn("people"))).getValue()
				.toString();
		UIRefPane refPane = (UIRefPane) listPanel.getBillListData()
				.getBodyItem("sjjg_people").getComponent();
		refPane.setWhereString("hi_psnjob.pk_dept=(select pk_dept from bd_psnjob where pk_psndoc='"
				+ people + "')");
		refPane.getRefModel().setFieldName(new String[] { "工号", "姓名", "部门" });
		refPane.getRefModel().setFieldCode(
				new String[] { "bd_psndoc.code", "bd_psndoc.name as name",
						"org_dept.name" });
		// String[] fieldCode = refPane.getRefModel().getFieldCode();
		// refPane.getRefModel().setHiddenFieldCode(new
		// String[]{"org_orgs.name","bd_psndoc.name as name","id"});
		// String refSql = refPane.getRefModel().getRefSql();
		return true;
	}

	private int getColumn(String key) {
		String name = listPanel.getBodyItem(key).getName();
		int columnCount = listPanel.getBodyTable().getColumnCount();
		for (int i = 0; i < columnCount; i++) {
			String columnName = listPanel.getBodyTable().getColumnName(i);
			if (columnName.equals(name)) {
				return i;
			}
		}
		return -1;
	}

}
