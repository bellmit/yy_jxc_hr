package nc.ui.jxc_hr.jx02.pgd2.action;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Action;

import nc.bs.framework.common.NCLocator;
import nc.itf.jxc_hr.jx01.ISGDMaintain;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.jdbc.framework.processor.MapProcessor;
import nc.ui.pub.beans.MessageDialog;
import nc.ui.pub.bill.BillCardPanel;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class SaveActionInterceptor implements
		nc.ui.uif2.actions.ActionInterceptor {
	private ShowUpableBillForm editor;
	private BillManageModel model;

	public ShowUpableBillForm getEditor() {
		return editor;
	}

	public void setEditor(ShowUpableBillForm editor) {
		this.editor = editor;
	}

	public BillManageModel getModel() {
		return model;
	}

	public void setModel(BillManageModel model) {
		this.model = model;
	}

	@Override
	public boolean afterDoActionFailed(Action arg0, ActionEvent arg1,
			Throwable arg2) {
		// TODO 自动生成的方法存根
		return true;
	}

	@Override
	public void afterDoActionSuccessed(Action arg0, ActionEvent arg1) {
		// TODO 自动生成的方法存根

	}

	/** 
	 * 分配工时超过85%提示
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean beforeDoAction(Action arg0, ActionEvent arg1) {
		try {
			editor.getBillCardPanel().stopEditing();
			BillCardPanel pn = editor.getBillCardPanel();
			String LsrwsNode = model.getContext().getNodeCode();
			if("68H10102400".equals(LsrwsNode)){
				return true;											//跳过临时任务书
			}
			if(pn.getBillModel().getRowCount()!=1){
				throw new BusinessException("表体行数不符合规范！");
			}
			String pk_pgk_h = pn.getHeadItem("pk_pgk_h").getValue();
		
			String pk_pgk_h_jylx = pn.getHeadItem("transtypepk").getValue();
			String[] sgd_bids =new String []{ pn.getHeadItem("srcbillbodyid").getValue()==null?"":pn.getHeadItem("srcbillbodyid").getValue()};
			if(sgd_bids==null||sgd_bids.length==0||sgd_bids[0].equals("")){
				throw new BusinessException("来源单据表体主键为空！");
			}
			IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
			Object sgdgs_b = ibs.executeQuery("select nvl(gs,0) from jxc_hr_sgd_b where nvl(dr,0)=0 and pk_sgd_b ='"+sgd_bids[0]+"'", new ColumnProcessor());
			if(sgdgs_b==null){
				throw new BusinessException("来源单据施工单工时为空！");
			}
			Map<String, UFDouble> resMap = NCLocator.getInstance().lookup(ISGDMaintain.class).queryActiveManHours(sgd_bids);
			UFDouble addgs = pn.getBillModel().getValueAt(0, "addgs")==null?UFDouble.ZERO_DBL:new  UFDouble(pn.getBillModel().getValueAt(0, "addgs").toString());
			UFDouble zgs=pn.getBillModel().getValueAt(0, "zgs")==null?UFDouble.ZERO_DBL:new UFDouble(pn.getBillModel().getValueAt(0, "zgs").toString());
			if(pk_pgk_h==null||pk_pgk_h.equals("")){
				if((addgs.add(zgs).div(new UFDouble(sgdgs_b.toString()))).compareTo(new UFDouble(0.85))>0){
					int res=MessageDialog.showOkCancelDlg(null, "提示", "工时分配超过85%，是否继续？");
					if(res==MessageDialog.ID_OK){
						return true;
					}else if(res==MessageDialog.ID_CANCEL){
						return false;
					}
				}
			}else{
				Object adc=ibs.executeQuery("select (nvl(zgs,0)+nvl(addgs,0))as resgs from jxc_hr_pgk_czz where nvl(dr,0)=0 and pk_pgk_h='"+pk_pgk_h+"'", new ColumnProcessor());
				if(resMap.get(sgd_bids[0]).add(new UFDouble(adc.toString())).sub((addgs.add(zgs))).div(new UFDouble(sgdgs_b.toString())).compareTo(new UFDouble(0.15))<=0){
					int res=MessageDialog.showOkCancelDlg(null, "提示", "工时分配超过85%，是否继续？");
					if(res==MessageDialog.ID_OK){
						return true;
					}else if(res==MessageDialog.ID_CANCEL){
						return false;
					}
				}
			}
			
		} catch (BusinessException e) {
			e.printStackTrace();
			MessageDialog.showErrorDlg(null, "保存失败", e.getMessage());
			return false;
		}	
		return true;

	}
}
