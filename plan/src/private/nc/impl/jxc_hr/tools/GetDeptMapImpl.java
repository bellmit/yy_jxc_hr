package nc.impl.jxc_hr.tools;

import java.util.ArrayList;
import java.util.HashMap;

import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.itf.jxc_hr.tools.IGetDeptMap;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.MapListProcessor;
import nc.vo.pub.BusinessException;

public class GetDeptMapImpl implements IGetDeptMap {
	private BaseDAO baseDao=null;
	@Override
	public HashMap<String, ArrayList<String>> getdept(String pk_dept,String Flag) throws BusinessException {
		if(!"UP".equals(Flag)&&!"DOWN".equals(Flag)){
			throw new BusinessException("标志位Flag不符合规范");
		}
		String sql=getSql(pk_dept,Flag);
		HashMap<String, ArrayList<String>> map=searchDept(sql,pk_dept);
		return map;
	}

	private HashMap<String, ArrayList<String>> searchDept(String sql,String pk_dept) throws BusinessException {
		@SuppressWarnings("unchecked")
		ArrayList<String> res=(ArrayList<String>) getBaseDAO().executeQuery(sql, new ColumnListProcessor());
		HashMap<String,ArrayList<String>> hm=new HashMap<String,ArrayList<String>>();
		hm.put(pk_dept, res);
		return hm;
	}

	private String getSql(String pk_dept, String flag) {
		if("UP".equals(flag)){
			return "select pk_dept,pk_fatherorg from  org_dept where nvl(dr,0)=0 and enablestate =2 start with  pk_dept='"+pk_dept+"' connect by  prior pk_dept=pk_fatherorg";
		}else if("DOWN".equals(flag)){
			return "select pk_dept,pk_fatherorg from  org_dept where nvl(dr,0)=0 and enablestate =2 start with  pk_dept='"+pk_dept+"' connect by  prior pk_fatherorg=pk_dept";
		}
		return null;
	}
	private BaseDAO getBaseDAO(){
		if(baseDao==null){
			baseDao=new BaseDAO();
		}
		return baseDao;
	}
}
