/**
 * 
 */
package nc.bs.jxc_hr.bg.orderend.ace.rule;

import java.util.ArrayList;

import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;
import nc.vo.jxc_hr.ordersheet.OrderEndVO;
import nc.vo.bd.defdoc.DefdocVO;
import nc.vo.jxc_hr.ordersheet.OrderEndSubVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;


/**
 * @author zhangshj
 * @date 2017-2-26上午11:22:04
 * @description 
 */
public class StopGLdefdocRule implements IRule<AggOrderEndVO> {

	/* （非 Javadoc）
	 * @see nc.impl.pubapp.pattern.rule.IRule#process(E[])
	 */
	@Override
	public void process(AggOrderEndVO[] vos) {
		if(vos == null || vos.length == 0){
			return ;
		}
		OrderEndVO vo=vos[0].getParentVO();
		if(vo==null){
			ExceptionUtils.wrappBusinessException("获取的Aggvo为空，回写工令自定义档案失败！");
		}
		if(vo.getApprove_state()==1){
			OrderEndSubVO[] bvos=(OrderEndSubVO[])vos[0].getChildrenVO();
			bvos[0].getGl();
			BaseDAO bd = new BaseDAO();
			String sql="update bd_defdoc set enablestate=3 where nvl(dr,0)=0 and pk_defdoc='"+bvos[0].getGl()+"'";
			try {
				bd.executeUpdate(sql);
			} catch (DAOException e) {
				ExceptionUtils.wrappBusinessException("回写工令自定义档案时更新数据异常！");
				e.printStackTrace();
			}
			
		}
		
	}
}
