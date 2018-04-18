package nc.ui.jxc_hr.jx02.pgd2.ace.handler;

import java.util.ArrayList;
import java.util.HashMap;

import nc.a.tools.all.BodySumUtil;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.bd.reportitem.pub.SqlUtils;
import nc.ui.pub.beans.UIRefPane;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyBeforeEditEvent;
import nc.vo.plan.jx02.PGDBVO01;
import nc.vo.plan.jx02.PGDHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
/**
 * �����ֶα༭ǰ�¼�������
 * 
 * @since 6.0
 * @version 2011-7-7 ����02:52:57
 * @author duy
 */
public class AceBodyBeforeEditHandler implements IAppEventHandler<CardBodyBeforeEditEvent> {

    @Override
    public void handleAppEvent(CardBodyBeforeEditEvent e) {
    	try {
    	if(!"people".equals(e.getKey())){return;}
    	
    	BillCardPanel panel=e.getBillCardPanel();
    	String pgd_dept = panel.getHeadItem("pgd_dept").getValue()==null?"":panel.getHeadItem("pgd_dept").getValue();
    	if(pgd_dept==null||pgd_dept.equals("")){              
    		ExceptionUtils.wrappBusinessException("��ͷ���Ų���Ϊ�գ�");//��������ʱ������ʹ�����ɹ�����ʩ�����ƹ����������
    	}
    	UIRefPane refPane=(UIRefPane) panel.getBodyItem("people").getComponent();
    	HashMap<String, ArrayList<String>> dept = NCLocator.getInstance().lookup(nc.itf.jxc_hr.tools.IGetDeptMap.class).getdept(pgd_dept, "DOWN");
    	 ArrayList<String> list=dept.get(pgd_dept);
    	 String inStr = SqlUtils.getInStr("pk_dept", list, true);
		refPane.getRefModel().setWherePart(inStr);
		} catch (BusinessException e1) {
			e1.printStackTrace();
			System.out.print("jdasjksdad");
		}
    }

}
