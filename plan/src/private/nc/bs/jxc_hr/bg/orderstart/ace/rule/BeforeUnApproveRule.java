/**
 * 
 */
package nc.bs.jxc_hr.bg.orderstart.ace.rule;

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
 * @date 2017-2-26����4:56:32
 * @description 
 */
public class BeforeUnApproveRule implements IRule<AggOrderStartVO> {

	/* ���� Javadoc��
	 * @see nc.impl.pubapp.pattern.rule.IRule#process(E[])
	 */
	@Override
	public void process(AggOrderStartVO[] vos) {
		if(vos == null || vos.length == 0){
			return ;
		}
		OrderStartVO vo=vos[0].getParentVO();
		if(vo==null){
			ExceptionUtils.wrappBusinessException("��ȡ��AggvoΪ�գ�");
		}
		String sqlpk=getbvopk((OrderStartSubVO[])vos[0].getChildrenVO());
		IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
		String sql="select pk_defdoc from bd_defdoc where nvl(dr,0)=0 and pk_defdoc in ("+sqlpk+")";
		String sql2="select pk_ordersub from jxc_hr_orderendsub where nvl(dr,0)=0 and srcbillbid in ("+sqlpk+")";	//add	xiashsh	2017-06-01
		Object res=null;
		Object res2=null;
		try {
			res=ibs.executeQuery(sql, new ColumnProcessor());
			res2=ibs.executeQuery(sql2, new ColumnProcessor());	//add	xiashsh	2017-06-01
		} catch (BusinessException e) {
			ExceptionUtils.wrappBusinessException("��ѯ���ݿ��쳣��");
			e.printStackTrace();
		}
		//add	xiashsh	2017-06-01
		if (res2!=null) {
			ExceptionUtils.wrappBusinessException("�õ������������ε��� �����깤���뵥������ɾ�������깤���뵥����ȡ��������");
		}
		if(res!=null){
			ExceptionUtils.wrappBusinessException("�õ�������ͨ���������ɹ����Զ��嵵��������ɾ�������Զ��嵵������ȡ��������");
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
