package nc.vo.jxc_hr.ordersheet;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.jxc_hr.ordersheet.OrderStartVO")
public class AggOrderStartVO extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(AggOrderStartVOMeta.class);
    return billMeta;
  }

  @Override
  public OrderStartVO getParentVO() {
    return (OrderStartVO) this.getParent();
  }
}