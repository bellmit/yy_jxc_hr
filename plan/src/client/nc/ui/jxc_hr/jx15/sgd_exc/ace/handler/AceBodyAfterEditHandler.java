package nc.ui.jxc_hr.jx15.sgd_exc.ace.handler;

import nc.a.tools.all.BodySumUtil;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.pub.beans.constenum.DefaultConstEnum;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.vo.plan.jx15.SGDBVO_EXC;
import nc.vo.plan.jx15.SGDHVO_EXC;
import nc.vo.pub.BusinessException;
/**
 *单据表体字段编辑后事件
 * 
 * @since 6.0
 * @version 2011-7-12 下午08:17:33
 * @author duy
 */
public class AceBodyAfterEditHandler implements IAppEventHandler<CardBodyAfterEditEvent> {
	private ShowUpableBillForm billform;
    public ShowUpableBillForm getBillform() {
		return billform;
	}
	public void setBillform(ShowUpableBillForm billform) {
		this.billform = billform;
	}
	/**
	 * 编辑协作部门后：根据上游单据主键，协作部门pk，工种pk 查询上游单据表体的 协作部门工时
	 */
	@Override
    public void handleAppEvent(CardBodyAfterEditEvent e) {
				
		
		//表体工时总和
		if("exchours_b".equals(e.getKey())){
    		BillCardPanel bpl = e.getBillCardPanel(); 
    		BodySumUtil.BodySum(bpl, SGDHVO_EXC.EXCHOURS, SGDBVO_EXC.EXCHOURS_B);
		}
    					
//		getBillform().getBillCardPanel().geth
    	if("excdept_b".equals(e.getKey())){
    		    		
    		String pk_dept_b=null;//表体部门
    		String gz=null;
    		String pk_sgd_h=e.getBillCardPanel().getHeadItem("pk_sgd_h").getValue();//上游单据主键
    		DefaultConstEnum dfce=(DefaultConstEnum)e.getBillCardPanel().getBillModel().getValueObjectAt(e.getRow(), "pk_dept");
    		if(dfce!=null){
    			pk_dept_b =dfce.getValue().toString();
    		}
    		DefaultConstEnum dfce2=(DefaultConstEnum)e.getBillCardPanel().getBillModel().getValueObjectAt(e.getRow(), "gz");
    		if(dfce2!=null){
    			
    			gz =dfce2.getValue().toString();
    		}
    		String excdept_b = e.getValue()==null?"":e.getValue().toString();//协作部门主键
    		String sql="select gs from jxc_hr_sgd_b where nvl(dr,0)=0 and pk_sgd_h='1001ZZ1000000000QG9A' and gz='1001A11000000000JF7V' and dept='0001A110000000001ER8'";
    		IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
    		Object res=null;
    		try {
				res = ibs.executeQuery(sql, new ColumnProcessor());
			} catch (BusinessException e1) {
				
				e1.printStackTrace();
			}
    		if(res!=null){
    			e.getBillCardPanel().getBillModel().setValueAt(res.toString(), e.getRow(), "excoldhours_b");
    		}

    		String pk_edept_b=e.getValue()==null?"":e.getValue().toString();
    		
    		
    		
    	}
    	
    	
    }

}
