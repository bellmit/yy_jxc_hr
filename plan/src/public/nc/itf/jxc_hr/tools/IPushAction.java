package nc.itf.jxc_hr.tools;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

public interface IPushAction {
	/**
	 *2017-2-14上午11:04:49
	 *TODO
	 * @param vos 多行数据
	 * @param vo  单行数据
	 * @param tbname 
	 * @return
	 * @throws BusinessException
	 */
	public String[] insert(SuperVO[] vos,SuperVO vo,String tbname)
		      throws BusinessException ;

}
