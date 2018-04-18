package nc.vo.plan.jx02;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.plan.jx02.PGDHVO")
public class PGDVO extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(PGDVOMeta.class);
    return billMeta;
  }

  @Override
  public PGDHVO getParentVO() {
    return (PGDHVO) this.getParent();
  }
}