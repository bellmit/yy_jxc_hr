package nc.ui.jxc_hr.jx06.bgd.ace.handler;

import java.util.ArrayList;

import nc.jdbc.framework.processor.ColumnProcessor;
import nc.ui.bd.ref.AbstractRefModel;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.beans.UIRefPane;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyBeforeEditEvent;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.vo.pub.BusinessException;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
/**
 * 表体字段编辑前事件处理类
 * 
 * @since 6.0
 * @version 2011-7-7 下午02:52:57
 * @author duy
 */
public class AceBodyBeforeEditHandler implements IAppEventHandler<CardBodyBeforeEditEvent> {

	@Override
    public void handleAppEvent(CardBodyBeforeEditEvent e) {
//    	UIRefPane a=(UIRefPane)e.getBillCardPanel().getBodyItem("name").getComponent();
//    	a.setWhereString("");
//    	e.getBillCardPanel().getBodyItem("name").setComponent(a);
    	//207.5.18 13:58
    	BillCardPanel cardPanel = e.getBillCardPanel();
    	IUAPQueryBS iUAPQueryBS=NCLocator.getInstance().lookup(IUAPQueryBS.class);
    	String kqzt = cardPanel.getBodyValueAt(e.getRow(), "kqzt")==null?"":cardPanel.getBodyValueAt(e.getRow(), "kqzt").toString();
    	//201706-07 START
    	String billdate = cardPanel.getHeadItem("bgd_date").getValue()==null?"":cardPanel.getHeadItem("bgd_date").getValue();
    	String people = cardPanel.getHeadItem("bgd_people").getValue()==null?"":cardPanel.getHeadItem("bgd_people").getValue();
    	String str=null;
    	String sql=null;

    	if(billdate==null||"".equals(billdate) ||billdate==people||"".equals(people) ){
			
			ShowStatusBarMsgUtil.showStatusBarMsg("提示：报工日期为空或报工人员为空！", e.getContext());
			e.setReturnValue(false);
			return;
		}else
		{
			str =billdate.substring(0, 8);
			ShowStatusBarMsgUtil.showStatusBarMsg(" ", e.getContext());
		}
    	//201706-07 END LSX
    	String day = "day";
		ArrayList<String> dayList = new ArrayList<String>(32);
		dayList.add("gl");
		for (int i = 1; i <32; i++) {
			dayList.add(day + i);
		}
		//2017-06-07 start lsx
		if(dayList.contains(e.getKey())&&!"gl".equals(e.getKey()))
		{
			String key = e.getKey();
			String date=key.replaceAll("day", "");
			if(date.length()==1){
				date="0"+date;
			}
			 sql="select ismidoutabnormal from tbm_timedata  t where dr = 0 and pk_psndoc = '"+people+"'  and calendar = ('"+(str+date)+"')";
				try {
					Object res = iUAPQueryBS.executeQuery(sql, new ColumnProcessor())==null?"0":iUAPQueryBS.executeQuery(sql, new ColumnProcessor());
					if("Y".equals(res.toString()))
					{
						MessageDialog.showWarningDlg(null, "提示", (str+date)+"号考勤数据异常，请检查并补全签卡信息！");
						return;
					}
					
				} catch (BusinessException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
		
		}
		//2017-06-07 start lsx end
    	//1、生产，2、出差，3、会务，4、加班，5、调休，6、公休，7、事假，8、病假，9长病假 10 其他；
		//5、6、7、8、9不可填工令、工时
		if (!kqzt.equals("1") && !kqzt.equals("2") && !kqzt.equals("4")) {

			if ("gl".equals(e.getKey())) {
				e.setReturnValue(false);
				ShowStatusBarMsgUtil.showStatusBarMsg("提示：该考勤状态下工令不可填！ ",
						e.getContext());
			}
		}
		
		if ("".equals(kqzt) ||"5".equals(kqzt) || "6".equals(kqzt) || "7".equals(kqzt)
				|| "8".equals(kqzt) || "9".equals(kqzt)) {

			if (dayList.contains(e.getKey())) {
				e.setReturnValue(false);
			}
		}
		//10、选择生产、出差、加班时填写的工令号需要参照其本人（班组）名下的未完工的工令号
		 //20170524 当前人员班组下的未完工工令
			if ("gl".equals(e.getKey())) {
				UIRefPane component = (UIRefPane) cardPanel.getBodyItem("gl")
						.getComponent();
				AbstractRefModel  refModel = component.getRefModel();
				//String sql1="pk_dept =(select  pk_dept  from hi_psnjob  where lastflag='Y' and pk_psndoc='"+ people +"')";
				String sql1="jobglbdef6 =(select jobglbdef6  from hi_psnjob A inner join bd_defdoc B on A.jobglbdef6=b.pk_defdoc where  A.lastflag='Y' and A.pk_psndoc ='"+ people +"')";//(select  pk_dept  from hi_psnjob  where lastflag='Y' and pk_psndoc='"+ people +"')";
				refModel.setWherePart("pk_defdoc in (select gl from jxc_hr_pgk_h where approvestatus='1' and people in(select pk_psndoc from hi_psnjob where  "+sql1+"))");
				String refSql = component.getRefModel().getRefSql();
				component.setRefModel(refModel);
				//jobgldef6这个字段存放班组信息
			}
			
			//考勤状态有值不允许修改
	    	if(cardPanel.getBodyItem("kqzt").getValue()!=null&&"kqzt".equals(e.getKey())){
	    		ShowStatusBarMsgUtil.showStatusBarMsg("提示：考勤状态不允许修改！", e.getContext());
	    		if("kqzt".equals(e.getKey())){
	    			e.setReturnValue(false);
	    		}
	    		
	    	}else{
	    		ShowStatusBarMsgUtil.showStatusBarMsg(" ", e.getContext());
	    	}
		
		
    }

}
