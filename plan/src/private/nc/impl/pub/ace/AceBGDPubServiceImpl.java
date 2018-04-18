package nc.impl.pub.ace;

import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDDeleteBP;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDInsertBP;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDUpdateBP;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDSendApproveBP;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDUnSendApproveBP;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDApproveBP;
import nc.bs.jxc_hr.jx06.bgd.ace.bp.AceBGDUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
		import nc.vo.plan.jx06.BGDVO;
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

public abstract class AceBGDPubServiceImpl {
		    //����
    public BGDVO[] pubinsertBills(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException {
        try {
          // ���ݿ������ݺ�ǰ̨���ݹ����Ĳ���VO�ϲ���Ľ��
          BillTransferTool<BGDVO> transferTool =new BillTransferTool<BGDVO>(clientFullVOs);
          // ����BP
          AceBGDInsertBP action = new AceBGDInsertBP();
          BGDVO[] retvos = action.insert(clientFullVOs);
          // ���췵������
          return transferTool.getBillForToClient(retvos);
        }catch (Exception e) {
          ExceptionUtils.marsh(e);
        }
        return null;
    }
    //ɾ��
				    public void pubdeleteBills(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException {
				        try {
				          // ����BP
				          new AceBGDDeleteBP().delete(clientFullVOs);
				        } catch (Exception e) {
				          ExceptionUtils.marsh(e);
				        }
				    }
				    //�޸�
				    public BGDVO				[] pubupdateBills(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException {
				        try {
				          //���� + ���ts
				          BillTransferTool<BGDVO				> transferTool =new BillTransferTool<BGDVO>(clientFullVOs);
				          AceBGDUpdateBP bp = new AceBGDUpdateBP();
				          BGDVO[] retvos = bp.update(clientFullVOs, originBills);
				          // ���췵������
				          return transferTool.getBillForToClient(retvos);
				        }catch (Exception e) {
				          ExceptionUtils.marsh(e);
        }
				          return null;
  				  }


  public BGDVO[] pubquerybills(IQueryScheme queryScheme)
      throws BusinessException {
    BGDVO[] bills = null;
    try {
      this.preQuery(queryScheme);
      BillLazyQuery<BGDVO> query =
          new BillLazyQuery<BGDVO>(BGDVO.class);
      bills = query.query(queryScheme, null);
    }
    catch (Exception e) {
      ExceptionUtils.marsh(e);
    }
    return bills;
  }

	  /**
   * ������ʵ�֣���ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
   * 
   * @param queryScheme
   */
  protected void preQuery(IQueryScheme queryScheme) {
    // ��ѯ֮ǰ��queryScheme���мӹ��������Լ����߼�
  }


		  //�ύ
				  public BGDVO[] pubsendapprovebills(BGDVO[] clientFullVOs,BGDVO[] originBills) 
				      throws BusinessException {
				    AceBGDSendApproveBP bp = new AceBGDSendApproveBP();
				    BGDVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //�ջ�
				  public BGDVO[] pubunsendapprovebills(BGDVO[] clientFullVOs,BGDVO[] originBills) 
				      throws BusinessException {
				    AceBGDUnSendApproveBP bp = new AceBGDUnSendApproveBP();
				    BGDVO[] retvos = bp.unSend(clientFullVOs, originBills);
				    return retvos;
				  };

  //����
				  public BGDVO[] pubapprovebills(BGDVO[] clientFullVOs,BGDVO[] originBills) 
				      throws BusinessException {
				    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceBGDApproveBP bp = new AceBGDApproveBP();
				    BGDVO[] retvos = bp.approve(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //����
				
				  public BGDVO[] pubunapprovebills(BGDVO[] clientFullVOs,BGDVO[] originBills)
				      throws BusinessException {
    				for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceBGDUnApproveBP bp = new AceBGDUnApproveBP();
				    BGDVO[] retvos = bp.unApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				
}