package nc.itf.jxc_hr.tools;

import java.util.ArrayList;
import java.util.HashMap;

import nc.vo.pub.BusinessException;

/**
 * 
 *
 */
public interface IGetDeptMap {
	
	/**
	 * @param pk_dept 
	 * 					部门主键
	 * @param Flag
	 * 					标志位："UP" 往上查到根节点  "DOWN"  往下查到叶子节点
	 * @return HashMap<传入进来的参数pk_dept,ArrayList<查到的pk>>
	 * @throws BusinessException
	 */
	public HashMap<String,ArrayList<String>> getdept(String pk_dept,String Flag)   throws BusinessException ;
	
}
