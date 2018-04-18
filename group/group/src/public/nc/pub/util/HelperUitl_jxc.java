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

	// ��ȡ�����ļ��е�����ֵ
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
			throw new BusinessException("�����ļ���ʱ�����쳣 " + path + e.getMessage());
		}
	}

	public String documentToString(Document doc) throws BusinessException {
		String xmlstr = "";
		try {
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer t = tf.newTransformer();
			t.setOutputProperty("encoding", "UTF-8");// ����������⣬�Թ���GBK����
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			t.transform(new DOMSource(doc), new StreamResult(bos));
			xmlstr = bos.toString("UTF-8");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BusinessException("��Document����ת����XMLʱ�����쳣"
					+ e.getMessage());
		}
		return xmlstr;
	}

	//��ȡxml�ļ������ļ���,ѭ���ļ���������xml�ļ�,�����ⲿ����ƽ̨
	public Document sendFile(String strUrl,SmbFile file)
			throws BusinessException {

		// ��ȡServlet���Ӳ���������ķ���
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
				throw new BusinessException("��ȡurl�����쳣");
			}
			URL realURL = new URL(url);
			connection = (HttpURLConnection) realURL.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-type", "text/xml");
			connection.setRequestMethod("POST");
			// ��Document����д�����ӵ��������
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
			// �����ӵ���������ȡ�û�ִ��Ϣ
			inputStream = connection.getInputStream();
			retDoc = XMLUtil.getDocumentBuilder().parse(inputStream); // ����ΪDoc����

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BusinessException("�����ⲿ����ƽ̨�쳣��"+e.getMessage());
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
				throw new BusinessException("�ر�����������쳣��"+e2.getMessage());
			}
		}
		return retDoc;
	}

	//��xml��ʽ�ļ�����ת�����ַ����������ⲿ����ƽ̨
	public Document sendFile(String xml) throws BusinessException {

		// ��ȡServlet���Ӳ���������ķ���
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
				throw new BusinessException("��ȡurl�����쳣");
			}
			URL realURL = new URL(url);
			connection = (HttpURLConnection) realURL.openConnection();
			connection.setDoOutput(true);
			connection.setRequestProperty("Content-type", "text/xml");
			connection.setRequestMethod("POST");
			// ��Document����д�����ӵ��������
			// String fileName = strUrl+"\\"+fileID;
			// File file = new File(fileName);
			out = new BufferedOutputStream(connection.getOutputStream());

			if (null != xml) {
				byte[] b = xml.toString().getBytes("UTF-8");
				out.write(b, 0, b.length);
			}
			out.flush();
			out.close();
			// �����ӵ���������ȡ�û�ִ��Ϣ
			inputStream = connection.getInputStream();
			retDoc = XMLUtil.getDocumentBuilder().parse(inputStream); // ����ΪDoc����

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
			throw new BusinessException("д���ļ�ʱ�����쳣��" + path + e.getMessage());
		} finally {
			try {
				if (out != null) {
					out.close(); 
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new BusinessException("�ر��ļ�ʱ�����쳣��" + e.getMessage());
			}
		}
	}

	public void writeToFile(String path, String contents)throws BusinessException {
		
		FileWriter fw = null;
		try {
			newFolder(path);
			// ��������ļ�
			File file = new File(path);
			// ������д���ļ�
			fw = new FileWriter(file);
			fw.write(contents);
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
			throw new BusinessException("д���ļ�ʱ�����쳣��" + path + e.getMessage());
		} finally {
			try {
				if(fw != null){
				fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new BusinessException("�ر��ļ�ʱ�����쳣��" + e.getMessage());
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
			throw new BusinessException("����ʱ��Ϊ�ļ���ʱ�����쳣" + e.getMessage());
		}
		if (filename.equals("")) {
			throw new BusinessException("����ʱ����Ϊ�ļ���ʱ�����쳣");
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
		 
		  int   scale   =   2;//����λ��  
		  int   roundingMode   =   4;//��ʾ�������룬����ѡ��������ֵ��ʽ������ȥβ���ȵ�.  
		  BigDecimal   bd   =   new   BigDecimal(num);  
		  bd   =   bd.setScale(scale,roundingMode);  
		  double ft   =   bd.doubleValue();  
		  return ft; 
	}
	
}
