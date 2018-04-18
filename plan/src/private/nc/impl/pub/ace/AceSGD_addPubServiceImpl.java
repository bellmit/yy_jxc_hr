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
		    //新增
    public SGDVO_ADD[] pubinsertBills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException {
        try {
          // 数据库中数据和前台传递过来的差异VO合并后的结果
          BillTransferTool<SGDVO_ADD> transferTool =new BillTransferTool<SGDVO_ADD>(clientFullVOs);
          // 调用BP
          AceSGD_addInsertBP action = new AceSGD_addInsertBP();
          SGDVO_ADD[] retvos = action.insert(clientFullVOs);
          // 构造返回数据
          return transferTool.getBillForToClient(retvos);
        }catch (Exception e) {
          ExceptionUtils.marsh(e);
        }
        return null;
    }
    //删除
				    public void pubdeleteBills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException {
				        try {
				          // 调用BP
				          new AceSGD_addDeleteBP().delete(clientFullVOs);
				        } catch (Exception e) {
				          ExceptionUtils.marsh(e);
				        }
				    }
				    //修改
				    public SGDVO_ADD				[] pubupdateBills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) throws BusinessException {
				        try {
				          //加锁 + 检查ts
				          BillTransferTool<SGDVO_ADD				> transferTool =new BillTransferTool<SGDVO_ADD>(clientFullVOs);
				          AceSGD_addUpdateBP bp = new AceSGD_addUpdateBP();
				          SGDVO_ADD[] retvos = bp.update(clientFullVOs, originBills);
				          // 构造返回数据
				          return transferTool.getBillForToClient(retvos);
				        }catch (Exception e) {
				          ExceptionUtils.marsh(e);
        }
				          return null;
  				  }


  //分页查询方法，查询所有PK
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
  
  //分页查询方法，根据PK查单据
  public SGDVO_ADD[] pubquerybillbypkbills(String[] pks)
      throws BusinessException {
    SGDVO_ADD[] bills = null;
    BillQuery<SGDVO_ADD> query =
        new BillQuery<SGDVO_ADD>(SGDVO_ADD.class);
    bills = query.query(pks);
    return PaginationUtils.filterNotExistBills(bills, pks);
  }


		  //提交
				  public SGDVO_ADD[] pubsendapprovebills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) 
				      throws BusinessException {
				    AceSGD_addSendApproveBP bp = new AceSGD_addSendApproveBP();
				    SGDVO_ADD[] retvos = bp.sendApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //收回
				  public SGDVO_ADD[] pubunsendapprovebills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) 
				      throws BusinessException {
				    AceSGD_addUnSendApproveBP bp = new AceSGD_addUnSendApproveBP();
				    SGDVO_ADD[] retvos = bp.unSend(clientFullVOs, originBills);
				    return retvos;
				  };

  //审批
				  public SGDVO_ADD[] pubapprovebills(SGDVO_ADD[] clientFullVOs,SGDVO_ADD[] originBills) 
				      throws BusinessException {
				    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceSGD_addApproveBP bp = new AceSGD_addApproveBP();
				    SGDVO_ADD[] retvos = bp.approve(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //弃审
				
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