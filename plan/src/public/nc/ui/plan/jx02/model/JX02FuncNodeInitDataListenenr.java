package nc.ui.plan.jx02.model;

import nc.funcnode.ui.FuncletInitData;
import nc.ui.jxc_hr.jx01.sgd.action.LinkMaintainData;
import nc.ui.pubapp.uif2app.model.DefaultFuncNodeInitDataListener;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.ui.uif2.UIState;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

public class JX02FuncNodeInitDataListenenr extends
		DefaultFuncNodeInitDataListener {
	private static final int datatype=68050102;
	
	public void initData(FuncletInitData data) {
		super.initData(data);
		// ���һ���ڵ��Ѿ��򿪲������ڱ༭����, Ĭ�ϲ��ٴ�����������
		if (UIState.EDIT.equals(this.getModel().getUiState())
				|| UIState.ADD.equals(this.getModel().getUiState())) {
			return;
		}
		if (null == data) {
			this.getModel().initModel(null);
			return;
		}
		
		if(data.getInitType()==datatype){
			LinkMaintainData lindata =  (LinkMaintainData) data.getInitData();
			AggregatedValueObject userObject= ((AggregatedValueObject[]) lindata.getUserObject())[0];
	
				getModel().setUiState(UIState.ADD);
				if(this.getAutoShowUpComponent() instanceof ShowUpableBillForm){
					((ShowUpableBillForm)this.getAutoShowUpComponent()).getBillCardPanel().setBillValueVO(userObject);
				}
				else{
					ExceptionUtils.wrappBusinessException("���������쳣");
				}
		}else{
			return;
		}
	}

}
