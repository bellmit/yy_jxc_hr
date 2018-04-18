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
		    //新增
    public BGDVO[] pubinsertBills(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException {
        try {
          // 数据库中数据和前台传递过来的差异VO合并后的结果
          BillTransferTool<BGDVO> transferTool =new BillTransferTool<BGDVO>(clientFullVOs);
          // 调用BP
          AceBGDInsertBP action = new AceBGDInsertBP();
          BGDVO[] retvos = action.insert(clientFullVOs);
          // 构造返回数据
          return transferTool.getBillForToClient(retvos);
        }catch (Exception e) {
          ExceptionUtils.marsh(e);
        }
        return null;
    }
    //删除
				    public void pubdeleteBills(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException {
				        try {
				          // 调用BP
				          new AceBGDDeleteBP().delete(clientFullVOs);
				        } catch (Exception e) {
				          ExceptionUtils.marsh(e);
				        }
				    }
				    //修改
				    public BGDVO				[] pubupdateBills(BGDVO[] clientFullVOs,BGDVO[] originBills) throws BusinessException {
				        try {
				          //加锁 + 检查ts
				          BillTransferTool<BGDVO				> transferTool =new BillTransferTool<BGDVO>(clientFullVOs);
				          AceBGDUpdateBP bp = new AceBGDUpdateBP();
				          BGDVO[] retvos = bp.update(clientFullVOs, originBills);
				          // 构造返回数据
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
   * 由子类实现，查询之前对queryScheme进行加工，加入自己的逻辑
   * 
   * @param queryScheme
   */
  protected void preQuery(IQueryScheme queryScheme) {
    // 查询之前对queryScheme进行加工，加入自己的逻辑
  }


		  //提交
				  public BGDVO[] pubsendapprovebills(BGDVO[] clientFullVOs,BGDVO[] originBills) 
				      throws BusinessException {
				    AceBGDSendApproveBP bp = new AceBGDSendApproveBP();
				    BGDVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //收回
				  public BGDVO[] pubunsendapprovebills(BGDVO[] clientFullVOs,BGDVO[] originBills) 
				      throws BusinessException {
				    AceBGDUnSendApproveBP bp = new AceBGDUnSendApproveBP();
				    BGDVO[] retvos = bp.unSend(clientFullVOs, originBills);
				    return retvos;
				  };

  //审批
				  public BGDVO[] pubapprovebills(BGDVO[] clientFullVOs,BGDVO[] originBills) 
				      throws BusinessException {
				    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceBGDApproveBP bp = new AceBGDApproveBP();
				    BGDVO[] retvos = bp.approve(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //弃审
				
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