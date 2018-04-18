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
*��ע
*/
public static final String BZ="bz";
/**
*��Ʒ��Ŀ����
*/
public static final String CPMC="cpmc";
/**
*��ƷҪ������
*/
public static final String CPYQPS="cpyqps";
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
*��ͬ�Է�����
*/
public static final String DFMC="dfmc";
/**
*����
*/
public static final String FS="fs";
/**
*�����
*/
public static final String GLH="glh";
/**
*�Ƿ�ϸ񹩷�
*/
public static final String HGGF="hggf";
/**
*��ͬ���
*/
public static final String HTBH="htbh";
/**
*��ͬ���
*/
public static final String HTJE="htje";
/**
*��ͬ����
*/
public static final String HTLX="htlx";
/**
*��ͬ����
*/
public static final String HTPS="htps";
/**
*������
*/
public static final String JBR="jbr";
/**
*�ܼ�
*/
public static final String MJ="mj";
/**
*����
*/
public static final String PK_DEPT="pk_dept";
/**
*��ӡ����
*/
public static final String PK_DEPT_V="pk_dept_v";
/**
*��ͬ����ϸ����
*/
public String pk_ht_b;
/**
*�ϲ㵥������
*/
public String pk_ht_h;
/**
*ǩԼ��
*/
public static final String QYR="qyr";
/**
*�к�
*/
public static final String ROWNO="rowno";
/**
*���
*/
public static final String SJ="sj";
/**
*��Ȩί����
*/
public static final String SQWTS="sqwts";
/**
*����һ��
*/
public static final String SZYD="szyd";
/**
*ʱ���
*/
public UFDateTime ts;
/**
*�ı��ַ�
*/
public static final String WBFF="wbff";
/**
*��Э�����Ŀ������
*/
public static final String XMSPB="xmspb";
/**
*��ӡ����
*/
public static final String YYRQ="yyrq";
/**
*ӡ������
*/
public static final String YZMC="yzmc";
/** 
* ��ȡ��ע
*
* @return ��ע
*/
public String getBz () {
return (String) this.getAttributeValue( HtBVO.BZ);
 } 

/** 
* ���ñ�ע
*
* @param bz ��ע
*/
public void setBz ( String bz) {
this.setAttributeValue( HtBVO.BZ,bz);
 } 

/** 
* ��ȡ��Ʒ��Ŀ����
*
* @return ��Ʒ��Ŀ����
*/
public String getCpmc () {
return (String) this.getAttributeValue( HtBVO.CPMC);
 } 

/** 
* ���ò�Ʒ��Ŀ����
*
* @param cpmc ��Ʒ��Ŀ����
*/
public void setCpmc ( String cpmc) {
this.setAttributeValue( HtBVO.CPMC,cpmc);
 } 

/** 
* ��ȡ��ƷҪ������
*
* @return ��ƷҪ������
*/
public String getCpyqps () {
return (String) this.getAttributeValue( HtBVO.CPYQPS);
 } 

/** 
* ���ò�ƷҪ������
*
* @param cpyqps ��ƷҪ������
*/
public void setCpyqps ( String cpyqps) {
this.setAttributeValue( HtBVO.CPYQPS,cpyqps);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return (String) this.getAttributeValue( HtBVO.DEF1);
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( HtBVO.DEF1,def1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public Integer getDef10 () {
return (Integer) this.getAttributeValue( HtBVO.DEF10);
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( Integer def10) {
this.setAttributeValue( HtBVO.DEF10,def10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public Integer getDef11 () {
return (Integer) this.getAttributeValue( HtBVO.DEF11);
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( Integer def11) {
this.setAttributeValue( HtBVO.DEF11,def11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return (String) this.getAttributeValue( HtBVO.DEF12);
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( HtBVO.DEF12,def12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return (String) this.getAttributeValue( HtBVO.DEF13);
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( HtBVO.DEF13,def13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return (String) this.getAttributeValue( HtBVO.DEF14);
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( HtBVO.DEF14,def14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public UFDate getDef15 () {
return (UFDate) this.getAttributeValue( HtBVO.DEF15);
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( UFDate def15) {
this.setAttributeValue( HtBVO.DEF15,def15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return (String) this.getAttributeValue( HtBVO.DEF16);
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( HtBVO.DEF16,def16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return (String) this.getAttributeValue( HtBVO.DEF17);
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( HtBVO.DEF17,def17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return (String) this.getAttributeValue( HtBVO.DEF18);
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( HtBVO.DEF18,def18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return (String) this.getAttributeValue( HtBVO.DEF19);
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( HtBVO.DEF19,def19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return (String) this.getAttributeValue( HtBVO.DEF2);
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( HtBVO.DEF2,def2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return (String) this.getAttributeValue( HtBVO.DEF20);
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( HtBVO.DEF20,def20);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return (String) this.getAttributeValue( HtBVO.DEF3);
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( HtBVO.DEF3,def3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return (String) this.getAttributeValue( HtBVO.DEF4);
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( HtBVO.DEF4,def4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return (String) this.getAttributeValue( HtBVO.DEF5);
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( HtBVO.DEF5,def5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public UFDouble getDef6 () {
return (UFDouble) this.getAttributeValue( HtBVO.DEF6);
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( UFDouble def6) {
this.setAttributeValue( HtBVO.DEF6,def6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public UFDouble getDef7 () {
return (UFDouble) this.getAttributeValue( HtBVO.DEF7);
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( UFDouble def7) {
this.setAttributeValue( HtBVO.DEF7,def7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public UFDouble getDef8 () {
return (UFDouble) this.getAttributeValue( HtBVO.DEF8);
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( UFDouble def8) {
this.setAttributeValue( HtBVO.DEF8,def8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public UFDouble getDef9 () {
return (UFDouble) this.getAttributeValue( HtBVO.DEF9);
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( UFDouble def9) {
this.setAttributeValue( HtBVO.DEF9,def9);
 } 

/** 
* ��ȡ��ͬ�Է�����
*
* @return ��ͬ�Է�����
*/
public String getDfmc () {
return (String) this.getAttributeValue( HtBVO.DFMC);
 } 

/** 
* ���ú�ͬ�Է�����
*
* @param dfmc ��ͬ�Է�����
*/
public void setDfmc ( String dfmc) {
this.setAttributeValue( HtBVO.DFMC,dfmc);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public Integer getFs () {
return (Integer) this.getAttributeValue( HtBVO.FS);
 } 

/** 
* ���÷���
*
* @param fs ����
*/
public void setFs ( Integer fs) {
this.setAttributeValue( HtBVO.FS,fs);
 } 

/** 
* ��ȡ�����
*
* @return �����
*/
public String getGlh () {
return (String) this.getAttributeValue( HtBVO.GLH);
 } 

/** 
* ���ù����
*
* @param glh �����
*/
public void setGlh ( String glh) {
this.setAttributeValue( HtBVO.GLH,glh);
 } 

/** 
* ��ȡ�Ƿ�ϸ񹩷�
*
* @return �Ƿ�ϸ񹩷�
*/
public String getHggf () {
return (String) this.getAttributeValue( HtBVO.HGGF);
 } 

/** 
* �����Ƿ�ϸ񹩷�
*
* @param hggf �Ƿ�ϸ񹩷�
*/
public void setHggf ( String hggf) {
this.setAttributeValue( HtBVO.HGGF,hggf);
 } 

/** 
* ��ȡ��ͬ���
*
* @return ��ͬ���
*/
public String getHtbh () {
return (String) this.getAttributeValue( HtBVO.HTBH);
 } 

/** 
* ���ú�ͬ���
*
* @param htbh ��ͬ���
*/
public void setHtbh ( String htbh) {
this.setAttributeValue( HtBVO.HTBH,htbh);
 } 

/** 
* ��ȡ��ͬ���
*
* @return ��ͬ���
*/
public UFDouble getHtje () {
return (UFDouble) this.getAttributeValue( HtBVO.HTJE);
 } 

/** 
* ���ú�ͬ���
*
* @param htje ��ͬ���
*/
public void setHtje ( UFDouble htje) {
this.setAttributeValue( HtBVO.HTJE,htje);
 } 

/** 
* ��ȡ��ͬ����
*
* @return ��ͬ����
*/
public String getHtlx () {
return (String) this.getAttributeValue( HtBVO.HTLX);
 } 

/** 
* ���ú�ͬ����
*
* @param htlx ��ͬ����
*/
public void setHtlx ( String htlx) {
this.setAttributeValue( HtBVO.HTLX,htlx);
 } 

/** 
* ��ȡ��ͬ����
*
* @return ��ͬ����
*/
public String getHtps () {
return (String) this.getAttributeValue( HtBVO.HTPS);
 } 

/** 
* ���ú�ͬ����
*
* @param htps ��ͬ����
*/
public void setHtps ( String htps) {
this.setAttributeValue( HtBVO.HTPS,htps);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getJbr () {
return (String) this.getAttributeValue( HtBVO.JBR);
 } 

/** 
* ���þ�����
*
* @param jbr ������
*/
public void setJbr ( String jbr) {
this.setAttributeValue( HtBVO.JBR,jbr);
 } 

/** 
* ��ȡ�ܼ�
*
* @return �ܼ�
*/
public String getMj () {
return (String) this.getAttributeValue( HtBVO.MJ);
 } 

/** 
* �����ܼ�
*
* @param mj �ܼ�
*/
public void setMj ( String mj) {
this.setAttributeValue( HtBVO.MJ,mj);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_dept () {
return (String) this.getAttributeValue( HtBVO.PK_DEPT);
 } 

/** 
* ���ò���
*
* @param pk_dept ����
*/
public void setPk_dept ( String pk_dept) {
this.setAttributeValue( HtBVO.PK_DEPT,pk_dept);
 } 

/** 
* ��ȡ��ӡ����
*
* @return ��ӡ����
*/
public String getPk_dept_v () {
return (String) this.getAttributeValue( HtBVO.PK_DEPT_V);
 } 

/** 
* ������ӡ����
*
* @param pk_dept_v ��ӡ����
*/
public void setPk_dept_v ( String pk_dept_v) {
this.setAttributeValue( HtBVO.PK_DEPT_V,pk_dept_v);
 } 

/** 
* ��ȡ��ͬ����ϸ����
*
* @return ��ͬ����ϸ����
*/
public String getPk_ht_b () {
return this.pk_ht_b;
 } 

/** 
* ���ú�ͬ����ϸ����
*
* @param pk_ht_b ��ͬ����ϸ����
*/
public void setPk_ht_b ( String pk_ht_b) {
this.pk_ht_b=pk_ht_b;
 } 

/** 
* ��ȡ�ϲ㵥������
*
* @return �ϲ㵥������
*/
public String getPk_ht_h () {
return this.pk_ht_h;
 } 

/** 
* �����ϲ㵥������
*
* @param pk_ht_h �ϲ㵥������
*/
public void setPk_ht_h ( String pk_ht_h) {
this.pk_ht_h=pk_ht_h;
 } 

/** 
* ��ȡǩԼ��
*
* @return ǩԼ��
*/
public String getQyr () {
return (String) this.getAttributeValue( HtBVO.QYR);
 } 

/** 
* ����ǩԼ��
*
* @param qyr ǩԼ��
*/
public void setQyr ( String qyr) {
this.setAttributeValue( HtBVO.QYR,qyr);
 } 

/** 
* ��ȡ�к�
*
* @return �к�
*/
public String getRowno () {
return (String) this.getAttributeValue( HtBVO.ROWNO);
 } 

/** 
* �����к�
*
* @param rowno �к�
*/
public void setRowno ( String rowno) {
this.setAttributeValue( HtBVO.ROWNO,rowno);
 } 

/** 
* ��ȡ���
*
* @return ���
*/
public String getSj () {
return (String) this.getAttributeValue( HtBVO.SJ);
 } 

/** 
* �������
*
* @param sj ���
*/
public void setSj ( String sj) {
this.setAttributeValue( HtBVO.SJ,sj);
 } 

/** 
* ��ȡ��Ȩί����
*
* @return ��Ȩί����
*/
public String getSqwts () {
return (String) this.getAttributeValue( HtBVO.SQWTS);
 } 

/** 
* ������Ȩί����
*
* @param sqwts ��Ȩί����
*/
public void setSqwts ( String sqwts) {
this.setAttributeValue( HtBVO.SQWTS,sqwts);
 } 

/** 
* ��ȡ����һ��
*
* @return ����һ��
*/
public String getSzyd () {
return (String) this.getAttributeValue( HtBVO.SZYD);
 } 

/** 
* ��������һ��
*
* @param szyd ����һ��
*/
public void setSzyd ( String szyd) {
this.setAttributeValue( HtBVO.SZYD,szyd);
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

/** 
* ��ȡ�ı��ַ�
*
* @return �ı��ַ�
*/
public String getWbff () {
return (String) this.getAttributeValue( HtBVO.WBFF);
 } 

/** 
* �����ı��ַ�
*
* @param wbff �ı��ַ�
*/
public void setWbff ( String wbff) {
this.setAttributeValue( HtBVO.WBFF,wbff);
 } 

/** 
* ��ȡ��Э�����Ŀ������
*
* @return ��Э�����Ŀ������
*/
public String getXmspb () {
return (String) this.getAttributeValue( HtBVO.XMSPB);
 } 

/** 
* ������Э�����Ŀ������
*
* @param xmspb ��Э�����Ŀ������
*/
public void setXmspb ( String xmspb) {
this.setAttributeValue( HtBVO.XMSPB,xmspb);
 } 

/** 
* ��ȡ��ӡ����
*
* @return ��ӡ����
*/
public UFDate getYyrq () {
return (UFDate) this.getAttributeValue( HtBVO.YYRQ);
 } 

/** 
* ������ӡ����
*
* @param yyrq ��ӡ����
*/
public void setYyrq ( UFDate yyrq) {
this.setAttributeValue( HtBVO.YYRQ,yyrq);
 } 

/** 
* ��ȡӡ������
*
* @return ӡ������
*/
public String getYzmc () {
return (String) this.getAttributeValue( HtBVO.YZMC);
 } 

/** 
* ����ӡ������
*
* @param yzmc ӡ������
*/
public void setYzmc ( String yzmc) {
this.setAttributeValue( HtBVO.YZMC,yzmc);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.htHVO");
  }
}