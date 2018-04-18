package nc.ui.jxc_hr.jx08.orderend.ace.handler;

import java.util.ArrayList;
import java.util.HashMap;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.jdbc.framework.processor.MapListProcessor;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.vo.jxc_hr.ordersheet.OrderEndSubVO;
import nc.vo.jxc_hr.ordersheet.OrderStartSubVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;
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
    	String key = e.getKey();
		//工令状态自动带出完工日期
    	if("orderstatus".equals(key)&&e.getValue()!=null&&"2".equals(e.getValue().toString())){
    		UFDateTime time=new UFDateTime();
    		e.getBillCardPanel().setBodyValueAt(time, e.getRow(), "actcompletdate");
    	}
    	if("gl".equals(key)&&e.getValue()!=null){
    		String value=(String) e.getValue();
    		System.out.println(e.getValue());
    		IUAPQueryBS iUAPQueryBS=NCLocator.getInstance().lookup(IUAPQueryBS.class);
    	    String sql="select * from jxc_hr_orderstartsub where ordercode=" +
    	    		"(select code from bd_defdoc where pk_defdoc='"+e.getValue()+"')";
    	    Object res=null;
    		try {
				res =iUAPQueryBS.executeQuery(sql, new MapListProcessor());
				if(res!=null){
					ArrayList re = (ArrayList)res;
					if(re.size()>0){
						HashMap hm=(HashMap)(re.get(0));
						e.getBillCardPanel().setBodyValueAt(hm.get("startsbase"), e.getRow(), "startsbase");
						e.getBillCardPanel().setBodyValueAt(hm.get("planstartdate"), e.getRow(), "planstartdate");
						e.getBillCardPanel().setBodyValueAt(hm.get("planenddate"), e.getRow(), "planenddate");
						e.getBillCardPanel().setBodyValueAt(hm.get("meterialcost"), e.getRow(), "meterialcost");
						e.getBillCardPanel().setBodyValueAt(hm.get("communicatecost"), e.getRow(), "communicatecost");
						e.getBillCardPanel().setBodyValueAt(hm.get("otherscost"), e.getRow(), "otherscost");
						e.getBillCardPanel().setBodyValueAt(hm.get("totalcost"), e.getRow(), "totalcost");
						e.getBillCardPanel().setBodyValueAt(hm.get("year"), e.getRow(), "year");
						e.getBillCardPanel().setBodyValueAt(hm.get("hostdept"), e.getRow(), "hostdept");
						e.getBillCardPanel().setBodyValueAt(hm.get("note"), e.getRow(), "note");
						e.getBillCardPanel().setBodyValueAt(hm.get("def1"), e.getRow(), "def1");
						e.getBillCardPanel().setBodyValueAt(hm.get("psncost"), e.getRow(), "psncost");
						e.getBillCardPanel().setBodyValueAt(hm.get("productname"), e.getRow(), "productname");
					}					
				}
			} catch (BusinessException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
    	}
    }

}
