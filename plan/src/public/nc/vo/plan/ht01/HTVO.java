package nc.vo.plan.ht01;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.plan.ht01.HtHVO")
public class HTVO extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(HTVOMeta.class);
    return billMeta;
  }

  @Override
  public HtHVO getParentVO() {
    return (HtHVO) this.getParent();
  }
}