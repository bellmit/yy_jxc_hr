package nc.vo.plan.jx04;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class SGDVO_ADDMeta extends AbstractBillMeta {
  public SGDVO_ADDMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.plan.jx04.SGDHVO_ADD.class);
    this.addChildren(nc.vo.plan.jx04.SGDBVO_ADD.class);
  }
}