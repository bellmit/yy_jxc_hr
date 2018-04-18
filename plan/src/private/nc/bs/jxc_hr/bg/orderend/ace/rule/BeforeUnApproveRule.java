/**
 * 
 */
package nc.bs.jxc_hr.bg.orderend.ace.rule;

import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.jxc_hr.ordersheet.AggOrderStartVO;
import nc.vo.jxc_hr.ordersheet.OrderStartSubVO;
import nc.vo.jxc_hr.ordersheet.OrderStartVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * @author zhangshj
 * @date 2017-2-26下午4:56:32
 * @description 
 */
public class BeforeUnApproveRule implements IRule<AggOrderStartVO> {

	/* （非 Javadoc）
	 * @see nc.impl.pubapp.pattern.rule.IRule#process(E[])
	 */
	@Override
	public void process(AggOrderStartVO[] vos) {
		if(vos == null || vos.length == 0){
			return ;
		}
		OrderStartVO vo=vos[0].getParentVO();
		if(vo==null){
			ExceptionUtils.wrappBusinessException("获取的Aggvo为空！");
		}
		String sqlpk=getbvopk((OrderStartSubVO[])vos[0].getChildrenVO());
		IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
		String sql="select pk_defdoc from bd_defdoc where nvl(dr,0)=0 and pk_defdoc in ("+sqlpk+")";
		Object res=null;
		try {
			res=ibs.executeQuery(sql, new ColumnProcessor());
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException("查询数据库异常！");
			e.printStackTrace();
		}
		if(res!=null){
			ExceptionUtils.wrappBusinessException("该单据审批通过后已生成工令自定义档案，请先删除工令自定义档案后再取消审批！");
		}
	}

	/**
	 * TODO
	 * @param childrenVO
	 * @return
	 * 
	 */
	private String getbvopk(OrderStartSubVO[] bvos) {
		String sqlpk=" '";
		for(int i=0;i<bvos.length;i++){
			if(i==bvos.length-1){
				sqlpk=sqlpk+bvos[i].getPk_ordersub()+"'";
			}
			else{
				sqlpk=sqlpk+bvos[i].getPk_ordersub()+"','";
			}
			
		}
		return sqlpk;
	}

}
