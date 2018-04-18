package nc.ui.jxc_hr.jx06.bgd.action;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.jdbc.framework.processor.MapListProcessor;
import nc.ui.jxc_hr.jx06.bgd.dlg.ShowISHaveBGDlg;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uif2.NCAction;
import nc.vo.plan.jx06.BGDHVO;
import nc.vo.plan.jx06.BGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;

public class ShowISHaveBGD extends NCAction {
	private Object busiDate=null;
	private BillManageModel model;
	private ShowUpableBillListView listview;
	public ShowUpableBillListView getListview() {
		return listview;
	}

	public void setListview(ShowUpableBillListView listview) {
		this.listview = listview;
	}

	public BillManageModel getModel() {
		return model;
	}

	public void setModel(BillManageModel model) {
		this.model = model;
	}

	public ShowISHaveBGD() {
		setBtnName("当月报工信息");
		setCode("showISHaveBGD");
	}

	@Override
	public void doAction(ActionEvent e) throws Exception {
		String pkUser = AppContext.getInstance().getPkUser();
		BGDHVO[] bghvos = getPsndocHasBG(pkUser);// 获得本部门当月已经报工的人员名单
		Object nbghvos = getPsndocNoBG(pkUser);// 上面取反
		ShowISHaveBGDlg dlg=new ShowISHaveBGDlg(null,bghvos,nbghvos,busiDate);
		dlg.showModal();
		BGDVO[] retvos = dlg.getRetvos();
		if(retvos==null||retvos.length==0){
			return;
		}
		
		this.getModel().initModel(retvos);
//		int hrc = this.getListview().getBillListPanel().getHeadBillModel().getRowCount();
//		this.getListview().getBillListPanel().getHeadBillModel().addLine(retvos.length);
//		BGDHVO[] hvos=new BGDHVO[retvos.length];
//		for(int i=0;i<retvos.length;i++){
//			hvos[i]=new BGDHVO();
//			hvos[i]=retvos[i].getParentVO();
//			this.getListview().getBillListPanel().getHeadBillModel().setBodyRowVO(retvos[i].getParentVO(), hrc+i);
//		}
//		this.getListview().getBillListPanel().getHeadBillModel().loadLoadRelationItemValue();
//		this.getListview().getBillListPanel().set
		
		

	}

	@SuppressWarnings("unchecked")
	private Object getPsndocNoBG(String pkUser) throws BusinessException {
//		String sql = "(select A.Pk_Dept from bd_psnjob A inner join bd_psndoc C on A.pk_psndoc=C.Pk_Psndoc where C.Pk_Psndoc=(select pk_psndoc from  sm_user where  nvl(dr,0)=0 and cuserid='"
//				+ "1001W1100000000011I9" + "')))";
//		sql = "select pk_dept from org_dept where pk_fatherorg=(select case  when pk_fatherorg ='~' then pk_dept else pk_fatherorg end pkdept  from org_dept where pk_dept="
//				+ sql;
		//String sql="select  bd_psndoc.code,bd_psndoc.name as bgd_people,bd_psnidtype.name as idtypename,id,org_orgs.name,org_dept.name as bgd_dept,om_post.postname, case when ismainjob = 'Y' then '是' else '否' end ,hi_psnjob.pk_dept,hi_psnjob.pk_psnjob,bd_psndoc.pk_psndoc,hi_psnjob.pk_org,hi_psnjob.pk_post,hi_psnjob.pk_job,hi_psnjob.pk_psncl from  bd_psndoc inner join hi_psnorg on hi_psnorg.pk_psndoc = bd_psndoc.pk_psndoc   inner join (select max( orgrelaid) as orgrelaid,pk_psndoc from hi_psnorg where indocflag='Y' group by pk_psndoc  ) tmp  on hi_psnorg.pk_psndoc = tmp.pk_psndoc and hi_psnorg.orgrelaid = tmp.orgrelaid inner join hi_psnjob on hi_psnorg.pk_psnorg = hi_psnjob.pk_psnorg and hi_psnjob.lastflag = 'Y' and hi_psnjob.ismainjob = 'Y'  left outer join org_orgs on org_orgs.pk_org = hi_psnjob.pk_org  left outer join org_dept on org_dept.pk_dept = hi_psnjob.pk_dept  left outer join om_post on om_post.pk_post = hi_psnjob.pk_post   left outer join bd_psnidtype on bd_psndoc.idtype = bd_psnidtype.pk_identitype   where (pk_dept in(select pk_dept from org_dept where pk_fatherorg=(select case  when pk_fatherorg ='~' then pk_dept else pk_fatherorg end pkdept  from org_dept where name like '机械制造%' and pk_dept=(select A.Pk_Dept from bd_psnjob A inner join bd_psndoc C on A.pk_psndoc=C.Pk_Psndoc where C.Pk_Psndoc=(select pk_psndoc from  sm_user where  nvl(dr,0)=0 and cuserid='1001W1100000000011I9')))) and bd_psndoc.pk_psndoc not in (select bgd_people from jxc_hr_bgd_h where nvl(dr,0)=0 and bgd_date like '2017-05%') ) and ( bd_psndoc.pk_psndoc in (select hi_psnjob.pk_psndoc from hi_psnjob  inner join hi_psnorg on hi_psnorg.pk_psnorg = hi_psnjob.pk_psnorg where hi_psnorg.indocflag = 'Y' and hi_psnjob.pk_org in (select org_adminorg.pk_adminorg from org_adminorg  where org_adminorg.enablestate=2 and org_adminorg.innercode like 'UF6D'||'%' and org_adminorg.pk_adminorg not in ( select aosm.pk_adminorg from ( select aos.code, aos.innercode, length(aos.innercode) as innercodelen from org_hrorg hrorg inner join org_adminorg aos on aos.pk_adminorg = hrorg.pk_hrorg where aos.innercode like 'UF6D'||'%' and aos.innercode <> 'UF6D' and hrorg.enablestate =2  )  sub_hrorg, org_adminorg aosm where sub_hrorg.innercode=substr(aosm.innercode , 1, sub_hrorg.innercodelen))  and org_adminorg.pk_adminorg in (select pk_adminorg from org_admin_enable) ) ) and  hi_psnorg.indocflag = 'Y' and hi_psnjob.pk_org in (select pk_adminorg from org_admin_enable) )  order by org_dept.name asc";
		//20170524 --start
		String sql="select bd_psndoc.code,         bd_psndoc.name as bgd_people,         bd_psnidtype.name as idtypename,         id,         org_orgs.name,  			 bd_defdoc.name,         org_dept.name as bgd_dept,         om_post.postname,         case           when ismainjob = 'Y' then            '是'           else            '否'         end,         hi_psnjob.pk_dept,         hi_psnjob.pk_psnjob,         bd_psndoc.pk_psndoc,         hi_psnjob.pk_org,         hi_psnjob.pk_post,         hi_psnjob.pk_job,         hi_psnjob.pk_psncl    from bd_psndoc   inner join hi_psnorg      on hi_psnorg.pk_psndoc = bd_psndoc.pk_psndoc   inner join bd_defdoc      on bd_psndoc.glbdef5 = bd_defdoc.pk_defdoc    inner join (select max(orgrelaid) as orgrelaid, pk_psndoc                 from hi_psnorg                where indocflag = 'Y'                group by pk_psndoc) tmp      on hi_psnorg.pk_psndoc = tmp.pk_psndoc     and hi_psnorg.orgrelaid = tmp.orgrelaid   inner join hi_psnjob      on hi_psnorg.pk_psnorg = hi_psnjob.pk_psnorg     and hi_psnjob.lastflag = 'Y'     and hi_psnjob.ismainjob = 'Y'    left outer join org_orgs      on org_orgs.pk_org = hi_psnjob.pk_org    left outer join org_dept      on org_dept.pk_dept = hi_psnjob.pk_dept    left outer join om_post      on om_post.pk_post = hi_psnjob.pk_post    left outer join bd_psnidtype      on bd_psndoc.idtype = bd_psnidtype.pk_identitype   where (pk_dept in         (select pk_dept             from org_dept            where  name like (select concat(substr(T.name,0,3),'%') from bd_psnjob A inner join org_dept T on A.PK_DEPT=T.PK_DEPT inner join bd_psndoc C on A.pk_psndoc = C.Pk_Psndoc where C.Pk_Psndoc = (select pk_psndoc from sm_user where nvl(dr, 0) = 0 and cuserid = '"+pkUser+"')))) and      bd_psndoc.pk_psndoc not in         (select bgd_people             from jxc_hr_bgd_h            where nvl(dr, 0) = 0              and bgd_date like '"+busiDate.toString().substring(0, 7)+"%')     and (bd_psndoc.pk_psndoc in         (select hi_psnjob.pk_psndoc             from hi_psnjob            inner join hi_psnorg               on hi_psnorg.pk_psnorg = hi_psnjob.pk_psnorg            where hi_psnorg.indocflag = 'Y'              and hi_psnjob.pk_org in                  (select org_adminorg.pk_adminorg                     from org_adminorg                    where org_adminorg.enablestate = 2                      and org_adminorg.innercode like 'UF6D' || '%'                      and org_adminorg.pk_adminorg not in                          (select aosm.pk_adminorg                             from (select aos.code,                                          aos.innercode,                                          length(aos.innercode) as innercodelen                                     from org_hrorg hrorg                                    inner join org_adminorg aos                                       on aos.pk_adminorg = hrorg.pk_hrorg                                    where aos.innercode like 'UF6D' || '%'                                      and aos.innercode <> 'UF6D'                                      and hrorg.enablestate = 2) sub_hrorg,                                  org_adminorg aosm                            where sub_hrorg.innercode =                                  substr(aosm.innercode,                                         1,                                         sub_hrorg.innercodelen))                      and org_adminorg.pk_adminorg in                          (select pk_adminorg from org_admin_enable))) and         hi_psnorg.indocflag = 'Y' and         hi_psnjob.pk_org in (select pk_adminorg from org_admin_enable))  			 and bd_defdoc.code in('007','004','015')   order by org_dept.name asc  ";
		//20170524--end
		Object list=getIUAPQueryBS().executeQuery(sql, new MapListProcessor());
		return list;
	}

	@SuppressWarnings("unchecked")
	private BGDHVO[] getPsndocHasBG(String pkUser) throws BusinessException {
		 
		/*String sql = "(select A.Pk_Dept from bd_psnjob A inner join bd_psndoc C on A.pk_psndoc=C.Pk_Psndoc where C.Pk_Psndoc=(select pk_psndoc from  sm_user where  nvl(dr,0)=0 and cuserid='"
				+ pkUser+ "')))";
		sql = "select pk_dept from org_dept where pk_fatherorg=(select case  when pk_fatherorg ='~' then pk_dept else pk_fatherorg end pkdept  from org_dept where pk_dept="
				+ sql;*/
		//20170609 s lsx
		String sql = "(select concat(substr(T.name,0,3),'%')  from bd_psnjob A inner join org_dept T on A.PK_DEPT=T.PK_DEPT inner join bd_psndoc C on A.pk_psndoc = C.Pk_Psndoc  where C.Pk_Psndoc = (select pk_psndoc from sm_user where nvl(dr, 0) = 0 and cuserid = '"+ pkUser+ "')) ";
		sql = "select pk_dept from org_dept   where name like "+ sql;
		
		 busiDate = AppContext.getInstance().getBusiDate();
		
		String lastSql="select billno,bgd_dept,bgd_people from jxc_hr_bgd_h  where nvl(dr,0)=0 and bgd_dept in ("+sql+") and bgd_date like '"+busiDate.toString().substring(0, 7)+"%' order by ts desc ";
		ArrayList<BGDHVO> list =(ArrayList<BGDHVO>)getIUAPQueryBS().executeQuery(lastSql, new BeanListProcessor(BGDHVO.class));
		return list.toArray(new BGDHVO[list.size()]);
	}
	private IUAPQueryBS ibs; 
	private IUAPQueryBS getIUAPQueryBS(){
		if(ibs==null){
			 ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
		}
		return ibs;
	}

}
