package nc.ui.jxc_hr.jx01.sgd.action;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import nc.a.tools.all.MyTransfer;
import nc.bs.framework.common.NCLocator;
import nc.itf.jxc_hr.jx01.ISGDMaintain;
import nc.itf.jxc_hr.tools.IGetDeptMap;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.pf.IPfExchangeService;
import nc.itf.uap.pf.busiflow.PfButtonClickContext;
import nc.jdbc.framework.crossdb.ExceptionFactory;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.bill.BillListPanel;
import nc.ui.pubapp.uif2app.actions.pflow.ScriptPFlowAction;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.vo.fipub.utils.BillcodeGenerater;
import nc.vo.plan.jx01.SGDBVO;
import nc.vo.plan.jx01.SGDHVO;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.plan.jx15.SGDBVO_EXC;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;

public class EXCAction extends ScriptPFlowAction {
	private ShowUpableBillListView listview;

	public ShowUpableBillListView getListview() {
		return listview;
	}

	public void setListview(ShowUpableBillListView listview) {
		this.listview = listview;
	}

	public EXCAction() {
		super();
		setBtnName("施工联系单");
		setCode("sgdexc");
	}

	@Override
	public void doAction(ActionEvent arg0) throws Exception {
		Object[] srcVos = this.model.getSelectedOperaDatas();
		if (srcVos == null || srcVos.length != 1) {
			if (srcVos == null) {
				MessageDialog.showWarningDlg(null, "提示", "请选中表头中的一行数据！");
			} else
				MessageDialog.showWarningDlg(null, "提示", "表头不允许选择多行数据！");
			return;
		}
		BillListPanel billListPanel = this.listview.getBillListPanel();
		int[] selectedRows = billListPanel.getBodyTable().getSelectedRows();
		if (selectedRows.length != 1) {
			if (selectedRows.length == 0) {
				MessageDialog.showWarningDlg(null, "提示", "请选中表体中的一行数据！");
			} else
				MessageDialog.showWarningDlg(null, "提示", "表体不允许选择多行数据！");
			return;
		}

		SGDBVO bvo = (SGDBVO) listview.getBillListPanel().getBodyBillModel()
				.getBodyValueRowVO(selectedRows[0], SGDBVO.class.getName());
		SGDHVO hvo = ((SGDVO) srcVos[0]).getParentVO();
		
		//判断是否审批	add xiashsh 2017-06-01
		if (hvo.getApprovestatus()!=1) {
			MessageDialog.showWarningDlg(null, "提示", "单据未审批！");
			return;
		}
		// 校验当前登录人员是否属于该部门 add xiashsh 2017-05-27===============
		String dept = bvo.getPk_dept();
		String user = AppContext.getInstance().getPkUser();
		Map<String, ArrayList<String>> map = NCLocator.getInstance()
				.lookup(IGetDeptMap.class).getdept(dept, "UP");
		String sql = "select t.pk_dept from bd_psnjob t inner join bd_psndoc t1 on t.pk_psndoc = t1.pk_psndoc inner join sm_user t2 on t1.pk_psndoc = t2.pk_psndoc where t2.cuserid = '"
				+ user + "'";
		IUAPQueryBS dao = (IUAPQueryBS) NCLocator.getInstance().lookup(
				IUAPQueryBS.class.getName());
		String resdept = (String) dao.executeQuery(sql, new ColumnProcessor());
		ArrayList<String> reslist = map.get(dept);
		boolean flag = true;
		for (String str : reslist) {
			if (str.equals(resdept)) {
				flag = false;
			}
		}
		if (flag) {
			MessageDialog.showWarningDlg(null, "提示", "当前登录人员不属于该部门！");
			return;
		}
		// ======================================================
		
		SGDVO[] vos = new SGDVO[1];
		vos[0] = new SGDVO();
		vos[0].setParentVO(hvo);
		vos[0].setChildrenVO(new SGDBVO[] { bvo });

		List<SGDVO_EXC> listvo = VOTransfer(vos);
		if (listvo == null || listvo.size() < 1) {
			return;
		}
		SGDVO_EXC[] pals = listvo.toArray(new SGDVO_EXC[listvo.size()]);

		MyTransfer mt = new MyTransfer();
		mt.OpenNode(pals, 68050115, "68H10115");
	}

	private List<SGDVO_EXC> VOTransfer(SGDVO[] vos) throws BusinessException {
		String pk_group = vos[0].getParentVO().getPk_group() == null ? AppContext
				.getInstance().getPkGroup() : vos[0].getParentVO()
				.getPk_group();
		String pk_org = vos[0].getParentVO().getPk_org() == null ? "GLOBLE00000000000000"
				: vos[0].getParentVO().getPk_org();
		// 数据VO 交换
		IPfExchangeService pfExchangeService = NCLocator.getInstance().lookup(
				IPfExchangeService.class);
		AggregatedValueObject[] destVos = pfExchangeService
				.runChangeDataAryNeedClassify("JX01", "JX15", vos, null,
						PfButtonClickContext.NoClassify);
		if (destVos == null || destVos.length == 0) {
			throw new BusinessException("生成的施工联系单数据为空！");
		}
		ArrayList<SGDVO_EXC> listvo = new ArrayList<SGDVO_EXC>();
		for (int i = 0; i < destVos.length; i++) {
			((SGDVO_EXC) destVos[i]).getParentVO().setBillno(
					new BillcodeGenerater().getBillCode("JX15", pk_group,
							pk_org, null, null));
			((SGDVO_EXC) destVos[i]).getParentVO().setBilldate(
					AppContext.getInstance().getBusiDate());
			listvo.add((SGDVO_EXC) destVos[i]);
		}
		return listvo;
	}

	@Override
	public boolean isActionEnable() {
		/*
		 * int brow =
		 * this.listview.getBillListPanel().getBodyTable().getSelectedRowCount
		 * (); if (brow!= 1) { return false; }
		 */
		Object[] srcVos = this.model.getSelectedOperaDatas();
		if (srcVos == null || srcVos.length != 1) {
			return false;
		}
		return true;
	}

}
