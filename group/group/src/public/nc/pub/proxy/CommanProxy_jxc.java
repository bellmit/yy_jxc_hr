package nc.pub.proxy;

import nc.bs.PackageXmlSend.PackageXmlSend_jxc;
import nc.pub.util.HelperUitl_jxc;

public class CommanProxy_jxc {
	private static HelperUitl_jxc helperUitl=null;
	private static PackageXmlSend_jxc packageXmlSend=null;
	
	public static HelperUitl_jxc getHelperUitl(){
		if(null==helperUitl){
			helperUitl=new HelperUitl_jxc();
		}
		return helperUitl;
	}

	public static PackageXmlSend_jxc getPackageXmlSend(){
		if(null==packageXmlSend){
			packageXmlSend= new PackageXmlSend_jxc();
		}
		return packageXmlSend;
	}
}
