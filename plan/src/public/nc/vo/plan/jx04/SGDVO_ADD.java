package nc.vo.plan.jx04;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.plan.jx04.SGDHVO_ADD")
public class SGDVO_ADD extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(SGDVO_ADDMeta.class);
    return billMeta;
  }

  @Override
  public SGDHVO_ADD getParentVO() {
    return (SGDHVO_ADD) this.getParent();
  }
}