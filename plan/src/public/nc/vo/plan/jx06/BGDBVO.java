package nc.vo.plan.jx06;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class BGDBVO extends SuperVO {
/**
*开始日期
*/
public static final String DATE_BEGIN="date_begin";
/**
*结束日期
*/
public static final String DATE_END="date_end";
/**
*1号
*/
public UFDouble day1;
/**
*10号
*/
public UFDouble day10;
/**
*11号
*/
public UFDouble day11;
/**
*12号
*/
public UFDouble day12;
/**
*13号
*/
public UFDouble day13;
/**
*14号
*/
public UFDouble day14;
/**
*15号
*/
public UFDouble day15;
/**
*16号
*/
public UFDouble day16;
/**
*17号
*/
public UFDouble day17;
/**
*18号
*/
public UFDouble day18;
/**
*19号
*/
public UFDouble day19;
/**
*2号
*/
public UFDouble day2;
/**
*20号
*/
public UFDouble day20;
/**
*21号
*/
public UFDouble day21;
/**
*22号
*/
public UFDouble day22;
/**
*23号
*/
public UFDouble day23;
/**
*24号
*/
public UFDouble day24;
/**
*25号
*/
public UFDouble day25;
/**
*26号
*/
public UFDouble day26;
/**
*27号
*/
public UFDouble day27;
/**
*28号
*/
public UFDouble day28;
/**
*29号
*/
public UFDouble day29;
/**
*3号
*/
public UFDouble day3;
/**
*30号
*/
public UFDouble day30;
/**
*31号
*/
public UFDouble day31;
/**
*4号
*/
public UFDouble day4;
/**
*5号
*/
public UFDouble day5;
/**
*6号
*/
public UFDouble day6;
/**
*7号
*/
public UFDouble day7;
/**
*8号
*/
public UFDouble day8;
/**
*9号
*/
public UFDouble day9;
/**
*天数
*/
public static final String DAYS_NUM="days_num";
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
public String def25;
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
*工令
*/
public static final String GL="gl";
/**
*考勤状态
*/
public String kqzt;
/**
*人员
*/
public static final String NAME="name";
/**
*报工单明细主键
*/
public String pk_bgd_b;
/**
*上层单据主键
*/
public String pk_bgd_h;
/**
*行号
*/
public static final String ROWNO="rowno";
/**
*时间戳
*/
public UFDateTime ts;
/** 
* 获取开始日期
*
* @return 开始日期
*/
public UFDate getDate_begin () {
return (UFDate) this.getAttributeValue( BGDBVO.DATE_BEGIN);
 } 

/** 
* 设置开始日期
*
* @param date_begin 开始日期
*/
public void setDate_begin ( UFDate date_begin) {
this.setAttributeValue( BGDBVO.DATE_BEGIN,date_begin);
 } 

/** 
* 获取结束日期
*
* @return 结束日期
*/
public UFDate getDate_end () {
return (UFDate) this.getAttributeValue( BGDBVO.DATE_END);
 } 

/** 
* 设置结束日期
*
* @param date_end 结束日期
*/
public void setDate_end ( UFDate date_end) {
this.setAttributeValue( BGDBVO.DATE_END,date_end);
 } 

/** 
* 获取1号
*
* @return 1号
*/
public UFDouble getDay1 () {
return this.day1;
 } 

/** 
* 设置1号
*
* @param day1 1号
*/
public void setDay1 ( UFDouble day1) {
this.day1=day1;
 } 

/** 
* 获取10号
*
* @return 10号
*/
public UFDouble getDay10 () {
return this.day10;
 } 

/** 
* 设置10号
*
* @param day10 10号
*/
public void setDay10 ( UFDouble day10) {
this.day10=day10;
 } 

/** 
* 获取11号
*
* @return 11号
*/
public UFDouble getDay11 () {
return this.day11;
 } 

/** 
* 设置11号
*
* @param day11 11号
*/
public void setDay11 ( UFDouble day11) {
this.day11=day11;
 } 

/** 
* 获取12号
*
* @return 12号
*/
public UFDouble getDay12 () {
return this.day12;
 } 

/** 
* 设置12号
*
* @param day12 12号
*/
public void setDay12 ( UFDouble day12) {
this.day12=day12;
 } 

/** 
* 获取13号
*
* @return 13号
*/
public UFDouble getDay13 () {
return this.day13;
 } 

/** 
* 设置13号
*
* @param day13 13号
*/
public void setDay13 ( UFDouble day13) {
this.day13=day13;
 } 

/** 
* 获取14号
*
* @return 14号
*/
public UFDouble getDay14 () {
return this.day14;
 } 

/** 
* 设置14号
*
* @param day14 14号
*/
public void setDay14 ( UFDouble day14) {
this.day14=day14;
 } 

/** 
* 获取15号
*
* @return 15号
*/
public UFDouble getDay15 () {
return this.day15;
 } 

/** 
* 设置15号
*
* @param day15 15号
*/
public void setDay15 ( UFDouble day15) {
this.day15=day15;
 } 

/** 
* 获取16号
*
* @return 16号
*/
public UFDouble getDay16 () {
return this.day16;
 } 

/** 
* 设置16号
*
* @param day16 16号
*/
public void setDay16 ( UFDouble day16) {
this.day16=day16;
 } 

/** 
* 获取17号
*
* @return 17号
*/
public UFDouble getDay17 () {
return this.day17;
 } 

/** 
* 设置17号
*
* @param day17 17号
*/
public void setDay17 ( UFDouble day17) {
this.day17=day17;
 } 

/** 
* 获取18号
*
* @return 18号
*/
public UFDouble getDay18 () {
return this.day18;
 } 

/** 
* 设置18号
*
* @param day18 18号
*/
public void setDay18 ( UFDouble day18) {
this.day18=day18;
 } 

/** 
* 获取19号
*
* @return 19号
*/
public UFDouble getDay19 () {
return this.day19;
 } 

/** 
* 设置19号
*
* @param day19 19号
*/
public void setDay19 ( UFDouble day19) {
this.day19=day19;
 } 

/** 
* 获取2号
*
* @return 2号
*/
public UFDouble getDay2 () {
return this.day2;
 } 

/** 
* 设置2号
*
* @param day2 2号
*/
public void setDay2 ( UFDouble day2) {
this.day2=day2;
 } 

/** 
* 获取20号
*
* @return 20号
*/
public UFDouble getDay20 () {
return this.day20;
 } 

/** 
* 设置20号
*
* @param day20 20号
*/
public void setDay20 ( UFDouble day20) {
this.day20=day20;
 } 

/** 
* 获取21号
*
* @return 21号
*/
public UFDouble getDay21 () {
return this.day21;
 } 

/** 
* 设置21号
*
* @param day21 21号
*/
public void setDay21 ( UFDouble day21) {
this.day21=day21;
 } 

/** 
* 获取22号
*
* @return 22号
*/
public UFDouble getDay22 () {
return this.day22;
 } 

/** 
* 设置22号
*
* @param day22 22号
*/
public void setDay22 ( UFDouble day22) {
this.day22=day22;
 } 

/** 
* 获取23号
*
* @return 23号
*/
public UFDouble getDay23 () {
return this.day23;
 } 

/** 
* 设置23号
*
* @param day23 23号
*/
public void setDay23 ( UFDouble day23) {
this.day23=day23;
 } 

/** 
* 获取24号
*
* @return 24号
*/
public UFDouble getDay24 () {
return this.day24;
 } 

/** 
* 设置24号
*
* @param day24 24号
*/
public void setDay24 ( UFDouble day24) {
this.day24=day24;
 } 

/** 
* 获取25号
*
* @return 25号
*/
public UFDouble getDay25 () {
return this.day25;
 } 

/** 
* 设置25号
*
* @param day25 25号
*/
public void setDay25 ( UFDouble day25) {
this.day25=day25;
 } 

/** 
* 获取26号
*
* @return 26号
*/
public UFDouble getDay26 () {
return this.day26;
 } 

/** 
* 设置26号
*
* @param day26 26号
*/
public void setDay26 ( UFDouble day26) {
this.day26=day26;
 } 

/** 
* 获取27号
*
* @return 27号
*/
public UFDouble getDay27 () {
return this.day27;
 } 

/** 
* 设置27号
*
* @param day27 27号
*/
public void setDay27 ( UFDouble day27) {
this.day27=day27;
 } 

/** 
* 获取28号
*
* @return 28号
*/
public UFDouble getDay28 () {
return this.day28;
 } 

/** 
* 设置28号
*
* @param day28 28号
*/
public void setDay28 ( UFDouble day28) {
this.day28=day28;
 } 

/** 
* 获取29号
*
* @return 29号
*/
public UFDouble getDay29 () {
return this.day29;
 } 

/** 
* 设置29号
*
* @param day29 29号
*/
public void setDay29 ( UFDouble day29) {
this.day29=day29;
 } 

/** 
* 获取3号
*
* @return 3号
*/
public UFDouble getDay3 () {
return this.day3;
 } 

/** 
* 设置3号
*
* @param day3 3号
*/
public void setDay3 ( UFDouble day3) {
this.day3=day3;
 } 

/** 
* 获取30号
*
* @return 30号
*/
public UFDouble getDay30 () {
return this.day30;
 } 

/** 
* 设置30号
*
* @param day30 30号
*/
public void setDay30 ( UFDouble day30) {
this.day30=day30;
 } 

/** 
* 获取31号
*
* @return 31号
*/
public UFDouble getDay31 () {
return this.day31;
 } 

/** 
* 设置31号
*
* @param day31 31号
*/
public void setDay31 ( UFDouble day31) {
this.day31=day31;
 } 

/** 
* 获取4号
*
* @return 4号
*/
public UFDouble getDay4 () {
return this.day4;
 } 

/** 
* 设置4号
*
* @param day4 4号
*/
public void setDay4 ( UFDouble day4) {
this.day4=day4;
 } 

/** 
* 获取5号
*
* @return 5号
*/
public UFDouble getDay5 () {
return this.day5;
 } 

/** 
* 设置5号
*
* @param day5 5号
*/
public void setDay5 ( UFDouble day5) {
this.day5=day5;
 } 

/** 
* 获取6号
*
* @return 6号
*/
public UFDouble getDay6 () {
return this.day6;
 } 

/** 
* 设置6号
*
* @param day6 6号
*/
public void setDay6 ( UFDouble day6) {
this.day6=day6;
 } 

/** 
* 获取7号
*
* @return 7号
*/
public UFDouble getDay7 () {
return this.day7;
 } 

/** 
* 设置7号
*
* @param day7 7号
*/
public void setDay7 ( UFDouble day7) {
this.day7=day7;
 } 

/** 
* 获取8号
*
* @return 8号
*/
public UFDouble getDay8 () {
return this.day8;
 } 

/** 
* 设置8号
*
* @param day8 8号
*/
public void setDay8 ( UFDouble day8) {
this.day8=day8;
 } 

/** 
* 获取9号
*
* @return 9号
*/
public UFDouble getDay9 () {
return this.day9;
 } 

/** 
* 设置9号
*
* @param day9 9号
*/
public void setDay9 ( UFDouble day9) {
this.day9=day9;
 } 

/** 
* 获取天数
*
* @return 天数
*/
public Integer getDays_num () {
return (Integer) this.getAttributeValue( BGDBVO.DAYS_NUM);
 } 

/** 
* 设置天数
*
* @param days_num 天数
*/
public void setDays_num ( Integer days_num) {
this.setAttributeValue( BGDBVO.DAYS_NUM,days_num);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getDef1 () {
return (String) this.getAttributeValue( BGDBVO.DEF1);
 } 

/** 
* 设置自定义项1
*
* @param def1 自定义项1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( BGDBVO.DEF1,def1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getDef10 () {
return (String) this.getAttributeValue( BGDBVO.DEF10);
 } 

/** 
* 设置自定义项10
*
* @param def10 自定义项10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( BGDBVO.DEF10,def10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getDef11 () {
return (String) this.getAttributeValue( BGDBVO.DEF11);
 } 

/** 
* 设置自定义项11
*
* @param def11 自定义项11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( BGDBVO.DEF11,def11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getDef12 () {
return (String) this.getAttributeValue( BGDBVO.DEF12);
 } 

/** 
* 设置自定义项12
*
* @param def12 自定义项12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( BGDBVO.DEF12,def12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getDef13 () {
return (String) this.getAttributeValue( BGDBVO.DEF13);
 } 

/** 
* 设置自定义项13
*
* @param def13 自定义项13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( BGDBVO.DEF13,def13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getDef14 () {
return (String) this.getAttributeValue( BGDBVO.DEF14);
 } 

/** 
* 设置自定义项14
*
* @param def14 自定义项14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( BGDBVO.DEF14,def14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getDef15 () {
return (String) this.getAttributeValue( BGDBVO.DEF15);
 } 

/** 
* 设置自定义项15
*
* @param def15 自定义项15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( BGDBVO.DEF15,def15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getDef16 () {
return (String) this.getAttributeValue( BGDBVO.DEF16);
 } 

/** 
* 设置自定义项16
*
* @param def16 自定义项16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( BGDBVO.DEF16,def16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getDef17 () {
return (String) this.getAttributeValue( BGDBVO.DEF17);
 } 

/** 
* 设置自定义项17
*
* @param def17 自定义项17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( BGDBVO.DEF17,def17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getDef18 () {
return (String) this.getAttributeValue( BGDBVO.DEF18);
 } 

/** 
* 设置自定义项18
*
* @param def18 自定义项18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( BGDBVO.DEF18,def18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getDef19 () {
return (String) this.getAttributeValue( BGDBVO.DEF19);
 } 

/** 
* 设置自定义项19
*
* @param def19 自定义项19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( BGDBVO.DEF19,def19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getDef2 () {
return (String) this.getAttributeValue( BGDBVO.DEF2);
 } 

/** 
* 设置自定义项2
*
* @param def2 自定义项2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( BGDBVO.DEF2,def2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getDef20 () {
return (String) this.getAttributeValue( BGDBVO.DEF20);
 } 

/** 
* 设置自定义项20
*
* @param def20 自定义项20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( BGDBVO.DEF20,def20);
 } 

/** 
* 获取自定义项21
*
* @return 自定义项21
*/
public String getDef21 () {
return (String) this.getAttributeValue( BGDBVO.DEF21);
 } 

/** 
* 设置自定义项21
*
* @param def21 自定义项21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( BGDBVO.DEF21,def21);
 } 

/** 
* 获取自定义项22
*
* @return 自定义项22
*/
public String getDef22 () {
return (String) this.getAttributeValue( BGDBVO.DEF22);
 } 

/** 
* 设置自定义项22
*
* @param def22 自定义项22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( BGDBVO.DEF22,def22);
 } 

/** 
* 获取自定义项23
*
* @return 自定义项23
*/
public String getDef23 () {
return (String) this.getAttributeValue( BGDBVO.DEF23);
 } 

/** 
* 设置自定义项23
*
* @param def23 自定义项23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( BGDBVO.DEF23,def23);
 } 

/** 
* 获取自定义项24
*
* @return 自定义项24
*/
public String getDef24 () {
return (String) this.getAttributeValue( BGDBVO.DEF24);
 } 

/** 
* 设置自定义项24
*
* @param def24 自定义项24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( BGDBVO.DEF24,def24);
 } 

/** 
* 获取自定义项25
*
* @return 自定义项25
*/
public String getDef25 () {
return this.def25;
 } 

/** 
* 设置自定义项25
*
* @param def25 自定义项25
*/
public void setDef25 ( String def25) {
this.def25=def25;
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getDef3 () {
return (String) this.getAttributeValue( BGDBVO.DEF3);
 } 

/** 
* 设置自定义项3
*
* @param def3 自定义项3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( BGDBVO.DEF3,def3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getDef4 () {
return (String) this.getAttributeValue( BGDBVO.DEF4);
 } 

/** 
* 设置自定义项4
*
* @param def4 自定义项4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( BGDBVO.DEF4,def4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getDef5 () {
return (String) this.getAttributeValue( BGDBVO.DEF5);
 } 

/** 
* 设置自定义项5
*
* @param def5 自定义项5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( BGDBVO.DEF5,def5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getDef6 () {
return (String) this.getAttributeValue( BGDBVO.DEF6);
 } 

/** 
* 设置自定义项6
*
* @param def6 自定义项6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( BGDBVO.DEF6,def6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getDef7 () {
return (String) this.getAttributeValue( BGDBVO.DEF7);
 } 

/** 
* 设置自定义项7
*
* @param def7 自定义项7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( BGDBVO.DEF7,def7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getDef8 () {
return (String) this.getAttributeValue( BGDBVO.DEF8);
 } 

/** 
* 设置自定义项8
*
* @param def8 自定义项8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( BGDBVO.DEF8,def8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getDef9 () {
return (String) this.getAttributeValue( BGDBVO.DEF9);
 } 

/** 
* 设置自定义项9
*
* @param def9 自定义项9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( BGDBVO.DEF9,def9);
 } 

/** 
* 获取工令
*
* @return 工令
*/
public String getGl () {
return (String) this.getAttributeValue( BGDBVO.GL);
 } 

/** 
* 设置工令
*
* @param gl 工令
*/
public void setGl ( String gl) {
this.setAttributeValue( BGDBVO.GL,gl);
 } 

/** 
* 获取考勤状态
*
* @return 考勤状态
* @see String
*/
public String getKqzt () {
return this.kqzt;
 } 

/** 
* 设置考勤状态
*
* @param kqzt 考勤状态
* @see String
*/
public void setKqzt ( String kqzt) {
this.kqzt=kqzt;
 } 

/** 
* 获取人员
*
* @return 人员
*/
public String getName () {
return (String) this.getAttributeValue( BGDBVO.NAME);
 } 

/** 
* 设置人员
*
* @param name 人员
*/
public void setName ( String name) {
this.setAttributeValue( BGDBVO.NAME,name);
 } 

/** 
* 获取报工单明细主键
*
* @return 报工单明细主键
*/
public String getPk_bgd_b () {
return this.pk_bgd_b;
 } 

/** 
* 设置报工单明细主键
*
* @param pk_bgd_b 报工单明细主键
*/
public void setPk_bgd_b ( String pk_bgd_b) {
this.pk_bgd_b=pk_bgd_b;
 } 

/** 
* 获取上层单据主键
*
* @return 上层单据主键
*/
public String getPk_bgd_h () {
return this.pk_bgd_h;
 } 

/** 
* 设置上层单据主键
*
* @param pk_bgd_h 上层单据主键
*/
public void setPk_bgd_h ( String pk_bgd_h) {
this.pk_bgd_h=pk_bgd_h;
 } 

/** 
* 获取行号
*
* @return 行号
*/
public String getRowno () {
return (String) this.getAttributeValue( BGDBVO.ROWNO);
 } 

/** 
* 设置行号
*
* @param rowno 行号
*/
public void setRowno ( String rowno) {
this.setAttributeValue( BGDBVO.ROWNO,rowno);
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
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.BGDBVO");
  }
}