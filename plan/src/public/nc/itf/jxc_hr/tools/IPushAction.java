package nc.itf.jxc_hr.tools;

import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

public interface IPushAction {
	/**
	 *2017-2-14����11:04:49
	 *TODO
	 * @param vos ��������
	 * @param vo  ��������
	 * @param tbname 
	 * @return
	 * @throws BusinessException
	 */
	public String[] insert(SuperVO[] vos,SuperVO vo,String tbname)
		      throws BusinessException ;

}
