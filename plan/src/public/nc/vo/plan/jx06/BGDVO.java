package nc.vo.plan.jx06;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.plan.jx06.BGDHVO")
public class BGDVO extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(BGDVOMeta.class);
    return billMeta;
  }

  @Override
  public BGDHVO getParentVO() {
    return (BGDHVO) this.getParent();
  }
}