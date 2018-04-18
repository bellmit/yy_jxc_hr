package nc.vo.plan.jx06;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class BGDVOMeta extends AbstractBillMeta {
  public BGDVOMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.plan.jx06.BGDHVO.class);
    this.addChildren(nc.vo.plan.jx06.BGDBVO.class);
  }
}