package nc.impl.pub.ace;

import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excDeleteBP;
import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excInsertBP;
import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excUpdateBP;
import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excSendApproveBP;
import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excUnSendApproveBP;
import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excApproveBP;
import nc.bs.jxc_hr.jx15.sgd_exc.ace.bp.AceSGD_excUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
		import nc.vo.plan.jx15.SGDVO_EXC;
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

public abstract class AceSGD_excPubServiceImpl {
		    //����
    public SGDVO_EXC[] pubinsertBills(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) throws BusinessException {
        try {
          // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
          BillTransferTool<SGDVO_EXC> transferTool =new BillTransferTool<SGDVO_EXC>(clientFullVOs);
          // ����BP
          AceSGD_excInsertBP action = new AceSGD_excInsertBP();
          SGDVO_EXC[] retvos = action.insert(clientFullVOs);
          // ���췵������
          return transferTool.getBillForToClient(retvos);
        }catch (Exception e) {
          ExceptionUtils.marsh(e);
        }
        return null;
    }
    //ɾ��
				    public void pubdeleteBills(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) throws BusinessException {
				        try {
				          // ����BP
				          new AceSGD_excDeleteBP().delete(clientFullVOs);
				        } catch (Exception e) {
				          ExceptionUtils.marsh(e);
				        }
				    }
				    //�޸�
				    public SGDVO_EXC				[] pubupdateBills(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) throws BusinessException {
				        try {
				          //���� + ���ts
				          BillTransferTool<SGDVO_EXC				> transferTool =new BillTransferTool<SGDVO_EXC>(clientFullVOs);
				          AceSGD_excUpdateBP bp = new AceSGD_excUpdateBP();
				          SGDVO_EXC[] retvos = bp.update(clientFullVOs, originBills);
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
    sql.append("pk_sgd_exc_h");
    sql.append(processor.getFinalFromWhere());
    DataAccessUtils dao = new DataAccessUtils();
    IRowSet rowset = dao.query(sql.toString());
    String[] keys = rowset.toOneDimensionStringArray();
    return keys;
  }
  
  //��ҳ��ѯ����������PK�鵥��
  public SGDVO_EXC[] pubquerybillbypkbills(String[] pks)
      throws BusinessException {
    SGDVO_EXC[] bills = null;
    BillQuery<SGDVO_EXC> query =
        new BillQuery<SGDVO_EXC>(SGDVO_EXC.class);
    bills = query.query(pks);
    return PaginationUtils.filterNotExistBills(bills, pks);
  }


		  //�ύ
				  public SGDVO_EXC[] pubsendapprovebills(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) 
				      throws BusinessException {
				    AceSGD_excSendApproveBP bp = new AceSGD_excSendApproveBP();
				    SGDVO_EXC[] retvos = bp.sendApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //�ջ�
				  public SGDVO_EXC[] pubunsendapprovebills(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) 
				      throws BusinessException {
				    AceSGD_excUnSendApproveBP bp = new AceSGD_excUnSendApproveBP();
				    SGDVO_EXC[] retvos = bp.unSend(clientFullVOs, originBills);
				    return retvos;
				  };

  //����
				  public SGDVO_EXC[] pubapprovebills(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills) 
				      throws BusinessException {
				    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceSGD_excApproveBP bp = new AceSGD_excApproveBP();
				    SGDVO_EXC[] retvos = bp.approve(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //����
				
				  public SGDVO_EXC[] pubunapprovebills(SGDVO_EXC[] clientFullVOs,SGDVO_EXC[] originBills)
				      throws BusinessException {
    				for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceSGD_excUnApproveBP bp = new AceSGD_excUnApproveBP();
				    SGDVO_EXC[] retvos = bp.unApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				
}