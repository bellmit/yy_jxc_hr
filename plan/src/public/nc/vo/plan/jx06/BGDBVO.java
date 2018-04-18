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
*��ʼ����
*/
public static final String DATE_BEGIN="date_begin";
/**
*��������
*/
public static final String DATE_END="date_end";
/**
*1��
*/
public UFDouble day1;
/**
*10��
*/
public UFDouble day10;
/**
*11��
*/
public UFDouble day11;
/**
*12��
*/
public UFDouble day12;
/**
*13��
*/
public UFDouble day13;
/**
*14��
*/
public UFDouble day14;
/**
*15��
*/
public UFDouble day15;
/**
*16��
*/
public UFDouble day16;
/**
*17��
*/
public UFDouble day17;
/**
*18��
*/
public UFDouble day18;
/**
*19��
*/
public UFDouble day19;
/**
*2��
*/
public UFDouble day2;
/**
*20��
*/
public UFDouble day20;
/**
*21��
*/
public UFDouble day21;
/**
*22��
*/
public UFDouble day22;
/**
*23��
*/
public UFDouble day23;
/**
*24��
*/
public UFDouble day24;
/**
*25��
*/
public UFDouble day25;
/**
*26��
*/
public UFDouble day26;
/**
*27��
*/
public UFDouble day27;
/**
*28��
*/
public UFDouble day28;
/**
*29��
*/
public UFDouble day29;
/**
*3��
*/
public UFDouble day3;
/**
*30��
*/
public UFDouble day30;
/**
*31��
*/
public UFDouble day31;
/**
*4��
*/
public UFDouble day4;
/**
*5��
*/
public UFDouble day5;
/**
*6��
*/
public UFDouble day6;
/**
*7��
*/
public UFDouble day7;
/**
*8��
*/
public UFDouble day8;
/**
*9��
*/
public UFDouble day9;
/**
*����
*/
public static final String DAYS_NUM="days_num";
/**
*�Զ�����1
*/
public static final String DEF1="def1";
/**
*�Զ�����10
*/
public static final String DEF10="def10";
/**
*�Զ�����11
*/
public static final String DEF11="def11";
/**
*�Զ�����12
*/
public static final String DEF12="def12";
/**
*�Զ�����13
*/
public static final String DEF13="def13";
/**
*�Զ�����14
*/
public static final String DEF14="def14";
/**
*�Զ�����15
*/
public static final String DEF15="def15";
/**
*�Զ�����16
*/
public static final String DEF16="def16";
/**
*�Զ�����17
*/
public static final String DEF17="def17";
/**
*�Զ�����18
*/
public static final String DEF18="def18";
/**
*�Զ�����19
*/
public static final String DEF19="def19";
/**
*�Զ�����2
*/
public static final String DEF2="def2";
/**
*�Զ�����20
*/
public static final String DEF20="def20";
/**
*�Զ�����21
*/
public static final String DEF21="def21";
/**
*�Զ�����22
*/
public static final String DEF22="def22";
/**
*�Զ�����23
*/
public static final String DEF23="def23";
/**
*�Զ�����24
*/
public static final String DEF24="def24";
/**
*�Զ�����25
*/
public String def25;
/**
*�Զ�����3
*/
public static final String DEF3="def3";
/**
*�Զ�����4
*/
public static final String DEF4="def4";
/**
*�Զ�����5
*/
public static final String DEF5="def5";
/**
*�Զ�����6
*/
public static final String DEF6="def6";
/**
*�Զ�����7
*/
public static final String DEF7="def7";
/**
*�Զ�����8
*/
public static final String DEF8="def8";
/**
*�Զ�����9
*/
public static final String DEF9="def9";
/**
*����
*/
public static final String GL="gl";
/**
*����״̬
*/
public String kqzt;
/**
*��Ա
*/
public static final String NAME="name";
/**
*��������ϸ����
*/
public String pk_bgd_b;
/**
*�ϲ㵥������
*/
public String pk_bgd_h;
/**
*�к�
*/
public static final String ROWNO="rowno";
/**
*ʱ���
*/
public UFDateTime ts;
/** 
* ��ȡ��ʼ����
*
* @return ��ʼ����
*/
public UFDate getDate_begin () {
return (UFDate) this.getAttributeValue( BGDBVO.DATE_BEGIN);
 } 

/** 
* ���ÿ�ʼ����
*
* @param date_begin ��ʼ����
*/
public void setDate_begin ( UFDate date_begin) {
this.setAttributeValue( BGDBVO.DATE_BEGIN,date_begin);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getDate_end () {
return (UFDate) this.getAttributeValue( BGDBVO.DATE_END);
 } 

/** 
* ���ý�������
*
* @param date_end ��������
*/
public void setDate_end ( UFDate date_end) {
this.setAttributeValue( BGDBVO.DATE_END,date_end);
 } 

/** 
* ��ȡ1��
*
* @return 1��
*/
public UFDouble getDay1 () {
return this.day1;
 } 

/** 
* ����1��
*
* @param day1 1��
*/
public void setDay1 ( UFDouble day1) {
this.day1=day1;
 } 

/** 
* ��ȡ10��
*
* @return 10��
*/
public UFDouble getDay10 () {
return this.day10;
 } 

/** 
* ����10��
*
* @param day10 10��
*/
public void setDay10 ( UFDouble day10) {
this.day10=day10;
 } 

/** 
* ��ȡ11��
*
* @return 11��
*/
public UFDouble getDay11 () {
return this.day11;
 } 

/** 
* ����11��
*
* @param day11 11��
*/
public void setDay11 ( UFDouble day11) {
this.day11=day11;
 } 

/** 
* ��ȡ12��
*
* @return 12��
*/
public UFDouble getDay12 () {
return this.day12;
 } 

/** 
* ����12��
*
* @param day12 12��
*/
public void setDay12 ( UFDouble day12) {
this.day12=day12;
 } 

/** 
* ��ȡ13��
*
* @return 13��
*/
public UFDouble getDay13 () {
return this.day13;
 } 

/** 
* ����13��
*
* @param day13 13��
*/
public void setDay13 ( UFDouble day13) {
this.day13=day13;
 } 

/** 
* ��ȡ14��
*
* @return 14��
*/
public UFDouble getDay14 () {
return this.day14;
 } 

/** 
* ����14��
*
* @param day14 14��
*/
public void setDay14 ( UFDouble day14) {
this.day14=day14;
 } 

/** 
* ��ȡ15��
*
* @return 15��
*/
public UFDouble getDay15 () {
return this.day15;
 } 

/** 
* ����15��
*
* @param day15 15��
*/
public void setDay15 ( UFDouble day15) {
this.day15=day15;
 } 

/** 
* ��ȡ16��
*
* @return 16��
*/
public UFDouble getDay16 () {
return this.day16;
 } 

/** 
* ����16��
*
* @param day16 16��
*/
public void setDay16 ( UFDouble day16) {
this.day16=day16;
 } 

/** 
* ��ȡ17��
*
* @return 17��
*/
public UFDouble getDay17 () {
return this.day17;
 } 

/** 
* ����17��
*
* @param day17 17��
*/
public void setDay17 ( UFDouble day17) {
this.day17=day17;
 } 

/** 
* ��ȡ18��
*
* @return 18��
*/
public UFDouble getDay18 () {
return this.day18;
 } 

/** 
* ����18��
*
* @param day18 18��
*/
public void setDay18 ( UFDouble day18) {
this.day18=day18;
 } 

/** 
* ��ȡ19��
*
* @return 19��
*/
public UFDouble getDay19 () {
return this.day19;
 } 

/** 
* ����19��
*
* @param day19 19��
*/
public void setDay19 ( UFDouble day19) {
this.day19=day19;
 } 

/** 
* ��ȡ2��
*
* @return 2��
*/
public UFDouble getDay2 () {
return this.day2;
 } 

/** 
* ����2��
*
* @param day2 2��
*/
public void setDay2 ( UFDouble day2) {
this.day2=day2;
 } 

/** 
* ��ȡ20��
*
* @return 20��
*/
public UFDouble getDay20 () {
return this.day20;
 } 

/** 
* ����20��
*
* @param day20 20��
*/
public void setDay20 ( UFDouble day20) {
this.day20=day20;
 } 

/** 
* ��ȡ21��
*
* @return 21��
*/
public UFDouble getDay21 () {
return this.day21;
 } 

/** 
* ����21��
*
* @param day21 21��
*/
public void setDay21 ( UFDouble day21) {
this.day21=day21;
 } 

/** 
* ��ȡ22��
*
* @return 22��
*/
public UFDouble getDay22 () {
return this.day22;
 } 

/** 
* ����22��
*
* @param day22 22��
*/
public void setDay22 ( UFDouble day22) {
this.day22=day22;
 } 

/** 
* ��ȡ23��
*
* @return 23��
*/
public UFDouble getDay23 () {
return this.day23;
 } 

/** 
* ����23��
*
* @param day23 23��
*/
public void setDay23 ( UFDouble day23) {
this.day23=day23;
 } 

/** 
* ��ȡ24��
*
* @return 24��
*/
public UFDouble getDay24 () {
return this.day24;
 } 

/** 
* ����24��
*
* @param day24 24��
*/
public void setDay24 ( UFDouble day24) {
this.day24=day24;
 } 

/** 
* ��ȡ25��
*
* @return 25��
*/
public UFDouble getDay25 () {
return this.day25;
 } 

/** 
* ����25��
*
* @param day25 25��
*/
public void setDay25 ( UFDouble day25) {
this.day25=day25;
 } 

/** 
* ��ȡ26��
*
* @return 26��
*/
public UFDouble getDay26 () {
return this.day26;
 } 

/** 
* ����26��
*
* @param day26 26��
*/
public void setDay26 ( UFDouble day26) {
this.day26=day26;
 } 

/** 
* ��ȡ27��
*
* @return 27��
*/
public UFDouble getDay27 () {
return this.day27;
 } 

/** 
* ����27��
*
* @param day27 27��
*/
public void setDay27 ( UFDouble day27) {
this.day27=day27;
 } 

/** 
* ��ȡ28��
*
* @return 28��
*/
public UFDouble getDay28 () {
return this.day28;
 } 

/** 
* ����28��
*
* @param day28 28��
*/
public void setDay28 ( UFDouble day28) {
this.day28=day28;
 } 

/** 
* ��ȡ29��
*
* @return 29��
*/
public UFDouble getDay29 () {
return this.day29;
 } 

/** 
* ����29��
*
* @param day29 29��
*/
public void setDay29 ( UFDouble day29) {
this.day29=day29;
 } 

/** 
* ��ȡ3��
*
* @return 3��
*/
public UFDouble getDay3 () {
return this.day3;
 } 

/** 
* ����3��
*
* @param day3 3��
*/
public void setDay3 ( UFDouble day3) {
this.day3=day3;
 } 

/** 
* ��ȡ30��
*
* @return 30��
*/
public UFDouble getDay30 () {
return this.day30;
 } 

/** 
* ����30��
*
* @param day30 30��
*/
public void setDay30 ( UFDouble day30) {
this.day30=day30;
 } 

/** 
* ��ȡ31��
*
* @return 31��
*/
public UFDouble getDay31 () {
return this.day31;
 } 

/** 
* ����31��
*
* @param day31 31��
*/
public void setDay31 ( UFDouble day31) {
this.day31=day31;
 } 

/** 
* ��ȡ4��
*
* @return 4��
*/
public UFDouble getDay4 () {
return this.day4;
 } 

/** 
* ����4��
*
* @param day4 4��
*/
public void setDay4 ( UFDouble day4) {
this.day4=day4;
 } 

/** 
* ��ȡ5��
*
* @return 5��
*/
public UFDouble getDay5 () {
return this.day5;
 } 

/** 
* ����5��
*
* @param day5 5��
*/
public void setDay5 ( UFDouble day5) {
this.day5=day5;
 } 

/** 
* ��ȡ6��
*
* @return 6��
*/
public UFDouble getDay6 () {
return this.day6;
 } 

/** 
* ����6��
*
* @param day6 6��
*/
public void setDay6 ( UFDouble day6) {
this.day6=day6;
 } 

/** 
* ��ȡ7��
*
* @return 7��
*/
public UFDouble getDay7 () {
return this.day7;
 } 

/** 
* ����7��
*
* @param day7 7��
*/
public void setDay7 ( UFDouble day7) {
this.day7=day7;
 } 

/** 
* ��ȡ8��
*
* @return 8��
*/
public UFDouble getDay8 () {
return this.day8;
 } 

/** 
* ����8��
*
* @param day8 8��
*/
public void setDay8 ( UFDouble day8) {
this.day8=day8;
 } 

/** 
* ��ȡ9��
*
* @return 9��
*/
public UFDouble getDay9 () {
return this.day9;
 } 

/** 
* ����9��
*
* @param day9 9��
*/
public void setDay9 ( UFDouble day9) {
this.day9=day9;
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public Integer getDays_num () {
return (Integer) this.getAttributeValue( BGDBVO.DAYS_NUM);
 } 

/** 
* ��������
*
* @param days_num ����
*/
public void setDays_num ( Integer days_num) {
this.setAttributeValue( BGDBVO.DAYS_NUM,days_num);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return (String) this.getAttributeValue( BGDBVO.DEF1);
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( BGDBVO.DEF1,def1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getDef10 () {
return (String) this.getAttributeValue( BGDBVO.DEF10);
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( BGDBVO.DEF10,def10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getDef11 () {
return (String) this.getAttributeValue( BGDBVO.DEF11);
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( BGDBVO.DEF11,def11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return (String) this.getAttributeValue( BGDBVO.DEF12);
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( BGDBVO.DEF12,def12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return (String) this.getAttributeValue( BGDBVO.DEF13);
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( BGDBVO.DEF13,def13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return (String) this.getAttributeValue( BGDBVO.DEF14);
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( BGDBVO.DEF14,def14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getDef15 () {
return (String) this.getAttributeValue( BGDBVO.DEF15);
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( BGDBVO.DEF15,def15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return (String) this.getAttributeValue( BGDBVO.DEF16);
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( BGDBVO.DEF16,def16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return (String) this.getAttributeValue( BGDBVO.DEF17);
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( BGDBVO.DEF17,def17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return (String) this.getAttributeValue( BGDBVO.DEF18);
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( BGDBVO.DEF18,def18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return (String) this.getAttributeValue( BGDBVO.DEF19);
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( BGDBVO.DEF19,def19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return (String) this.getAttributeValue( BGDBVO.DEF2);
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( BGDBVO.DEF2,def2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return (String) this.getAttributeValue( BGDBVO.DEF20);
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( BGDBVO.DEF20,def20);
 } 

/** 
* ��ȡ�Զ�����21
*
* @return �Զ�����21
*/
public String getDef21 () {
return (String) this.getAttributeValue( BGDBVO.DEF21);
 } 

/** 
* �����Զ�����21
*
* @param def21 �Զ�����21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( BGDBVO.DEF21,def21);
 } 

/** 
* ��ȡ�Զ�����22
*
* @return �Զ�����22
*/
public String getDef22 () {
return (String) this.getAttributeValue( BGDBVO.DEF22);
 } 

/** 
* �����Զ�����22
*
* @param def22 �Զ�����22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( BGDBVO.DEF22,def22);
 } 

/** 
* ��ȡ�Զ�����23
*
* @return �Զ�����23
*/
public String getDef23 () {
return (String) this.getAttributeValue( BGDBVO.DEF23);
 } 

/** 
* �����Զ�����23
*
* @param def23 �Զ�����23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( BGDBVO.DEF23,def23);
 } 

/** 
* ��ȡ�Զ�����24
*
* @return �Զ�����24
*/
public String getDef24 () {
return (String) this.getAttributeValue( BGDBVO.DEF24);
 } 

/** 
* �����Զ�����24
*
* @param def24 �Զ�����24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( BGDBVO.DEF24,def24);
 } 

/** 
* ��ȡ�Զ�����25
*
* @return �Զ�����25
*/
public String getDef25 () {
return this.def25;
 } 

/** 
* �����Զ�����25
*
* @param def25 �Զ�����25
*/
public void setDef25 ( String def25) {
this.def25=def25;
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return (String) this.getAttributeValue( BGDBVO.DEF3);
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( BGDBVO.DEF3,def3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return (String) this.getAttributeValue( BGDBVO.DEF4);
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( BGDBVO.DEF4,def4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return (String) this.getAttributeValue( BGDBVO.DEF5);
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( BGDBVO.DEF5,def5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getDef6 () {
return (String) this.getAttributeValue( BGDBVO.DEF6);
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( BGDBVO.DEF6,def6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getDef7 () {
return (String) this.getAttributeValue( BGDBVO.DEF7);
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( BGDBVO.DEF7,def7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getDef8 () {
return (String) this.getAttributeValue( BGDBVO.DEF8);
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( BGDBVO.DEF8,def8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getDef9 () {
return (String) this.getAttributeValue( BGDBVO.DEF9);
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( BGDBVO.DEF9,def9);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getGl () {
return (String) this.getAttributeValue( BGDBVO.GL);
 } 

/** 
* ���ù���
*
* @param gl ����
*/
public void setGl ( String gl) {
this.setAttributeValue( BGDBVO.GL,gl);
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public String getKqzt () {
return this.kqzt;
 } 

/** 
* ���ÿ���״̬
*
* @param kqzt ����״̬
* @see String
*/
public void setKqzt ( String kqzt) {
this.kqzt=kqzt;
 } 

/** 
* ��ȡ��Ա
*
* @return ��Ա
*/
public String getName () {
return (String) this.getAttributeValue( BGDBVO.NAME);
 } 

/** 
* ������Ա
*
* @param name ��Ա
*/
public void setName ( String name) {
this.setAttributeValue( BGDBVO.NAME,name);
 } 

/** 
* ��ȡ��������ϸ����
*
* @return ��������ϸ����
*/
public String getPk_bgd_b () {
return this.pk_bgd_b;
 } 

/** 
* ���ñ�������ϸ����
*
* @param pk_bgd_b ��������ϸ����
*/
public void setPk_bgd_b ( String pk_bgd_b) {
this.pk_bgd_b=pk_bgd_b;
 } 

/** 
* ��ȡ�ϲ㵥������
*
* @return �ϲ㵥������
*/
public String getPk_bgd_h () {
return this.pk_bgd_h;
 } 

/** 
* �����ϲ㵥������
*
* @param pk_bgd_h �ϲ㵥������
*/
public void setPk_bgd_h ( String pk_bgd_h) {
this.pk_bgd_h=pk_bgd_h;
 } 

/** 
* ��ȡ�к�
*
* @return �к�
*/
public String getRowno () {
return (String) this.getAttributeValue( BGDBVO.ROWNO);
 } 

/** 
* �����к�
*
* @param rowno �к�
*/
public void setRowno ( String rowno) {
this.setAttributeValue( BGDBVO.ROWNO,rowno);
 } 

/** 
* ��ȡʱ���
*
* @return ʱ���
*/
public UFDateTime getTs () {
return this.ts;
 } 

/** 
* ����ʱ���
*
* @param ts ʱ���
*/
public void setTs ( UFDateTime ts) {
this.ts=ts;
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.BGDBVO");
  }
}