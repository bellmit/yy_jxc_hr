package nc.jxc_hr.dao;

import nc.bs.dao.BaseDAO;

public class GetBASEDAO {
	private BaseDAO dao = null;
	public BaseDAO getDao() {
    	if(dao==null){
    		dao = new BaseDAO();
    	}
		return dao;
	}
}
