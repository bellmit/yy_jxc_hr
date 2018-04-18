package nc.ui.jxc_hr.jx08.orderend.ref;

import java.awt.event.ActionEvent;

import nc.ui.pub.pf.PfUtilClient;
import nc.ui.pubapp.uif2app.actions.AbstractReferenceAction;
import nc.ui.pubapp.uif2app.model.BillManageModel;
import nc.vo.jxc_hr.ordersheet.AggOrderEndVO;

/**
 * 工令完工申请单参照工令申请单按钮
 * 
 * @author shidl
 * 
 */
public class FromOrderStartAction extends AbstractReferenceAction {

	private BillManageModel model;

	public FromOrderStartAction() {
		this.setBtnName("参照工令申请单");
		this.setCode("fromOrderStartAction");
	}

	@Override
	public void doAction(ActionEvent arg0) throws Exception {
		PfUtilClient.childButtonClicked(getSourceBillType(), getModel()
				.getContext().getPk_group(), getModel().getContext()
				.getPk_loginUser(), "JX08", getModel().getContext()
				.getEntranceUI(), null, null);
		if (PfUtilClient.isCloseOK()) {
			AggOrderEndVO[] vos = (AggOrderEndVO[]) PfUtilClient.getRetVos();
			this.getTransferViewProcessor().processBillTransfer(vos);
		}

	}

	public BillManageModel getModel() {
		return model;
	}

	public void setModel(BillManageModel model) {
		this.model = model;
	}

}
