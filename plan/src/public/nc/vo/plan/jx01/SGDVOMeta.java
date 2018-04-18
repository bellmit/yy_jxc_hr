package nc.vo.plan.jx01;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class SGDVOMeta extends AbstractBillMeta {
  public SGDVOMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.plan.jx01.SGDHVO.class);
    this.addChildren(nc.vo.plan.jx01.SGDBVO.class);
  }
}