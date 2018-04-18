package nc.impl.pub.ace;

import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglDeleteBP;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglInsertBP;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglUpdateBP;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglSendApproveBP;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglUnSendApproveBP;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglApproveBP;
import nc.bs.jxc_hr.ht01.htgl.ace.bp.AceHtglUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
		import nc.vo.plan.ht01.HTVO;
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

public abstract class AceHtglPubServiceImpl {
		    //����
    public HTVO[] pubinsertBills(HTVO[] clientFullVOs,HTVO[] originBills) throws BusinessException {
        try {
          // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
          BillTransferTool<HTVO> transferTool =new BillTransferTool<HTVO>(clientFullVOs);
          // ����BP
          AceHtglInsertBP action = new AceHtglInsertBP();
          HTVO[] retvos = action.insert(clientFullVOs);
          // ���췵������
          return transferTool.getBillForToClient(retvos);
        }catch (Exception e) {
          ExceptionUtils.marsh(e);
        }
        return null;
    }
    //ɾ��
				    public void pubdeleteBills(HTVO[] clientFullVOs,HTVO[] originBills) throws BusinessException {
				        try {
				          // ����BP
				          new AceHtglDeleteBP().delete(clientFullVOs);
				        } catch (Exception e) {
				          ExceptionUtils.marsh(e);
				        }
				    }
				    //�޸�
				    public HTVO				[] pubupdateBills(HTVO[] clientFullVOs,HTVO[] originBills) throws BusinessException {
				        try {
				          //���� + ���ts
				          BillTransferTool<HTVO				> transferTool =new BillTransferTool<HTVO>(clientFullVOs);
				          AceHtglUpdateBP bp = new AceHtglUpdateBP();
				          HTVO[] retvos = bp.update(clientFullVOs, originBills);
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
    sql.append("pk_ht_h");
    sql.append(processor.getFinalFromWhere());
    DataAccessUtils dao = new DataAccessUtils();
    IRowSet rowset = dao.query(sql.toString());
    String[] keys = rowset.toOneDimensionStringArray();
    return keys;
  }
  
  //��ҳ��ѯ����������PK�鵥��
  public HTVO[] pubquerybillbypkbills(String[] pks)
      throws BusinessException {
    HTVO[] bills = null;
    BillQuery<HTVO> query =
        new BillQuery<HTVO>(HTVO.class);
    bills = query.query(pks);
    return PaginationUtils.filterNotExistBills(bills, pks);
  }


		  //�ύ
				  public HTVO[] pubsendapprovebills(HTVO[] clientFullVOs,HTVO[] originBills) 
				      throws BusinessException {
				    AceHtglSendApproveBP bp = new AceHtglSendApproveBP();
				    HTVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //�ջ�
				  public HTVO[] pubunsendapprovebills(HTVO[] clientFullVOs,HTVO[] originBills) 
				      throws BusinessException {
				    AceHtglUnSendApproveBP bp = new AceHtglUnSendApproveBP();
				    HTVO[] retvos = bp.unSend(clientFullVOs, originBills);
				    return retvos;
				  };

  //����
				  public HTVO[] pubapprovebills(HTVO[] clientFullVOs,HTVO[] originBills) 
				      throws BusinessException {
				    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceHtglApproveBP bp = new AceHtglApproveBP();
				    HTVO[] retvos = bp.approve(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //����
				
				  public HTVO[] pubunapprovebills(HTVO[] clientFullVOs,HTVO[] originBills)
				      throws BusinessException {
    				for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceHtglUnApproveBP bp = new AceHtglUnApproveBP();
				    HTVO[] retvos = bp.unApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				
}