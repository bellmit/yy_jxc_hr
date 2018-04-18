package nc.vo.plan.jx01;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.plan.jx01.SGDHVO")
public class SGDVO extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(SGDVOMeta.class);
    return billMeta;
  }

  @Override
  public SGDHVO getParentVO() {
    return (SGDHVO) this.getParent();
  }
}