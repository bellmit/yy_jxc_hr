package nc.jxc.pub.voucherVO;

import java.util.ArrayList;
import java.util.List;
import nc.vo.pub.SuperVO;

public class DetailVO extends SuperVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pk_voucher;
	private String pk_detail;//Y
	private Integer detailindex;//Y
	private String explanation;//Y
	private double price;//Y
	private double debitquantity;//Y
	private double creditquantity;
	private double debitamount;//Y
	private double creditamount;//Y
	private double localdebitamount;//Y
	private double localcreditamount;//Y
	private String pk_currtype;//Y
	private String pk_accsoa;//会计科目
	private String assid;//Y
	private String ts;//Y
	private String accountcode;
	public String getAccountcode() {
		return accountcode;
	}
	public void setAccountcode(String accountcode) {
		this.accountcode = accountcode;
	}
	private List<AssVO> assList = new ArrayList<AssVO>();
	List<CashFlowVO> cashFlowList = new ArrayList<CashFlowVO>();
	
	public String getPk_voucher() {
		return pk_voucher;
	}
	public void setPk_voucher(String pk_voucher) {
		this.pk_voucher = pk_voucher;
	}
	public String getPk_detail() {
		return pk_detail;
	}
	public void setPk_detail(String pk_detail) {
		this.pk_detail = pk_detail;
	}
	public Integer getDetailindex() {
		return detailindex;
	}
	public void setDetailindex(Integer detailindex) {
		this.detailindex = detailindex;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDebitquantity() {
		return debitquantity;
	}
	public void setDebitquantity(double debitquantity) {
		this.debitquantity = debitquantity;
	}
	public double getCreditquantity() {
		return creditquantity;
	}
	public void setCreditquantity(double creditquantity) {
		this.creditquantity = creditquantity;
	}
	public double getDebitamount() {
		return debitamount;
	}
	public void setDebitamount(double debitamount) {
		this.debitamount = debitamount;
	}
	public double getCreditamount() {
		return creditamount;
	}
	public void setCreditamount(double creditamount) {
		this.creditamount = creditamount;
	}
	public double getLocaldebitamount() {
		return localdebitamount;
	}
	public void setLocaldebitamount(double localdebitamount) {
		this.localdebitamount = localdebitamount;
	}
	public double getLocalcreditamount() {
		return localcreditamount;
	}
	public void setLocalcreditamount(double localcreditamount) {
		this.localcreditamount = localcreditamount;
	}
	public String getPk_currtype() {
		return pk_currtype;
	}
	public void setPk_currtype(String pk_currtype) {
		this.pk_currtype = pk_currtype;
	}
	public String getPk_accsoa() {
		return pk_accsoa;
	}
	public void setPk_accsoa(String pk_accsoa) {
		this.pk_accsoa = pk_accsoa;
	}
	public String getAssid() {
		return assid;
	}
	public void setAssid(String assid) {
		this.assid = assid;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	public List<AssVO> getAssList() {
		return assList;
	}
	public void setAssList(List<AssVO> assList) {
		this.assList = assList;
	}
	public List<CashFlowVO> getCashFlowList() {
		return cashFlowList;
	}
	public void setCashFlowList(List<CashFlowVO> cashFlowList) {
		this.cashFlowList = cashFlowList;
	}
	@Override
	public String getPKFieldName() {
		// TODO Auto-generated method stub
		return "pk_detail";
	}
	@Override
	public String getParentPKFieldName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
