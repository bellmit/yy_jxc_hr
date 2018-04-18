package nc.impl.jxc_hr.jx02;

import nc.bs.jxc_hr.jx02.pgd2.ace.bp.AcePGD2UpdateBP;
import nc.impl.pub.ace.AcePGD2PubServiceImpl;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
import nc.vo.plan.jx02.PGDVO;
import nc.impl.pubapp.pattern.data.bill.BillLazyQuery;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.pubapp.query2.sql.process.QuerySchemeProcessor;
import nc.impl.pubapp.pattern.database.DataAccessUtils;
import nc.vo.pubapp.pattern.data.IRowSet;
import nc.vo.pubapp.bill.pagination.PaginationTransferObject;
import nc.vo.pubapp.bill.pagination.util.PaginationUtils;
import nc.impl.pubapp.pattern.data.bill.BillQuery;

public class PGD2MaintainImpl extends AcePGD2PubServiceImpl implements
		nc.itf.jxc_hr.jx02.IPGD2Maintain {

	@Override
	public void delete(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		super.pubdeleteBills(clientFullVOs, originBills);
	}

	@Override
	public PGDVO[] insert(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		return super.pubinsertBills(clientFullVOs, originBills);
	}

	@Override
	public PGDVO[] update(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		return super.pubupdateBills(clientFullVOs, originBills);
	}

	@Override
	public String[] queryPKs(IQueryScheme queryScheme) throws BusinessException {
		return super.pubquerypkbills(queryScheme);
	}

	@Override
	public PGDVO[] queryBillByPK(String[] pks) throws BusinessException {
		return super.pubquerybillbypkbills(pks);
	}

	@Override
	public PGDVO[] save(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		return super.pubsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public PGDVO[] unsave(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		return super.pubunsendapprovebills(clientFullVOs, originBills);
	}

	@Override
	public PGDVO[] approve(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		return super.pubapprovebills(clientFullVOs, originBills);
	}

	@Override
	public PGDVO[] unapprove(PGDVO[] clientFullVOs, PGDVO[] originBills)
			throws BusinessException {
		return super.pubunapprovebills(clientFullVOs, originBills);
	}

	
	//�ɹ��� ��ӡ�ɹ����ã�����VO
	@Override
	public PGDVO[] ClientBillToServer(PGDVO[] clientVOs)
			throws BusinessException {

		// ����ǰ�˴����Ĳ���VO������VOת��������BillTransTool�����ڳ�ʼ��ʱִ�С����� + ���ts���Ĺ���
		BillTransferTool<PGDVO> transferTool = new BillTransferTool<PGDVO>(
				clientVOs);
		// ��ת�����ߴ����ݿ��в�ѯ���޸�ǰ��VO
		PGDVO[] originBills = transferTool.getOriginBills();
		// ����updateBP
		AcePGD2UpdateBP bp = new AcePGD2UpdateBP();
		PGDVO[] retvos = bp.update(transferTool.getClientFullInfoBill(),
				originBills);
		// ���޸ĺ��VO���в�����㣬��ǰ̨���ر�����ֶ�
		return retvos;
	}

}
