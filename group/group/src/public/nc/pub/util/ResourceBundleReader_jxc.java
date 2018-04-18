package nc.pub.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ʹ�����ַ�ʽ��ȡ�����ļ���Ϊ�˱����ظ���ȡ�����ļ�
 * @author Administrator
 *
 */
public class ResourceBundleReader_jxc {
	public final static Object initLock = new Object();

	private final static String PROPERTIES_FILE_NAME = "nc.pub.util.property";

	
	private static ResourceBundle bundle = null;

	 // cn.zld.imtalk.client.test����Դ�İ�����������ͨjava�������������ȫһ����   
    // - ��չ�� .properties ʡ�ԡ�������������ʡ�Ե� .class��չ��һ��   
    // - ��Դ�ļ�����λ��ָ������·��֮�£�λ����ָ����classpath�У�   
	
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
