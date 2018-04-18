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
		    //新增
    public AggOrderEndVO[] pubinsertBills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException {
        try {
          // 数据库中数据和前台传递过来的差异VO合并后的结果
          BillTransferTool<AggOrderEndVO> transferTool =new BillTransferTool<AggOrderEndVO>(clientFullVOs);
          // 调用BP
          AceOrderendInsertBP action = new AceOrderendInsertBP();
          AggOrderEndVO[] retvos = action.insert(clientFullVOs);
          // 构造返回数据
          return transferTool.getBillForToClient(retvos);
        }catch (Exception e) {
          ExceptionUtils.marsh(e);
        }
        return null;
    }
    //删除
				    public void pubdeleteBills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException {
				        try {
				          // 调用BP
				          new AceOrderendDeleteBP().delete(clientFullVOs);
				        } catch (Exception e) {
				          ExceptionUtils.marsh(e);
				        }
				    }
				    //修改
				    public AggOrderEndVO				[] pubupdateBills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) throws BusinessException {
				        try {
				          //加锁 + 检查ts
				          BillTransferTool<AggOrderEndVO				> transferTool =new BillTransferTool<AggOrderEndVO>(clientFullVOs);
				          AceOrderendUpdateBP bp = new AceOrderendUpdateBP();
				          AggOrderEndVO[] retvos = bp.update(clientFullVOs, originBills);
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
    sql.append("pk_ordersheet");
    sql.append(processor.getFinalFromWhere());
    DataAccessUtils dao = new DataAccessUtils();
    IRowSet rowset = dao.query(sql.toString());
    String[] keys = rowset.toOneDimensionStringArray();
    return keys;
  }
  
  //分页查询方法，根据PK查单据
  public AggOrderEndVO[] pubquerybillbypkbills(String[] pks)
      throws BusinessException {
    AggOrderEndVO[] bills = null;
    BillQuery<AggOrderEndVO> query =
        new BillQuery<AggOrderEndVO>(AggOrderEndVO.class);
    bills = query.query(pks);
    return PaginationUtils.filterNotExistBills(bills, pks);
  }


		  //提交
				  public AggOrderEndVO[] pubsendapprovebills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) 
				      throws BusinessException {
				    AceOrderendSendApproveBP bp = new AceOrderendSendApproveBP();
				    AggOrderEndVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //收回
				  public AggOrderEndVO[] pubunsendapprovebills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) 
				      throws BusinessException {
				    AceOrderendUnSendApproveBP bp = new AceOrderendUnSendApproveBP();
				    AggOrderEndVO[] retvos = bp.unSend(clientFullVOs, originBills);
				    return retvos;
				  };

  //审批
				  public AggOrderEndVO[] pubapprovebills(AggOrderEndVO[] clientFullVOs,AggOrderEndVO[] originBills) 
				      throws BusinessException {
				    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceOrderendApproveBP bp = new AceOrderendApproveBP();
				    AggOrderEndVO[] retvos = bp.approve(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //弃审
				
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