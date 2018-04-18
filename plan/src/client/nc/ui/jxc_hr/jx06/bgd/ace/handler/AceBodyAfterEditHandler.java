package nc.ui.jxc_hr.jx06.bgd.ace.handler;

import java.awt.Color;
import java.util.ArrayList;

import com.borland.dx.dataset.ColumnList;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnListProcessor;
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
 *单据表体字段编辑后事件
 * 
 * @since 6.0
 * @version 2011-7-12 下午08:17:33
 * @author duy
 */
public class AceBodyAfterEditHandler implements IAppEventHandler<CardBodyAfterEditEvent> {

    

	@Override
    public void handleAppEvent(CardBodyAfterEditEvent e) {

		//207.5.18 13:58
		BillCardPanel panel = e.getBillCardPanel();
		
		String people = panel.getHeadItem("bgd_people").getValue();
		IUAPQueryBS iUAPQueryBS=NCLocator.getInstance().lookup(IUAPQueryBS.class);
		String day="day";
		ArrayList<String> dayList=new ArrayList<String>(32);
		
		String kqzt = panel.getBodyValueAt(e.getRow(), "kqzt")==null?"":panel.getBodyValueAt(e.getRow(), "kqzt").toString();
		//1、生产，2、出差，3、会务，4、加班，5、调休，6、公休，7、事假，8、病假，9长病假 10 其他；
		// 出差、会务、加班，不校验数值
		if("2".equals(kqzt)||"3".equals(kqzt)||"4".equals(kqzt))
		{
			return;
		}else {
			for(int i=1;i<32;i++){
	    		dayList.add(day+i);
	    	}
			if(dayList.contains(e.getKey())){
			
				if(e.getKey()==null){
					return;
				}
				String key = e.getKey();
				String date=key.replaceAll("day", "");
				if(date.length()==1){
					date="0"+date;
				}
				String str=null;
				String billdate = panel.getHeadItem("bgd_date").getValue()==null?"":panel.getHeadItem("bgd_date").getValue();
				if(billdate!=null||"".equals(billdate)){
					str=billdate.substring(0, 8);
				}
				//String sql="select case when logtime > 8 then  8 else  trunc(logtime) end  from (select distinct t.calendar, t.oneendtime, t.onebegintime, case when (t.oneendtime is null or t.onebegintime is null) then  0  else (to_date(t.oneendtime, 'YYYY-MM-DD HH24:MI:SS') -  to_date(t.onebegintime, 'YYYY-MM-DD HH24:MI:SS')) * 24 - (select  nvl(c.earlylong/60,0)from tbm_daystat  c where  nvl(c.dr,0) = 0 and pk_psndoc = '"+people+"' and calendar = '"+(str+date)+"') -(select  nvl(c.latelong/60,0) from tbm_daystat  c where  nvl(c.dr,0) = 0 and pk_psndoc = '"+people+"' and calendar = '"+(str+date)+"')  -(select  nvl(b.midwayouttime/60,0) from tbm_timedata b where nvl(b.dr,0) = 0 and pk_psndoc = '"+people+"' and calendar = '"+(str+date)+"') end logtime  from tbm_timedata t  where nvl(t.dr,0) = 0 and t.pk_psndoc = '"+people+"' and t.calendar = '"+(str+date)+"')";
				
				String sql="select case when logtime > 8 then 8 else trunc(logtime) end  from (select distinct t.calendar, t.oneendtime, t.onebegintime, case when (t.oneendtime is null or t.onebegintime is null) then 0 else  (   ( case when to_date(t.oneendtime, 'YYYY-MM-DD HH24:MI:SS') < to_date('"+(str+date)+" 16:30:00', 'YYYY-MM-DD HH24:MI:SS') then to_date(t.oneendtime, 'YYYY-MM-DD HH24:MI:SS') else to_date('"+(str+date)+" 16:30:00', 'YYYY-MM-DD HH24:MI:SS') end) -(case  when to_date(t.onebegintime, 'YYYY-MM-DD HH24:MI:SS') < to_date('"+(str+date)+" 07:30:00', 'YYYY-MM-DD HH24:MI:SS') then to_date('"+(str+date)+" 07:30:00', 'YYYY-MM-DD HH24:MI:SS') else to_date(t.onebegintime, 'YYYY-MM-DD HH24:MI:SS') end ) ) * 24 -  (select nvl(c.earlylong / 60, 0) from tbm_daystat c where nvl(c.dr, 0) = 0 and pk_psndoc = '"+people+"' and calendar = '"+(str+date)+"') - (select nvl(c.latelong / 60, 0)  from tbm_daystat c where nvl(c.dr, 0) = 0 and pk_psndoc = '"+people+"' and calendar = '"+(str+date)+"') - (select nvl(b.midwayouttime / 60, 0) from tbm_timedata b  where nvl(b.dr, 0) = 0  and pk_psndoc = '"+people+"' and calendar = '"+(str+date)+"') end logtime from tbm_timedata t where nvl(t.dr, 0) = 0 and t.pk_psndoc = '"+people+"' and t.calendar = '"+(str+date)+"')";
				try {
					Object res = iUAPQueryBS.executeQuery(sql, new ColumnProcessor())==null?"0":iUAPQueryBS.executeQuery(sql, new ColumnProcessor());
					if(new UFDouble(e.getValue().toString()).compareTo(new UFDouble(res.toString()))>0){
						
						panel.getBillModel().setValueAt(new UFDouble(res.toString()), e.getRow(), e.getKey());//填参
						ShowStatusBarMsgUtil.showStatusBarMsg("提示：填写工时大于实际考勤时间！ ", e.getContext());
					}
				} catch (BusinessException e1) {
					e1.printStackTrace();
				}
			}
		}
		
  }
	
//	private void checkdate(Object date_begin,Object date_end,Object name){
//		String sql ="select t.calendar from tbm_timedata t where dr=0 and calendar between '"+date_begin.toString()+"' and '"+date_end.toString()+"' " +
//				" and pk_psndoc='"+name.toString()+"'";
//		IUAPQueryBS iUAPQueryBS=NCLocator.getInstance().lookup(IUAPQueryBS.class);
//		Object res=null;
//		try {
//			res = iUAPQueryBS.executeQuery(sql, new ColumnListProcessor());
//		} catch (BusinessException e2) {
//			ExceptionUtils.wrappBusinessException("查询数据库异常！");
//			e2.printStackTrace();
//		}
//		if(res!=null&&res.hashCode()!=1){
//			MessageDialog.showHintDlg(null, "提示","该人员的缺勤日期为"+res.toString());
//		}		
//	}
    
}
