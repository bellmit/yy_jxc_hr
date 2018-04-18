package nc.vo.plan.jx03;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class SWLGSBVO extends SuperVO {
/**
*班组
*/
public static final String BZ="bz";
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
*自定义项21
*/
public static final String DEF21="def21";
/**
*自定义项22
*/
public static final String DEF22="def22";
/**
*自定义项23
*/
public static final String DEF23="def23";
/**
*自定义项24
*/
public static final String DEF24="def24";
/**
*自定义项25
*/
public static final String DEF25="def25";
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
*定额工时
*/
public static final String DEGS="degs";
/**
*工令号
*/
public static final String GL="gl";
/**
*工令名称
*/
public static final String GLNAME="glname";
/**
*工时类型
*/
public static final String GSLX="gslx";
/**
*工种
*/
public static final String GZ="gz";
/**
*进度(%)
*/
public static final String JD="jd";
/**
*人员
*/
public static final String PEOPLE="people";
/**
*实物量工时明细主键
*/
public String pk_swlgs_b;
/**
*上层单据主键
*/
public String pk_swlgs_h;
/**
*行号
*/
public static final String ROWNO="rowno";
/**
*来源单据id
*/
public static final String SRCBILLID="srcbillid";
/**
*来源单据表体id
*/
public static final String SRCBILLID_B="srcbillid_b";
/**
*实物量工时
*/
public static final String SWLGS="swlgs";
/**
*日期
*/
public static final String SWLGS_DATE="swlgs_date";
/**
*时间戳
*/
public UFDateTime ts;
/** 
* 获取班组
*
* @return 班组
*/
public String getBz () {
return (String) this.getAttributeValue( SWLGSBVO.BZ);
 } 

/** 
* 设置班组
*
* @param bz 班组
*/
public void setBz ( String bz) {
this.setAttributeValue( SWLGSBVO.BZ,bz);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getDef1 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF1);
 } 

/** 
* 设置自定义项1
*
* @param def1 自定义项1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( SWLGSBVO.DEF1,def1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getDef10 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF10);
 } 

/** 
* 设置自定义项10
*
* @param def10 自定义项10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( SWLGSBVO.DEF10,def10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getDef11 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF11);
 } 

/** 
* 设置自定义项11
*
* @param def11 自定义项11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( SWLGSBVO.DEF11,def11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getDef12 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF12);
 } 

/** 
* 设置自定义项12
*
* @param def12 自定义项12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( SWLGSBVO.DEF12,def12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getDef13 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF13);
 } 

/** 
* 设置自定义项13
*
* @param def13 自定义项13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( SWLGSBVO.DEF13,def13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getDef14 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF14);
 } 

/** 
* 设置自定义项14
*
* @param def14 自定义项14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( SWLGSBVO.DEF14,def14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getDef15 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF15);
 } 

/** 
* 设置自定义项15
*
* @param def15 自定义项15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( SWLGSBVO.DEF15,def15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getDef16 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF16);
 } 

/** 
* 设置自定义项16
*
* @param def16 自定义项16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( SWLGSBVO.DEF16,def16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getDef17 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF17);
 } 

/** 
* 设置自定义项17
*
* @param def17 自定义项17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( SWLGSBVO.DEF17,def17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getDef18 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF18);
 } 

/** 
* 设置自定义项18
*
* @param def18 自定义项18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( SWLGSBVO.DEF18,def18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getDef19 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF19);
 } 

/** 
* 设置自定义项19
*
* @param def19 自定义项19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( SWLGSBVO.DEF19,def19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getDef2 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF2);
 } 

/** 
* 设置自定义项2
*
* @param def2 自定义项2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( SWLGSBVO.DEF2,def2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getDef20 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF20);
 } 

/** 
* 设置自定义项20
*
* @param def20 自定义项20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( SWLGSBVO.DEF20,def20);
 } 

/** 
* 获取自定义项21
*
* @return 自定义项21
*/
public String getDef21 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF21);
 } 

/** 
* 设置自定义项21
*
* @param def21 自定义项21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( SWLGSBVO.DEF21,def21);
 } 

/** 
* 获取自定义项22
*
* @return 自定义项22
*/
public String getDef22 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF22);
 } 

/** 
* 设置自定义项22
*
* @param def22 自定义项22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( SWLGSBVO.DEF22,def22);
 } 

/** 
* 获取自定义项23
*
* @return 自定义项23
*/
public String getDef23 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF23);
 } 

/** 
* 设置自定义项23
*
* @param def23 自定义项23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( SWLGSBVO.DEF23,def23);
 } 

/** 
* 获取自定义项24
*
* @return 自定义项24
*/
public String getDef24 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF24);
 } 

/** 
* 设置自定义项24
*
* @param def24 自定义项24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( SWLGSBVO.DEF24,def24);
 } 

/** 
* 获取自定义项25
*
* @return 自定义项25
*/
public String getDef25 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF25);
 } 

/** 
* 设置自定义项25
*
* @param def25 自定义项25
*/
public void setDef25 ( String def25) {
this.setAttributeValue( SWLGSBVO.DEF25,def25);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getDef3 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF3);
 } 

/** 
* 设置自定义项3
*
* @param def3 自定义项3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( SWLGSBVO.DEF3,def3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getDef4 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF4);
 } 

/** 
* 设置自定义项4
*
* @param def4 自定义项4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( SWLGSBVO.DEF4,def4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getDef5 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF5);
 } 

/** 
* 设置自定义项5
*
* @param def5 自定义项5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( SWLGSBVO.DEF5,def5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getDef6 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF6);
 } 

/** 
* 设置自定义项6
*
* @param def6 自定义项6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( SWLGSBVO.DEF6,def6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getDef7 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF7);
 } 

/** 
* 设置自定义项7
*
* @param def7 自定义项7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( SWLGSBVO.DEF7,def7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getDef8 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF8);
 } 

/** 
* 设置自定义项8
*
* @param def8 自定义项8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( SWLGSBVO.DEF8,def8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getDef9 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF9);
 } 

/** 
* 设置自定义项9
*
* @param def9 自定义项9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( SWLGSBVO.DEF9,def9);
 } 

/** 
* 获取定额工时
*
* @return 定额工时
*/
public UFDouble getDegs () {
return (UFDouble) this.getAttributeValue( SWLGSBVO.DEGS);
 } 

/** 
* 设置定额工时
*
* @param degs 定额工时
*/
public void setDegs ( UFDouble degs) {
this.setAttributeValue( SWLGSBVO.DEGS,degs);
 } 

/** 
* 获取工令号
*
* @return 工令号
*/
public String getGl () {
return (String) this.getAttributeValue( SWLGSBVO.GL);
 } 

/** 
* 设置工令号
*
* @param gl 工令号
*/
public void setGl ( String gl) {
this.setAttributeValue( SWLGSBVO.GL,gl);
 } 

/** 
* 获取工令名称
*
* @return 工令名称
*/
public String getGlname () {
return (String) this.getAttributeValue( SWLGSBVO.GLNAME);
 } 

/** 
* 设置工令名称
*
* @param glname 工令名称
*/
public void setGlname ( String glname) {
this.setAttributeValue( SWLGSBVO.GLNAME,glname);
 } 

/** 
* 获取工时类型
*
* @return 工时类型
* @see String
*/
public String getGslx () {
return (String) this.getAttributeValue( SWLGSBVO.GSLX);
 } 

/** 
* 设置工时类型
*
* @param gslx 工时类型
* @see String
*/
public void setGslx ( String gslx) {
this.setAttributeValue( SWLGSBVO.GSLX,gslx);
 } 

/** 
* 获取工种
*
* @return 工种
*/
public String getGz () {
return (String) this.getAttributeValue( SWLGSBVO.GZ);
 } 

/** 
* 设置工种
*
* @param gz 工种
*/
public void setGz ( String gz) {
this.setAttributeValue( SWLGSBVO.GZ,gz);
 } 

/** 
* 获取进度(%)
*
* @return 进度(%)
*/
public UFDouble getJd () {
return (UFDouble) this.getAttributeValue( SWLGSBVO.JD);
 } 

/** 
* 设置进度(%)
*
* @param jd 进度(%)
*/
public void setJd ( UFDouble jd) {
this.setAttributeValue( SWLGSBVO.JD,jd);
 } 

/** 
* 获取人员
*
* @return 人员
*/
public String getPeople () {
return (String) this.getAttributeValue( SWLGSBVO.PEOPLE);
 } 

/** 
* 设置人员
*
* @param people 人员
*/
public void setPeople ( String people) {
this.setAttributeValue( SWLGSBVO.PEOPLE,people);
 } 

/** 
* 获取实物量工时明细主键
*
* @return 实物量工时明细主键
*/
public String getPk_swlgs_b () {
return this.pk_swlgs_b;
 } 

/** 
* 设置实物量工时明细主键
*
* @param pk_swlgs_b 实物量工时明细主键
*/
public void setPk_swlgs_b ( String pk_swlgs_b) {
this.pk_swlgs_b=pk_swlgs_b;
 } 

/** 
* 获取上层单据主键
*
* @return 上层单据主键
*/
public String getPk_swlgs_h () {
return this.pk_swlgs_h;
 } 

/** 
* 设置上层单据主键
*
* @param pk_swlgs_h 上层单据主键
*/
public void setPk_swlgs_h ( String pk_swlgs_h) {
this.pk_swlgs_h=pk_swlgs_h;
 } 

/** 
* 获取行号
*
* @return 行号
*/
public String getRowno () {
return (String) this.getAttributeValue( SWLGSBVO.ROWNO);
 } 

/** 
* 设置行号
*
* @param rowno 行号
*/
public void setRowno ( String rowno) {
this.setAttributeValue( SWLGSBVO.ROWNO,rowno);
 } 

/** 
* 获取来源单据id
*
* @return 来源单据id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( SWLGSBVO.SRCBILLID);
 } 

/** 
* 设置来源单据id
*
* @param srcbillid 来源单据id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( SWLGSBVO.SRCBILLID,srcbillid);
 } 

/** 
* 获取来源单据表体id
*
* @return 来源单据表体id
*/
public String getSrcbillid_b () {
return (String) this.getAttributeValue( SWLGSBVO.SRCBILLID_B);
 } 

/** 
* 设置来源单据表体id
*
* @param srcbillid_b 来源单据表体id
*/
public void setSrcbillid_b ( String srcbillid_b) {
this.setAttributeValue( SWLGSBVO.SRCBILLID_B,srcbillid_b);
 } 

/** 
* 获取实物量工时
*
* @return 实物量工时
*/
public UFDouble getSwlgs () {
return (UFDouble) this.getAttributeValue( SWLGSBVO.SWLGS);
 } 

/** 
* 设置实物量工时
*
* @param swlgs 实物量工时
*/
public void setSwlgs ( UFDouble swlgs) {
this.setAttributeValue( SWLGSBVO.SWLGS,swlgs);
 } 

/** 
* 获取日期
*
* @return 日期
*/
public UFDateTime getSwlgs_date () {
return (UFDateTime) this.getAttributeValue( SWLGSBVO.SWLGS_DATE);
 } 

/** 
* 设置日期
*
* @param swlgs_date 日期
*/
public void setSwlgs_date ( UFDateTime swlgs_date) {
this.setAttributeValue( SWLGSBVO.SWLGS_DATE,swlgs_date);
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


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.SWLGSBVO");
  }
}