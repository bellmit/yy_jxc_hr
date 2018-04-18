package nc.impl.pub.ace;

import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendDeleteBP;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendInsertBP;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendUpdateBP;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendSendApproveBP;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendUnSendApproveBP;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendApproveBP;
import nc.bs.jxc_hr.jx08.orderend.ace.bp.AceOrderendUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
		import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
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

public abstract class AceOrderendPubServiceImpl {
		    //����
    public AggOrderEndVO[] pubinsertBills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException {
        try {
          // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
          BillTransferTool<AggOrderEndVO> transferTool =new BillTransferTool<AggOrderEndVO>(clientFullVOs);
          // ����BP
          AceOrderendInsertBP action = new AceOrderendInsertBP();
          AggOrderEndVO[] retvos = action.insert(clientFullVOs);
          // ���췵������
          return transferTool.getBillForToClient(retvos);
        }catch (Exception e) {
          ExceptionUtils.marsh(e);
        }
        return null;
    }
    //ɾ��
				    public void pubdeleteBills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException {
				        try {
				          // ����BP
				          new AceOrderendDeleteBP().delete(clientFullVOs);
				        } catch (Exception e) {
				          ExceptionUtils.marsh(e);
				        }
				    }
				    //�޸�
				    public AggOrderEndVO				[] pubupdateBills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException {
				        try {
				          //���� + ���ts
				          BillTransferTool<AggOrderEndVO				> transferTool =new BillTransferTool<AggOrderEndVO>(clientFullVOs);
				          AceOrderendUpdateBP bp = new AceOrderendUpdateBP();
				          AggOrderEndVO[] retvos = bp.update(clientFullVOs, originBills);
				          // ���췵������
				          return transferTool.getBillForToClient(retvos);
				        }catch (Exception e) {
				          ExceptionUtils.marsh(e);
        }
				          return null;
  				  }


  //��ҳ��ѯ��������ѯ����PK
  public String[] pubquerypkbills(IQueryScheme queryScheme)
      throws BusinessException {
    // String beanId=(String) queryScheme.get(QueryConstants.BEAN_ID);
    StringBuffer sql = new StringBuffer();
    QuerySchemeProcessor processor = new QuerySchemeProcessor(queryScheme);
    String mainAlias = processor.getMainTableAlias();
    sql.append(" select distinct ");
    sql.append(mainAlias);
    sql.append(".");
    sql.append("pk_ordersheet");
    sql.append(processor.getFinalFromWhere());
    DataAccessUtils dao = new DataAccessUtils();
    IRowSet rowset = dao.query(sql.toString());
    String[] keys = rowset.toOneDimensionStringArray();
    return keys;
  }
  
  //��ҳ��ѯ����������PK�鵥��
  public AggOrderEndVO[] pubquerybillbypkbills(String[] pks)
      throws BusinessException {
    AggOrderEndVO[] bills = null;
    BillQuery<AggOrderEndVO> query =
        new BillQuery<AggOrderEndVO>(AggOrderEndVO.class);
    bills = query.query(pks);
    return PaginationUtils.filterNotExistBills(bills, pks);
  }


		  //�ύ
				  public AggOrderEndVO[] pubsendapprovebills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) 
				      throws BusinessException {
				    AceOrderendSendApproveBP bp = new AceOrderendSendApproveBP();
				    AggOrderEndVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //�ջ�
				  public AggOrderEndVO[] pubunsendapprovebills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) 
				      throws BusinessException {
				    AceOrderendUnSendApproveBP bp = new AceOrderendUnSendApproveBP();
				    AggOrderEndVO[] retvos = bp.unSend(clientFullVOs, originBills);
				    return retvos;
				  };

  //����
				  public AggOrderEndVO[] pubapprovebills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) 
				      throws BusinessException {
				    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceOrderendApproveBP bp = new AceOrderendApproveBP();
				    AggOrderEndVO[] retvos = bp.approve(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //����
				
				  public AggOrderEndVO[] pubunapprovebills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills)
				      throws BusinessException {
    				for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceOrderendUnApproveBP bp = new AceOrderendUnApproveBP();
				    AggOrderEndVO[] retvos = bp.unApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				
}