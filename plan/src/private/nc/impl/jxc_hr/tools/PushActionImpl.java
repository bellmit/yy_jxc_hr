package nc.impl.jxc_hr.tools;

import nc.itf.jxc_hr.tools.IPushAction;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.jxc_hr.dao.GetBASEDAO;

public class PushActionImpl implements IPushAction {

	@Override
	public String[] insert(SuperVO[] vos, SuperVO vo, String tbname)
			throws BusinessException {
		 try {
	        	if(vos == null){
	        		throw new BusinessException("传入的bvo为空");
	        	}
	        	GetBASEDAO tool=new GetBASEDAO();
	        	tool.getDao().insertVOArray(vos);
		 }
		 catch (Exception e){
			 System.out.println(e.getMessage());
		 }
		return null;
	}

}
