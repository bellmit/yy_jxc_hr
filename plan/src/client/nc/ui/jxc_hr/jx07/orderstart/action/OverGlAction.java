package nc.ui.jxc_hr.jx07.orderstart.action;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import nc.a.tools.all.MyTransfer;
import nc.bs.framework.common.NCLocator;
import nc.funcnode.ui.FuncletInitData;
import nc.itf.uap.pf.IPfExchangeService;
import nc.itf.uap.pf.busiflow.PfButtonClickContext;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pubapp.uif2app.ToftPanelAdaptorEx;
import nc.ui.pubapp.uif2app.actions.pflow.ScriptPFlowAction;
import nc.ui.pubapp.uif2app.view.ShowUpableBillListView;
import nc.ui.uap.sf.SFClientUtil;
import nc.vo.fipub.utils.BillcodeGenerater;
import nc.vo.plan.jx01.SGDHVO;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.plan.jx04.SGDHVO_ADD;
import nc.vo.plan.jx04.SGDVO_ADD;
import nc.vo.plan.jx15.SGDVO_EXC;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.AppContext;

@SuppressWarnings("serial")
public class OverGlAction extends ScriptPFlowAction {
	public OverGlAction(){
		super();
		setBtnName("工令完工申请");
		setCode("overgl");
	}

	@Override
	public void doAction(ActionEvent arg0) throws Exception {
//		Object[] srcVos = this.model.getSelectedOperaDatas();
//		if(srcVos.length!=1){
//			MessageDialog.showWarningDlg(null, "提示", "请选择一行！");
//			return ;
//		}
//		SGDVO aggvo=(SGDVO) srcVos[0];
//		SGDVO[] vos = new SGDVO[1];
//		vos[0]=aggvo;
//		List<SGDVO_ADD> listvo = VOTransfer(vos);
//		if(listvo==null||listvo.size()<1){
//			return;
//		}
//		SGDVO_ADD[] pals=listvo.toArray(new SGDVO_ADD[listvo.size()]);
//		MyTransfer mt=new MyTransfer();
//		mt.OpenNode(pals, 68050104, "68H10104");
	}
	
	private List<SGDVO_ADD> VOTransfer(SGDVO[] vos) throws BusinessException {
		String pk_group = vos[0].getParentVO().getPk_group() == null ? AppContext
				.getInstance().getPkGroup() : vos[0].getParentVO()
				.getPk_group();
		String pk_org = vos[0].getParentVO().getPk_org() == null ? "GLOBLE00000000000000"
				: vos[0].getParentVO().getPk_org();
		// 数据VO 交换
		IPfExchangeService pfExchangeService = NCLocator.getInstance().lookup(
				IPfExchangeService.class);
		AggregatedValueObject[] destVos = pfExchangeService
				.runChangeDataAryNeedClassify("JX01", "JX04", vos, null,
						PfButtonClickContext.NoClassify);
		if (destVos == null || destVos.length == 0) {
			throw new BusinessException("生成的施工增补单数据为空！");
		}
		ArrayList<SGDVO_ADD> listvo = new ArrayList<SGDVO_ADD>();
		for (int i = 0; i < destVos.length; i++) {
			((SGDVO_ADD) destVos[i]).getParentVO().setBillno(
					new BillcodeGenerater().getBillCode("JX04", pk_group,
							pk_org, null, null));
			((SGDVO_ADD) destVos[i]).getParentVO().setBilldate(
					AppContext.getInstance().getBusiDate());
			listvo.add((SGDVO_ADD) destVos[i]);
		}
		return listvo;
	}

	@Override
	public boolean isActionEnable(){
		return true;
	}
}
