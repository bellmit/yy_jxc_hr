package nc.vo.plan.jx01;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public class SGDDTO extends SuperVO {
	private String pk_sgd_b;
	private String pk_sgd_h;
	private String dept;
	private String pk_dept_v;
	private String gz;
	private String bm_gz;
	private String sgdh_bm_gz;
	private UFDouble gs;
	private String pk_org;
	private String pk_org_v;
	private String pk_group;
	private Integer dr;
	private UFDateTime ts;
	private UFDateTime modifiedtime;
	private String modifier;
	
	
	
	
	@Override
	public String getTableName() {
		return "jxc_hr_sgd_b";
	}
	@Override
	public String getPrimaryKey() {
		return "pk_sgd_b";
	}
	public String getPk_sgd_b() {
		return pk_sgd_b;
	}
	public void setPk_sgd_b(String pk_sgd_b) {
		this.pk_sgd_b = pk_sgd_b;
	}
	public String getPk_sgd_h() {
		return pk_sgd_h;
	}
	public void setPk_sgd_h(String pk_sgd_h) {
		this.pk_sgd_h = pk_sgd_h;
	}
	public String getBm_gz() {
		return bm_gz;
	}
	public void setBm_gz(String bm_gz) {
		this.bm_gz = bm_gz;
	}
	
	public UFDouble getGs() {
		return gs;
	}
	public void setGs(UFDouble gs) {
		this.gs = gs;
	}
	public String getSgdh_bm_gz() {
		return sgdh_bm_gz;
	}
	public void setSgdh_bm_gz(String sgdh_bm_gz) {
		this.sgdh_bm_gz = sgdh_bm_gz;
	}
	public String getGz() {
		return gz;
	}
	public void setGz(String gz) {
		this.gz = gz;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
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
	public Integer getDr() {
		return dr;
	}
	public void setDr(Integer dr) {
		this.dr = dr;
	}
	public UFDateTime getTs() {
		return ts;
	}
	public void setTs(UFDateTime ts) {
		this.ts = ts;
	}
	public UFDateTime getModifiedtime() {
		return modifiedtime;
	}
	public void setModifiedtime(UFDateTime modifiedtime) {
		this.modifiedtime = modifiedtime;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String getPk_dept_v() {
		return pk_dept_v;
	}
	public void setPk_dept_v(String pk_dept_v) {
		this.pk_dept_v = pk_dept_v;
	}
}
