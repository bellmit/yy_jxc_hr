package nc.vo.plan.jx03;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class SWLGSVOMeta extends AbstractBillMeta {
  public SWLGSVOMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.plan.jx03.SWLGSHVO.class);
    this.addChildren(nc.vo.plan.jx03.SWLGSBVO.class);
  }
}