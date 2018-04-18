package nc.pub.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.ResourceBundle;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jcifs.smb.SmbFile;
import jcifs.smb.SmbFileInputStream;
import jcifs.smb.SmbFileOutputStream;
import nc.vo.jcom.xml.XMLUtil;
import nc.vo.pub.BusinessException;
import org.w3c.dom.Document;

public class HelperUitl_jxc {

	private ResourceBundle bundle = null;

	// 获取属性文件中的属性值
	public ResourceBundle getResourceBundle() {
		if (null == bundle) {
			return bundle = ResourceBundleReader_jxc.getBundle();
		}
		return bundle;
	}

	public void newFolder(String path) throws BusinessException {
		try {
			File floder = new File(path);
			floder.mkdirs();
		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException("创建文件夹时出现异常 " + path + e.getMessage());
		}
	}

	public String documentToString(Document doc) throws BusinessException {
		String xmlstr = "";
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			t.setOutputProperty("encoding", "UTF-8");// 解决中文问题，试过用GBK不行
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			t.transform(new DOMSource(doc), new StreamResult(bos));
			xmlstr = bos.toString("UTF-8");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BusinessException("将Document对象转换成XML时出现异常"
					+ e.getMessage());
		}
		return xmlstr;
	}

	//获取xml文件所在文件夹,循环文件夹中所有xml文件,发送外部交换平台
	public Document sendFile(String strUrl,SmbFile file)
			throws BusinessException {

		// 获取Servlet连接并设置请求的方法
		Document retDoc = null;
		// String url =
		// "http://127.0.0.1:80/service/XChangeServlet?account=develop&groupcode=0";

		HttpURLConnection connection = null;
		BufferedOutputStream out = null;
		BufferedInputStream input = null;
		InputStream inputStream = null;
		try {
			String url = null;
			try {
				url = getResourceBundle().getString("url");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw new BusinessException(e.getMessage());
			}
			if (null == url) {
				throw new BusinessException("获取url出现异常");
			}
			URL realURL = new URL(url);
			connection = (HttpURLConnection) realURL.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-type", "text/xml");
			connection.setRequestMethod("POST");
			// 将Document对象写入连接的输出流中
			// String fileName = strUrl+"\\"+fileID;
			// File file = new File(fileName);
			out = new BufferedOutputStream(connection.getOutputStream());
			input = new BufferedInputStream(new SmbFileInputStream(file));

			int length;
			byte[] buffer = new byte[1000];
			while ((length = input.read(buffer, 0, 1000)) != -1) {
				out.write(buffer, 0, length);
			}
			input.close();
			out.close();
			// 从连接的输入流中取得回执信息
			inputStream = connection.getInputStream();
			retDoc = XMLUtil.getDocumentBuilder().parse(inputStream); // 解析为Doc对象

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BusinessException("发送外部交换平台异常："+e.getMessage());
		} finally {
			try {
				if (null != input) {
					input.close();
				}
				if (null != out) {
					out.close();
				}
				if (null != inputStream) {
					inputStream.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				throw new BusinessException("关闭输入输出流异常："+e2.getMessage());
			}
		}
		return retDoc;
	}

	//将xml格式文件内容转换至字符串发送至外部交换平台
	public Document sendFile(String xml) throws BusinessException {

		// 获取Servlet连接并设置请求的方法
		Document retDoc = null;

		HttpURLConnection connection = null;
		BufferedOutputStream out = null;
		BufferedInputStream input = null;
		InputStream inputStream = null;
		try {
			String url = null;
			try {
				url = getResourceBundle().getString("url");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				throw new BusinessException(e.getMessage());
			}
			if (null == url) {
				throw new BusinessException("获取url出现异常");
			}
			URL realURL = new URL(url);
			connection = (HttpURLConnection) realURL.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-type", "text/xml");
			connection.setRequestMethod("POST");
			// 将Document对象写入连接的输出流中
			// String fileName = strUrl+"\\"+fileID;
			// File file = new File(fileName);
			out = new BufferedOutputStream(connection.getOutputStream());

			if (null != xml) {
				byte[] b = xml.toString().getBytes("UTF-8");
				out.write(b, 0, b.length);
			}
			out.flush();
			out.close();
			// 从连接的输入流中取得回执信息
			inputStream = connection.getInputStream();
			retDoc = XMLUtil.getDocumentBuilder().parse(inputStream); // 解析为Doc对象

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BusinessException(e.getMessage());
		} finally {
			try {
				if (null != input) {
					input.close();
				}
				if (null != out) {
					out.close();
				}
				if (null != inputStream) {
					inputStream.close();
				}

			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
				throw new BusinessException(e2.getMessage());
			}

		}
		return retDoc;
	}

	public synchronized Document readXML(String path) throws BusinessException {
		Document doc = null;
		try {
			File f = new File(path);
			doc = XMLUtil.getDocument(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}

	public void writeStringToFile(String path, String contents)
			throws BusinessException {
		
		OutputStreamWriter out = null;
		try {
			SmbFile remoteFile = new  SmbFile(path);   
			out = new OutputStreamWriter(new SmbFileOutputStream(remoteFile),"UTF-8");
			out.write(contents);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException("写出文件时出现异常：" + path + e.getMessage());
		} finally {
			try {
				if (out != null) {
					out.close(); 
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new BusinessException("关闭文件时出现异常：" + e.getMessage());
			}
		}
	}

	public void writeToFile(String path, String contents)throws BusinessException {
		
		FileWriter fw = null;
		try {
			newFolder(path);
			// 创建输出文件
			File file = new File(path);
			// 将数据写进文件
			fw = new FileWriter(file);
			fw.write(contents);
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException("写出文件时出现异常：" + path + e.getMessage());
		} finally {
			try {
				if(fw != null){
				fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new BusinessException("关闭文件时出现异常：" + e.getMessage());
			}
		}
	}
	
	public String getFileID() throws BusinessException {

		String filename = "";
		try {
			Calendar cal = Calendar.getInstance();
			String DATE_FORMAT = "yyyyMMddHHmmssms";
			java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
					DATE_FORMAT);
			filename = sdf.format(cal.getTime());
			filename = filename + ".xml";
		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException("生成时间为文件名时出现异常" + e.getMessage());
		}
		if (filename.equals("")) {
			throw new BusinessException("生成时间作为文件名时出现异常");
		}

		return filename;
	}

	public void smbPut(String remoteUrl, SmbFile byRmoveFile)
			throws BusinessException {
		InputStream in = null;
		OutputStream out = null;
		try {
			SmbFile remoteFile = new SmbFile(remoteUrl + byRmoveFile.getName());
			in = new BufferedInputStream(new SmbFileInputStream(byRmoveFile));
			out = new BufferedOutputStream(new SmbFileOutputStream(remoteFile));
			int length;
			byte[] buffer = new byte[1000];
			while ((length = in.read(buffer, 0, 1000)) != -1) {
				out.write(buffer, 0, length);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException(e.getMessage());
		} finally {
			try {
				out.close();
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public double convertFloat(double num){
		 
		  int   scale   =   2;//设置位数  
		  int   roundingMode   =   4;//表示四舍五入，可以选择其他舍值方式，例如去尾，等等.  
		  BigDecimal   bd   =   new   BigDecimal(num);  
		  bd   =   bd.setScale(scale,roundingMode);  
		  double ft   =   bd.doubleValue();  
		  return ft; 
	}
	
}
