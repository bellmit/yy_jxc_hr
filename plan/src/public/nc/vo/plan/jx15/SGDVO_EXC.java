package nc.vo.plan.jx15;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.plan.jx15.SGDHVO_EXC")
public class SGDVO_EXC extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(SGDVO_EXCMeta.class);
    return billMeta;
  }

  @Override
  public SGDHVO_EXC getParentVO() {
    return (SGDHVO_EXC) this.getParent();
  }
}