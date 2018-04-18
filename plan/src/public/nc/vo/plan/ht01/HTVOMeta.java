package nc.vo.plan.ht01;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class HTVOMeta extends AbstractBillMeta {
  public HTVOMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.plan.ht01.HtHVO.class);
    this.addChildren(nc.vo.plan.ht01.HtBVO.class);
  }
}