package nc.a.tools.all;

import nc.bs.framework.common.NCLocator;
import nc.funcnode.ui.FuncletInitData;
import nc.itf.uap.pf.IPfExchangeService;
import nc.itf.uap.pf.busiflow.PfButtonClickContext;
import nc.ui.jxc_hr.jx01.sgd.action.LinkMaintainData;
import nc.ui.pubapp.uif2app.ToftPanelAdaptorEx;
import nc.ui.uap.sf.SFClientUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class MyTransfer {
	private AggregatedValueObject[] destVos;

	public AggregatedValueObject[] getDestVos() {
		return destVos;
	}

	public void setDestVos(AggregatedValueObject[] destVos) {
		this.destVos = destVos;
	}
	
	public AggregatedValueObject[] VOtransfer(String secBillType,String destBillType,AggregatedValueObject[] srcVos)throws BusinessException{
		IPfExchangeService pfExchangeService=NCLocator.getInstance().lookup(IPfExchangeService.class);
		AggregatedValueObject[] destVos=pfExchangeService.runChangeDataAryNeedClassify(secBillType, destBillType, srcVos, null,PfButtonClickContext.NoClassify);
		if(destVos==null||destVos.length==0){
			throw new BusinessException("单据转换规则后的数据为空！");
		}
		this.destVos=destVos;
		return destVos;
	}
	public void OpenNode(AggregatedValueObject[] destVos,int dataType,String nodeCode)throws BusinessException{
		if(dataType>10&&destVos.length>0){
			LinkMaintainData maintaindata = new LinkMaintainData(nodeCode, destVos);
			SFClientUtil.closeFuncWindow(nodeCode);
			nc.ui.pubapp.uif2app.ToftPanelAdaptorEx ifs = (ToftPanelAdaptorEx) SFClientUtil
					.showNode(nodeCode);
			FuncletInitData data = new FuncletInitData();
			data.setInitData(maintaindata);
			data.setInitType(dataType);
			ifs.initData(data);
		}	
	}
}
