package nc.ui.jxc_hr.jx08.orderend.ref;

import java.awt.Container;

import nc.ui.pub.pf.BillSourceVar;
import nc.ui.pubapp.billref.src.view.SourceRefDlg;

/**
 ** ��Դ������ʾ�� ���ܣ���ѯ���ѡ������ ��д����getRefBillInfoBeanPath(), �����������������ļ�
 * 
 * @author shidl
 * 
 */
public class OrderStartRefOrderEndSourceRefDlg extends SourceRefDlg {

	public OrderStartRefOrderEndSourceRefDlg(Container parent, BillSourceVar bsVar) {
		super(parent, bsVar);
		// TODO �Զ����ɵĹ��캯�����
	}

	private static final long serialVersionUID = 1L;

	/**
	 * ���������ļ�
	 */
	@Override
	public String getRefBillInfoBeanPath() {
		return "nc/ui/jxc_hr/jx08/orderend/ref/OrderStartRefOrderEndInfo.xml";
	}
}
