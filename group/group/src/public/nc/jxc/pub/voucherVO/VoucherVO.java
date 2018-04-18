package nc.jxc.pub.voucherVO;

import java.util.ArrayList;
import java.util.List;

import nc.vo.pub.SuperVO;


public class VoucherVO extends SuperVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	private String pk_voucher;
//	private String year;
//	private String pk_glbook;
//	private String pk_glorgbook;
//	private String period;
//	private Integer no;
//	private Integer attachment;
//	private String pk_prepared;
//	private String prepareddate;
//	private String pk_corp;
//	private String free7;
//	private Integer voucherkind;
//	private double totalcredit;
//	private double totaldebit;
//	private String ts;
	private String pk_voucher;//Y
	private String pk_vouchertype;
	private String year;//Y
	private String pk_system;
	private String pk_accountingbook;
	private Boolean discardflag;
	private Boolean signflag; 
	private String pk_org;
	private String pk_org_v;
	private String pk_group;
	private String period;//Y
	private Integer no;//Y
	private Integer attachment;//Y
	private String pk_prepared;//Y
	private String prepareddate;//Y
	private String free7;
	private Integer voucherkind;//Y
	private double totalcredit;
	private double totaldebit;
	private List<DetailVO> list = new ArrayList<DetailVO>();
	
	
	public String getPk_voucher() {
		return pk_voucher;
	}
	public void setPk_voucher(String pk_voucher) {
		this.pk_voucher = pk_voucher;
	}
	public String getPk_vouchertype() {
		return pk_vouchertype;
	}
	public void setPk_vouchertype(String pk_vouchertype) {
		this.pk_vouchertype = pk_vouchertype;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getPk_system() {
		return pk_system;
	}
	public void setPk_system(String pk_system) {
		this.pk_system = pk_system;
	}
	public String getPk_accountingbook() {
		return pk_accountingbook;
	}
	public void setPk_accountingbook(String pk_accountingbook) {
		this.pk_accountingbook = pk_accountingbook;
	}
	public Boolean getDiscardflag() {
		return discardflag;
	}
	public void setDiscardflag(Boolean discardflag) {
		this.discardflag = discardflag;
	}
	public Boolean getSignflag() {
		return signflag;
	}
	public void setSignflag(Boolean signflag) {
		this.signflag = signflag;
	}
	public String getPk_org() {
		return pk_org;
	}
	public void setPk_org(String pk_org) {
		this.pk_org = pk_org;
	}
	public String getPk_org_v() {
		return pk_org_v;
	}
	public void setPk_org_v(String pk_org_v) {
		this.pk_org_v = pk_org_v;
	}
	public String getPk_group() {
		return pk_group;
	}
	public void setPk_group(String pk_group) {
		this.pk_group = pk_group;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public Integer getAttachment() {
		return attachment;
	}
	public void setAttachment(Integer attachment) {
		this.attachment = attachment;
	}
	public String getPk_prepared() {
		return pk_prepared;
	}
	public void setPk_prepared(String pk_prepared) {
		this.pk_prepared = pk_prepared;
	}
	public String getPrepareddate() {
		return prepareddate;
	}
	public void setPrepareddate(String prepareddate) {
		this.prepareddate = prepareddate;
	}
	public String getFree7() {
		return free7;
	}
	public void setFree7(String free7) {
		this.free7 = free7;
	}
	public Integer getVoucherkind() {
		return voucherkind;
	}
	public void setVoucherkind(Integer voucherkind) {
		this.voucherkind = voucherkind;
	}
	public double getTotalcredit() {
		return totalcredit;
	}
	public void setTotalcredit(double totalcredit) {
		this.totalcredit = totalcredit;
	}
	public double getTotaldebit() {
		return totaldebit;
	}
	public void setTotaldebit(double totaldebit) {
		this.totaldebit = totaldebit;
	}
	public List<DetailVO> getList() {
		return list;
	}
	public void setList(List<DetailVO> list) {
		this.list = list;
	}
	@Override
	public String getPKFieldName() {
		// TODO Auto-generated method stub
		return "pk_voucher";
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
