package nc.bs.jxc.pub;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.naming.NamingException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import nc.bs.dao.BaseDAO;
import nc.bs.pub.DataManageObject;
import nc.jdbc.framework.processor.ArrayListProcessor;
import nc.jdbc.framework.processor.ArrayProcessor;
import nc.jdbc.framework.processor.ColumnProcessor;
import nc.pub.proxy.CommanProxy_jxc;
import nc.jxc.pub.vo.ErrorMsgVO;
import nc.jxc.pub.voucherVO.AssVO;
import nc.jxc.pub.voucherVO.DetailVO;
import nc.jxc.pub.voucherVO.VoucherVO;
import nc.vo.uap.busibean.exception.BusiBeanException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class WebserviceDao extends DataManageObject {

	private BaseDAO basedao;
	private Gson gson;
	
	//��ȡ��������Դ����
	private BaseDAO getBaseDAO() {
		if (basedao == null)
			basedao = new BaseDAO();
		return basedao;
	}
	
	//��ȡGSON����
	private Gson getGson() {
		if (gson == null)
			gson = new Gson();
		return gson;
	}
	
	//���캯��
	public WebserviceDao() throws NamingException  {
		// TODO Auto-generated constructor stub
		super();
	}

	//ͬ��ƾ֤
	public Object synVoucher(String xml) {
		// TODO �Զ����ɵķ������
		StringBuilder returnMSG = new StringBuilder();
		String splitString = "@_@";
		boolean boo = true;
		StringBuilder buil = new StringBuilder();
//		String splitString2 = "`,`";
		try{
			Type typeToken = new TypeToken<List<VoucherVO>>(){}.getType();
			List<VoucherVO> voucherList = this.getGson().fromJson(xml, typeToken);
			for (VoucherVO voucherVO : voucherList) {
//				List<DetailVO> detailVOList = voucherVO.getList();
//				for (DetailVO detailVO : detailVOList) {
//					List<AssVO> assList = detailVO.getAssList();
//					for (AssVO assVO : assList) {
//						String checktypeSql = "select code from bd_accassitem where name = '"+assVO.getChecktype()+"' ";
//						Object[] checktypeObj = (Object[]) this.getBaseDAO().executeQuery(checktypeSql, new ArrayProcessor());
//						assVO.setChecktype(null == checktypeObj?null:(String)checktypeObj[0]);
////						assVO.setChecktype((String)checktypeObj[0]);
//					}
//				}
				int no = voucherVO.getNo();//ƾ֤����
				String pk_org = voucherVO.getPk_org();//������֯
				List<DetailVO> detailVOList = voucherVO.getList();//��ȡ��¼
				for (DetailVO detailVO : detailVOList) {
					String pk_accsubj = detailVO.getAccountcode();
					String sql = "select bd_accassitem.code from bd_accass " +//��������
							"inner join bd_accasoa " +//��ƿ�Ŀ
							"on bd_accass.pk_accasoa = bd_accasoa.pk_accasoa " +
							"inner join bd_account " +//��ƿ�Ŀ������Ϣ
							"on bd_account.pk_account = bd_accasoa.pk_account " +
							"inner join bd_accchart " +//��Ŀ��
							"on bd_accchart.pk_accchart = bd_accasoa.pk_accchart " +
							"inner join org_orgs " +
							"on org_orgs.pk_org = bd_accchart.pk_org " +
							"inner join bd_accassitem " +//��Ƹ���������Ŀ
							"on bd_accass.pk_entity = bd_accassitem.pk_accassitem " +
							"where bd_account.code = '"+pk_accsubj+"' " +
							"and org_orgs.code = '"+pk_org+"' ";
					List list = (List) this.getBaseDAO().executeQuery(sql, new ArrayListProcessor());
					List<AssVO> newAssList = new ArrayList<AssVO>();
					for(int i=0;i<list.size();i++){
						Object[] obj = (Object[]) list.get(i);
						List<AssVO> assList = detailVO.getAssList();
						for (AssVO assVO : assList) {
							if(assVO.getChecktype().equals((String)obj[0])){
								String checktypeSql = "select pk_accassitem from bd_accassitem where code ='"+assVO.getChecktype()+"'";
								String valuecodeSql = "select pk_dept from org_dept where name = '"+assVO.getValuecode()+"'";//����Ҫ�ж�
								String checktypeObj = (String)this.getBaseDAO().executeQuery(checktypeSql, new ColumnProcessor());
								String valuecodeObj = (String)this.getBaseDAO().executeQuery(valuecodeSql, new ColumnProcessor());
								assVO.setChecktype(checktypeObj);
								assVO.setValuecode(valuecodeObj);
								newAssList.add(assVO);
							}
						}
					}
					detailVO.setAssList(newAssList);
				}
				//��ȡxml��ʽ�ļ�
				xml = CommanProxy_jxc.getPackageXmlSend().packageXml(voucherVO,"gl_voucher");
				
				Document doc = CommanProxy_jxc.getHelperUitl().sendFile(xml);
				Element element = doc.getDocumentElement();
				String successful = element.getAttribute("successful");
				NodeList nodeList = element.getElementsByTagName("resultcode");
				Node node = nodeList.item(0);
				int resultcode = Integer.parseInt(node.getTextContent());
				if( !(("Y").equals(successful) && resultcode == 1) ){
					nodeList = element.getElementsByTagName("resultdescription");
					node = nodeList.item(0);
					String msg = node.getTextContent();
					String message = "ƾ֤�š�"+no+"��,ͬ���쳣��"+msg;
					buil.append(message);
					//String message = "����ƾ֤�쳣���쳣��Ϣ��"+msg+",������鿴V6����ƽ̨��־";
					boo = false;
				}
				else{
					continue;
				}
			}
			if(boo){
				return null;
			}
			else{
				ErrorMsgVO errorMsgVO = new ErrorMsgVO();
				errorMsgVO.setTitle("gl_voucher");
				errorMsgVO.setContent(buil.toString());
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
				String ts = df.format(new Date());
				errorMsgVO.setTs(ts);
				Type type = new TypeToken<ErrorMsgVO>(){}.getType();
				String gsonStr = this.getGson().toJson(errorMsgVO,type);
				if(null != errorMsgVO.getContent()){
					returnMSG.append("false");
					returnMSG.append(splitString);
					returnMSG.append(gsonStr);
				}
			}
		}catch(Exception e){
			ErrorMsgVO ErrorMsgVO = new ErrorMsgVO(); 
			ErrorMsgVO.setTitle("gl_voucher");
			String message = null == e.getMessage()?e.toString():e.getMessage();
			ErrorMsgVO.setContent(message);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
			String ts = df.format(new Date());
			ErrorMsgVO.setTs(ts);
			String gsonStr = this.getGson().toJson(ErrorMsgVO);
			if(null != ErrorMsgVO.getContent()){
				returnMSG.append("false");
				returnMSG.append(splitString);
				returnMSG.append(gsonStr);
			}
		}
		return returnMSG.toString();
	}
	
	//��ѯƾ֤�Ƿ����
	public Object isAccounting(String xml) throws BusiBeanException {
		// TODO �Զ����ɵķ������
		Object obj = null;
		try{
			Type typeToken = new TypeToken<List<VoucherVO>>(){}.getType();
			List<VoucherVO> voucherList = this.getGson().fromJson(xml, typeToken);
			for (VoucherVO voucherVO : voucherList) {
				String sql = "select count(*) from gl_voucher " +
						"where nvl(dr,0)=0 and " +
						"( tallydate = '~' or tallydate = '' or tallydate = null) " +
						"and (pk_manager = 'N/A' or pk_manager = '' or pk_manager = null) " +
						"and free1 = '"+voucherVO.getPk_voucher()+"' ";
				Object[] objs = (Object[]) this.getBaseDAO().executeQuery(sql, new ArrayProcessor());
				int count = (Integer) objs[0];
				if(count>0){
					obj = "��ƾ֤δ����";
				}
				else{
					obj = "��ƾ֤�Ѽ���";
				}
			}
		}catch(Exception e){
			throw new BusiBeanException("��ѯV6ƾ֤�Ƿ�����쳣,�쳣��Ϣ:"+e.getMessage());
		}
		return obj;
	}
	//�������,�������
//	private void insertORupdate(Object obj,String type) throws BusiBeanException{
//		
//		String querySQL = "";
//		Object[] objs = null;
//		int length = 0;
//		String xml = "";
//		if(("bd_corp").equals(type)){
//			try{
//				//��ȡxml��ʽ�ļ�
//				xml = CommanProxy.getPackageXmlSend().packageXml(obj,type);
//				
//				Document doc = CommanProxy.getHelperUitl().sendFile(xml);
//				Element element = doc.getDocumentElement();
//				String successful = element.getAttribute("successful");
//				NodeList NodeList = element.getElementsByTagName("resultcode");
//				Node node = NodeList.item(0);
//				int resultcode = Integer.parseInt(node.getTextContent());
//				if(("Y").equals(successful) && resultcode == 1){
//					
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("ͬ��NCV5��˾����,�����쳣,�쳣��ϢΪ:"+e.getMessage());
//			}
//		}
//		else if(("bd_deptdoc").equals(type)){
//			DeptVO deptVO = (DeptVO) obj;
//			try{
//				querySQL = "select count(code) as length from org_dept where code = '"+deptVO.getDeptcode()+"' and nvl(dr,0)=0";
//				objs = (Object[]) this.getBaseDAO().executeQuery(querySQL,new ArrayProcessor());
//				if(null != objs){
//					length = (Integer) objs[0];
//				}
//				if(length>0){
//					System.out.println(deptVO.getDeptcode());
//					throw new BusiBeanException("����δʵ��,Ŀǰ�޷�ͬ��1");
//				}
//				else if(length<=0){
//					System.out.println(deptVO.getDeptcode());
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("ͬ��NCV5���ŵ���,����Ϊ"+deptVO.getDeptcode()+"�����쳣,�쳣��ϢΪ:"+e.getMessage());
//			}
//		}
//		else if(("bd_psndoc").equals(type)){
//			PsndocVO psndocVO = (PsndocVO) obj;
//			try{
//				querySQL = "select count(code) as length from bd_psndoc where code = '"+psndocVO.getPsnname()+"' and nvl(dr,0)=0";
//				objs = (Object[]) this.getBaseDAO().executeQuery(querySQL,new ArrayProcessor());
//				if(null != objs){
//					length = (Integer) objs[0];
//				}
//				if(length>0){
//					System.out.println(psndocVO.getPsnname());
//					throw new BusiBeanException("����δʵ��,Ŀǰ�޷�ͬ��1");
//				}
//				else if(length<=0){
//					System.out.println(psndocVO.getPsnname());
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("ͬ��NCV5��Ա����,����Ϊ"+psndocVO.getPsnname()+"�����쳣,�쳣��ϢΪ:"+e.getMessage());
//			}
//		}
//		else if(("bd_customer").equals(type)){
//			CustomerVO customerVO = (CustomerVO) obj;
//			try{
//				querySQL = "select count(code) as length from bd_customer where code = '"+customerVO.getCustcode()+"' and nvl(dr,0)=0";
//				objs = (Object[]) this.getBaseDAO().executeQuery(querySQL,new ArrayProcessor());
//				if(null != objs){
//					length = (Integer) objs[0];
//				}
//				if(length>0){
//					System.out.println(customerVO.getCustcode());
//					throw new BusiBeanException("����δʵ��,Ŀǰ�޷�ͬ��1");
//				}
//				else if(length<=0){
//					System.out.println(customerVO.getCustcode());
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("ͬ��NCV5���̵���,����Ϊ"+customerVO.getCustcode()+"�����쳣,�쳣��ϢΪ:"+e.getMessage());
//			}
//		}
//		else if(("bd_cashflow").equals(type)){
//			CashflowVO cashflowVO = (CashflowVO) obj;
//			try{
//				querySQL = "select count(code) as length from bd_cashflow where code = '"+cashflowVO.getCfitemcode()+"' and nvl(dr,0)=0";
//				objs = (Object[]) this.getBaseDAO().executeQuery(querySQL,new ArrayProcessor());
//				if(null != objs){
//					length = (Integer) objs[0];
//				}
//				if(length>0){
//					System.out.println(cashflowVO.getCfitemcode());
//					throw new BusiBeanException("����δʵ��,Ŀǰ�޷�ͬ��1");
//				}
//				else if(length<=0){
//					System.out.println(cashflowVO.getCfitemcode());
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("ͬ��NCV5�ֽ�������,����Ϊ"+cashflowVO.getCfitemcode()+"�����쳣,�쳣��ϢΪ:"+e.getMessage());
//			}
//		}
//		else if(("bd_accsubj").equals(type)){
//			AccsubjVO accsubjVO = (AccsubjVO) obj;
//			try{
//				querySQL = "select count(code) as length from bd_account where code = '"+accsubjVO.getSubjcode()+"' and nvl(dr,0)=0";
//				objs = (Object[]) this.getBaseDAO().executeQuery(querySQL,new ArrayProcessor());
//				if(null != objs){
//					length = (Integer) objs[0];
//				}
//				if(length>0){
//					System.out.println(accsubjVO.getSubjcode());
//					throw new BusiBeanException("����δʵ��,Ŀǰ�޷�ͬ��1");
//				}
//				else if(length<=0){
//					System.out.println(accsubjVO.getSubjcode());
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("ͬ��NCV5��Ŀ����,����Ϊ"+accsubjVO.getSubjcode()+"�����쳣,�쳣��ϢΪ:"+e.getMessage());
//			}
//		}
//		else if(("bd_defdoclist").equals(type)){
//			
//		}
//	}
	
}
