package nc.ui.jxc_hr.jx01.sgd.action;

import java.awt.Color;
import java.awt.event.ActionEvent;

import nc.a.tools.all.BillIteamInfo;
import nc.a.tools.all.PublicTools;
import nc.ui.pubapp.pub.power.PowerCheckUtils;
import nc.ui.pubapp.uif2app.actions.EditAction;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.vo.pubapp.pub.power.PowerActionEnum;

public class SGDEditAction extends EditAction {

  private static final long serialVersionUID = 1L;
  
  private String billType;
  
  private String billCodeName;
  
  private boolean powercheck;
  
  private nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor;
	
	public nc.ui.pubapp.uif2app.view.ShowUpableBillForm getBillFormEditor() {
		return billFormEditor;
	}
	public void setBillFormEditor(
			nc.ui.pubapp.uif2app.view.ShowUpableBillForm billFormEditor) {
		this.billFormEditor = billFormEditor;
	}
  
  @Override
  public void doAction(ActionEvent e) throws Exception {
    if (this.isPowercheck()) {
      IBill bill = (IBill) this.getModel().getSelectedData();
      PowerCheckUtils.checkHasPermission(new IBill[] {
        bill
      }, this.getBillType(), PowerActionEnum.EDIT.getActioncode(),
          this.getBillCodeName());
    }
    super.doAction(e);
    PublicTools.changeCardGsColor(getBillFormEditor().getBillCardPanel(),BillIteamInfo.Body);
  }
  
  public String getBillType() {
    return this.billType;
  }

  public void setBillType(String billType) {
    this.billType = billType;
  }

  public String getBillCodeName() {
    return this.billCodeName;
  }

  public void setBillCodeName(String billCodeName) {
    this.billCodeName = billCodeName;
  }

  public boolean isPowercheck() {
    return this.powercheck;
  }

  public void setPowercheck(boolean powercheck) {
    this.powercheck = powercheck;
  }

}
