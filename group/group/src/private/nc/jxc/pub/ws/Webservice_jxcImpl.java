package nc.jxc.pub.ws;

import javax.naming.NamingException;
import nc.bs.jxc.pub.WebserviceDao;
import nc.jxc.pub.ws.IWebservice_jxc;

public class Webservice_jxcImpl implements IWebservice_jxc{

	private WebserviceDao webserviceDao;

	public WebserviceDao getWebserviceDao() throws NamingException {
		if (null == webserviceDao) {
			webserviceDao = new WebserviceDao();
		}
		return webserviceDao;
	}

	//ͬ��ƾ֤
	@Override
	public Object synVoucher(String xml) {
		
		Object obj = null;
		String splitString = "@_@";
		String splitString2 = "`,`";
		StringBuilder returnMSG = new StringBuilder();
		try{
			if(null != null || ( !("").equals(xml)) ){
				obj  = getWebserviceDao().synVoucher(xml);
			}
			else{
				returnMSG.append("false");
				returnMSG.append(splitString);
				returnMSG.append("û����Ҫͬ����ƾ֤");
				returnMSG.append(splitString2);
				obj = returnMSG.toString();
			}
		}catch(NamingException e){
			e.printStackTrace();
		}
		return obj;
	}
	
	//��ѯƾ֤�Ƿ����
	@Override
	public Object isAccounting(String xml) {
		// TODO �Զ����ɵķ������
		try{
			if(null != null || ( !("").equals(xml)) ){
				Object obj  = getWebserviceDao().isAccounting(xml);
				return obj;
			}
			else{
				return "��ѯ����Ϊ��,��֧��ȫ����ѯ";
			}
		}catch(Exception e){
			e.printStackTrace();
			return "��ѯƾ֤�Ƿ�����쳣,�쳣Ϊ:"+e.getMessage();
		}
	}

}
