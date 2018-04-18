package nc.ui.jxc_hr.ht01.htgl.dlg;

import java.awt.BorderLayout;
import java.awt.Dimension;
import nc.ui.pub.beans.UIDialog;
import nc.ui.pub.beans.UIPanel;
import nc.ui.pub.bill.BillListPanel;
import nc.vo.plan.ht01.HtBVO;
import nc.vo.pubapp.AppContext;
public class GLHMessageDlg extends UIDialog {
	// ������Panel
	private UIPanel mainpanel = null;
	// ������Panel
	private BillListPanel listPanel;
	public GLHMessageDlg(HtBVO[] bvos) {
		super();
		initialize();
		setDefaultData(bvos);
	}
	private void setDefaultData(HtBVO[] bvos) {
		getListPanel().setBodyValueVO(bvos);
		getListPanel().getBodyBillModel().loadLoadRelationItemValue();
		
	}
	public void initialize() {
		setTitle("��ʷ��ͬ��Ϣ");
		setName("GLHMessageDlg");
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setSize(850, 600);
		setContentPane(getMainPanel());
		setResizable(false);

	}
	private UIPanel getMainPanel() {
		if (mainpanel == null) {
			mainpanel = new UIPanel();
			mainpanel.setName("mainpanel");
			mainpanel.setLayout(new BorderLayout());
			mainpanel.add(getListPanel(), BorderLayout.CENTER);

		}
		return mainpanel;
	}
	private BillListPanel getListPanel() {
		if (listPanel == null) {
			try {
				listPanel = new BillListPanel();
				listPanel.setName("listPanel");
				listPanel.setPreferredSize(new Dimension(920, 455));
				// ����ģ��
				//listPanel.setListData(new BillListData(listPanel.getTempletData(""+ CreatePGKDLGConstant.getpkBilltemplet() + "")));//
				
				//2017-03-27�޸�
				listPanel.loadTemplet("HT01", null, AppContext.getInstance().getPkUser(), AppContext.getInstance().getPkGroup(), "bttk");
				//2017-03-27�޸�
				//listPanel.setMultiSelect(true);// �Ƿ��й�ѡ��
				listPanel.getHeadTable().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);// �Ƿ�ctrlȫѡ
				listPanel.getBodyBillModel().setEnabled(true);
				listPanel.removeListener();
				listPanel.getBodyBillModel().execLoadFormula();
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
		return listPanel;
	}
}
