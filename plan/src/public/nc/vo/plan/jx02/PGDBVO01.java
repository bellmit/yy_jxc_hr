package nc.vo.plan.jx02;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class PGDBVO01 extends SuperVO {
	/**
	*实际加工人
	*/
	public static final String SJJG_PEOPLE="sjjg_people";
/**
*增补工时
*/
public static final String ADDGS="addgs";
/**
*出差日期
*/
public static final String CCRQ="ccrq";
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
*自定义项26
*/
public static final String DEF26="def26";
/**
*自定义项27
*/
public static final String DEF27="def27";
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
*单件工时
*/
public static final String DJGS="djgs";
/**
*回沪日期
*/
public static final String HHRQ="hhrq";
/**
*间断工时
*/
public static final String JDGS="jdgs";
/**
*间断日期
*/
public static final String JDRQ="jdrq";
/**
*间断原因
*/
public static final String JDYY="jdyy";
/**
*开工日期
*/
public static final String KGRQ="kgrq";
/**
*备注
*/
public static final String MEMO="memo";
/**
*人员档案
*/
public static final String PEOPLE="people";
/**
*派工卡操作者主键
*/
public String pk_pgd_czz;
/**
*上层单据主键
*/
public String pk_pgk_h;
/**
*行号
*/
public static final String ROWNO="rowno";
/**
*设备型号
*/
public static final String SBXH="sbxh";
/**
*实动工时
*/
public static final String SDGS="sdgs";
/**
*任务完成确认人
*/
public static final String SUREPERPLE="sureperple";
/**
*确认日期
*/
public static final String SURETIME="suretime";
/**
*实物量工时
*/
public static final String SWLGSS="swlgss";
/**
*时间戳
*/
public UFDateTime ts;
/**
*完工日期
*/
public static final String WGRQ="wgrq";
/**
*准备工时
*/
public static final String ZBGS="zbgs";
/**
*转差日期
*/
public static final String ZCRQ="zcrq";
/**
*总工时
*/
public static final String ZGS="zgs";
/** 
* 获取增补工时
*
* @return 增补工时
*/
public UFDouble getAddgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.ADDGS);
 } 

/** 
* 设置增补工时
*
* @param addgs 增补工时
*/
public void setAddgs ( UFDouble addgs) {
this.setAttributeValue( PGDBVO01.ADDGS,addgs);
 } 

/** 
* 获取出差日期
*
* @return 出差日期
*/
public UFDateTime getCcrq () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.CCRQ);
 } 

/** 
* 设置出差日期
*
* @param ccrq 出差日期
*/
public void setCcrq ( UFDateTime ccrq) {
this.setAttributeValue( PGDBVO01.CCRQ,ccrq);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getDef1 () {
return (String) this.getAttributeValue( PGDBVO01.DEF1);
 } 

/** 
* 设置自定义项1
*
* @param def1 自定义项1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( PGDBVO01.DEF1,def1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getDef10 () {
return (String) this.getAttributeValue( PGDBVO01.DEF10);
 } 

/** 
* 设置自定义项10
*
* @param def10 自定义项10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( PGDBVO01.DEF10,def10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getDef11 () {
return (String) this.getAttributeValue( PGDBVO01.DEF11);
 } 

/** 
* 设置自定义项11
*
* @param def11 自定义项11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( PGDBVO01.DEF11,def11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getDef12 () {
return (String) this.getAttributeValue( PGDBVO01.DEF12);
 } 

/** 
* 设置自定义项12
*
* @param def12 自定义项12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( PGDBVO01.DEF12,def12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getDef13 () {
return (String) this.getAttributeValue( PGDBVO01.DEF13);
 } 

/** 
* 设置自定义项13
*
* @param def13 自定义项13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( PGDBVO01.DEF13,def13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getDef14 () {
return (String) this.getAttributeValue( PGDBVO01.DEF14);
 } 

/** 
* 设置自定义项14
*
* @param def14 自定义项14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( PGDBVO01.DEF14,def14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getDef15 () {
return (String) this.getAttributeValue( PGDBVO01.DEF15);
 } 

/** 
* 设置自定义项15
*
* @param def15 自定义项15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( PGDBVO01.DEF15,def15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getDef16 () {
return (String) this.getAttributeValue( PGDBVO01.DEF16);
 } 

/** 
* 设置自定义项16
*
* @param def16 自定义项16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( PGDBVO01.DEF16,def16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getDef17 () {
return (String) this.getAttributeValue( PGDBVO01.DEF17);
 } 

/** 
* 设置自定义项17
*
* @param def17 自定义项17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( PGDBVO01.DEF17,def17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getDef18 () {
return (String) this.getAttributeValue( PGDBVO01.DEF18);
 } 

/** 
* 设置自定义项18
*
* @param def18 自定义项18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( PGDBVO01.DEF18,def18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getDef19 () {
return (String) this.getAttributeValue( PGDBVO01.DEF19);
 } 

/** 
* 设置自定义项19
*
* @param def19 自定义项19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( PGDBVO01.DEF19,def19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getDef2 () {
return (String) this.getAttributeValue( PGDBVO01.DEF2);
 } 

/** 
* 设置自定义项2
*
* @param def2 自定义项2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( PGDBVO01.DEF2,def2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getDef20 () {
return (String) this.getAttributeValue( PGDBVO01.DEF20);
 } 

/** 
* 设置自定义项20
*
* @param def20 自定义项20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( PGDBVO01.DEF20,def20);
 } 

/** 
* 获取自定义项21
*
* @return 自定义项21
*/
public String getDef21 () {
return (String) this.getAttributeValue( PGDBVO01.DEF21);
 } 

/** 
* 设置自定义项21
*
* @param def21 自定义项21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( PGDBVO01.DEF21,def21);
 } 

/** 
* 获取自定义项22
*
* @return 自定义项22
*/
public String getDef22 () {
return (String) this.getAttributeValue( PGDBVO01.DEF22);
 } 

/** 
* 设置自定义项22
*
* @param def22 自定义项22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( PGDBVO01.DEF22,def22);
 } 

/** 
* 获取自定义项23
*
* @return 自定义项23
*/
public String getDef23 () {
return (String) this.getAttributeValue( PGDBVO01.DEF23);
 } 

/** 
* 设置自定义项23
*
* @param def23 自定义项23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( PGDBVO01.DEF23,def23);
 } 

/** 
* 获取自定义项24
*
* @return 自定义项24
*/
public String getDef24 () {
return (String) this.getAttributeValue( PGDBVO01.DEF24);
 } 

/** 
* 设置自定义项24
*
* @param def24 自定义项24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( PGDBVO01.DEF24,def24);
 } 

/** 
* 获取自定义项25
*
* @return 自定义项25
*/
public String getDef25 () {
return (String) this.getAttributeValue( PGDBVO01.DEF25);
 } 

/** 
* 设置自定义项25
*
* @param def25 自定义项25
*/
public void setDef25 ( String def25) {
this.setAttributeValue( PGDBVO01.DEF25,def25);
 } 

/** 
* 获取自定义项26
*
* @return 自定义项26
*/
public String getDef26 () {
return (String) this.getAttributeValue( PGDBVO01.DEF26);
 } 

/** 
* 设置自定义项26
*
* @param def26 自定义项26
*/
public void setDef26 ( String def26) {
this.setAttributeValue( PGDBVO01.DEF26,def26);
 } 

/** 
* 获取自定义项27
*
* @return 自定义项27
*/
public String getDef27 () {
return (String) this.getAttributeValue( PGDBVO01.DEF27);
 } 

/** 
* 设置自定义项27
*
* @param def27 自定义项27
*/
public void setDef27 ( String def27) {
this.setAttributeValue( PGDBVO01.DEF27,def27);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getDef3 () {
return (String) this.getAttributeValue( PGDBVO01.DEF3);
 } 

/** 
* 设置自定义项3
*
* @param def3 自定义项3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( PGDBVO01.DEF3,def3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getDef4 () {
return (String) this.getAttributeValue( PGDBVO01.DEF4);
 } 

/** 
* 设置自定义项4
*
* @param def4 自定义项4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( PGDBVO01.DEF4,def4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getDef5 () {
return (String) this.getAttributeValue( PGDBVO01.DEF5);
 } 

/** 
* 设置自定义项5
*
* @param def5 自定义项5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( PGDBVO01.DEF5,def5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getDef6 () {
return (String) this.getAttributeValue( PGDBVO01.DEF6);
 } 

/** 
* 设置自定义项6
*
* @param def6 自定义项6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( PGDBVO01.DEF6,def6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getDef7 () {
return (String) this.getAttributeValue( PGDBVO01.DEF7);
 } 

/** 
* 设置自定义项7
*
* @param def7 自定义项7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( PGDBVO01.DEF7,def7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getDef8 () {
return (String) this.getAttributeValue( PGDBVO01.DEF8);
 } 

/** 
* 设置自定义项8
*
* @param def8 自定义项8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( PGDBVO01.DEF8,def8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getDef9 () {
return (String) this.getAttributeValue( PGDBVO01.DEF9);
 } 

/** 
* 设置自定义项9
*
* @param def9 自定义项9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( PGDBVO01.DEF9,def9);
 } 

/** 
* 获取单件工时
*
* @return 单件工时
*/
public UFDouble getDjgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.DJGS);
 } 

/** 
* 设置单件工时
*
* @param djgs 单件工时
*/
public void setDjgs ( UFDouble djgs) {
this.setAttributeValue( PGDBVO01.DJGS,djgs);
 } 

/** 
* 获取回沪日期
*
* @return 回沪日期
*/
public UFDateTime getHhrq () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.HHRQ);
 } 

/** 
* 设置回沪日期
*
* @param hhrq 回沪日期
*/
public void setHhrq ( UFDateTime hhrq) {
this.setAttributeValue( PGDBVO01.HHRQ,hhrq);
 } 

/** 
* 获取间断工时
*
* @return 间断工时
*/
public UFDouble getJdgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.JDGS);
 } 

/** 
* 设置间断工时
*
* @param jdgs 间断工时
*/
public void setJdgs ( UFDouble jdgs) {
this.setAttributeValue( PGDBVO01.JDGS,jdgs);
 } 

/** 
* 获取间断日期
*
* @return 间断日期
*/
public UFDate getJdrq () {
return (UFDate) this.getAttributeValue( PGDBVO01.JDRQ);
 } 

/** 
* 设置间断日期
*
* @param jdrq 间断日期
*/
public void setJdrq ( UFDate jdrq) {
this.setAttributeValue( PGDBVO01.JDRQ,jdrq);
 } 

/** 
* 获取间断原因
*
* @return 间断原因
*/
public String getJdyy () {
return (String) this.getAttributeValue( PGDBVO01.JDYY);
 } 

/** 
* 设置间断原因
*
* @param jdyy 间断原因
*/
public void setJdyy ( String jdyy) {
this.setAttributeValue( PGDBVO01.JDYY,jdyy);
 } 

/** 
* 获取开工日期
*
* @return 开工日期
*/
public UFDateTime getKgrq () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.KGRQ);
 } 

/** 
* 设置开工日期
*
* @param kgrq 开工日期
*/
public void setKgrq ( UFDateTime kgrq) {
this.setAttributeValue( PGDBVO01.KGRQ,kgrq);
 } 

/** 
* 获取备注
*
* @return 备注
*/
public String getMemo () {
return (String) this.getAttributeValue( PGDBVO01.MEMO);
 } 

/** 
* 设置备注
*
* @param memo 备注
*/
public void setMemo ( String memo) {
this.setAttributeValue( PGDBVO01.MEMO,memo);
 } 

/** 
* 获取人员档案
*
* @return 人员档案
*/
public String getPeople () {
return (String) this.getAttributeValue( PGDBVO01.PEOPLE);
 } 

/** 
* 设置人员档案
*
* @param people 人员档案
*/
public void setPeople ( String people) {
this.setAttributeValue( PGDBVO01.PEOPLE,people);
 } 

/** 
* 获取派工卡操作者主键
*
* @return 派工卡操作者主键
*/
public String getPk_pgd_czz () {
return this.pk_pgd_czz;
 } 

/** 
* 设置派工卡操作者主键
*
* @param pk_pgd_czz 派工卡操作者主键
*/
public void setPk_pgd_czz ( String pk_pgd_czz) {
this.pk_pgd_czz=pk_pgd_czz;
 } 

/** 
* 获取上层单据主键
*
* @return 上层单据主键
*/
public String getPk_pgk_h () {
return this.pk_pgk_h;
 } 

/** 
* 设置上层单据主键
*
* @param pk_pgk_h 上层单据主键
*/
public void setPk_pgk_h ( String pk_pgk_h) {
this.pk_pgk_h=pk_pgk_h;
 } 

/** 
* 获取行号
*
* @return 行号
*/
public String getRowno () {
return (String) this.getAttributeValue( PGDBVO01.ROWNO);
 } 

/** 
* 设置行号
*
* @param rowno 行号
*/
public void setRowno ( String rowno) {
this.setAttributeValue( PGDBVO01.ROWNO,rowno);
 } 

/** 
* 获取设备型号
*
* @return 设备型号
*/
public String getSbxh () {
return (String) this.getAttributeValue( PGDBVO01.SBXH);
 } 

/** 
* 设置设备型号
*
* @param sbxh 设备型号
*/
public void setSbxh ( String sbxh) {
this.setAttributeValue( PGDBVO01.SBXH,sbxh);
 } 

/** 
* 获取实动工时
*
* @return 实动工时
*/
public UFDouble getSdgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.SDGS);
 } 

/** 
* 设置实动工时
*
* @param sdgs 实动工时
*/
public void setSdgs ( UFDouble sdgs) {
this.setAttributeValue( PGDBVO01.SDGS,sdgs);
 } 

/** 
* 获取任务完成确认人
*
* @return 任务完成确认人
*/
public String getSureperple () {
return (String) this.getAttributeValue( PGDBVO01.SUREPERPLE);
 } 

/** 
* 设置任务完成确认人
*
* @param sureperple 任务完成确认人
*/
public void setSureperple ( String sureperple) {
this.setAttributeValue( PGDBVO01.SUREPERPLE,sureperple);
 } 

/** 
* 获取确认日期
*
* @return 确认日期
*/
public UFDateTime getSuretime () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.SURETIME);
 } 

/** 
* 设置确认日期
*
* @param suretime 确认日期
*/
public void setSuretime ( UFDateTime suretime) {
this.setAttributeValue( PGDBVO01.SURETIME,suretime);
 } 

/** 
* 获取实物量工时
*
* @return 实物量工时
*/
public UFDouble getSwlgss () {
return (UFDouble) this.getAttributeValue( PGDBVO01.SWLGSS);
 } 

/** 
* 设置实物量工时
*
* @param swlgss 实物量工时
*/
public void setSwlgss ( UFDouble swlgss) {
this.setAttributeValue( PGDBVO01.SWLGSS,swlgss);
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
* 获取完工日期
*
* @return 完工日期
*/
public UFDateTime getWgrq () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.WGRQ);
 } 

/** 
* 设置完工日期
*
* @param wgrq 完工日期
*/
public void setWgrq ( UFDateTime wgrq) {
this.setAttributeValue( PGDBVO01.WGRQ,wgrq);
 } 

/** 
* 获取准备工时
*
* @return 准备工时
*/
public UFDouble getZbgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.ZBGS);
 } 

/** 
* 设置准备工时
*
* @param zbgs 准备工时
*/
public void setZbgs ( UFDouble zbgs) {
this.setAttributeValue( PGDBVO01.ZBGS,zbgs);
 } 

/** 
* 获取转差日期
*
* @return 转差日期
*/
public UFDateTime getZcrq () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.ZCRQ);
 } 

/** 
* 设置转差日期
*
* @param zcrq 转差日期
*/
public void setZcrq ( UFDateTime zcrq) {
this.setAttributeValue( PGDBVO01.ZCRQ,zcrq);
 } 

/** 
* 获取总工时
*
* @return 总工时
*/
public UFDouble getZgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.ZGS);
 } 

/** 
* 设置总工时
*
* @param zgs 总工时
*/
public void setZgs ( UFDouble zgs) {
this.setAttributeValue( PGDBVO01.ZGS,zgs);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.派工卡操作者");
  }

  /** 
  * 获取实际加工人
  *
  * @return 实际加工人
  */
  public String getSjjg_people () {
  return (String) this.getAttributeValue( PGDBVO01.SJJG_PEOPLE);
   } 

  /** 
  * 设置实际加工人
  *
  * @param sjjg_people 实际加工人
  */
  public void setSjjg_people ( String sjjg_people) {
  this.setAttributeValue( PGDBVO01.SJJG_PEOPLE,sjjg_people);
   } 
}