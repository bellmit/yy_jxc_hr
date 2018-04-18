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
		// TODO �Զ����ɵķ������

		return false;
	}

	/**
	 * ÿ�δ�ӡ��ɴ���������1
	 */
	@Override
	public void afterDoActionSuccessed(Action arg0, ActionEvent arg1) {
		try {
			String LsrwsNode = model.getContext().getNodeCode();
			if("68H10102400".equals(LsrwsNode)){
				return;							//������ʱ������20170828
			}
			Object[] strVos = getModel().getSelectedOperaDatas();
			if (strVos == null)
				throw new BusinessException("��ѡ������.");

			PGDVO[] vos = new PGDVO[1];
			vos[0] = (PGDVO) strVos[0]; // ��VO
			PGDVO[] newVOs = new PGDVO[1];
			newVOs[0] = (PGDVO) vos[0].clone();
			if (newVOs[0].getParentVO().getDef27() == null) {
				newVOs[0].getParentVO().setDef27("0"); // �����null,�滻��0
			}
			String def27 = newVOs[0].getParentVO().getDef27();
			// int def27s=Integer.parseInt(def27)+1;
			// String newdef27= Integer.toString(def27s);
			newVOs[0].getParentVO().setDef27(
					(new UFDouble(def27)).add(new UFDouble(1)).toString());
			// ���ýӿڣ���vo������Ϊ��vo
			PGDVO[] clientVOs = new ClientBillToServer<PGDVO>().construct(vos,
					newVOs);
			IPGD2Maintain service = (IPGD2Maintain) NCLocator.getInstance()
					.lookup(nc.itf.jxc_hr.jx02.IPGD2Maintain.class);

			PGDVO[] serverVOs = service.ClientBillToServer(clientVOs);
			new ClientBillCombinServer<PGDVO>().combine(vos, serverVOs);
			this.getModel().directlyUpdate(vos);

		} catch (BusinessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	/**
	 * ��ӡʱ�ж��Ƿ��Ѵ�ӡ
	 */
	@Override
	public boolean beforeDoAction(Action arg0, ActionEvent arg1) {
		// TODO �Զ����ɵķ������
		boolean flag = false; // �Ƿ��ӡ
		Object[] strVos = getModel().getSelectedOperaDatas();
		try {
			if (strVos.length != 1) {
				return false;
			}
			PGDVO aggvo = (PGDVO) strVos[0];
			// ��ѯ���ɹ����Ƿ����д�ӡ����
			String prow = aggvo.getParentVO().getDef27();
			if (prow != null) { // �Ѵ�ӡ�ж��Ƿ������ӡ
				int flag1 = MessageDialog.showYesNoDlg(null, "��ʾ ", "�˵����Ѵ�ӡ��"
						+ aggvo.getParentVO().getDef27() + "�Σ���ȷ���Ƿ����ٴδ�ӡ��");
				if (flag1 == MessageDialog.ID_YES) {
					flag = true;
				}
			} else { // δ��ӡֱ�Ӵ�ӡ
				flag = true;
			}
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			new BusinessException("��ӡʧ�ܣ�");
			e.printStackTrace();
		}
		return flag;
	}

}
