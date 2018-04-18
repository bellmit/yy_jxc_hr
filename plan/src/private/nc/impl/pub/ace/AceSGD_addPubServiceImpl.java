package nc.impl.pub.ace;

import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addDeleteBP;
import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addInsertBP;
import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addUpdateBP;
import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addSendApproveBP;
import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addUnSendApproveBP;
import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addApproveBP;
import nc.bs.jxc_hr.jx04.sgd_add.ace.bp.AceSGD_addUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
		import nc.vo.plan.jx04.SGDVO_ADD;
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

public abstract class AceSGD_addPubServiceImpl {
		    //����
    public SGDVO_ADD[] pubinsertBills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException {
        try {
          // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
          BillTransferTool<SGDVO_ADD> transferTool =new BillTransferTool<SGDVO_ADD>(clientFullVOs);
          // ����BP
          AceSGD_addInsertBP action = new AceSGD_addInsertBP();
          SGDVO_ADD[] retvos = action.insert(clientFullVOs);
          // ���췵������
          return transferTool.getBillForToClient(retvos);
        }catch (Exception e) {
          ExceptionUtils.marsh(e);
        }
        return null;
    }
    //ɾ��
				    public void pubdeleteBills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException {
				        try {
				          // ����BP
				          new AceSGD_addDeleteBP().delete(clientFullVOs);
				        } catch (Exception e) {
				          ExceptionUtils.marsh(e);
				        }
				    }
				    //�޸�
				    public SGDVO_ADD				[] pubupdateBills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException {
				        try {
				          //���� + ���ts
				          BillTransferTool<SGDVO_ADD				> transferTool =new BillTransferTool<SGDVO_ADD>(clientFullVOs);
				          AceSGD_addUpdateBP bp = new AceSGD_addUpdateBP();
				          SGDVO_ADD[] retvos = bp.update(clientFullVOs, originBills);
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
    sql.append("pk_sgd_add_h");
    sql.append(processor.getFinalFromWhere());
    DataAccessUtils dao = new DataAccessUtils();
    IRowSet rowset = dao.query(sql.toString());
    String[] keys = rowset.toOneDimensionStringArray();
    return keys;
  }
  
  //��ҳ��ѯ����������PK�鵥��
  public SGDVO_ADD[] pubquerybillbypkbills(String[] pks)
      throws BusinessException {
    SGDVO_ADD[] bills = null;
    BillQuery<SGDVO_ADD> query =
        new BillQuery<SGDVO_ADD>(SGDVO_ADD.class);
    bills = query.query(pks);
    return PaginationUtils.filterNotExistBills(bills, pks);
  }


		  //�ύ
				  public SGDVO_ADD[] pubsendapprovebills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) 
				      throws BusinessException {
				    AceSGD_addSendApproveBP bp = new AceSGD_addSendApproveBP();
				    SGDVO_ADD[] retvos = bp.sendApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //�ջ�
				  public SGDVO_ADD[] pubunsendapprovebills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) 
				      throws BusinessException {
				    AceSGD_addUnSendApproveBP bp = new AceSGD_addUnSendApproveBP();
				    SGDVO_ADD[] retvos = bp.unSend(clientFullVOs, originBills);
				    return retvos;
				  };

  //����
				  public SGDVO_ADD[] pubapprovebills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) 
				      throws BusinessException {
				    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceSGD_addApproveBP bp = new AceSGD_addApproveBP();
				    SGDVO_ADD[] retvos = bp.approve(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //����
				
				  public SGDVO_ADD[] pubunapprovebills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills)
				      throws BusinessException {
    				for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceSGD_addUnApproveBP bp = new AceSGD_addUnApproveBP();
				    SGDVO_ADD[] retvos = bp.unApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				
}