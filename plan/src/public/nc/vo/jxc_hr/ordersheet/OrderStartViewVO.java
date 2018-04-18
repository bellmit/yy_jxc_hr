package nc.vo.jxc_hr.ordersheet;

import nc.vo.pubapp.pattern.model.entity.view.AbstractDataView;
import nc.vo.pubapp.pattern.model.meta.entity.view.DataViewMetaFactory;
import nc.vo.pubapp.pattern.model.meta.entity.view.IDataViewMeta;

public class OrderStartViewVO extends AbstractDataView {

	public AggOrderStartVO changeToBill() {
		AggOrderStartVO aggvo = new AggOrderStartVO();
		aggvo.setParent(this.getHead());
		OrderStartSubVO[] items = new OrderStartSubVO[] { this.getItem() };
		aggvo.setChildrenVO(items);
		return aggvo;
	}

	public OrderStartVO getHead() {
		return (OrderStartVO) this.getVO(OrderStartVO.class);
	}

	public OrderStartSubVO getItem() {
		return (OrderStartSubVO) this.getVO(OrderStartSubVO.class);
	}

	@Override
	public IDataViewMeta getMetaData() {
		// TODO 自动生成的方法存根
		return DataViewMetaFactory.getInstance().getBillViewMeta(
				AggOrderStartVO.class);
	}

	public void setHead(OrderStartVO head) {
		this.setVO(head);
	}

	public void setItem(OrderStartSubVO item) {
		this.setVO(item);
	}
}
