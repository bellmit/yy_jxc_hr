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
*����
*/
public static final String BZ="bz";
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
public static final String DEF25="def25";
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
*���ʱ
*/
public static final String DEGS="degs";
/**
*�����
*/
public static final String GL="gl";
/**
*��������
*/
public static final String GLNAME="glname";
/**
*��ʱ����
*/
public static final String GSLX="gslx";
/**
*����
*/
public static final String GZ="gz";
/**
*����(%)
*/
public static final String JD="jd";
/**
*��Ա
*/
public static final String PEOPLE="people";
/**
*ʵ������ʱ��ϸ����
*/
public String pk_swlgs_b;
/**
*�ϲ㵥������
*/
public String pk_swlgs_h;
/**
*�к�
*/
public static final String ROWNO="rowno";
/**
*��Դ����id
*/
public static final String SRCBILLID="srcbillid";
/**
*��Դ���ݱ���id
*/
public static final String SRCBILLID_B="srcbillid_b";
/**
*ʵ������ʱ
*/
public static final String SWLGS="swlgs";
/**
*����
*/
public static final String SWLGS_DATE="swlgs_date";
/**
*ʱ���
*/
public UFDateTime ts;
/** 
* ��ȡ����
*
* @return ����
*/
public String getBz () {
return (String) this.getAttributeValue( SWLGSBVO.BZ);
 } 

/** 
* ���ð���
*
* @param bz ����
*/
public void setBz ( String bz) {
this.setAttributeValue( SWLGSBVO.BZ,bz);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF1);
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( SWLGSBVO.DEF1,def1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getDef10 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF10);
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( SWLGSBVO.DEF10,def10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getDef11 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF11);
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( SWLGSBVO.DEF11,def11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF12);
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( SWLGSBVO.DEF12,def12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF13);
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( SWLGSBVO.DEF13,def13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF14);
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( SWLGSBVO.DEF14,def14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getDef15 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF15);
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( SWLGSBVO.DEF15,def15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF16);
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( SWLGSBVO.DEF16,def16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF17);
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( SWLGSBVO.DEF17,def17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF18);
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( SWLGSBVO.DEF18,def18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF19);
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( SWLGSBVO.DEF19,def19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF2);
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( SWLGSBVO.DEF2,def2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF20);
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( SWLGSBVO.DEF20,def20);
 } 

/** 
* ��ȡ�Զ�����21
*
* @return �Զ�����21
*/
public String getDef21 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF21);
 } 

/** 
* �����Զ�����21
*
* @param def21 �Զ�����21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( SWLGSBVO.DEF21,def21);
 } 

/** 
* ��ȡ�Զ�����22
*
* @return �Զ�����22
*/
public String getDef22 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF22);
 } 

/** 
* �����Զ�����22
*
* @param def22 �Զ�����22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( SWLGSBVO.DEF22,def22);
 } 

/** 
* ��ȡ�Զ�����23
*
* @return �Զ�����23
*/
public String getDef23 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF23);
 } 

/** 
* �����Զ�����23
*
* @param def23 �Զ�����23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( SWLGSBVO.DEF23,def23);
 } 

/** 
* ��ȡ�Զ�����24
*
* @return �Զ�����24
*/
public String getDef24 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF24);
 } 

/** 
* �����Զ�����24
*
* @param def24 �Զ�����24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( SWLGSBVO.DEF24,def24);
 } 

/** 
* ��ȡ�Զ�����25
*
* @return �Զ�����25
*/
public String getDef25 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF25);
 } 

/** 
* �����Զ�����25
*
* @param def25 �Զ�����25
*/
public void setDef25 ( String def25) {
this.setAttributeValue( SWLGSBVO.DEF25,def25);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF3);
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( SWLGSBVO.DEF3,def3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF4);
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( SWLGSBVO.DEF4,def4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF5);
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( SWLGSBVO.DEF5,def5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getDef6 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF6);
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( SWLGSBVO.DEF6,def6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getDef7 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF7);
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( SWLGSBVO.DEF7,def7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getDef8 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF8);
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( SWLGSBVO.DEF8,def8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getDef9 () {
return (String) this.getAttributeValue( SWLGSBVO.DEF9);
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( SWLGSBVO.DEF9,def9);
 } 

/** 
* ��ȡ���ʱ
*
* @return ���ʱ
*/
public UFDouble getDegs () {
return (UFDouble) this.getAttributeValue( SWLGSBVO.DEGS);
 } 

/** 
* ���ö��ʱ
*
* @param degs ���ʱ
*/
public void setDegs ( UFDouble degs) {
this.setAttributeValue( SWLGSBVO.DEGS,degs);
 } 

/** 
* ��ȡ�����
*
* @return �����
*/
public String getGl () {
return (String) this.getAttributeValue( SWLGSBVO.GL);
 } 

/** 
* ���ù����
*
* @param gl �����
*/
public void setGl ( String gl) {
this.setAttributeValue( SWLGSBVO.GL,gl);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getGlname () {
return (String) this.getAttributeValue( SWLGSBVO.GLNAME);
 } 

/** 
* ���ù�������
*
* @param glname ��������
*/
public void setGlname ( String glname) {
this.setAttributeValue( SWLGSBVO.GLNAME,glname);
 } 

/** 
* ��ȡ��ʱ����
*
* @return ��ʱ����
* @see String
*/
public String getGslx () {
return (String) this.getAttributeValue( SWLGSBVO.GSLX);
 } 

/** 
* ���ù�ʱ����
*
* @param gslx ��ʱ����
* @see String
*/
public void setGslx ( String gslx) {
this.setAttributeValue( SWLGSBVO.GSLX,gslx);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getGz () {
return (String) this.getAttributeValue( SWLGSBVO.GZ);
 } 

/** 
* ���ù���
*
* @param gz ����
*/
public void setGz ( String gz) {
this.setAttributeValue( SWLGSBVO.GZ,gz);
 } 

/** 
* ��ȡ����(%)
*
* @return ����(%)
*/
public UFDouble getJd () {
return (UFDouble) this.getAttributeValue( SWLGSBVO.JD);
 } 

/** 
* ���ý���(%)
*
* @param jd ����(%)
*/
public void setJd ( UFDouble jd) {
this.setAttributeValue( SWLGSBVO.JD,jd);
 } 

/** 
* ��ȡ��Ա
*
* @return ��Ա
*/
public String getPeople () {
return (String) this.getAttributeValue( SWLGSBVO.PEOPLE);
 } 

/** 
* ������Ա
*
* @param people ��Ա
*/
public void setPeople ( String people) {
this.setAttributeValue( SWLGSBVO.PEOPLE,people);
 } 

/** 
* ��ȡʵ������ʱ��ϸ����
*
* @return ʵ������ʱ��ϸ����
*/
public String getPk_swlgs_b () {
return this.pk_swlgs_b;
 } 

/** 
* ����ʵ������ʱ��ϸ����
*
* @param pk_swlgs_b ʵ������ʱ��ϸ����
*/
public void setPk_swlgs_b ( String pk_swlgs_b) {
this.pk_swlgs_b=pk_swlgs_b;
 } 

/** 
* ��ȡ�ϲ㵥������
*
* @return �ϲ㵥������
*/
public String getPk_swlgs_h () {
return this.pk_swlgs_h;
 } 

/** 
* �����ϲ㵥������
*
* @param pk_swlgs_h �ϲ㵥������
*/
public void setPk_swlgs_h ( String pk_swlgs_h) {
this.pk_swlgs_h=pk_swlgs_h;
 } 

/** 
* ��ȡ�к�
*
* @return �к�
*/
public String getRowno () {
return (String) this.getAttributeValue( SWLGSBVO.ROWNO);
 } 

/** 
* �����к�
*
* @param rowno �к�
*/
public void setRowno ( String rowno) {
this.setAttributeValue( SWLGSBVO.ROWNO,rowno);
 } 

/** 
* ��ȡ��Դ����id
*
* @return ��Դ����id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( SWLGSBVO.SRCBILLID);
 } 

/** 
* ������Դ����id
*
* @param srcbillid ��Դ����id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( SWLGSBVO.SRCBILLID,srcbillid);
 } 

/** 
* ��ȡ��Դ���ݱ���id
*
* @return ��Դ���ݱ���id
*/
public String getSrcbillid_b () {
return (String) this.getAttributeValue( SWLGSBVO.SRCBILLID_B);
 } 

/** 
* ������Դ���ݱ���id
*
* @param srcbillid_b ��Դ���ݱ���id
*/
public void setSrcbillid_b ( String srcbillid_b) {
this.setAttributeValue( SWLGSBVO.SRCBILLID_B,srcbillid_b);
 } 

/** 
* ��ȡʵ������ʱ
*
* @return ʵ������ʱ
*/
public UFDouble getSwlgs () {
return (UFDouble) this.getAttributeValue( SWLGSBVO.SWLGS);
 } 

/** 
* ����ʵ������ʱ
*
* @param swlgs ʵ������ʱ
*/
public void setSwlgs ( UFDouble swlgs) {
this.setAttributeValue( SWLGSBVO.SWLGS,swlgs);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public UFDateTime getSwlgs_date () {
return (UFDateTime) this.getAttributeValue( SWLGSBVO.SWLGS_DATE);
 } 

/** 
* ��������
*
* @param swlgs_date ����
*/
public void setSwlgs_date ( UFDateTime swlgs_date) {
this.setAttributeValue( SWLGSBVO.SWLGS_DATE,swlgs_date);
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
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.SWLGSBVO");
  }
}