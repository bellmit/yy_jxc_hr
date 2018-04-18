package nc.ui.jxc_hr.jx01.sgd.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.vo.plan.jx01.SGDVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.ui.pubapp.uif2app.actions.IDataOperationService;
import nc.ui.pubapp.uif2app.query2.model.IQueryService;
import nc.ui.uif2.components.pagination.IPaginationQueryService;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * 示例单据的操作代理
 * 
 * @since 6.0
 * @version 2011-7-6 上午08:31:09
 * @author duy
 */
public class AceSGDMaintainProxy 
             implements 
                  IPaginationQueryService 
                     {
    
    @Override
    public Object[] queryObjectByPks(String[] pks) throws BusinessException {
        SGDVO[] rets = null;
        nc.itf.jxc_hr.jx01.ISGDMaintain service = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx01.ISGDMaintain.class);
        try {
            rets = service.queryBillByPK(pks);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException(e);
        }
        return rets;
    }
}
