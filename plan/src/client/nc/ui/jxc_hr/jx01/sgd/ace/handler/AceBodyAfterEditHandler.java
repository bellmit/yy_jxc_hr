package nc.ui.jxc_hr.jx01.sgd.ace.handler;

import java.awt.Color;


import nc.a.tools.all.BodySumUtil;
import nc.a.tools.all.BillIteamInfo;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pub.bill.BillItem;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.vo.plan.jx01.SGDBVO;
import nc.vo.plan.jx01.SGDHVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
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
    	String modifier=e.getContext().getPk_loginUser();
    	UFDateTime modifiedtime=new UFDateTime();
    	e.getBillCardPanel().setBodyValueAt(modifier, e.getRow(), "modifier");
    	
    	e.getBillCardPanel().setBodyValueAt(modifiedtime, e.getRow(), "modifiedtime");
    	BillCardPanel blp = e.getBillCardPanel();
    	if("gs".equals(e.getKey())){

    		BillItem[] bis = blp.getBodyItems();
    		//表体工时总和
    		BodySumUtil.BodySum(blp, SGDHVO.TOTALGS, SGDBVO.GS);
    		
    		int row = e.getRow();//获取表体当前编辑行
    		for(int i=0;i<bis.length;i++){   			  
			    if("gs".equals(bis[i].getKey())){//判断是否为工时
			    	if(Double.parseDouble(e.getValue()==null?"0":e.getValue().toString())<0){
						e.getBillCardPanel().getBillModel().setForeground(Color.red, row, i);
			    	}else {
						e.getBillCardPanel().getBillModel().setForeground(Color.black, row, i);
					}
			    	
			    	Object gs = blp.getBodyValueAt(row, e.getKey());
			    	blp.getBillModel().setValueAt(gs==null?"":gs.toString(), row, "def10");	//add	xiashsh	2017-06-09
			    	
				    double sum = 0;
				    for(int j=0;j<blp.getRowCount();j++){
					    Object temp = blp.getBodyValueAt(j, bis[i].getKey());
					    
					    if(temp==null){
					    	temp=0;
					    }
					    sum = Double.parseDouble(temp.toString())+sum;
				    }
				    
			    	Object gssum = blp.getHeadItem("def9").getValue();//此处为暂时选用，记得修改定额工时总计的元数据
				    if(gssum!=null&&Double.parseDouble(gssum.toString())<sum){
				    	ExceptionUtils.wrappBusinessException("表体工时相加不能大于总工时！");
				    }else{
						ShowStatusBarMsgUtil.showStatusBarMsg(" ", e.getContext());
				    }
				     
			    }
  		  }
    		nc.a.tools.all.PublicTools.changeCardGsColor(blp, BillIteamInfo.Body);
    	}
//    	
    	
    }

}
