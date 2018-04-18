package nc.vo.jxc_hr.ordersheet;

import nc.vo.pubapp.pattern.model.meta.entity.bill.AbstractBillMeta;

public class AggOrderEndVOMeta extends AbstractBillMeta {
  public AggOrderEndVOMeta() {
    this.init();
  }
  private void init() {
    this.setParent(nc.vo.jxc_hr.ordersheet.OrderEndVO.class);
    this.addChildren(nc.vo.jxc_hr.ordersheet.OrderEndSubVO.class);
  }
}