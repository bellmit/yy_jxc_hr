package nc.vo.plan.jx03;

import nc.vo.pubapp.pattern.model.entity.bill.AbstractBill;
import nc.vo.pubapp.pattern.model.meta.entity.bill.BillMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

@nc.vo.annotation.AggVoInfo(parentVO = "nc.vo.plan.jx03.SWLGSHVO")
public class SWLGSVO extends AbstractBill {

  @Override
  public IBillMeta getMetaData() {
    IBillMeta billMeta =BillMetaFactory.getInstance().getBillMeta(SWLGSVOMeta.class);
    return billMeta;
  }

  @Override
  public SWLGSHVO getParentVO() {
    return (SWLGSHVO) this.getParent();
  }
}