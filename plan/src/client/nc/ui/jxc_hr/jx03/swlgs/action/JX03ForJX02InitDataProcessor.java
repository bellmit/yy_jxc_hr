package nc.ui.jxc_hr.jx03.swlgs.action;

import nc.funcnode.ui.FuncletInitData;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.ui.pubapp.uif2app.model.DefaultFuncNodeInitDataListener.IInitDataProcessor;
import nc.ui.pubapp.uif2app.view.ShowUpableBillForm;
import nc.ui.uif2.UIState;
import nc.vo.pub.AggregatedValueObject;
import nc.ui.jxc_hr.jx01.sgd.action.LinkMaintainData;
public class JX03ForJX02InitDataProcessor implements IInitDataProcessor {
	private BillManageModel model;
	public BillManageModel getModel() {
		return model;
	}
	public void setModel(BillManageModel model) {
		this.model = model;
	}
	public ShowUpableBillForm getEditor() {
		return editor;
	}
	public void setEditor(ShowUpableBillForm editor) {
		this.editor = editor;
	}
	private ShowUpableBillForm editor;
	@Override
	public void process(FuncletInitData data) {
		LinkMaintainData lindata =  (LinkMaintainData) data.getInitData();
		AggregatedValueObject userObject= ((AggregatedValueObject[]) lindata.getUserObject())[0];
		getEditor().showMeUp();
		getModel().setUiState(UIState.ADD);
		getEditor().getBillCardPanel().setBillValueVO(userObject);

	}

}
