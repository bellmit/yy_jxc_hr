package nc.impl.pub.ace;

import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2ApproveBP;
import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2DeleteBP;
import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2InsertBP;
import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2SendApproveBP;
import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2UnApproveBP;
import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2UnSendApproveBP;
import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2UpdateBP;
import nc.impl.pubapp.pattern.data.bill.BillQuery;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.bill.pagination.util.PaginationUtils;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;

public abstract class AcePGD2PubServiceImpl {
	// 新增
	public PGDVO[] pubinsertBills(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<PGDVO> transferTool = new BillTransferTool<PGDVO>(
					clientFullVOs);
			// 调用BP
			AcePGD2InsertBP action = new AcePGD2InsertBP();
			PGDVO[] retvos = action.insert(clientFullVOs);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		try {
			// 调用BP
			new AcePGD2DeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public PGDVO[] pubupdateBills(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
//		try {
			// 加锁 + 检查ts
			BillTransferTool<PGDVO> transferTool = new BillTransferTool<PGDVO>(
					clientFullVOs);
			AcePGD2UpdateBP bp = new AcePGD2UpdateBP();
			PGDVO[] retvos = bp.update(clientFullVOs, originBills);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
//		} catch (RuntimeException e) {
//			ExceptionUtils.marsh(e);
//			ExceptionUtils.wrappBusinessException(e.getMessage());
//		}
//		return null;
	}

	// 分页查询方法，查询所有PK
	//增加部门过滤 lsx 20170616
	public String[] pubquerypkbills(IQueryScheme queryScheme)
			throws BusinessException {
		// String beanId=(String) queryScheme.get(QueryConstants.BEAN_ID);
		StringBuffer sql = new StringBuffer();
		QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
		String mainAlias = processor.getMainTableAlias();
		sql.append(" select distinct ");
		sql.append(mainAlias);
		sql.append(".");
		sql.append("pk_pgk_h");
		
		sql.append(processor.getFinalFromWhere());
		
		String user=nc.bs.framework.common.InvocationInfoProxy.getInstance().getUserId(); 
		String sql_pkdept = "(select concat(substr(T.name,0,3),'%')  from bd_psnjob A inner join org_dept T on A.PK_DEPT=T.PK_DEPT inner join bd_psndoc C on A.pk_psndoc = C.Pk_Psndoc  where C.Pk_Psndoc = (select pk_psndoc from sm_user where nvl(dr, 0) = 0 and cuserid = '"+ user+ "')) ";
		sql_pkdept = "select pk_dept from org_dept   where name like "+ sql_pkdept;
		String sql2="and pgd_dept  in("+sql_pkdept+")";
				
		sql.append(sql2);
		DataAccessUtils dao = new DataAccessUtils();
		IRowSet rowset = dao.query(sql.toString());
		String[] keys = rowset.toOneDimensionStringArray();
		return keys;
	}

	// 分页查询方法，根据PK查单据
	public PGDVO[] pubquerybillbypkbills(String[] pks) throws BusinessException {
		PGDVO[] bills = null;
		BillQuery<PGDVO> query = new BillQuery<PGDVO>(PGDVO.class);
		bills = query.query(pks);
		return PaginationUtils.filterNotExistBills(bills, pks);
	}

	// 提交
	public PGDVO[] pubsendapprovebills(PGDVO[] clientFullVOs,
			PGDVO[] originBills) throws BusinessException {
		AcePGD2SendApproveBP bp = new AcePGD2SendApproveBP();
		PGDVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// 收回
	public PGDVO[] pubunsendapprovebills(PGDVO[] clientFullVOs,
			PGDVO[] originBills) throws BusinessException {
		AcePGD2UnSendApproveBP bp = new AcePGD2UnSendApproveBP();
		PGDVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// 审批
	public PGDVO[] pubapprovebills(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AcePGD2ApproveBP bp = new AcePGD2ApproveBP();
		PGDVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// 弃审

	public PGDVO[] pubunapprovebills(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AcePGD2UnApproveBP bp = new AcePGD2UnApproveBP();
		PGDVO[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}