package nc.pub.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 使作该种方式读取配制文件是为了避免重复读取配制文件
 * @author Administrator
 *
 */
public class ResourceBundleReader_jxc {
	public final static Object initLock = new Object();

	private final static String PROPERTIES_FILE_NAME = "nc.pub.util.property";

	
	private static ResourceBundle bundle = null;

	 // cn.zld.imtalk.client.test是资源的包名，它跟普通java类的命名规则完全一样：   
    // - 扩展名 .properties 省略。就像对于类可以省略掉 .class扩展名一样   
    // - 资源文件必须位于指定包的路径之下（位于所指定的classpath中）   
	
	static {
		
		try {
			if (bundle == null) {
				synchronized (initLock) {
					if (bundle == null)
						bundle = ResourceBundle.getBundle(PROPERTIES_FILE_NAME,
								Locale.CHINA);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
		}
	}

	public static ResourceBundle getBundle() {
		return bundle;
	}

//	public static void setBundle(ResourceBundle bundle) {
//		bundle = bundle;
//	}
}
