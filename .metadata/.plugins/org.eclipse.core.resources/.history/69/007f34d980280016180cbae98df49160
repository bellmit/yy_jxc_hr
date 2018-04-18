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
	
	//获取操作数据源对象
	private BaseDAO getBaseDAO() {
		if (basedao == null)
			basedao = new BaseDAO();
		return basedao;
	}
	
	//获取GSON对象
	private Gson getGson() {
		if (gson == null)
			gson = new Gson();
		return gson;
	}
	
	//构造函数
	public WebserviceDao() throws NamingException  {
		// TODO Auto-generated constructor stub
		super();
	}

	//同步凭证
	public Object synVoucher(String xml) {
		// TODO 自动生成的方法存根
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
				int no = voucherVO.getNo();//凭证编码
				String pk_org = voucherVO.getPk_org();//财务组织
				List<DetailVO> detailVOList = voucherVO.getList();//获取分录
				for (DetailVO detailVO : detailVOList) {
					String pk_accsubj = detailVO.getAccountcode();
					String sql = "select bd_accassitem.code from bd_accass " +//辅助核算
							"inner join bd_accasoa " +//会计科目
							"on bd_accass.pk_accasoa = bd_accasoa.pk_accasoa " +
							"inner join bd_account " +//会计科目基本信息
							"on bd_account.pk_account = bd_accasoa.pk_account " +
							"inner join bd_accchart " +//科目表
							"on bd_accchart.pk_accchart = bd_accasoa.pk_accchart " +
							"inner join org_orgs " +
							"on org_orgs.pk_org = bd_accchart.pk_org " +
							"inner join bd_accassitem " +//会计辅助核算项目
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
								String valuecodeSql = "select pk_dept from org_dept where name = '"+assVO.getValuecode()+"'";//后续要判断
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
				//获取xml格式文件
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
					String message = "凭证号【"+no+"】,同步异常："+msg;
					buil.append(message);
					//String message = "导入凭证异常，异常信息："+msg+",详情请查看V6交换平台日志";
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
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
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
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
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
	
	//查询凭证是否记账
	public Object isAccounting(String xml) throws BusiBeanException {
		// TODO 自动生成的方法存根
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
					obj = "此凭证未记账";
				}
				else{
					obj = "此凭证已记账";
				}
			}
		}catch(Exception e){
			throw new BusiBeanException("查询V6凭证是否记账异常,异常信息:"+e.getMessage());
		}
		return obj;
	}
	//有则更新,无则插入
//	private void insertORupdate(Object obj,String type) throws BusiBeanException{
//		
//		String querySQL = "";
//		Object[] objs = null;
//		int length = 0;
//		String xml = "";
//		if(("bd_corp").equals(type)){
//			try{
//				//获取xml格式文件
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
//				throw new BusiBeanException("同步NCV5公司档案,出现异常,异常信息为:"+e.getMessage());
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
//					throw new BusiBeanException("功能未实现,目前无法同步1");
//				}
//				else if(length<=0){
//					System.out.println(deptVO.getDeptcode());
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("同步NCV5部门档案,编码为"+deptVO.getDeptcode()+"出现异常,异常信息为:"+e.getMessage());
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
//					throw new BusiBeanException("功能未实现,目前无法同步1");
//				}
//				else if(length<=0){
//					System.out.println(psndocVO.getPsnname());
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("同步NCV5人员档案,编码为"+psndocVO.getPsnname()+"出现异常,异常信息为:"+e.getMessage());
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
//					throw new BusiBeanException("功能未实现,目前无法同步1");
//				}
//				else if(length<=0){
//					System.out.println(customerVO.getCustcode());
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("同步NCV5客商档案,编码为"+customerVO.getCustcode()+"出现异常,异常信息为:"+e.getMessage());
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
//					throw new BusiBeanException("功能未实现,目前无法同步1");
//				}
//				else if(length<=0){
//					System.out.println(cashflowVO.getCfitemcode());
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("同步NCV5现金流档案,编码为"+cashflowVO.getCfitemcode()+"出现异常,异常信息为:"+e.getMessage());
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
//					throw new BusiBeanException("功能未实现,目前无法同步1");
//				}
//				else if(length<=0){
//					System.out.println(accsubjVO.getSubjcode());
//				}
//			}catch(Exception e){
//				e.printStackTrace();
//				throw new BusiBeanException("同步NCV5科目档案,编码为"+accsubjVO.getSubjcode()+"出现异常,异常信息为:"+e.getMessage());
//			}
//		}
//		else if(("bd_defdoclist").equals(type)){
//			
//		}
//	}
	
}
