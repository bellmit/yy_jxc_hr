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

	//同步凭证
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
				returnMSG.append("没有需要同步的凭证");
				returnMSG.append(splitString2);
				obj = returnMSG.toString();
			}
		}catch(NamingException e){
			e.printStackTrace();
		}
		return obj;
	}
	
	//查询凭证是否记账
	@Override
	public Object isAccounting(String xml) {
		// TODO 自动生成的方法存根
		try{
			if(null != null || ( !("").equals(xml)) ){
				Object obj  = getWebserviceDao().isAccounting(xml);
				return obj;
			}
			else{
				return "查询条件为空,不支持全部查询";
			}
		}catch(Exception e){
			e.printStackTrace();
			return "查询凭证是否记账异常,异常为:"+e.getMessage();
		}
	}

}
