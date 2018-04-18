package nc.bs.jxc_hr.jx04.sgd_exc.rule;

import java.util.ArrayList;

import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.rule.IRule;
import nc.itf.uap.pf.IPfExchangeService;
import nc.itf.uap.pf.busiflow.PfButtonClickContext;
import nc.vo.fipub.utils.BillcodeGenerater;
import nc.vo.plan.jx02.PGDHVO;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.plan.jx04.SGDBVO_ADD;
import nc.vo.plan.jx04.SGDHVO_ADD;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.ValidationException;
import nc.vo.pubapp.AppContext;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class JX04AfterApproveRule implements IRule<SGDVO_ADD> {

	@Override
	public void process(SGDVO_ADD[] vos) {
		if (vos == null || vos.length == 0) {
			return;
		}
		Object as = vos[0].getParentVO().getApprovestatus();
		if (as != null) {
			// JX15单据审核通过后在派工卡中新增三条记录、同时要去更新原来的施工单的表体部门工种对应的工时
			if (Integer.parseInt(as.toString()) == 1) {
				try {

					SGDBVO_ADD[] bvos = (SGDBVO_ADD[]) vos[0].getChildrenVO();
					// ArrayList<PGDHVO>
					// listvo=changevo01(bvos,vos[0].getParentVO());
					// if (listvo != null && listvo.size() >= 1) {
					// PGDHVO[] pgdhvo = listvo.toArray(new
					// PGDHVO[listvo.size()]);
					// BaseDAO bd=new BaseDAO();
					// bd.insertVOArray(pgdhvo);
					// }

					String pk_group = vos[0].getParentVO().getPk_group() == null ? AppContext
							.getInstance().getPkGroup() : vos[0].getParentVO()
							.getPk_group();
					String pk_org = vos[0].getParentVO().getPk_org() == null ? "GLOBLE00000000000000"
							: vos[0].getParentVO().getPk_org();
					// 拆分开始#把原aggvo的数量拆分成和表体数量一样多
					SGDVO_ADD[] newvos = new SGDVO_ADD[bvos.length];
					for (int i = 0; i < bvos.length; i++) {
						newvos[i] = new SGDVO_ADD();
						newvos[i].setParentVO(vos[0].getParentVO());
						SGDBVO_ADD[] newbvos = new SGDBVO_ADD[1];
						newbvos[0] = bvos[i];
						newvos[i].setChildrenVO(newbvos);
					}
					// 拆分结束#
					PGDVO[] pgdvo = (PGDVO[]) excchangVO(newvos);
					ArrayList<PGDHVO> listhvo = new ArrayList<PGDHVO>();
					for (int i = 0; i < pgdvo.length; i++) {
						// pgdvo[i].getParentVO().setDr(0);
						pgdvo[i].getParentVO().setBillno(
								new BillcodeGenerater().getBillCode("JX02",
										pk_group, pk_org, null, null));
						pgdvo[i].getParentVO().setBilldate(
								AppContext.getInstance().getBusiDate());
						listhvo.add(pgdvo[i].getParentVO());
					}
					BaseDAO bd = new BaseDAO();
					bd.insertVOArray(listhvo.toArray(new PGDHVO[listhvo.size()]));
				} catch (Exception e) {
					e.printStackTrace();
					ExceptionUtils.wrappBusinessException(e.getMessage());
				}
			}
		}

	}

	private AggregatedValueObject[] excchangVO(SGDVO_ADD[] vos)
			throws BusinessException {
		IPfExchangeService pfExchangeService = NCLocator.getInstance().lookup(
				IPfExchangeService.class);
		AggregatedValueObject[] destVos = pfExchangeService
				.runChangeDataAryNeedClassify("JX04", "JX02", vos, null,
						PfButtonClickContext.NoClassify);
		return destVos;
	}

	private ArrayList<PGDHVO> changevo01(SGDBVO_ADD[] bvos, SGDHVO_ADD hvo)
			throws ValidationException, BusinessException {
		String srchid = hvo.getPk_sgd_add_h();// 来源单据表头主键
		String pk_group = hvo.getPk_group() == null ? AppContext.getInstance()
				.getPkGroup() : hvo.getPk_group();
		String pk_org = hvo.getPk_org() == null ? "GLOBLE00000000000000" : hvo
				.getPk_org();
		String pk_org_v = hvo.getPk_org_v() == null ? "~" : hvo.getPk_org_v();
		ArrayList<PGDHVO> listvo = new ArrayList<PGDHVO>();
		for (int i = 0; i < bvos.length; i++) {
			PGDHVO phvo = new PGDHVO();
			String billno = new BillcodeGenerater().getBillCode("JX02",
					pk_group, pk_org, null, null);
			phvo.setPk_group(pk_group);// 集团
			phvo.setPk_org(pk_org);// 组织
			phvo.setPk_org_v(pk_org_v);// 组织多版本
			phvo.setApprovestatus(-1);// 审批状态
			phvo.setBilltype("JX02");// 派工单单据类型
			phvo.setSrcbilltype("JX04");// 施工增补单
			phvo.setSrcbillid(srchid);// 来源单据id
			phvo.setAttributeValue("approvestatus", -1);// 审批状态
			phvo.setBilldate(AppContext.getInstance().getBusiDate());
			phvo.setBillno(billno);
			// phvo.setDr(0);
			listvo.add(phvo);
		}
		return listvo;
	}

}
