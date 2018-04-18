package nc.vo.jxc_hr.ordersheet;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggOrderStartVOMeta extends AbstractBillMeta {
  public AggOrderStartVOMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.jxc_hr.ordersheet.OrderStartVO.class);
    this.addChildren(nc.vo.jxc_hr.ordersheet.OrderStartSubVO.class);
  }
}