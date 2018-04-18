package nc.ui.jxc_hr.jx02.pgd2.ace.handler;

import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.billform.AddEvent;
import nc.vo.plan.jx02.PGDHVO;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.AppContext;

public class AceAddHandler implements IAppEventHandler<AddEvent> {

  @Override
  public void handleAppEvent(AddEvent e) {
    String pk_group = e.getContext().getPk_group();
    String pk_org = e.getContext().getPk_org();
    BillCardPanel panel = e.getBillForm().getBillCardPanel();
    String nodeCode = e.getContext().getNodeCode();				//��ȡ��ǰ�ڵ�Ĺ��ܱ���
	    //��������֯Ĭ��ֵ
    panel.setHeadItem("pk_group", pk_group); 
    panel.setHeadItem("pk_org", pk_org); 
    //���õ���״̬������Ĭ��ֵ
    panel.setHeadItem("approvestatus", BillStatusEnum.FREE.value());
    panel.setHeadItem("billdate", AppContext.getInstance().getBusiDate());
    if(!nodeCode.equals("68H10102400")){		//		������ʱ��������ɹ��� 68H10102400��ʱ������ NODE
    	panel.setHeadItem("billtype", "JX02");
    }else{
    	panel.setHeadItem("billtype", "JX02-Cxx-02");
    }
  }

}
