package nc.ui.jxc_hr.jx06.bgd.ace.handler;

import nc.ui.bd.ref.model.PsndocDefaultRefModel;
import nc.ui.pub.beans.UIRefPane;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pub.bill.BillItem;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardHeadTailBeforeEditEvent;
import nc.ui.uif2.ShowStatusBarMsgUtil;
import nc.vo.plan.jx06.BGDHVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.AppContext;
/**
 * ���ݱ�ͷ��β�ֶα༭ǰ�¼�������
 * 
 * @since 6.0
 * @version 2011-7-7 ����02:51:21
 * @author duy
 */
public class AceHeadTailBeforeEditHandler implements IAppEventHandler<CardHeadTailBeforeEditEvent> {

    @Override
    public void handleAppEvent(CardHeadTailBeforeEditEvent e) {
    	 
    	//������Ա���˳�  ��ǰ��¼�û����ڵĲ�����Ա  ���ұ������ڲ���
    	if(!"bgd_people".equals(e.getKey())){
    		return ;
    	}else{
    		BillCardPanel panel = e.getBillCardPanel();
		    	String pkUser = AppContext.getInstance().getPkUser();
		    	if(pkUser==null){
		    		return ;
		    		} 
		    	String bgd_date = panel.getHeadItem("bgd_date")==null?"":panel.getHeadItem("bgd_date").getValue();
		    	if(bgd_date==null||"".equals(bgd_date)){
		    		ShowStatusBarMsgUtil.showStatusBarMsg("��ʾ����������Ϊ��,����ѡ�񱨹����ڣ�", e.getContext());
		    		e.setReturnValue(false);
		    		return;
		    	}else{
		    		ShowStatusBarMsgUtil.showStatusBarMsg(" ", e.getContext());
		    		e.setReturnValue(true);
		    	}
		    	//String sql1="select pk_dept from org_dept where  pk_fatherorg=(select case  when pk_fatherorg ='' then pk_dept else pk_fatherorg end pkdept  from org_dept where   pk_dept=(select A.Pk_Dept from bd_psnjob A inner join bd_psndoc C on A.pk_psndoc=C.Pk_Psndoc where C.Pk_Psndoc=(select pk_psndoc from  sm_user where  nvl(dr,0)=0 and cuserid='"+pkUser+"')))";
		    	//20170609 start lsx
		    	// String sql1="select pk_dept from org_dept   where name like  (select concat(substr(T.name,0,3),'%') from bd_psnjob A inner join org_dept T on A.PK_DEPT=T.PK_DEPT inner join bd_psndoc C on A.pk_psndoc = C.Pk_Psndoc  where C.Pk_Psndoc =  (select pk_psndoc from sm_user where nvl(dr, 0) = 0 and cuserid = '"+pkUser+"'))";
		    	//20170609 end lsx
		    	
		    	//bgd_people��Ա��ֵ�������޸�
		    	if(panel.getHeadItem("bgd_people").getValue()!=null){
		    		ShowStatusBarMsgUtil.showStatusBarMsg("��ʾ��������Ա�������޸ģ�", e.getContext());
		    		e.setReturnValue(false);
		    	}else
		    	{
		    		e.setReturnValue(true);
		    	}
		    	
		    	String sql1="select pk_psndoc from hi_psnjob  A inner join bd_defdoc B on A.jobglbdef6=b.pk_defdoc where a.jobglbdef6=(select jobglbdef6  from hi_psnjob A inner join bd_defdoc B on A.jobglbdef6=b.pk_defdoc where  A.pk_psndoc=(select pk_psndoc from sm_user where nvl(dr, 0) = 0 and cuserid = '"+pkUser+"'))";
		    	String sql2="select bgd_people from jxc_hr_bgd_h where nvl(dr,0)=0 and bgd_date like '"+bgd_date.substring(0, 7)+"%'";
		    	UIRefPane ref=(UIRefPane)panel.getHeadItem("bgd_people").getComponent();
		    	
				ref.setWhereString("bd_psndoc.pk_psndoc in("+sql1+") and bd_psndoc.pk_psndoc not in ("+sql2+")");
				String refSql = ref.getRefModel().getRefSql();
				e.getBillCardPanel().getHeadItem("bgd_people").setComponent(ref);
    	}
    }

}
