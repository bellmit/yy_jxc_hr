package nc.ui.jxc_hr.jx01.sgd.action;

import nc.ui.pub.linkoperate.ILinkAdd;
import nc.ui.pub.linkoperate.ILinkAddData;
import nc.ui.pub.linkoperate.ILinkMaintain;
import nc.ui.pub.linkoperate.ILinkMaintainData;

public class LinkMaintainData implements ILinkMaintainData,ILinkMaintain,ILinkAdd{

	private String billid = null;
	private Object userObject = null;
	
	
	public LinkMaintainData(String pk_vouchers,Object userObj){
		this.billid = pk_vouchers;
		this.userObject = userObj;
	}
	
	
	@Override
	public String getBillID() {
		return billid;
	}

	@Override
	public Object getUserObject() {
		return userObject;
	}


	@Override
	public void doMaintainAction(ILinkMaintainData arg0) {
		
	}


	@Override
	public void doAddAction(ILinkAddData arg0) {

	}

}
