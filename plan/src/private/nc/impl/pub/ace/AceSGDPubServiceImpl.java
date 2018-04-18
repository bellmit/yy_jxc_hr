package nc.impl.pub.ace;

import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDDeleteBP;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDInsertBP;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDUpdateBP;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDSendApproveBP;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDUnSendApproveBP;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDApproveBP;
import nc.bs.jxc_hr.jx01.sgd.ace.bp.AceSGDUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.plan.jx01.SGDVO;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pub.VOStatus;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.bill.pagination.PaginationTransferObject;
import nc.vo.pubapp.bill.pagination.util.PaginationUtils;
import nc.impl.pubapp.pattern.data.bill.BillQuery;

public abstract class AceSGDPubServiceImpl {
	// 新增
	public SGDVO[] pubinsertBills(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		try {
			// 数据库中数据和前台传递过来的差异VO合并后的结果
			BillTransferTool<SGDVO> transferTool = new BillTransferTool<SGDVO>(
					clientFullVOs);
			// 调用BP
			AceSGDInsertBP action = new AceSGDInsertBP();
			SGDVO[] retvos = action.insert(clientFullVOs);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 删除
	public void pubdeleteBills(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		try {
			// 调用BP
			new AceSGDDeleteBP().delete(clientFullVOs);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
	}

	// 修改
	public SGDVO[] pubupdateBills(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		try {
			// 加锁 + 检查ts
			BillTransferTool<SGDVO> transferTool = new BillTransferTool<SGDVO>(
					clientFullVOs);
			AceSGDUpdateBP bp = new AceSGDUpdateBP();
			SGDVO[] retvos = bp.update(clientFullVOs, originBills);
			// 构造返回数据
			return transferTool.getBillForToClient(retvos);
		} catch (Exception e) {
			ExceptionUtils.marsh(e);
		}
		return null;
	}

	// 分页查询方法，查询所有PK
	public String[] pubquerypkbills(IQueryScheme queryScheme)
			throws BusinessException {
		// String beanId=(String) queryScheme.get(QueryConstants.BEAN_ID);
		StringBuffer sql = new StringBuffer();
		QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
		String mainAlias = processor.getMainTableAlias();
		sql.append(" select distinct ");
		sql.append(mainAlias);
		sql.append(".");
		sql.append("pk_sgd_h");
		sql.append(processor.getFinalFromWhere());
		DataAccessUtils dao = new DataAccessUtils();
		IRowSet rowset = dao.query(sql.toString());
		String[] keys = rowset.toOneDimensionStringArray();
		return keys;
	}

	// 分页查询方法，根据PK查单据
	public SGDVO[] pubquerybillbypkbills(String[] pks) throws BusinessException {
		SGDVO[] bills = null;
		BillQuery<SGDVO> query = new BillQuery<SGDVO>(SGDVO.class);
		bills = query.query(pks);
		return PaginationUtils.filterNotExistBills(bills, pks);
	}

	// 提交
	public SGDVO[] pubsendapprovebills(SGDVO[] clientFullVOs,
			SGDVO[] originBills) throws BusinessException {
		AceSGDSendApproveBP bp = new AceSGDSendApproveBP();
		SGDVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
		return retvos;
	}

	// 收回
	public SGDVO[] pubunsendapprovebills(SGDVO[] clientFullVOs,
			SGDVO[] originBills) throws BusinessException {
		AceSGDUnSendApproveBP bp = new AceSGDUnSendApproveBP();
		SGDVO[] retvos = bp.unSend(clientFullVOs, originBills);
		return retvos;
	};

	// 审批
	public SGDVO[] pubapprovebills(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceSGDApproveBP bp = new AceSGDApproveBP();
		SGDVO[] retvos = bp.approve(clientFullVOs, originBills);
		return retvos;
	}

	// 弃审

	public SGDVO[] pubunapprovebills(SGDVO[] clientFullVOs, SGDVO[] originBills)
			throws BusinessException {
		for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
			clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
		}
		AceSGDUnApproveBP bp = new AceSGDUnApproveBP();
		SGDVO[] retvos = bp.unApprove(clientFullVOs, originBills);
		return retvos;
	}

}