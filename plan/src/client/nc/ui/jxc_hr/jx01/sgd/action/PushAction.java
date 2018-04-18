package nc.ui.jxc_hr.jx01.sgd.action;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nc.a.tools.all.MyTransfer;
import nc.bs.framework.common.NCLocator;
import nc.desktop.ui.WorkbenchEnvironment;
import nc.funcnode.ui.FuncletInitData;
import nc.itf.jxc_hr.jx01.ISGDMaintain;
import nc.itf.jxc_hr.tools.IGetDeptMap;
import nc.itf.uap.IUAPQueryBS;
import nc.itf.uap.pf.IPfExchangeService;
import nc.itf.uap.pf.busiflow.PfButtonClickContext;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.jdbc.framework.processor.MapProcessor;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pubapp.uif2app.ToftPanelAdaptorEx;
import nc.ui.pubapp.uif2app.actions.pflow.ScriptPFlowAction;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uap.sf.SFClientUtil;
import nc.vo.fipub.utils.BillcodeGenerater;
import nc.vo.plan.jx01.SGDBVO;
import nc.vo.plan.jx01.SGDHVO;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.plan.jx02.PGDHVO;
import nc.vo.plan.jx02.PGDVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.AppContext;

@SuppressWarnings("serial")
public class PushAction extends ScriptPFlowAction {
	private ShowUpableBillListView listview;

	public ShowUpableBillListView getListview() {
		return listview;
	}

	public void setListview(ShowUpableBillListView listview) {
		this.listview = listview;
	}

	public PushAction() {
		super();
		setBtnName("�����ɹ���");
		setCode("pushPGD");
	}

	@Override
	public void doAction(ActionEvent arg0) throws Exception {
		Object[] srcVos = this.model.getSelectedOperaDatas();
		if (srcVos == null || srcVos.length == 0) {
			return;
		}
		// ��ֻ����ѡ��һ�б�ͷ
		if (srcVos.length > 1) {
			MessageDialog.showWarningDlg(null, "����", "�������ѡ��");
			return;
		}
		SGDVO[] vos = new SGDVO[srcVos.length];
		for (int i = 0; i < srcVos.length; i++) {
			vos[i] = (SGDVO) srcVos[i];
		}
		try {
			int brow = listview.getBillListPanel().getBodyTable()
					.getSelectedRow();
			SGDBVO bvo = (SGDBVO) listview.getBillListPanel()
					.getBodyBillModel()
					.getBodyValueRowVO(brow, SGDBVO.class.getName());
			// ��鹤ʱ�Ƿ���ʣ��,����ʣ�๤ʱ��
			// ע��֮ǰ�Ĺ�ʱУ�� altre xiashsh 2017-05-25
			UFDouble surplushours = checkGsIsHaving(bvo);
			// if (surplushours.compareTo(new UFDouble("0"))<=0) {
			// throw new BusinessException("��ǰ��ѡ���ֵĹ�ʱ�ѱ��ɷ��꣡");
			// }
			
			//�ж��Ƿ�����	add xiashsh 2017-06-01
			if (((SGDVO) srcVos[0]).getParentVO().getApprovestatus()!=1) {
				MessageDialog.showWarningDlg(null, "����", "����δ������");
				return;
			}

			// У�鵱ǰ��¼��Ա�Ƿ����ڸò��� add xiashsh 2017-05-27=============
			String dept = bvo.getPk_dept();
			String user = AppContext.getInstance().getPkUser();
			Map<String, ArrayList<String>> map = NCLocator.getInstance()
					.lookup(IGetDeptMap.class).getdept(dept, "UP");
			String sql = "select t.pk_dept from bd_psnjob t inner join bd_psndoc t1 on t.pk_psndoc = t1.pk_psndoc inner join sm_user t2 on t1.pk_psndoc = t2.pk_psndoc where t2.cuserid = '"
					+ user + "'";
			IUAPQueryBS dao = (IUAPQueryBS) NCLocator.getInstance().lookup(
					IUAPQueryBS.class.getName());
			String resdept = (String) dao.executeQuery(sql,
					new ColumnProcessor());
			ArrayList<String> reslist = map.get(dept);
			boolean flag = true;
			for (String str : reslist) {
				if (str.equals(resdept)) {
					flag = false;
				}
			}
			if (flag) {
				MessageDialog.showWarningDlg(null, "����", "��ǰ��¼��Ա�����ڸò��ţ�");
				return;
//				throw new BusinessException("��ǰ��¼��Ա�����ڸò��ţ�");
			}
			ISGDMaintain isgd = NCLocator.getInstance().lookup(
					ISGDMaintain.class);
			String[] sgd_b=new String[]{bvo.getPk_sgd_b()};
			Map<String, UFDouble> resMap = isgd.queryActiveManHours(sgd_b);
			// ======================================================

			List<PGDVO> listvo = VOTransfer(vos,bvo, resMap.get(sgd_b[0]));//xiashsh 2017-06-14
			if (listvo != null && listvo.size() >= 1) {
				PGDVO[] pals = listvo.toArray(new PGDVO[listvo.size()]);
				MyTransfer mt = new MyTransfer();
				mt.OpenNode(pals, 68050102, "68H10102");
			}
		} catch (BusinessException e) {
			MessageDialog.showErrorDlg(null, "�޷������ɹ���", e.getMessage());
			return;
		}
	}

	/**
	 * 2017-2-20����11:50:31 TODO
	 * 
	 * @param surplushours
	 * 
	 * @param ��Դ���ݵ�Aggvo
	 *            [] vos
	 * @return Ŀ�ĵ��ݵ�Aggvo list��ʽ��װ
	 * @throws BusinessException
	 */
	private ArrayList<PGDVO> VOTransfer(SGDVO[] vos,SGDBVO bvo, UFDouble surplushours)
			throws BusinessException {
		String pk_group = vos[0].getParentVO().getPk_group() == null ? AppContext
				.getInstance().getPkGroup() : vos[0].getParentVO()
				.getPk_group();
		String pk_org = vos[0].getParentVO().getPk_org() == null ? "GLOBLE00000000000000"
				: vos[0].getParentVO().getPk_org();
		// ����VO ����
		MyTransfer tr = new MyTransfer();
		AggregatedValueObject[] destVos = tr.VOtransfer("JX01", "JX02", vos);
		// IPfExchangeService pfExchangeService =
		// NCLocator.getInstance().lookup(
		// IPfExchangeService.class);
		// AggregatedValueObject[] destVos = pfExchangeService
		// .runChangeDataAryNeedClassify("JX01", "JX02", vos, null,
		// PfButtonClickContext.NoClassify);
		if (destVos == null || destVos.length == 0) {
			throw new BusinessException("���ɵ��ɹ�������Ϊ�գ�");
		}
		ArrayList<PGDVO> listvo = new ArrayList<PGDVO>();
		for (int i = 0; i < destVos.length; i++) {
			((PGDVO) destVos[i]).getParentVO().setBillno(
					new BillcodeGenerater().getBillCode("JX02", pk_group,
							pk_org, null, null));
			((PGDVO) destVos[i]).getParentVO().setBilldate(
					AppContext.getInstance().getBusiDate());
			((PGDVO) destVos[i]).getParentVO().setGs(surplushours);// Ĭ�����ó�ʣ�๤ʱ
//			((PGDVO) destVos[i]).getParentVO().setSrcbillid(bvo.getPk_sgd_h());
			((PGDVO) destVos[i]).getParentVO().setSrcbillbodyid(bvo.getPk_sgd_b());
			((PGDVO) destVos[i]).getParentVO().setPgd_dept(bvo.getPk_dept());
//			((PGDVO) destVos[i]).getParentVO().setSrcbilltype(bvo.getBilltype());
//			((PGDVO) destVos[i]).getParentVO().setCpmc(vos[0].getParentVO().getTaskname());
			listvo.add((PGDVO) destVos[i]);
		}
		return listvo;

	}

	private UFDouble checkGsIsHaving(SGDBVO bvo) throws BusinessException {
		String pk_sgd_b = bvo.getPk_sgd_b() == null ? "" : bvo.getPk_sgd_b();
		String sql = "select SG.gs SGDGS,(select nvl(sum(nvl(pg.bodygstotal,0)),0) end from jxc_hr_pgk_h PG where nvl(PG.dr,0)=0 and PG.Srcbillbodyid= '"
				+ pk_sgd_b
				+ "' ) PGKGS,(select nvl(sum(nvl(NX.Exchours,0)),0) end from  jxc_hr_sgd_exc_b NX where NX.Srcbillid_b='"
				+ pk_sgd_b
				+ "' and nvl(NX.Dr,0)=0) LXDGS,(select nvl(sum(nvl(ZB.gs,0)),0)from jxc_hr_sgd_add_b ZB where ZB.Srcbillid_b='"
				+ pk_sgd_b
				+ "' and nvl(ZB.Dr,0)=0) ZBDGS from jxc_hr_sgd_b SG where SG.Pk_Sgd_b='"
				+ pk_sgd_b + "' and nvl(SG.Dr,0)=0";
		IUAPQueryBS dao = (IUAPQueryBS) NCLocator.getInstance().lookup(
				IUAPQueryBS.class.getName());
		@SuppressWarnings("unchecked")
		HashMap<String, Object> res = (HashMap<String, Object>) dao
				.executeQuery(sql, new MapProcessor());
		if (res == null) {
			throw new BusinessException("δ�ҵ���ѡ�������ݣ�");
		}
		UFDouble sgdgs = new UFDouble(res.get("sgdgs").toString());
		UFDouble pgkgs = new UFDouble(res.get("pgkgs").toString());
		UFDouble lxdgs = new UFDouble(res.get("lxdgs").toString());
		UFDouble zbdgs = new UFDouble(res.get("zbdgs").toString());
		return sgdgs.sub(pgkgs).sub(lxdgs).add(zbdgs);
	}

	private void openFuncNode(List<PGDVO> listvo) {
		PGDVO[] pals = listvo.toArray(new PGDVO[listvo.size()]);
		if (pals != null && pals.length >= 1) {
			LinkMaintainData maintaindata = new LinkMaintainData("68H10102",
					pals);
			SFClientUtil.closeFuncWindow("68H10102");
			nc.ui.pubapp.uif2app.ToftPanelAdaptorEx ifs = (ToftPanelAdaptorEx) SFClientUtil
					.showNode("68H10102");
			FuncletInitData data = new FuncletInitData();
			data.setInitData(maintaindata);
			ifs.initData(data);
		}
	}

	private List<PGDVO> changevo02(SGDBVO bvo, SGDHVO sgdhvo,
			double surplushours) {
		String srchid = sgdhvo.getPk_sgd_h();// ��Դ���ݱ�ͷ����
		String pk_group = WorkbenchEnvironment.getInstance().getLoginUser()
				.getPk_group() == null ? "0001A1100000000004PE" : sgdhvo
				.getPk_group();
		String pk_org = WorkbenchEnvironment.getInstance().getLoginUser()
				.getPk_org() == null ? "GLOBLE00000000000000" : sgdhvo
				.getPk_org();
		String pk_org_v = sgdhvo.getPk_org_v() == null ? "~" : sgdhvo
				.getPk_org_v();

		String gl = sgdhvo.getDef1();// ����
		PGDVO aggvo = new PGDVO();
		List<PGDVO> listvo = new ArrayList<PGDVO>();
		PGDHVO phvo = new PGDHVO();
		phvo.setPk_group(pk_group);// ����
		phvo.setPk_org(pk_org);// ��֯
		phvo.setPk_org_v(pk_org_v);// ��֯��汾
		phvo.setApprovestatus(-1);// ����״̬
		phvo.setBilltype("JX02");// �ɹ�����������
		phvo.setSrcbilltype("JX01");// ��Դ��������
		phvo.setSrcbillbodyid(bvo.getPk_sgd_b());// ��Դ���ݱ���id
		phvo.setSrcbillid(srchid);// ��Դ����id
		phvo.setAttributeValue("approvestatus", -1);// ����״̬
		phvo.setBilldate(AppContext.getInstance().getBusiDate());
		phvo.setGs(new UFDouble(surplushours));// ��ʱ
		phvo.setGl(gl);// �����
		aggvo.setParentVO(phvo);
		listvo.add(aggvo);
		return listvo;
	}

	@Override
	public boolean isActionEnable() {
		int brow = this.listview.getBillListPanel().getBodyTable()
				.getSelectedRowCount();
		if (brow == 0 || brow > 1) {
			return false;
		}
		return true;
	}

}
