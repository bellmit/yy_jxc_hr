package nc.bs.jxc_hr.jx15.sgd_exc.rule;

import java.util.Map;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.jxc_hr.jx01.ISGDMaintain;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

import org.jfree.util.StringUtils;
/**
 * @author zhangshjf
 * ʩ����ϵ����Э��ʱ����ǰУ�� ���ô��ڿ��ù�ʱ��
 */
public class JX15BeforeInsertOrUpdateRule implements IRule<SGDVO_EXC> {
	
	@Override
	public void process(SGDVO_EXC[] vos) {
		try {
		if(vos==null||vos.length==0){return;}
		SGDVO_EXC vo=vos[0];
		String pk_sgd_exc_h = vo.getParentVO().getPk_sgd_exc_h();
		String srcbillid_b = vo.getParentVO().getSrcbillid_b();//ʩ��������ID
		UFDouble exchours = vo.getParentVO().getExchours();//������Э�Ĺ�ʱ
		String [] sbids=new String[]{srcbillid_b};
		Map<String, UFDouble> queryActiveManHours = NCLocator.getInstance().lookup(ISGDMaintain.class).queryActiveManHours(sbids);
		if(pk_sgd_exc_h==null||pk_sgd_exc_h.toString().trim().equals("")){
			if(exchours.compareTo(queryActiveManHours.get(srcbillid_b))>0){
				throw new BusinessException("�������ݵĿ��ù�ʱ����!");
			}
		}else{
			BaseDAO baseDAO = new BaseDAO();
			Object res1=baseDAO.executeQuery("select nvl(exchours,0) from jxc_hr_sgd_exc_h where nvl(dr,0)=0 and srcbillid_b='"+srcbillid_b+"'", new ColumnProcessor());
			UFDouble res =  res1==null? UFDouble.ZERO_DBL: new UFDouble(res1.toString());
			if(res.add(queryActiveManHours.get(srcbillid_b)).compareTo(exchours)<0){
				throw new BusinessException("�޸ĵ��ݵĿ��ù�ʱ����!");
			}
		}
		} catch (BusinessException e) {
			e.printStackTrace();
			ExceptionUtils.wrappBusinessException("����ʧ�ܣ�"+e.getMessage());
		}
	}

}
