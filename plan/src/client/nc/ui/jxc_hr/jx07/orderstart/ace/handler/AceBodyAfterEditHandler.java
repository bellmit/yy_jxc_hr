package nc.ui.jxc_hr.jx07.orderstart.ace.handler;

import java.awt.Color;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
/**
 *���ݱ����ֶα༭���¼�
 * 
 * @since 6.0
 * @version 2011-7-12 ����08:17:33
 * @author duy
 */
public class AceBodyAfterEditHandler implements IAppEventHandler<CardBodyAfterEditEvent> {

    @Override
    public void handleAppEvent(CardBodyAfterEditEvent e) {
    		String key = e.getKey();
    		int row = e.getRow();
    		if("planstartdate".equals(key)||"planenddate".equals(key)){
    			BillCardPanel cardPanel = e.getBillCardPanel();
    			Object planenddate = cardPanel.getBillModel().getValueAt(e.getRow(), "planenddate");
        		Object planstartdate = cardPanel.getBillModel().getValueAt(e.getRow(), "planstartdate");
        		if(planenddate!=null&&planstartdate!=null){
        			if(planstartdate.toString().compareTo(planenddate.toString())>0){
            			cardPanel.getBillModel().setValueAt(null, row, "planenddate");
        				ExceptionUtils.wrappBusinessException("�������ڲ���С�ڿ�ʼ����");			
        			}else if(planstartdate.toString().compareTo(planenddate.toString())<=0){
        				ShowStatusBarMsgUtil.showStatusBarMsg(" ", e.getContext());
        			}
        		}
    		}    		
	    	//����Ӽ�Ԥ�����û���
    		if("meterialcost".equals(key)|| "psncost".equals(key)
    				|| "communicatecost".equals(key)
    				|| "otherscost".equals(key)){
        		BillCardPanel cardPanel = e.getBillCardPanel();
        		Object meterialcost = cardPanel.getBillModel().getValueAt(e.getRow(), "meterialcost");
        		Object psncost = cardPanel.getBillModel().getValueAt(e.getRow(), "psncost");
        		Object communicatecost = cardPanel.getBillModel().getValueAt(e.getRow(), "communicatecost");
        		Object otherscost = cardPanel.getBillModel().getValueAt(e.getRow(), "otherscost");
    			UFDouble total = new UFDouble(toUFDouble(meterialcost)).add(toUFDouble(communicatecost)).add(toUFDouble(psncost))
    					.add(toUFDouble(otherscost));

    			cardPanel.getBillModel().setValueAt(total, e.getRow(),
    					"totalcost");
        	}
	    	
	    	//����Ų���
    		if("ordercode".equals(key)){
    			BillCardPanel cardPanel = e.getBillCardPanel();
    			cardPanel.getBillModel().setValueAt("1", e.getRow(),"orderstatus");
    			String ordercode = cardPanel.getBillModel().getValueAt(e.getRow(),"ordercode").toString();
    			String sql = "select count(*) from bd_defdoc where name = '"+ordercode+"'";
    			String sql2="select count(pk_ordersub) from jxc_hr_orderstartsub where ordercode= '"+ordercode+"'";	//add	xiashsh	2017-06-08	�������뵥���幤���ΨһУ��
    			IUAPQueryBS iqb = NCLocator.getInstance().lookup(IUAPQueryBS.class);
    			Object isexist=null;
    			Object res=null;
				try {
					isexist = iqb.executeQuery(sql, new ColumnProcessor());
					res=iqb.executeQuery(sql2, new ColumnProcessor());	//add	xiashsh	2017-06-08
				} catch (BusinessException e1) {
					ExceptionUtils.wrappBusinessException("��ѯ���ݿ��쳣");
				}
    			if((isexist!=null&&Integer.parseInt(isexist.toString())!=0) || (res!=null&&Integer.parseInt(res.toString())!=0)){
    				MessageDialog.showHintDlg(cardPanel,"����","������Ѵ��ڣ����飡");
    				cardPanel.getBillModel().setValueAt("",e.getRow(),"ordercode");
    			}
    			
    		}
    }
    
    private UFDouble toUFDouble(Object o) {
    	UFDouble oo=new UFDouble();
    	if(o!=null){   		
    		oo=(UFDouble)o;
    	}else{
    		oo=new UFDouble(0);
    	}
		return oo;		
	}

}
