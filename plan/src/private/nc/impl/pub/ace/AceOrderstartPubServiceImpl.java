package nc.impl.pub.ace;

import nc.bs.jxc_hr.jx07.orderstart.ace.bp.AceOrderstartDeleteBP;
import nc.bs.jxc_hr.jx07.orderstart.ace.bp.AceOrderstartInsertBP;
import nc.bs.jxc_hr.jx07.orderstart.ace.bp.AceOrderstartUpdateBP;
import nc.bs.jxc_hr.jx07.orderstart.ace.bp.AceOrderstartSendApproveBP;
import nc.bs.jxc_hr.jx07.orderstart.ace.bp.AceOrderstartUnSendApproveBP;
import nc.bs.jxc_hr.jx07.orderstart.ace.bp.AceOrderstartApproveBP;
import nc.bs.jxc_hr.jx07.orderstart.ace.bp.AceOrderstartUnApproveBP;
import nc.impl.pubapp.pattern.data.bill.tool.BillTransferTool;
		import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
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

public abstract class AceOrderstartPubServiceImpl {
		    //新增
    public AggOrderStartVO[] pubinsertBills(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) throws BusinessException {
        try {
          // 数据库中数据和前台传递过来的差异VO合并后的结果
          BillTransferTool<AggOrderStartVO> transferTool =new BillTransferTool<AggOrderStartVO>(clientFullVOs);
          // 调用BP
          AceOrderstartInsertBP action = new AceOrderstartInsertBP();
          AggOrderStartVO[] retvos = action.insert(clientFullVOs);
          // 构造返回数据
          return transferTool.getBillForToClient(retvos);
        }catch (Exception e) {
          ExceptionUtils.marsh(e);
        }
        return null;
    }
    //删除
				    public void pubdeleteBills(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) throws BusinessException {
				        try {
				          // 调用BP
				          new AceOrderstartDeleteBP().delete(clientFullVOs);
				        } catch (Exception e) {
				          ExceptionUtils.marsh(e);
				        }
				    }
				    //修改
				    public AggOrderStartVO				[] pubupdateBills(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) throws BusinessException {
				        try {
				          //加锁 + 检查ts
				          BillTransferTool<AggOrderStartVO				> transferTool =new BillTransferTool<AggOrderStartVO>(clientFullVOs);
				          AceOrderstartUpdateBP bp = new AceOrderstartUpdateBP();
				          AggOrderStartVO[] retvos = bp.update(clientFullVOs, originBills);
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
  public AggOrderStartVO[] pubquerybillbypkbills(String[] pks)
      throws BusinessException {
    AggOrderStartVO[] bills = null;
    BillQuery<AggOrderStartVO> query =
        new BillQuery<AggOrderStartVO>(AggOrderStartVO.class);
    bills = query.query(pks);
    return PaginationUtils.filterNotExistBills(bills, pks);
  }


		  //提交
				  public AggOrderStartVO[] pubsendapprovebills(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) 
				      throws BusinessException {
				    AceOrderstartSendApproveBP bp = new AceOrderstartSendApproveBP();
				    AggOrderStartVO[] retvos = bp.sendApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //收回
				  public AggOrderStartVO[] pubunsendapprovebills(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) 
				      throws BusinessException {
				    AceOrderstartUnSendApproveBP bp = new AceOrderstartUnSendApproveBP();
				    AggOrderStartVO[] retvos = bp.unSend(clientFullVOs, originBills);
				    return retvos;
				  };

  //审批
				  public AggOrderStartVO[] pubapprovebills(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills) 
				      throws BusinessException {
				    for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceOrderstartApproveBP bp = new AceOrderstartApproveBP();
				    AggOrderStartVO[] retvos = bp.approve(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				  //弃审
				
				  public AggOrderStartVO[] pubunapprovebills(AggOrderStartVO[] clientFullVOs,AggOrderStartVO[] originBills)
				      throws BusinessException {
    				for (int i = 0; clientFullVOs != null && i < clientFullVOs.length; i++) {
				      clientFullVOs[i].getParentVO().setStatus(VOStatus.UPDATED);
				    }
				    AceOrderstartUnApproveBP bp = new AceOrderstartUnApproveBP();
				    AggOrderStartVO[] retvos = bp.unApprove(clientFullVOs, originBills);
				    return retvos;
				  }
				  
				
}