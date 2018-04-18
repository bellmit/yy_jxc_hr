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
	 * 					��������
	 * @param Flag
	 * 					��־λ��"UP" ���ϲ鵽���ڵ�  "DOWN"  ���²鵽Ҷ�ӽڵ�
	 * @return HashMap<��������Ĳ���pk_dept,ArrayList<�鵽��pk>>
	 * @throws BusinessException
	 */
	public HashMap<String,ArrayList<String>> getdept(String pk_dept,String Flag)   throws BusinessException ;
	
}
