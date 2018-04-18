package nc.impl.pub.ace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSApproveBP;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSDeleteBP;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSInsertBP;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSSendApproveBP;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSUnApproveBP;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSUnSendApproveBP;
import nc.bs.jxc_hr.jx03.swlgs.ace.bp.AceSWLGSUpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.impl.pubapp.pattern.data.bill.BillQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.jdbc.framework.processor.MapListProcessor;
import nc.pubitf.bd.reportitem.pub.SqlUtils;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.plan.jx03.SWLGSHVO;
import nc.vo.plan.jx03.SWLGSVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.bill.pagination.util.PaginationUtils;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;

public abstract class AceSWLGSPubServiceImpl {
	// 新增
	public SWLGSVO[] pubinsertBills(SWLGSVO[] clientFullVOs,
			SWLGSVO[] originBills) throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<SWLGSVO> transferTool = new BillTransferTool<SWLGSVO>(
					clientFullVOs);
			// 调用BP
			AceSWLGSInsertBP action = new AceSWLGSInsertBP();
			SWLGSVO[] retvos = action.insert(clientFullVOs);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(SWLGSVO[] clientFullVOs, SWLGSVO[] originBills)
			throws BusinessException {
		try {
			// 调用BP
			new AceSWLGSDeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public SWLGSVO[] pubupdateBills(SWLGSVO[] clientFullVOs,
			SWLGSVO[] originBills) throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<SWLGSVO> transferTool = new BillTransferTool<SWLGSVO>(
					clientFullVOs);
			AceSWLGSUpdateBP bp = new AceSWLGSUpdateBP();
			SWLGSVO[] retvos = bp.update(clientFullVOs, originBills);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	public SWLGSVO[] pubquerybills(IQueryScheme queryScheme)
			throws BusinessException {
		SWLGSVO[] bills = null;
		ArrayList<SWLGSVO> cbills=new ArrayList<SWLGSVO>();
		try {
			this.preQuery(queryScheme);
			BillLazyQuery<SWLGSVO> query = new BillLazyQuery<SWLGSVO>(
					SWLGSVO.class);
			bills = query.query(queryScheme, null);
			//-----20170620  过滤部门--当前部门的父部门，和兄弟部门
			String user = AppContext.getInstance().getPkUser();
			String sql_pkdept = "(select concat(substr(T.name,0,3),'%')  from bd_psnjob A inner join org_dept T on A.PK_DEPT=T.PK_DEPT inner join bd_psndoc C on A.pk_psndoc = C.Pk_Psndoc  where C.Pk_Psndoc = (select pk_psndoc from sm_user where nvl(dr, 0) = 0 and cuserid = '"+ user+ "')) ";
			sql_pkdept = "select pk_dept from org_dept   where name like "+ sql_pkdept;
			DataAccessUtils dao = new DataAccessUtils();
			IRowSet rowset = dao.query(sql_pkdept.toString());
			String[] keys = rowset.toOneDimensionStringArray();
			ArrayList<String> deptpk=new ArrayList<String>();
			for(String p:keys){
				deptpk.add(p);
			}
			for (SWLGSVO vos : bills) {
				SWLGSHVO hvo=vos.getParentVO();
				
				if (deptpk.contains(hvo.getSwlgs_dept())) {
					cbills.add(vos);
				}
			}
			//-------20170620
			
			
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return (SWLGSVO[])cbills.toArray(new SWLGSVO[cbills.size()]);
	}

	/**
	 * 由子类实现，查询之前对queryScheme进行加工，加入自己的逻辑
	 * 
	 * @param queryScheme
	 */
	protected void preQuery(IQueryScheme queryScheme) {
		// 查询之前对queryScheme进行加工，加入自己的逻辑
	}

	// 分页查询方法，根据PK查单据
		public SWLGSVO[] pubquerybillbypkbills(String[] pks) {
			SWLGSVO[]  bills = null;
			BillQuery<SWLGSVO> query = new BillQuery<SWLGSVO>(SWLGSVO.class);
			bills = query.query(pks);
			
			return PaginationUtils.filterNotExistBills(bills, pks);
		}

		public String[] pubquerypkbills(IQueryScheme queryScheme) {
			StringBuffer sql = new StringBuffer();
			QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
			String mainAlias = processor.getMainTableAlias();
			sql.append(" select distinct ");
			sql.append(mainAlias);
			sql.append(".");
			sql.append("pk_swlgs_h");
			sql.append(processor.getFinalFromWhere());
			String user=nc.bs.framework.common.InvocationInfoProxy.getInstance().getUserId(); 
			String sql_pkdept = "(select concat(substr(T.name,0,3),'%')  from bd_psnjob A inner join org_dept T on A.PK_DEPT=T.PK_DEPT inner join bd_psndoc C on A.pk_psndoc = C.Pk_Psndoc  where C.Pk_Psndoc = (select pk_psndoc from sm_user where nvl(dr, 0) = 0 and cuserid = '"+ user+ "')) ";
			sql_pkdept = "select pk_dept from org_dept   where name like "+ sql_pkdept;
			String sql2="and swlgs_dept  in("+sql_pkdept+")";
					
			sql.append(sql2);
			DataAccessUtils dao = new DataAccessUtils();
			IRowSet rowset = dao.query(sql.toString());
			String[] keys = rowset.toOneDimensionStringArray();
			return keys;
		}
	
	
	
	// 提交
	public SWLGSVO[] pubsendapprovebills(SWLGSVO[] clientFullVOs,
			SWLGSVO[] originBills) throws BusinessException {
		AceSWLGSSendApproveBP bp = new AceSWLGSSendApproveBP();
		SWLGSVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// 收回
	public SWLGSVO[] pubunsendapprovebills(SWLGSVO[] clientFullVOs,
			SWLGSVO[] originBills) throws BusinessException {
		AceSWLGSUnSendApproveBP bp = new AceSWLGSUnSendApproveBP();
		SWLGSVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// 审批
	public SWLGSVO[] pubapprovebills(SWLGSVO[] clientFullVOs,
			SWLGSVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceSWLGSApproveBP bp = new AceSWLGSApproveBP();
		SWLGSVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// 弃审

	public SWLGSVO[] pubunapprovebills(SWLGSVO[] clientFullVOs,
			SWLGSVO[] originBills) throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceSWLGSUnApproveBP bp = new AceSWLGSUnApproveBP();
		SWLGSVO[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

	public SWLGSVO[] insert(SWLGSVO[] originBills) throws BusinessException {
		AceSWLGSInsertBP bp = new AceSWLGSInsertBP();
		SWLGSVO[] retvos = bp.insert(originBills);
		return retvos;
	}

	public HashMap<String, UFDouble> queryPGDRemainGS(String[] pk_pgd_h,String[] pk_pgd_b) throws BusinessException {
		if(pk_pgd_h!=null&&pk_pgd_b!=null){
			throw new BusinessException("queryPGDRemainGS方法不能两个参数都不为空！");
		}
		HashMap<String,UFDouble> map=new HashMap<String,UFDouble>();
		if(pk_pgd_h!=null&&pk_pgd_h.length>=0){
			List pkhList = Arrays.asList(pk_pgd_h);
			String inStr = SqlUtils.getInStr("pk_pgk_h", pkhList, true);
			StringBuilder sql=new StringBuilder();
			sql.append("select  sy.pk_pgk_h,sum(nvl(syb.zgs,0)+nvl(syb.addgs,0))-xygs.xygs as remaings from jxc_hr_pgk_h sy ");
			sql.append("inner join jxc_hr_pgk_czz SYB on SYB.Pk_Pgk_h=SY.Pk_Pgk_h ");
			sql.append("left join ");
			sql.append("(select xy.srcbillid as pk,sum(nvl(xyb.swlgs,0)) as xygs from jxc_hr_swlgs_h xy ");
			sql.append("inner join jxc_hr_swlgs_b xyb on xyb.pk_swlgs_h=xy.pk_swlgs_h  ");
			sql.append("where nvl(xy.dr,0)=0 and nvl(xyb.dr,0)=0 group by xy.srcbillid  ");
			sql.append(") xygs on xygs.pk=sy.pk_pgk_h ");
			sql.append("where sy.");
			sql.append(inStr);
			sql.append("and nvl(sy.dr, 0) =0 and nvl(syb.dr,0)=0 ");
			sql.append("group by sy.pk_pgk_h,xygs.xygs");
			BaseDAO bd=new BaseDAO();
			ArrayList<Object> list= (ArrayList<Object>)bd.executeQuery(sql.toString(), new MapListProcessor());
			if(list!=null&&list.size()>0){
					for (Object obj : list) {
						Map mapl = (Map) obj;
						String key = mapl.get("pk_pgk_h") == null ? "" : mapl.get("pk_pgk_h").toString();
						UFDouble value = mapl.get("remaings") == null ? UFDouble.ZERO_DBL: new UFDouble(mapl.get("remaings").toString());
						map.put(key, value);
					}
			}
		}
		return map;
	}
	
	
	

}