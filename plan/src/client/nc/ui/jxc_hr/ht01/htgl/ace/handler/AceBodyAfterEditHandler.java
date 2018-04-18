package nc.ui.jxc_hr.ht01.htgl.ace.handler;

import java.util.ArrayList;

import nc.bs.framework.common.NCLocator;
import nc.itf.uap.IUAPQueryBS;
import nc.jdbc.framework.processor.BeanListProcessor;
import nc.ui.jxc_hr.ht01.htgl.dlg.GLHMessageDlg;
import nc.ui.pubapp.uif2app.event.IAppEventHandler;
import nc.ui.pubapp.uif2app.event.card.CardBodyAfterEditEvent;
import nc.vo.plan.ht01.HtBVO;
import nc.vo.pub.BusinessException;
/**
 *单据表体字段编辑后事件
 * 
 * @since 6.0
 * @version 2011-7-12 下午08:17:33
 * @author duy
 */
public class AceBodyAfterEditHandler implements IAppEventHandler<CardBodyAfterEditEvent> {

    @SuppressWarnings("unchecked")
	@Override
    public void handleAppEvent(CardBodyAfterEditEvent e) {
    	//需求：编辑工令后，弹出一个框，框内信息为 该工令下的历史合同明细信息
    	//如果编辑的字段不是工令，则返回；感叹号表示  非
    	if(!e.getKey().equals("glh")){
    		return;
    	}
    	//brow表示当前编辑的行
    	int brow = e.getRow();
    	Object glh = e.getBillCardPanel().getBodyValueAt(brow, "glh");
    	if(glh==null){
    		return;
    	}
//    	String sql="select * from jxc_ht_b where nvl(dr,0)=0 and glh='"+glh.toString()+"'";
    	String sql="select * from jxc_ht_b where nvl(dr,0)=0 order by ts desc ";
    	//1.如何查询sql语句
    	IUAPQueryBS ibs = (IUAPQueryBS) NCLocator.getInstance().lookup(IUAPQueryBS.class.getName());
    	ArrayList<HtBVO> res=null;
    	try {
			res=(ArrayList<HtBVO>) ibs.executeQuery(sql, new BeanListProcessor(nc.vo.plan.ht01.HtBVO.class));
		} catch (BusinessException e1) {
			e1.printStackTrace();
		}
    	if(res==null){
    		return;
    	}
    	//2.如何画弹框界面,并显示
    	GLHMessageDlg dlg=new nc.ui.jxc_hr.ht01.htgl.dlg.GLHMessageDlg(res.toArray(new HtBVO[res.size()]));
    	dlg.showModal();
    	
    	
    }

}
