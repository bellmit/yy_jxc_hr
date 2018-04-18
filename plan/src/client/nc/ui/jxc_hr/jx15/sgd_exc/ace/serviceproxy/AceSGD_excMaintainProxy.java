package nc.ui.jxc_hr.jx15.sgd_exc.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.vo.plan.jx15.SGDVO_EXC;
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
public class AceSGD_excMaintainProxy 
             implements 
                  IPaginationQueryService 
                     {
    
    @Override
    public Object[] queryObjectByPks(String[] pks) throws BusinessException {
        SGDVO_EXC[] rets = null;
        nc.itf.jxc_hr.jx15.ISGD_excMaintain service = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx15.ISGD_excMaintain.class);
        try {
            rets = service.queryBillByPK(pks);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException(e);
        }
        return rets;
    }
}
