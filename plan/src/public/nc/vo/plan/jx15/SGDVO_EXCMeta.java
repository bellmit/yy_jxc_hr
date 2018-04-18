package nc.vo.plan.jx15;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class SGDVO_EXCMeta extends AbstractBillMeta {
  public SGDVO_EXCMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.plan.jx15.SGDHVO_EXC.class);
    this.addChildren(nc.vo.plan.jx15.SGDBVO_EXC.class);
  }
}