package nc.ui.jxc_hr.jx01.sgd.ace.handler;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.billform.AddEvent;
import nc.vo.plan.jx01.SGDHVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.pf.BillStatusEnum;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.AppContext;

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
    panel.setHeadItem("billtype", "JX01");
    //xshsh
    String user = AppContext.getInstance().getPkUser();
    String sql = "select t.pk_dept from bd_psnjob t inner join bd_psndoc t1 on t.pk_psndoc = t1.pk_psndoc inner join sm_user t2 on t1.pk_psndoc = t2.pk_psndoc where nvl(dr,0)=0 and t2.cuserid = '"
			+ user + "'";
	IUAPQueryBS dao = (IUAPQueryBS) NCLocator.getInstance().lookup(
			IUAPQueryBS.class.getName());
	try {
		String resdept = (String) dao.executeQuery(sql,
				new ColumnProcessor());
		String sql_v="select pk_vid from org_dept_v where nvl(dr,0)=0 and pk_dept='"+resdept+"'";
		String resdept_v = (String) dao.executeQuery(sql_v,
				new ColumnProcessor());
		panel.setHeadItem("pk_dept", resdept);
		panel.setHeadItem("pk_dept_v", resdept_v);
	} catch (BusinessException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	   //xshsh
    
    
/*	 IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
	 
	    String pkUser = AppContext.getInstance().getPkUser();
		String sql = "select T.pk_vid from bd_psnjob A inner join org_dept_v T on A.PK_DEPT=T.PK_DEPT inner join bd_psndoc C on A.pk_psndoc = C.Pk_Psndoc  where C.Pk_Psndoc = (select pk_psndoc from sm_user where nvl(dr, 0) = 0 and cuserid = '"+ pkUser+ "') ";
		String res=null;
		try {
			res =(String) ibs.executeQuery(sql,new ColumnProcessor());
		} catch (BusinessException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		panel.setHeadItem("pk_dept_v",res);*/
	  }

}
