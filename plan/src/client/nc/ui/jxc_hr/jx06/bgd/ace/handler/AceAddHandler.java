package nc.ui.jxc_hr.jx06.bgd.ace.handler;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.billform.AddEvent;
import nc.vo.plan.jx06.BGDHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class AceAddHandler implements IAppEventHandler<AddEvent> {

  @Override
  public void handleAppEvent(AddEvent e) {
    String pk_group = e.getContext().getPk_group();
    String pk_org = e.getContext().getPk_org();
    BillCardPanel panel = e.getBillForm().getBillCardPanel();
	    //设置主组织默认值
    panel.setHeadItem("pk_group", pk_group); 
    panel.setHeadItem("pk_org", pk_org); 
    //设置单据状态、日期默认值
    panel.setHeadItem("approvestatus", BillStatusEnum.FREE.value());
    panel.setHeadItem("billdate", AppContext.getInstance().getBusiDate());
    panel.setHeadItem("billtype", "JX06");
    
//    panel.setHeadItem("bgd_dept", "1001W1100000000013RM");
    //部门默认值
    String user =AppContext.getInstance().getPkUser();
    IUAPQueryBS iUAPQueryBS=NCLocator.getInstance().lookup(IUAPQueryBS.class);
    String sql="select pk_dept from bd_psnjob where psncode=(select code from bd_psndoc where pk_psndoc=" +
    		"(select pk_psndoc from sm_user where cuserid='"+user.toString()+"'))";
    Object res=null;
    try {
		res =iUAPQueryBS.executeQuery(sql, new ColumnProcessor());
		if(res!=null){
			panel.setHeadItem("bgd_dept", res);
		}
	} catch (BusinessException e1) {
		ExceptionUtils.wrappBusinessException("查询数据库失败");
		e1.printStackTrace();
	}   
  }

}
