package nc.bs.PackageXmlSend;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import nc.pub.proxy.CommanProxy_jxc;
import nc.vo.bd.account.AccountVO;
import nc.vo.bd.cashflow.CashflowVO;
import nc.vo.bd.cust.CustomerVO;
import nc.vo.bd.defdoc.DefdocVO;
import nc.vo.bd.defdoc.DefdoclistVO;
import nc.vo.bd.psn.PsndocVO;
import nc.vo.bd.psn.PsnjobVO;
import nc.vo.gl.cashflowcase.CashflowcaseVO;
import nc.vo.gl.pubvoucher.DetailVO;
import nc.vo.gl.pubvoucher.VoucherVO;
import nc.vo.glcom.ass.AssVO;
import nc.vo.org.DeptVO;
import nc.vo.org.OrgVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;

public class PackageXmlSend_jxc {

	
	//付款结算单xml Document
//	private static Document document = null;
	
//	//事先 读取付款结算单xml 之后不需要读取
//	static {
//		try {
//			URL path = Thread.currentThread().getContextClassLoader().getResource("D5demo.xml");
//			String url = path.getPath();
//			nc.bs.logging.Logger.debug("获取xml文件路径："+url);
//			document = CommanProxy.getHelperUitl().readXML(url);
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	String account = "01";
	String groupcode = "0";
	
	public String packageXml(Object obj,String type) throws BusinessException{
		
		String xml = "";
		URL path = null;
		String url = "";
		Document document = null;
		boolean boo = true;
		
//		if(("bd_corp").equals(type)){}
//		else if(("bd_deptdoc").equals(type)){}
//		else if(("bd_psndoc").equals(type)){}
//		else if(("bd_customer").equals(type)){}
//		else if(("bd_cashflow").equals(type)){}
//		else if(("bd_accsubj").equals(type)){}
//		else if(("bd_defdoclist").equals(type)){}
//		else if(("bd_defdoc").equals(type)){}
		String str = CommanProxy_jxc.getHelperUitl().getResourceBundle().getString("url");//获取外部交换平台地址

		if(str.indexOf("account")>0){
			account = str.substring(str.indexOf("account"), str.indexOf("&"));
			account = account.split("=")[1];
		}
		if(str.indexOf("groupcode")>0){
			groupcode = str.substring(str.indexOf("groupcode"), str.length());
			groupcode = groupcode.split("=")[1];
		}
		if(("gl_voucher").equals(type)){
			path = Thread.currentThread().getContextClassLoader().getResource("nc/pub/util/xmlDemo/voucher.xml");
			boo = false;
		}
		
		url = null == path ? "" : path.getPath();
		nc.bs.logging.Logger.debug("获取xml文件路径："+url);
		document = CommanProxy_jxc.getHelperUitl().readXML(url);
		xml = getXML(document,obj,type,boo);
		return xml;
	}
	
	public String getXML(Document document,Object obj,String type,boolean boo) throws BusinessException{
		
		String xml = "";
		String[] voHNames = null;
		String[] voBNames = null;
		int length = 0;
		
		OrgVO orgVO = new OrgVO();
		DeptVO deptVO = new DeptVO();
		PsndocVO psndocVO = new PsndocVO();
		PsnjobVO[] psnjobs = null;
		CustomerVO customerVO = new CustomerVO();
		CashflowVO cashflowVO = new CashflowVO();
		AccountVO accountVO = new AccountVO();
		//AccsubjVO accsubjVO = null;
		DefdoclistVO defdoclistVO = new DefdoclistVO();
		DefdocVO defdocVO = new DefdocVO();
		VoucherVO voucherVO = new VoucherVO();
		DetailVO[] detailVOs = null;
		
		if(("gl_voucher").equals(type)){
			nc.jxc.pub.voucherVO.VoucherVO voucherVO2 = (nc.jxc.pub.voucherVO.VoucherVO) obj;
			voucherVO.setPk_voucher(voucherVO2.getPk_voucher());//
			voucherVO.setYear(voucherVO2.getYear());//
			voucherVO.setPk_accountingbook(voucherVO2.getPk_accountingbook());//
			voucherVO.setPeriod(voucherVO2.getPeriod());//
			voucherVO.setNo(voucherVO2.getNo());
			voucherVO.setAttachment(voucherVO2.getAttachment());//
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			voucherVO.setPrepareddate(new UFDate(null == voucherVO2.getPrepareddate()?df.format(date):voucherVO2.getPrepareddate()));//
			voucherVO.setPk_org(voucherVO2.getPk_org());//
			voucherVO.setPk_group(groupcode);//
			voucherVO.setVoucherkind(voucherVO2.getVoucherkind());//
			voucherVO.setPk_prepared(voucherVO2.getPk_prepared());//
			voucherVO.setFree1(voucherVO2.getPk_voucher());
			
			List<nc.jxc.pub.voucherVO.DetailVO> list = voucherVO2.getList();
			detailVOs = new DetailVO[list.size()];
			for(int i=0;i<list.size();i++){
				nc.jxc.pub.voucherVO.DetailVO detailVO2 = list.get(i);
				DetailVO detailVO = new DetailVO();
				detailVO.setDetailindex(detailVO2.getDetailindex());//
				detailVO.setExplanation(detailVO2.getExplanation());//
				detailVO.setPrice(new UFDouble(detailVO2.getPrice()));//
				detailVO.setDebitquantity(new UFDouble(detailVO2.getDebitquantity()));//
				detailVO.setCreditquantity(new UFDouble(detailVO2.getCreditquantity()));//
				detailVO.setDebitamount(new UFDouble(detailVO2.getDebitamount()));//
				detailVO.setCreditamount(new UFDouble(detailVO2.getCreditamount()));//
				detailVO.setLocaldebitamount(new UFDouble(detailVO2.getLocaldebitamount()));
				detailVO.setLocalcreditamount(new UFDouble(detailVO2.getLocalcreditamount()));
				detailVO.setPk_currtype(detailVO2.getPk_currtype());
				detailVO.setPk_accasoa(detailVO2.getPk_accsoa());
				detailVO.setPk_account(detailVO2.getAssid());
				if(null != detailVO2.getAssList()){
					if(detailVO2.getAssList().size()>0){
						List<nc.jxc.pub.voucherVO.AssVO> assVOList = detailVO2.getAssList();
						AssVO[] assVOs = new AssVO[assVOList.size()];
						int j = 0;
						for (nc.jxc.pub.voucherVO.AssVO assVO2 : assVOList) {
							AssVO assVO = new AssVO();
							//assVO.setChecktypecode(assVO2.getValuecode());
							//assVO.setChecktypename();
							//assVO.setCheckvaluecode();
							//assVO.setCheckvaluename();
							assVO.setPk_Checktype(assVO2.getChecktype());
							assVO.setPk_Checkvalue(assVO2.getValuecode());
							assVOs[j] = assVO;
							j++;
						}
						detailVO.setAss(assVOs);
					}
				}
				else{
					detailVO.setAss(null);
				}
				if(null != detailVO2.getCashFlowList()){
					if(detailVO2.getCashFlowList().size()>0){
						List<nc.jxc.pub.voucherVO.CashFlowVO> cashFlowVOList = detailVO2.getCashFlowList();
						CashflowcaseVO[] cashflowcaseVOs = new CashflowcaseVO[cashFlowVOList.size()];
						int j = 0;
						for (nc.jxc.pub.voucherVO.CashFlowVO cashFlowVO2 : cashFlowVOList) {
							CashflowcaseVO cashflowcaseVO = new CashflowcaseVO();
							//assVO.setChecktypecode(assVO2.getValuecode());
							//assVO.setChecktypename();
							//assVO.setCheckvaluecode();
							//assVO.setCheckvaluename();
							cashflowcaseVO.setPk_cashflow(cashFlowVO2.getPk_cashflow());
							cashflowcaseVO.setM_pk_currtype(cashFlowVO2.getM_pk_currtype());
							cashflowcaseVO.setMoney(new UFDouble(cashFlowVO2.getMoney()));
							cashflowcaseVO.setMoneymain(new UFDouble(cashFlowVO2.getMoneymain()));
							cashflowcaseVOs[j] = cashflowcaseVO;
							j++;
						}
						detailVO.setCashFlow(cashflowcaseVOs);
					}
					else{
						detailVO.setCashFlow(null);
					}
				}
				else{
					detailVO.setCashFlow(null);
				}
				detailVOs[i] = detailVO;
			}
			length = detailVOs.length;
			voucherVO.setDetails(detailVOs);
			
			Vector<String> vH = new Vector<String>();
			for(int i=0;i<voucherVO.getAttributeNames().length;i++){
				vH.add(voucherVO.getAttributeNames()[i]);
			}
			vH.add("pk_accountingbook");
			vH.add("pk_org");
			vH.add("pk_group");
			Object [] objs = vH.toArray();
			voHNames = new String[objs.length];
			for(int i=0;i<objs.length;i++){
				voHNames[i] = objs[i].toString();
			}
			voBNames = detailVOs[0].getAttributeNames();
		}
		
		if(boo){
			Element element = rebuildDocument(document,length);
			element.setAttribute("account", account);
			element.setAttribute("groupcode", groupcode);
//			Element billElement = (Element) element.getElementsByTagName("bill").item(0);
			NodeList hList = element.getElementsByTagName("billhead");
			//bList.getLength() item 标签的个数，即表头数
			for(int i=0;i<hList.getLength();i++){
				Element hElement = (Element) hList.item(i);
				for(int k=0;k<voHNames.length;k++){
					NodeList hNodeList = hElement.getElementsByTagName(voHNames[k]);
					for(int j=0;j<hNodeList.getLength();j++){
						Node node = hNodeList.item(j);
						Node Hnode = node.getParentNode();
						String parentName = Hnode.getNodeName();
					}
				}
			}
		}
		else{
			Element element = rebuildDocument(document,length);
			element.setAttribute("account", account);
			element.setAttribute("groupcode", groupcode);
			if(("bd_psndoc").equals(type)){
//				NodeList billNodeList =  element.getElementsByTagName("bill");
//				Element billElement = (Element) element.getElementsByTagName("bill");
				NodeList hList = element.getElementsByTagName("billhead");
				//bList.getLength() item 标签的个数，即表头数
				for(int i=0;i<hList.getLength();i++){
					Element hElement = (Element) hList.item(i);
					for(int k=0;k<voHNames.length;k++){
						NodeList hNodeList = hElement.getElementsByTagName(voHNames[k]);
						for(int j=0;j<hNodeList.getLength();j++){
							Node node = hNodeList.item(j);
							Node Hnode = node.getParentNode();
							String parentName = Hnode.getNodeName();
							if(("billhead").equals(parentName)){
//								Element billElement = (Element) billNodeList.item(0);
//								billElement.setAttribute("id", psndocVO.getCode());
//								System.out.println(node.getNodeName());
//								System.out.println(voHNames[k]);
								if(!node.hasChildNodes()){
									node.setTextContent(null==psndocVO.getAttributeValue(voHNames[k])?node.getTextContent():psndocVO.getAttributeValue(voHNames[k]).toString());
								}
							}
						}
					}
				}
				if(null != psnjobs){
					NodeList itemList = element.getElementsByTagName("item");
					//bList.getLength() item 标签的个数，即表体数
					for(int i=0;i<itemList.getLength();i++){
						Element bElement = (Element) itemList.item(i);
						for(int k=0;k<voBNames.length;k++){
							NodeList bNodeList = bElement.getElementsByTagName(voBNames[k]);
							for(int j=0;j<bNodeList.getLength();j++){
								Node node = bNodeList.item(j);
								Node bnode = node.getParentNode();
								String parentName = bnode.getNodeName();
								if(("item").equals(parentName)){
//									System.out.println(node.getNodeName());
//									System.out.println(voBNames[k]);
									node.setTextContent(null==psnjobs[i].getAttributeValue(voBNames[k])?node.getTextContent():psnjobs[i].getAttributeValue(voBNames[k]).toString());
								}
							}
						}
					}
				}
			}
			/*************************************
			 * 凭证
			 **************************************/
			else if(("gl_voucher").equals(type)){
				NodeList voucherNodeList = element.getElementsByTagName("voucher");
				NodeList hList = element.getElementsByTagName("voucher_head");
				//bList.getLength() item 标签的个数，即表头数
				for(int i=0;i<hList.getLength();i++){
					Element hElement = (Element) hList.item(i);
					for(int k=0;k<voHNames.length;k++){
						NodeList hNodeList = hElement.getElementsByTagName(voHNames[k]);
						for(int j=0;j<hNodeList.getLength();j++){
							Node node = hNodeList.item(j);
							Node Hnode = node.getParentNode();
							String parentName = Hnode.getNodeName();
							if(("voucher_head").equals(parentName)){
//								Element voucherElement = (Element)voucherNodeList.item(0);
//								voucherElement.setAttribute("id", voucherVO.getPk_voucher());
								if(("voucher_head").equals(parentName)){
									if(("pk_accountingbook").equals(node.getNodeName())){
										node.setTextContent(voucherVO.getPk_accountingbook());
									}
									else if(("pk_org").equals(node.getNodeName())){
										node.setTextContent(voucherVO.getPk_org());
									}
									else if(("pk_group").equals(node.getNodeName())){
										node.setTextContent(voucherVO.getPk_group());
									}
									else if(("pk_voucher").equals(node.getNodeName())){
										node.setTextContent(null);
									}
									else if(("no").equals(node.getNodeName())){
										node.setTextContent(String.valueOf(voucherVO.getNo()));
									}
									else if(("free1").equals(node.getNodeName())){
										node.setTextContent(voucherVO.getFree1());
									}
									else{
										node.setTextContent(null==voucherVO.getAttributeValue(voHNames[k])?node.getTextContent():voucherVO.getAttributeValue(voHNames[k]).toString());
									}
								}
							}
						}
					}
				}
				if(null != detailVOs){
					NodeList itemList = element.getElementsByTagName("item");
					//bList.getLength() item 标签的个数，即表体数
					for(int i=0;i<detailVOs.length;i++){
						Node bNode = itemList.item(i);
						if(("details").equals(bNode.getParentNode().getNodeName())){
							Element bElement = (Element) itemList.item(i);
							for(int k=0;k<voBNames.length;k++){
								NodeList bNodeList = bElement.getElementsByTagName(voBNames[k]);
								for(int j=0;j<bNodeList.getLength();j++){
									Node node = bNodeList.item(j);
									Node bnode = node.getParentNode().getParentNode();
									String parentName = bnode.getNodeName();
									if(("details").equals(parentName)){
										if(("detailindex").equals(node.getNodeName())){
											node.setTextContent(String.valueOf(null==detailVOs[i].getDetailindex()?0:detailVOs[i].getDetailindex()));
										}
										else if(("explanation").equals(node.getNodeName())){
											node.setTextContent(null==detailVOs[i].getExplanation()?null:detailVOs[i].getExplanation());
										}
										else if(("price").equals(node.getNodeName())){
											node.setTextContent(String.valueOf(null==detailVOs[i].getPrice()?0.00:detailVOs[i].getPrice()));
										}
										else if(("debitquantity").equals(node.getNodeName())){
											node.setTextContent(String.valueOf(null==detailVOs[i].getDebitquantity()?0.00:detailVOs[i].getDebitquantity()));
										}
										else if(("creditquantity").equals(node.getNodeName())){
											node.setTextContent(String.valueOf(null==detailVOs[i].getCreditquantity()?0.00:detailVOs[i].getCreditquantity()));
										}
										else if(("debitamount").equals(node.getNodeName())){
											node.setTextContent(String.valueOf(null==detailVOs[i].getDebitamount()?0.00:detailVOs[i].getDebitamount()));
										}
										else if(("creditamount").equals(node.getNodeName())){
											node.setTextContent(String.valueOf(null==detailVOs[i].getCreditamount()?0.00:detailVOs[i].getCreditamount()));
										}
										else if(("localdebitamount").equals(node.getNodeName())){
											node.setTextContent(String.valueOf(null==detailVOs[i].getLocaldebitamount()?0.00:detailVOs[i].getLocaldebitamount()));
										}
										else if(("localcreditamount").equals(node.getNodeName())){
											node.setTextContent(String.valueOf(null==detailVOs[i].getLocalcreditamount()?0.00:detailVOs[i].getLocalcreditamount()));
										}
										else if(("pk_currtype").equals(node.getNodeName())){
											node.setTextContent(null==detailVOs[i].getPk_currtype()?node.getTextContent():detailVOs[i].getPk_currtype());
										}
										else if(("pk_accasoa").equals(node.getNodeName())){
											node.setTextContent(null==detailVOs[i].getPk_accasoa()?null:detailVOs[i].getPk_accasoa());
										}
										else{
											node.setTextContent(null==detailVOs[i].getAttributeValue(voBNames[k])?node.getTextContent():detailVOs[i].getAttributeValue(voBNames[k]).toString());
										}
									}
								}
							}
							//加入辅助核算
							//								if(null != detailVOs[i].getAss()){
							//									Element assElement = document.createElement("ass");
							//									for(int j=0;j<detailVOs[i].getAss().length;j++){
							//										AssVO assVO = new AssVO();
							//										assVO = detailVOs[i].getAss()[j];
							//										Element itemElement = document.createElement("item");
							//										Element pk_ChecktypeElement = document.createElement("pk_Checktype");
							//										pk_ChecktypeElement.setTextContent(null==assVO.getPk_Checktype()?null:assVO.getPk_Checktype());
							//										Element pk_CheckvalueElement = document.createElement("pk_Checkvalue");
							//										pk_CheckvalueElement.setTextContent(null==assVO.getPk_Checkvalue()?null:assVO.getPk_Checkvalue());
							//										itemElement.appendChild(pk_ChecktypeElement);
							//										itemElement.appendChild(pk_CheckvalueElement);
							//										assElement.appendChild(itemElement);
							//									}
							//									bElement.appendChild(assElement);
							//								}
							//								//加入现金流
							//								if(null != detailVOs[i].getCashFlow()){
							//									Element cashElement = document.createElement("cashFlow");
							//									for(int j=0;j<detailVOs[i].getCashFlow().length;j++){
							//										CashflowcaseVO cashflowcaseVO = new CashflowcaseVO();
							//										cashflowcaseVO = detailVOs[i].getCashFlow()[j];
							//										Element itemElement = document.createElement("item");
							//										Element m_pk_currtypeElement = document.createElement("m_pk_currtype");
							//										m_pk_currtypeElement.setTextContent(null==cashflowcaseVO.getM_pk_currtype()?null:cashflowcaseVO.getM_pk_currtype());
							//										Element moneyElement = document.createElement("money");
							//										moneyElement.setTextContent(String.valueOf(null==cashflowcaseVO.getMoney()?0.00:cashflowcaseVO.getMoney()));
							//										Element moneyglobalElement = document.createElement("moneyglobal");
							//										moneyglobalElement.setTextContent(String.valueOf(null==cashflowcaseVO.getMoneyglobal()?0.00:cashflowcaseVO.getMoneyglobal()));
							//										Element moneygroupElement = document.createElement("moneygroup");
							//										moneygroupElement.setTextContent(String.valueOf(null==cashflowcaseVO.getMoneygroup()?0.00:cashflowcaseVO.getMoneygroup()));
							//										Element moneymainElement = document.createElement("moneymain");
							//										moneymainElement.setTextContent(String.valueOf(null==cashflowcaseVO.getMoneymain()?0.00:cashflowcaseVO.getMoneymain()));
							//										Element pk_cashflowElement = document.createElement("pk_cashflow");
							//										pk_cashflowElement.setTextContent(null==cashflowcaseVO.getPk_cashflow()?null:cashflowcaseVO.getPk_cashflow());
							//										itemElement.appendChild(m_pk_currtypeElement);
							//										itemElement.appendChild(moneyElement);
							//										itemElement.appendChild(moneyglobalElement);
							//										itemElement.appendChild(moneygroupElement);
							//										itemElement.appendChild(moneymainElement);
							//										itemElement.appendChild(pk_cashflowElement);
							//										cashElement.appendChild(itemElement);
							//									}
							//									bElement.appendChild(cashElement);
							//								}
						}
					}
					int x = 0;
					for(int i=0;i<itemList.getLength();i++){
						Node bNode = itemList.item(i);
						if(("details").equals(bNode.getParentNode().getNodeName())){
							Element bElement = (Element) itemList.item(i);
							//加入辅助核算
							if(null != detailVOs[x].getAss()){
								Element assElement = document.createElement("ass");
								for(int j=0;j<detailVOs[x].getAss().length;j++){
									AssVO assVO = new AssVO();
									assVO = detailVOs[x].getAss()[j];
									Element itemElement = document.createElement("item");
									Element pk_ChecktypeElement = document.createElement("pk_Checktype");
									pk_ChecktypeElement.setTextContent(null==assVO.getPk_Checktype()?null:assVO.getPk_Checktype());
									Element pk_CheckvalueElement = document.createElement("pk_Checkvalue");
									String checktype = assVO.getPk_Checktype();
									if(("0002").equals(checktype)){
										pk_CheckvalueElement.setTextContent(null==assVO.getPk_Checkvalue()?null:"SH"+assVO.getPk_Checkvalue());
									}
									else{
										pk_CheckvalueElement.setTextContent(null==assVO.getPk_Checkvalue()?null:assVO.getPk_Checkvalue());	
									}
									itemElement.appendChild(pk_ChecktypeElement);
									itemElement.appendChild(pk_CheckvalueElement);
									assElement.appendChild(itemElement);
								}
								bElement.appendChild(assElement);
							}
							//加入现金流
							if(null != detailVOs[x].getCashFlow()){
								Element cashElement = document.createElement("cashFlow");
								for(int j=0;j<detailVOs[x].getCashFlow().length;j++){
									CashflowcaseVO cashflowcaseVO = new CashflowcaseVO();
									cashflowcaseVO = detailVOs[x].getCashFlow()[j];
									Element itemElement = document.createElement("item");
									Element m_pk_currtypeElement = document.createElement("m_pk_currtype");
									m_pk_currtypeElement.setTextContent(null==cashflowcaseVO.getM_pk_currtype()?null:cashflowcaseVO.getM_pk_currtype());
									Element moneyElement = document.createElement("money");
									moneyElement.setTextContent(String.valueOf(null==cashflowcaseVO.getMoney()?0.00:cashflowcaseVO.getMoney()));
									Element moneyglobalElement = document.createElement("moneyglobal");
									moneyglobalElement.setTextContent(String.valueOf(null==cashflowcaseVO.getMoneyglobal()?0.00:cashflowcaseVO.getMoneyglobal()));
									Element moneygroupElement = document.createElement("moneygroup");
									moneygroupElement.setTextContent(String.valueOf(null==cashflowcaseVO.getMoneygroup()?0.00:cashflowcaseVO.getMoneygroup()));
									Element moneymainElement = document.createElement("moneymain");
									moneymainElement.setTextContent(String.valueOf(null==cashflowcaseVO.getMoneymain()?0.00:cashflowcaseVO.getMoneymain()));
									Element pk_cashflowElement = document.createElement("pk_cashflow");
									pk_cashflowElement.setTextContent(null==cashflowcaseVO.getPk_cashflow()?null:cashflowcaseVO.getPk_cashflow());
									itemElement.appendChild(m_pk_currtypeElement);
									itemElement.appendChild(moneyElement);
									itemElement.appendChild(moneyglobalElement);
									itemElement.appendChild(moneygroupElement);
									itemElement.appendChild(moneymainElement);
									itemElement.appendChild(pk_cashflowElement);
									cashElement.appendChild(itemElement);
								}
								bElement.appendChild(cashElement);
							}
							x++;
						}
					}
				}
			}
		}
		//addAssDocument(detailVOs,document);
		xml = CommanProxy_jxc.getHelperUitl().documentToString(document);
		System.out.println(xml);
		return xml;
	}
	
	//根据表体数 重构xml
	public Element rebuildDocument(Document document,int length) throws BusinessException {
		
		Element newElement = null;
		try{
			if(length>1){
				Element element = document.getDocumentElement();
				NodeList itemsList = element.getElementsByTagName("details");
				Element itemsElement = (Element) itemsList.item(0);
				
				NodeList itemList = element.getElementsByTagName("item");
				Element itemElement = (Element) itemList.item(0);
				itemList.getLength();
				for(int l=0;l<length-1;l++){
					Element newItemElement = document.createElement(itemElement.getNodeName());
					NodeList itemChildList = itemElement.getChildNodes();
					for(int i=0;i<itemChildList.getLength();i++){
						Node itemChildNode = itemChildList.item(i);
						if(itemChildNode.getNodeType() == Node.ELEMENT_NODE){
//							System.out.println(itemChildNode.getNodeName());
							Element newItemChildNode = document.createElement(itemChildNode.getNodeName());
//							System.out.println(itemChildNode.getTextContent());
							if(null != itemChildNode.getTextContent()){
								newItemChildNode.setTextContent(itemChildNode.getTextContent());
							}
							newItemElement.appendChild(newItemChildNode);
						}
					}
					itemsElement.appendChild(newItemElement);
					newElement = element;
				}
			}
			else {
				Element element = document.getDocumentElement();
				newElement = element;
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new BusinessException("重构xml异常："+e.getMessage());
		}
		return newElement;
	}

}
