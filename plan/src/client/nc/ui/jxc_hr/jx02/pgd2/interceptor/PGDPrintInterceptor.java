package nc.ui.jxc_hr.jx02.pgd2.interceptor;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import com.ibm.db2.jcc.sqlj.m;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.itf.jxc_hr.jx02.IPGD2Maintain;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.ui.uif2.actions.ActionInterceptor;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.transfer.bill.ClientBillCombinServer;
import nc.vo.pubapp.pattern.model.transfer.bill.ClientBillToServer;

public class PGDPrintInterceptor implements ActionInterceptor {

	private ShowUpableBillForm editor;
	private BillManageModel model;

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

	/**
	 * 每次打印完成次数，增加1
	 */
	@Override
	public void afterDoActionSuccessed(Action arg0, ActionEvent arg1) {
		try {
			String LsrwsNode = model.getContext().getNodeCode();
			if("68H10102400".equals(LsrwsNode)){
				return;							//跳过临时任务书20170828
			}
			Object[] strVos = getModel().getSelectedOperaDatas();
			if (strVos == null)
				throw new BusinessException("请选中数据.");

			PGDVO[] vos = new PGDVO[1];
			vos[0] = (PGDVO) strVos[0]; // 旧VO
			PGDVO[] newVOs = new PGDVO[1];
			newVOs[0] = (PGDVO) vos[0].clone();
			if (newVOs[0].getParentVO().getDef27() == null) {
				newVOs[0].getParentVO().setDef27("0"); // 如果是null,替换成0
			}
			String def27 = newVOs[0].getParentVO().getDef27();
			// int def27s=Integer.parseInt(def27)+1;
			// String newdef27= Integer.toString(def27s);
			newVOs[0].getParentVO().setDef27(
					(new UFDouble(def27)).add(new UFDouble(1)).toString());
			// 调用接口，旧vo被更新为新vo
			PGDVO[] clientVOs = new ClientBillToServer<PGDVO>().construct(vos,
					newVOs);
			IPGD2Maintain service = (IPGD2Maintain) NCLocator.getInstance()
					.lookup(nc.itf.jxc_hr.jx02.IPGD2Maintain.class);

			PGDVO[] serverVOs = service.ClientBillToServer(clientVOs);
			new ClientBillCombinServer<PGDVO>().combine(vos, serverVOs);
			this.getModel().directlyUpdate(vos);

		} catch (BusinessException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	/**
	 * 打印时判断是否已打印
	 */
	@Override
	public boolean beforeDoAction(Action arg0, ActionEvent arg1) {
		// TODO 自动生成的方法存根
		boolean flag = false; // 是否打印
		Object[] strVos = getModel().getSelectedOperaDatas();
		try {
			if (strVos.length != 1) {
				return false;
			}
			PGDVO aggvo = (PGDVO) strVos[0];
			// 查询此派工单是否已有打印次数
			String prow = aggvo.getParentVO().getDef27();
			if (prow != null) { // 已打印判断是否继续打印
				int flag1 = MessageDialog.showYesNoDlg(null, "提示 ", "此单据已打印过"
						+ aggvo.getParentVO().getDef27() + "次，请确认是否需再次打印？");
				if (flag1 == MessageDialog.ID_YES) {
					flag = true;
				}
			} else { // 未打印直接打印
				flag = true;
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			new BusinessException("打印失败！");
			e.printStackTrace();
		}
		return flag;
	}

}
