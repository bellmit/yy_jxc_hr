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
	*ʵ�ʼӹ���
	*/
	public static final String SJJG_PEOPLE="sjjg_people";
/**
*������ʱ
*/
public static final String ADDGS="addgs";
/**
*��������
*/
public static final String CCRQ="ccrq";
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
*�Զ�����26
*/
public static final String DEF26="def26";
/**
*�Զ�����27
*/
public static final String DEF27="def27";
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
*������ʱ
*/
public static final String DJGS="djgs";
/**
*�ػ�����
*/
public static final String HHRQ="hhrq";
/**
*��Ϲ�ʱ
*/
public static final String JDGS="jdgs";
/**
*�������
*/
public static final String JDRQ="jdrq";
/**
*���ԭ��
*/
public static final String JDYY="jdyy";
/**
*��������
*/
public static final String KGRQ="kgrq";
/**
*��ע
*/
public static final String MEMO="memo";
/**
*��Ա����
*/
public static final String PEOPLE="people";
/**
*�ɹ�������������
*/
public String pk_pgd_czz;
/**
*�ϲ㵥������
*/
public String pk_pgk_h;
/**
*�к�
*/
public static final String ROWNO="rowno";
/**
*�豸�ͺ�
*/
public static final String SBXH="sbxh";
/**
*ʵ����ʱ
*/
public static final String SDGS="sdgs";
/**
*�������ȷ����
*/
public static final String SUREPERPLE="sureperple";
/**
*ȷ������
*/
public static final String SURETIME="suretime";
/**
*ʵ������ʱ
*/
public static final String SWLGSS="swlgss";
/**
*ʱ���
*/
public UFDateTime ts;
/**
*�깤����
*/
public static final String WGRQ="wgrq";
/**
*׼����ʱ
*/
public static final String ZBGS="zbgs";
/**
*ת������
*/
public static final String ZCRQ="zcrq";
/**
*�ܹ�ʱ
*/
public static final String ZGS="zgs";
/** 
* ��ȡ������ʱ
*
* @return ������ʱ
*/
public UFDouble getAddgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.ADDGS);
 } 

/** 
* ����������ʱ
*
* @param addgs ������ʱ
*/
public void setAddgs ( UFDouble addgs) {
this.setAttributeValue( PGDBVO01.ADDGS,addgs);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDateTime getCcrq () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.CCRQ);
 } 

/** 
* ���ó�������
*
* @param ccrq ��������
*/
public void setCcrq ( UFDateTime ccrq) {
this.setAttributeValue( PGDBVO01.CCRQ,ccrq);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return (String) this.getAttributeValue( PGDBVO01.DEF1);
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( PGDBVO01.DEF1,def1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getDef10 () {
return (String) this.getAttributeValue( PGDBVO01.DEF10);
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( PGDBVO01.DEF10,def10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getDef11 () {
return (String) this.getAttributeValue( PGDBVO01.DEF11);
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( PGDBVO01.DEF11,def11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return (String) this.getAttributeValue( PGDBVO01.DEF12);
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( PGDBVO01.DEF12,def12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return (String) this.getAttributeValue( PGDBVO01.DEF13);
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( PGDBVO01.DEF13,def13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return (String) this.getAttributeValue( PGDBVO01.DEF14);
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( PGDBVO01.DEF14,def14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getDef15 () {
return (String) this.getAttributeValue( PGDBVO01.DEF15);
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( PGDBVO01.DEF15,def15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return (String) this.getAttributeValue( PGDBVO01.DEF16);
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( PGDBVO01.DEF16,def16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return (String) this.getAttributeValue( PGDBVO01.DEF17);
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( PGDBVO01.DEF17,def17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return (String) this.getAttributeValue( PGDBVO01.DEF18);
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( PGDBVO01.DEF18,def18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return (String) this.getAttributeValue( PGDBVO01.DEF19);
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( PGDBVO01.DEF19,def19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return (String) this.getAttributeValue( PGDBVO01.DEF2);
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( PGDBVO01.DEF2,def2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return (String) this.getAttributeValue( PGDBVO01.DEF20);
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( PGDBVO01.DEF20,def20);
 } 

/** 
* ��ȡ�Զ�����21
*
* @return �Զ�����21
*/
public String getDef21 () {
return (String) this.getAttributeValue( PGDBVO01.DEF21);
 } 

/** 
* �����Զ�����21
*
* @param def21 �Զ�����21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( PGDBVO01.DEF21,def21);
 } 

/** 
* ��ȡ�Զ�����22
*
* @return �Զ�����22
*/
public String getDef22 () {
return (String) this.getAttributeValue( PGDBVO01.DEF22);
 } 

/** 
* �����Զ�����22
*
* @param def22 �Զ�����22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( PGDBVO01.DEF22,def22);
 } 

/** 
* ��ȡ�Զ�����23
*
* @return �Զ�����23
*/
public String getDef23 () {
return (String) this.getAttributeValue( PGDBVO01.DEF23);
 } 

/** 
* �����Զ�����23
*
* @param def23 �Զ�����23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( PGDBVO01.DEF23,def23);
 } 

/** 
* ��ȡ�Զ�����24
*
* @return �Զ�����24
*/
public String getDef24 () {
return (String) this.getAttributeValue( PGDBVO01.DEF24);
 } 

/** 
* �����Զ�����24
*
* @param def24 �Զ�����24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( PGDBVO01.DEF24,def24);
 } 

/** 
* ��ȡ�Զ�����25
*
* @return �Զ�����25
*/
public String getDef25 () {
return (String) this.getAttributeValue( PGDBVO01.DEF25);
 } 

/** 
* �����Զ�����25
*
* @param def25 �Զ�����25
*/
public void setDef25 ( String def25) {
this.setAttributeValue( PGDBVO01.DEF25,def25);
 } 

/** 
* ��ȡ�Զ�����26
*
* @return �Զ�����26
*/
public String getDef26 () {
return (String) this.getAttributeValue( PGDBVO01.DEF26);
 } 

/** 
* �����Զ�����26
*
* @param def26 �Զ�����26
*/
public void setDef26 ( String def26) {
this.setAttributeValue( PGDBVO01.DEF26,def26);
 } 

/** 
* ��ȡ�Զ�����27
*
* @return �Զ�����27
*/
public String getDef27 () {
return (String) this.getAttributeValue( PGDBVO01.DEF27);
 } 

/** 
* �����Զ�����27
*
* @param def27 �Զ�����27
*/
public void setDef27 ( String def27) {
this.setAttributeValue( PGDBVO01.DEF27,def27);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return (String) this.getAttributeValue( PGDBVO01.DEF3);
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( PGDBVO01.DEF3,def3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return (String) this.getAttributeValue( PGDBVO01.DEF4);
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( PGDBVO01.DEF4,def4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return (String) this.getAttributeValue( PGDBVO01.DEF5);
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( PGDBVO01.DEF5,def5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getDef6 () {
return (String) this.getAttributeValue( PGDBVO01.DEF6);
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( PGDBVO01.DEF6,def6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getDef7 () {
return (String) this.getAttributeValue( PGDBVO01.DEF7);
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( PGDBVO01.DEF7,def7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getDef8 () {
return (String) this.getAttributeValue( PGDBVO01.DEF8);
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( PGDBVO01.DEF8,def8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getDef9 () {
return (String) this.getAttributeValue( PGDBVO01.DEF9);
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( PGDBVO01.DEF9,def9);
 } 

/** 
* ��ȡ������ʱ
*
* @return ������ʱ
*/
public UFDouble getDjgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.DJGS);
 } 

/** 
* ���õ�����ʱ
*
* @param djgs ������ʱ
*/
public void setDjgs ( UFDouble djgs) {
this.setAttributeValue( PGDBVO01.DJGS,djgs);
 } 

/** 
* ��ȡ�ػ�����
*
* @return �ػ�����
*/
public UFDateTime getHhrq () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.HHRQ);
 } 

/** 
* ���ûػ�����
*
* @param hhrq �ػ�����
*/
public void setHhrq ( UFDateTime hhrq) {
this.setAttributeValue( PGDBVO01.HHRQ,hhrq);
 } 

/** 
* ��ȡ��Ϲ�ʱ
*
* @return ��Ϲ�ʱ
*/
public UFDouble getJdgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.JDGS);
 } 

/** 
* ���ü�Ϲ�ʱ
*
* @param jdgs ��Ϲ�ʱ
*/
public void setJdgs ( UFDouble jdgs) {
this.setAttributeValue( PGDBVO01.JDGS,jdgs);
 } 

/** 
* ��ȡ�������
*
* @return �������
*/
public UFDate getJdrq () {
return (UFDate) this.getAttributeValue( PGDBVO01.JDRQ);
 } 

/** 
* ���ü������
*
* @param jdrq �������
*/
public void setJdrq ( UFDate jdrq) {
this.setAttributeValue( PGDBVO01.JDRQ,jdrq);
 } 

/** 
* ��ȡ���ԭ��
*
* @return ���ԭ��
*/
public String getJdyy () {
return (String) this.getAttributeValue( PGDBVO01.JDYY);
 } 

/** 
* ���ü��ԭ��
*
* @param jdyy ���ԭ��
*/
public void setJdyy ( String jdyy) {
this.setAttributeValue( PGDBVO01.JDYY,jdyy);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDateTime getKgrq () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.KGRQ);
 } 

/** 
* ���ÿ�������
*
* @param kgrq ��������
*/
public void setKgrq ( UFDateTime kgrq) {
this.setAttributeValue( PGDBVO01.KGRQ,kgrq);
 } 

/** 
* ��ȡ��ע
*
* @return ��ע
*/
public String getMemo () {
return (String) this.getAttributeValue( PGDBVO01.MEMO);
 } 

/** 
* ���ñ�ע
*
* @param memo ��ע
*/
public void setMemo ( String memo) {
this.setAttributeValue( PGDBVO01.MEMO,memo);
 } 

/** 
* ��ȡ��Ա����
*
* @return ��Ա����
*/
public String getPeople () {
return (String) this.getAttributeValue( PGDBVO01.PEOPLE);
 } 

/** 
* ������Ա����
*
* @param people ��Ա����
*/
public void setPeople ( String people) {
this.setAttributeValue( PGDBVO01.PEOPLE,people);
 } 

/** 
* ��ȡ�ɹ�������������
*
* @return �ɹ�������������
*/
public String getPk_pgd_czz () {
return this.pk_pgd_czz;
 } 

/** 
* �����ɹ�������������
*
* @param pk_pgd_czz �ɹ�������������
*/
public void setPk_pgd_czz ( String pk_pgd_czz) {
this.pk_pgd_czz=pk_pgd_czz;
 } 

/** 
* ��ȡ�ϲ㵥������
*
* @return �ϲ㵥������
*/
public String getPk_pgk_h () {
return this.pk_pgk_h;
 } 

/** 
* �����ϲ㵥������
*
* @param pk_pgk_h �ϲ㵥������
*/
public void setPk_pgk_h ( String pk_pgk_h) {
this.pk_pgk_h=pk_pgk_h;
 } 

/** 
* ��ȡ�к�
*
* @return �к�
*/
public String getRowno () {
return (String) this.getAttributeValue( PGDBVO01.ROWNO);
 } 

/** 
* �����к�
*
* @param rowno �к�
*/
public void setRowno ( String rowno) {
this.setAttributeValue( PGDBVO01.ROWNO,rowno);
 } 

/** 
* ��ȡ�豸�ͺ�
*
* @return �豸�ͺ�
*/
public String getSbxh () {
return (String) this.getAttributeValue( PGDBVO01.SBXH);
 } 

/** 
* �����豸�ͺ�
*
* @param sbxh �豸�ͺ�
*/
public void setSbxh ( String sbxh) {
this.setAttributeValue( PGDBVO01.SBXH,sbxh);
 } 

/** 
* ��ȡʵ����ʱ
*
* @return ʵ����ʱ
*/
public UFDouble getSdgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.SDGS);
 } 

/** 
* ����ʵ����ʱ
*
* @param sdgs ʵ����ʱ
*/
public void setSdgs ( UFDouble sdgs) {
this.setAttributeValue( PGDBVO01.SDGS,sdgs);
 } 

/** 
* ��ȡ�������ȷ����
*
* @return �������ȷ����
*/
public String getSureperple () {
return (String) this.getAttributeValue( PGDBVO01.SUREPERPLE);
 } 

/** 
* �����������ȷ����
*
* @param sureperple �������ȷ����
*/
public void setSureperple ( String sureperple) {
this.setAttributeValue( PGDBVO01.SUREPERPLE,sureperple);
 } 

/** 
* ��ȡȷ������
*
* @return ȷ������
*/
public UFDateTime getSuretime () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.SURETIME);
 } 

/** 
* ����ȷ������
*
* @param suretime ȷ������
*/
public void setSuretime ( UFDateTime suretime) {
this.setAttributeValue( PGDBVO01.SURETIME,suretime);
 } 

/** 
* ��ȡʵ������ʱ
*
* @return ʵ������ʱ
*/
public UFDouble getSwlgss () {
return (UFDouble) this.getAttributeValue( PGDBVO01.SWLGSS);
 } 

/** 
* ����ʵ������ʱ
*
* @param swlgss ʵ������ʱ
*/
public void setSwlgss ( UFDouble swlgss) {
this.setAttributeValue( PGDBVO01.SWLGSS,swlgss);
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
* ��ȡ�깤����
*
* @return �깤����
*/
public UFDateTime getWgrq () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.WGRQ);
 } 

/** 
* �����깤����
*
* @param wgrq �깤����
*/
public void setWgrq ( UFDateTime wgrq) {
this.setAttributeValue( PGDBVO01.WGRQ,wgrq);
 } 

/** 
* ��ȡ׼����ʱ
*
* @return ׼����ʱ
*/
public UFDouble getZbgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.ZBGS);
 } 

/** 
* ����׼����ʱ
*
* @param zbgs ׼����ʱ
*/
public void setZbgs ( UFDouble zbgs) {
this.setAttributeValue( PGDBVO01.ZBGS,zbgs);
 } 

/** 
* ��ȡת������
*
* @return ת������
*/
public UFDateTime getZcrq () {
return (UFDateTime) this.getAttributeValue( PGDBVO01.ZCRQ);
 } 

/** 
* ����ת������
*
* @param zcrq ת������
*/
public void setZcrq ( UFDateTime zcrq) {
this.setAttributeValue( PGDBVO01.ZCRQ,zcrq);
 } 

/** 
* ��ȡ�ܹ�ʱ
*
* @return �ܹ�ʱ
*/
public UFDouble getZgs () {
return (UFDouble) this.getAttributeValue( PGDBVO01.ZGS);
 } 

/** 
* �����ܹ�ʱ
*
* @param zgs �ܹ�ʱ
*/
public void setZgs ( UFDouble zgs) {
this.setAttributeValue( PGDBVO01.ZGS,zgs);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.�ɹ���������");
  }

  /** 
  * ��ȡʵ�ʼӹ���
  *
  * @return ʵ�ʼӹ���
  */
  public String getSjjg_people () {
  return (String) this.getAttributeValue( PGDBVO01.SJJG_PEOPLE);
   } 

  /** 
  * ����ʵ�ʼӹ���
  *
  * @param sjjg_people ʵ�ʼӹ���
  */
  public void setSjjg_people ( String sjjg_people) {
  this.setAttributeValue( PGDBVO01.SJJG_PEOPLE,sjjg_people);
   } 
}