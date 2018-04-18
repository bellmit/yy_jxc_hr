package nc.ui.jxc_hr.jx06.bgd.ace.serviceproxy;

import nc.bs.framework.common.NCLocator;
import nc.vo.plan.jx06.BGDVO;
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
public class AceBGDMaintainProxy 
             implements 
                  IQueryService 
                     {
    @Override
    public Object[] queryByQueryScheme(IQueryScheme queryScheme) throws Exception {
        nc.itf.jxc_hr.jx06.IBGDMaintain query = NCLocator.getInstance().lookup(nc.itf.jxc_hr.jx06.IBGDMaintain.class);
        return query.query(queryScheme);
    }
    
}
