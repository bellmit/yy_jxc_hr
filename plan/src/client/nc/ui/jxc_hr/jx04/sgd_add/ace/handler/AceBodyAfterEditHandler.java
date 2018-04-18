package nc.ui.jxc_hr.jx04.sgd_add.ace.handler;

import java.awt.Color;

import nc.a.tools.all.BillIteamInfo;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pub.bill.BillItem;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
/**
 *单据表体字段编辑后事件
 * 
 * @since 6.0
 * @version 2011-7-12 下午08:17:33
 * @author duy
 */
public class AceBodyAfterEditHandler implements IAppEventHandler<CardBodyAfterEditEvent> {

    @Override
    public void handleAppEvent(CardBodyAfterEditEvent e) {
    	BillCardPanel blp = e.getBillCardPanel();
    	
    	if("gs".equals(e.getKey())){
			
    		BillItem[] bis = blp.getBodyItems();
    		int row = e.getRow();//获取表体当前编辑行
    		for(int i=0;i<bis.length;i++){   			  
			    if("gs".equals(bis[i].getKey())){//判断是否为工时
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
				    
//			    	Object gssum = blp.getHeadItem("def9").getValue();//此处为暂时选用，记得修改定额工时总计的元数据
//				    if(gssum!=null&&Double.parseDouble(gssum.toString())<sum){
//				    	ExceptionUtils.wrappBusinessException("表体工时相加不能大于总工时！");
//				    }else{
//						ShowStatusBarMsgUtil.showStatusBarMsg(" ", e.getContext());
//				    }
			    }
  		  }
    	}
    	nc.a.tools.all.PublicTools.changeCardGsColor(blp, BillIteamInfo.Body);
    }

}
