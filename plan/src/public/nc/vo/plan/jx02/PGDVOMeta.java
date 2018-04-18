package nc.vo.plan.jx02;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class PGDVOMeta extends AbstractBillMeta {
  public PGDVOMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.plan.jx02.PGDHVO.class);
    this.addChildren(nc.vo.plan.jx02.PGDBVO01.class);
    this.addChildren(nc.vo.plan.jx02.PGDBVO02.class);
  }
}