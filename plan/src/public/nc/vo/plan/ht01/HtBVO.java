package nc.vo.plan.ht01;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class HtBVO extends SuperVO {
/**
*备注
*/
public static final String BZ="bz";
/**
*产品项目名称
*/
public static final String CPMC="cpmc";
/**
*产品要求评审
*/
public static final String CPYQPS="cpyqps";
/**
*自定义项1
*/
public static final String DEF1="def1";
/**
*自定义项10
*/
public static final String DEF10="def10";
/**
*自定义项11
*/
public static final String DEF11="def11";
/**
*自定义项12
*/
public static final String DEF12="def12";
/**
*自定义项13
*/
public static final String DEF13="def13";
/**
*自定义项14
*/
public static final String DEF14="def14";
/**
*自定义项15
*/
public static final String DEF15="def15";
/**
*自定义项16
*/
public static final String DEF16="def16";
/**
*自定义项17
*/
public static final String DEF17="def17";
/**
*自定义项18
*/
public static final String DEF18="def18";
/**
*自定义项19
*/
public static final String DEF19="def19";
/**
*自定义项2
*/
public static final String DEF2="def2";
/**
*自定义项20
*/
public static final String DEF20="def20";
/**
*自定义项3
*/
public static final String DEF3="def3";
/**
*自定义项4
*/
public static final String DEF4="def4";
/**
*自定义项5
*/
public static final String DEF5="def5";
/**
*自定义项6
*/
public static final String DEF6="def6";
/**
*自定义项7
*/
public static final String DEF7="def7";
/**
*自定义项8
*/
public static final String DEF8="def8";
/**
*自定义项9
*/
public static final String DEF9="def9";
/**
*合同对方名称
*/
public static final String DFMC="dfmc";
/**
*份数
*/
public static final String FS="fs";
/**
*工令号
*/
public static final String GLH="glh";
/**
*是否合格供方
*/
public static final String HGGF="hggf";
/**
*合同编号
*/
public static final String HTBH="htbh";
/**
*合同金额
*/
public static final String HTJE="htje";
/**
*合同类型
*/
public static final String HTLX="htlx";
/**
*合同评审
*/
public static final String HTPS="htps";
/**
*经办人
*/
public static final String JBR="jbr";
/**
*密级
*/
public static final String MJ="mj";
/**
*部门
*/
public static final String PK_DEPT="pk_dept";
/**
*用印部门
*/
public static final String PK_DEPT_V="pk_dept_v";
/**
*合同单明细主键
*/
public String pk_ht_b;
/**
*上层单据主键
*/
public String pk_ht_h;
/**
*签约人
*/
public static final String QYR="qyr";
/**
*行号
*/
public static final String ROWNO="rowno";
/**
*审价
*/
public static final String SJ="sj";
/**
*授权委托书
*/
public static final String SQWTS="sqwts";
/**
*三重一大
*/
public static final String SZYD="szyd";
/**
*时间戳
*/
public UFDateTime ts;
/**
*文本分发
*/
public static final String WBFF="wbff";
/**
*外协外包项目审批表
*/
public static final String XMSPB="xmspb";
/**
*用印日期
*/
public static final String YYRQ="yyrq";
/**
*印章名称
*/
public static final String YZMC="yzmc";
/** 
* 获取备注
*
* @return 备注
*/
public String getBz () {
return (String) this.getAttributeValue( HtBVO.BZ);
 } 

/** 
* 设置备注
*
* @param bz 备注
*/
public void setBz ( String bz) {
this.setAttributeValue( HtBVO.BZ,bz);
 } 

/** 
* 获取产品项目名称
*
* @return 产品项目名称
*/
public String getCpmc () {
return (String) this.getAttributeValue( HtBVO.CPMC);
 } 

/** 
* 设置产品项目名称
*
* @param cpmc 产品项目名称
*/
public void setCpmc ( String cpmc) {
this.setAttributeValue( HtBVO.CPMC,cpmc);
 } 

/** 
* 获取产品要求评审
*
* @return 产品要求评审
*/
public String getCpyqps () {
return (String) this.getAttributeValue( HtBVO.CPYQPS);
 } 

/** 
* 设置产品要求评审
*
* @param cpyqps 产品要求评审
*/
public void setCpyqps ( String cpyqps) {
this.setAttributeValue( HtBVO.CPYQPS,cpyqps);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getDef1 () {
return (String) this.getAttributeValue( HtBVO.DEF1);
 } 

/** 
* 设置自定义项1
*
* @param def1 自定义项1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( HtBVO.DEF1,def1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public Integer getDef10 () {
return (Integer) this.getAttributeValue( HtBVO.DEF10);
 } 

/** 
* 设置自定义项10
*
* @param def10 自定义项10
*/
public void setDef10 ( Integer def10) {
this.setAttributeValue( HtBVO.DEF10,def10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public Integer getDef11 () {
return (Integer) this.getAttributeValue( HtBVO.DEF11);
 } 

/** 
* 设置自定义项11
*
* @param def11 自定义项11
*/
public void setDef11 ( Integer def11) {
this.setAttributeValue( HtBVO.DEF11,def11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getDef12 () {
return (String) this.getAttributeValue( HtBVO.DEF12);
 } 

/** 
* 设置自定义项12
*
* @param def12 自定义项12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( HtBVO.DEF12,def12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getDef13 () {
return (String) this.getAttributeValue( HtBVO.DEF13);
 } 

/** 
* 设置自定义项13
*
* @param def13 自定义项13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( HtBVO.DEF13,def13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getDef14 () {
return (String) this.getAttributeValue( HtBVO.DEF14);
 } 

/** 
* 设置自定义项14
*
* @param def14 自定义项14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( HtBVO.DEF14,def14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public UFDate getDef15 () {
return (UFDate) this.getAttributeValue( HtBVO.DEF15);
 } 

/** 
* 设置自定义项15
*
* @param def15 自定义项15
*/
public void setDef15 ( UFDate def15) {
this.setAttributeValue( HtBVO.DEF15,def15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getDef16 () {
return (String) this.getAttributeValue( HtBVO.DEF16);
 } 

/** 
* 设置自定义项16
*
* @param def16 自定义项16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( HtBVO.DEF16,def16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getDef17 () {
return (String) this.getAttributeValue( HtBVO.DEF17);
 } 

/** 
* 设置自定义项17
*
* @param def17 自定义项17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( HtBVO.DEF17,def17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getDef18 () {
return (String) this.getAttributeValue( HtBVO.DEF18);
 } 

/** 
* 设置自定义项18
*
* @param def18 自定义项18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( HtBVO.DEF18,def18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getDef19 () {
return (String) this.getAttributeValue( HtBVO.DEF19);
 } 

/** 
* 设置自定义项19
*
* @param def19 自定义项19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( HtBVO.DEF19,def19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getDef2 () {
return (String) this.getAttributeValue( HtBVO.DEF2);
 } 

/** 
* 设置自定义项2
*
* @param def2 自定义项2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( HtBVO.DEF2,def2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getDef20 () {
return (String) this.getAttributeValue( HtBVO.DEF20);
 } 

/** 
* 设置自定义项20
*
* @param def20 自定义项20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( HtBVO.DEF20,def20);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getDef3 () {
return (String) this.getAttributeValue( HtBVO.DEF3);
 } 

/** 
* 设置自定义项3
*
* @param def3 自定义项3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( HtBVO.DEF3,def3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getDef4 () {
return (String) this.getAttributeValue( HtBVO.DEF4);
 } 

/** 
* 设置自定义项4
*
* @param def4 自定义项4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( HtBVO.DEF4,def4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getDef5 () {
return (String) this.getAttributeValue( HtBVO.DEF5);
 } 

/** 
* 设置自定义项5
*
* @param def5 自定义项5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( HtBVO.DEF5,def5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public UFDouble getDef6 () {
return (UFDouble) this.getAttributeValue( HtBVO.DEF6);
 } 

/** 
* 设置自定义项6
*
* @param def6 自定义项6
*/
public void setDef6 ( UFDouble def6) {
this.setAttributeValue( HtBVO.DEF6,def6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public UFDouble getDef7 () {
return (UFDouble) this.getAttributeValue( HtBVO.DEF7);
 } 

/** 
* 设置自定义项7
*
* @param def7 自定义项7
*/
public void setDef7 ( UFDouble def7) {
this.setAttributeValue( HtBVO.DEF7,def7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public UFDouble getDef8 () {
return (UFDouble) this.getAttributeValue( HtBVO.DEF8);
 } 

/** 
* 设置自定义项8
*
* @param def8 自定义项8
*/
public void setDef8 ( UFDouble def8) {
this.setAttributeValue( HtBVO.DEF8,def8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public UFDouble getDef9 () {
return (UFDouble) this.getAttributeValue( HtBVO.DEF9);
 } 

/** 
* 设置自定义项9
*
* @param def9 自定义项9
*/
public void setDef9 ( UFDouble def9) {
this.setAttributeValue( HtBVO.DEF9,def9);
 } 

/** 
* 获取合同对方名称
*
* @return 合同对方名称
*/
public String getDfmc () {
return (String) this.getAttributeValue( HtBVO.DFMC);
 } 

/** 
* 设置合同对方名称
*
* @param dfmc 合同对方名称
*/
public void setDfmc ( String dfmc) {
this.setAttributeValue( HtBVO.DFMC,dfmc);
 } 

/** 
* 获取份数
*
* @return 份数
*/
public Integer getFs () {
return (Integer) this.getAttributeValue( HtBVO.FS);
 } 

/** 
* 设置份数
*
* @param fs 份数
*/
public void setFs ( Integer fs) {
this.setAttributeValue( HtBVO.FS,fs);
 } 

/** 
* 获取工令号
*
* @return 工令号
*/
public String getGlh () {
return (String) this.getAttributeValue( HtBVO.GLH);
 } 

/** 
* 设置工令号
*
* @param glh 工令号
*/
public void setGlh ( String glh) {
this.setAttributeValue( HtBVO.GLH,glh);
 } 

/** 
* 获取是否合格供方
*
* @return 是否合格供方
*/
public String getHggf () {
return (String) this.getAttributeValue( HtBVO.HGGF);
 } 

/** 
* 设置是否合格供方
*
* @param hggf 是否合格供方
*/
public void setHggf ( String hggf) {
this.setAttributeValue( HtBVO.HGGF,hggf);
 } 

/** 
* 获取合同编号
*
* @return 合同编号
*/
public String getHtbh () {
return (String) this.getAttributeValue( HtBVO.HTBH);
 } 

/** 
* 设置合同编号
*
* @param htbh 合同编号
*/
public void setHtbh ( String htbh) {
this.setAttributeValue( HtBVO.HTBH,htbh);
 } 

/** 
* 获取合同金额
*
* @return 合同金额
*/
public UFDouble getHtje () {
return (UFDouble) this.getAttributeValue( HtBVO.HTJE);
 } 

/** 
* 设置合同金额
*
* @param htje 合同金额
*/
public void setHtje ( UFDouble htje) {
this.setAttributeValue( HtBVO.HTJE,htje);
 } 

/** 
* 获取合同类型
*
* @return 合同类型
*/
public String getHtlx () {
return (String) this.getAttributeValue( HtBVO.HTLX);
 } 

/** 
* 设置合同类型
*
* @param htlx 合同类型
*/
public void setHtlx ( String htlx) {
this.setAttributeValue( HtBVO.HTLX,htlx);
 } 

/** 
* 获取合同评审
*
* @return 合同评审
*/
public String getHtps () {
return (String) this.getAttributeValue( HtBVO.HTPS);
 } 

/** 
* 设置合同评审
*
* @param htps 合同评审
*/
public void setHtps ( String htps) {
this.setAttributeValue( HtBVO.HTPS,htps);
 } 

/** 
* 获取经办人
*
* @return 经办人
*/
public String getJbr () {
return (String) this.getAttributeValue( HtBVO.JBR);
 } 

/** 
* 设置经办人
*
* @param jbr 经办人
*/
public void setJbr ( String jbr) {
this.setAttributeValue( HtBVO.JBR,jbr);
 } 

/** 
* 获取密级
*
* @return 密级
*/
public String getMj () {
return (String) this.getAttributeValue( HtBVO.MJ);
 } 

/** 
* 设置密级
*
* @param mj 密级
*/
public void setMj ( String mj) {
this.setAttributeValue( HtBVO.MJ,mj);
 } 

/** 
* 获取部门
*
* @return 部门
*/
public String getPk_dept () {
return (String) this.getAttributeValue( HtBVO.PK_DEPT);
 } 

/** 
* 设置部门
*
* @param pk_dept 部门
*/
public void setPk_dept ( String pk_dept) {
this.setAttributeValue( HtBVO.PK_DEPT,pk_dept);
 } 

/** 
* 获取用印部门
*
* @return 用印部门
*/
public String getPk_dept_v () {
return (String) this.getAttributeValue( HtBVO.PK_DEPT_V);
 } 

/** 
* 设置用印部门
*
* @param pk_dept_v 用印部门
*/
public void setPk_dept_v ( String pk_dept_v) {
this.setAttributeValue( HtBVO.PK_DEPT_V,pk_dept_v);
 } 

/** 
* 获取合同单明细主键
*
* @return 合同单明细主键
*/
public String getPk_ht_b () {
return this.pk_ht_b;
 } 

/** 
* 设置合同单明细主键
*
* @param pk_ht_b 合同单明细主键
*/
public void setPk_ht_b ( String pk_ht_b) {
this.pk_ht_b=pk_ht_b;
 } 

/** 
* 获取上层单据主键
*
* @return 上层单据主键
*/
public String getPk_ht_h () {
return this.pk_ht_h;
 } 

/** 
* 设置上层单据主键
*
* @param pk_ht_h 上层单据主键
*/
public void setPk_ht_h ( String pk_ht_h) {
this.pk_ht_h=pk_ht_h;
 } 

/** 
* 获取签约人
*
* @return 签约人
*/
public String getQyr () {
return (String) this.getAttributeValue( HtBVO.QYR);
 } 

/** 
* 设置签约人
*
* @param qyr 签约人
*/
public void setQyr ( String qyr) {
this.setAttributeValue( HtBVO.QYR,qyr);
 } 

/** 
* 获取行号
*
* @return 行号
*/
public String getRowno () {
return (String) this.getAttributeValue( HtBVO.ROWNO);
 } 

/** 
* 设置行号
*
* @param rowno 行号
*/
public void setRowno ( String rowno) {
this.setAttributeValue( HtBVO.ROWNO,rowno);
 } 

/** 
* 获取审价
*
* @return 审价
*/
public String getSj () {
return (String) this.getAttributeValue( HtBVO.SJ);
 } 

/** 
* 设置审价
*
* @param sj 审价
*/
public void setSj ( String sj) {
this.setAttributeValue( HtBVO.SJ,sj);
 } 

/** 
* 获取授权委托书
*
* @return 授权委托书
*/
public String getSqwts () {
return (String) this.getAttributeValue( HtBVO.SQWTS);
 } 

/** 
* 设置授权委托书
*
* @param sqwts 授权委托书
*/
public void setSqwts ( String sqwts) {
this.setAttributeValue( HtBVO.SQWTS,sqwts);
 } 

/** 
* 获取三重一大
*
* @return 三重一大
*/
public String getSzyd () {
return (String) this.getAttributeValue( HtBVO.SZYD);
 } 

/** 
* 设置三重一大
*
* @param szyd 三重一大
*/
public void setSzyd ( String szyd) {
this.setAttributeValue( HtBVO.SZYD,szyd);
 } 

/** 
* 获取时间戳
*
* @return 时间戳
*/
public UFDateTime getTs () {
return this.ts;
 } 

/** 
* 设置时间戳
*
* @param ts 时间戳
*/
public void setTs ( UFDateTime ts) {
this.ts=ts;
 } 

/** 
* 获取文本分发
*
* @return 文本分发
*/
public String getWbff () {
return (String) this.getAttributeValue( HtBVO.WBFF);
 } 

/** 
* 设置文本分发
*
* @param wbff 文本分发
*/
public void setWbff ( String wbff) {
this.setAttributeValue( HtBVO.WBFF,wbff);
 } 

/** 
* 获取外协外包项目审批表
*
* @return 外协外包项目审批表
*/
public String getXmspb () {
return (String) this.getAttributeValue( HtBVO.XMSPB);
 } 

/** 
* 设置外协外包项目审批表
*
* @param xmspb 外协外包项目审批表
*/
public void setXmspb ( String xmspb) {
this.setAttributeValue( HtBVO.XMSPB,xmspb);
 } 

/** 
* 获取用印日期
*
* @return 用印日期
*/
public UFDate getYyrq () {
return (UFDate) this.getAttributeValue( HtBVO.YYRQ);
 } 

/** 
* 设置用印日期
*
* @param yyrq 用印日期
*/
public void setYyrq ( UFDate yyrq) {
this.setAttributeValue( HtBVO.YYRQ,yyrq);
 } 

/** 
* 获取印章名称
*
* @return 印章名称
*/
public String getYzmc () {
return (String) this.getAttributeValue( HtBVO.YZMC);
 } 

/** 
* 设置印章名称
*
* @param yzmc 印章名称
*/
public void setYzmc ( String yzmc) {
this.setAttributeValue( HtBVO.YZMC,yzmc);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.htHVO");
  }
}