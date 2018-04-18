package nc.bs.jxc_hr.jx02.pgd2.rule;

import java.util.HashMap;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.jxc_hr.jx01.ISGDMaintain;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.plan.jx02.PGDBVO01;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class CheckGSBeforeInsertOrUpdate implements IRule<PGDVO> {

	@Override
	public void process(PGDVO[] vos) {
		if(vos == null || vos.length == 0||vos[0].getParentVO().getBilltype().equals("JX02-Cxx-02")){
			return ;
		}
		try {
			PGDVO vo = vos[0];
			String[] sgd_bids = new String[] { vo.getParentVO()
					.getSrcbillbodyid() == null ? "" : vo.getParentVO()
					.getSrcbillbodyid() };
			if (sgd_bids == null || sgd_bids.length == 0
					|| sgd_bids[0].equals("")) {
				throw new BusinessException("��Դ��������Ϊ�գ�");
			}
			PGDBVO01[] bvos = (PGDBVO01[]) vo.getChildren(PGDBVO01.class);
			if (bvos.length != 1) {
				throw new BusinessException("�ɹ��������߱�����������һ�У�");
			}
			// �ͻ��˵Ĺ�ʱ=����Ĺ�ʱ+�����������ʱ

			UFDouble qwertyui = UFDouble.ZERO_DBL;
			UFDouble addgs = bvos[0].getAddgs() == null ? UFDouble.ZERO_DBL
					: bvos[0].getAddgs();// ������ʱ
			UFDouble gs = bvos[0].getZgs() == null ? UFDouble.ZERO_DBL
					: bvos[0].getZgs();// �ܹ�ʱ
			ISGDMaintain isgd = NCLocator.getInstance().lookup(
					ISGDMaintain.class);
			Map<String, UFDouble> resMap = isgd.queryActiveManHours(sgd_bids);
			if (gs.compareTo(new UFDouble(0))==0) {
				throw new BusinessException("��ʱ����Ϊ  0!");
			}
			// ������������棬ֱ��ȡ�����ϵĹ�ʱ֮�Ͳ��ܴ��ڿ��ù�ʱ
			if (vo.getParentVO().getPk_pgk_h() == null) {
				qwertyui = addgs.add(gs);
			}
			// ������޸ı��棬��ȥ��ѯ���ݿ�Ĺ�ʱ֮�ͣ���ȡ�����ϵĹ�ʱ֮�Ͳ��ܴ��ڿ��ù�ʱ���ϲ�ѯ�Ĺ�ʱ
			else {
				BaseDAO bd = new BaseDAO();
				Object executeQuery = bd
						.executeQuery(
								"select (nvl(zgs,0)+nvl(addgs,0))as resgs from jxc_hr_pgk_czz where nvl(dr,0)=0 and pk_pgk_h='"
										+ vo.getParentVO().getPk_pgk_h() + "'",
								new ColumnProcessor());
				UFDouble resGS = executeQuery == null ? UFDouble.ZERO_DBL
						: new UFDouble(executeQuery.toString());
				qwertyui = addgs.add(gs).sub(resGS);

			}

			if (resMap.get(sgd_bids[0]).compareTo(qwertyui) < 0) {// ���ù�ʱ�ȼ����ɹ��Ĺ�ʱ
				throw new BusinessException("�ɹ�����ʱ->" + addgs.add(gs)
						+ " ���ù�ʱ->" + resMap.get(sgd_bids[0]));
			}
		} catch (Exception e) {
			e.printStackTrace();

			ExceptionUtils.wrappBusinessException("����ʧ�ܣ�" + e.getMessage());

		}
	}
}
