package nc.jxc.pub.voucherVO;

import nc.vo.pub.SuperVO;

public class AssVO extends SuperVO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String freevalueid;
	private String checktype;
	private String checkvalue;
	private String valuecode;
	private String valuename;
	private String ts;
	
	public String getFreevalueid() {
		return freevalueid;
	}
	public void setFreevalueid(String freevalueid) {
		this.freevalueid = freevalueid;
	}
	public String getChecktype() {
		return checktype;
	}
	public void setChecktype(String checktype) {
		this.checktype = checktype;
	}
	public String getCheckvalue() {
		return checkvalue;
	}
	public void setCheckvalue(String checkvalue) {
		this.checkvalue = checkvalue;
	}
	public String getValuecode() {
		return valuecode;
	}
	public void setValuecode(String valuecode) {
		this.valuecode = valuecode;
	}
	public String getValuename() {
		return valuename;
	}
	public void setValuename(String valuename) {
		this.valuename = valuename;
	}
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
	@Override
	public String getPKFieldName() {
		// TODO Auto-generated method stub
		return "freevalueid";
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
