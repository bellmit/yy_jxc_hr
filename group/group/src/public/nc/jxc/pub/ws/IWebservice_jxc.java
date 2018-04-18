package nc.jxc.pub.ws;

public interface IWebservice_jxc {
	
	//查询TS
	//public Object queryTS(String xml);

	//凭证是否记账
	public Object isAccounting(String xml);
	
	//同步档案
	//public Object synArchives(String xml);
	
	//同步凭证
	public Object synVoucher(String xml);
}
