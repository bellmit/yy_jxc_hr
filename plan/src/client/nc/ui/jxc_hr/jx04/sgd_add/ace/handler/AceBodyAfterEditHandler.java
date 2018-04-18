package nc.ui.jxc_hr.jx04.sgd_add.ace.handler;

import java.awt.Color;

import nc.a.tools.all.BillIteamInfo;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pub.bill.BillItem;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
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
    	BillCardPanel blp = e.getBillCardPanel();
    	
    	if("gs".equals(e.getKey())){
			
    		BillItem[] bis = blp.getBodyItems();
    		int row = e.getRow();//��ȡ���嵱ǰ�༭��
    		for(int i=0;i<bis.length;i++){   			  
			    if("gs".equals(bis[i].getKey())){//�ж��Ƿ�Ϊ��ʱ
			    	if(Double.parseDouble(e.getValue().toString())<0){
						e.getBillCardPanel().getBillModel().setForeground(Color.red, row, i);
			    	}else {
						e.getBillCardPanel().getBillModel().setForeground(Color.black, row, i);
					}
			    	
				    double sum = 0;
				    for(int j=0;j<blp.getRowCount();j++){
					    Object temp = blp.getBodyValueAt(j, bis[i].getKey());
					    if(temp==null){temp=0;}
					    sum = Double.parseDouble(temp.toString())+sum;
				    }
					blp.setHeadItem("def1", sum);
				    
//			    	Object gssum = blp.getHeadItem("def9").getValue();//�˴�Ϊ��ʱѡ�ã��ǵ��޸Ķ��ʱ�ܼƵ�Ԫ����
//				    if(gssum!=null&&Double.parseDouble(gssum.toString())<sum){
//				    	ExceptionUtils.wrappBusinessException("���幤ʱ��Ӳ��ܴ����ܹ�ʱ��");
//				    }else{
//						ShowStatusBarMsgUtil.showStatusBarMsg(" ", e.getContext());
//				    }
			    }
  		  }
    	}
    	nc.a.tools.all.PublicTools.changeCardGsColor(blp, BillIteamInfo.Body);
    }

}
