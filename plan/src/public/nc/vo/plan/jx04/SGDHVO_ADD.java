package nc.vo.plan.jx04;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class SGDHVO_ADD extends SuperVO {
/**
*������ʱ
*/
public static final String ADDHOURS="addhours";
/**
*����ʱ��
*/
public static final String APPROVEDATE="approvedate";
/**
*��������
*/
public static final String APPROVENOTE="approvenote";
/**
*������
*/
public static final String APPROVER="approver";
/**
*����״̬
*/
public static final String APPROVESTATUS="approvestatus";
/**
*��������
*/
public static final String BILLDATE="billdate";
/**
*�Ƶ���
*/
public static final String BILLMAKER="billmaker";
/**
*���ݺ�
*/
public static final String BILLNO="billno";
/**
*��������
*/
public static final String BILLTYPE="billtype";
/**
*���ݰ汾pk
*/
public static final String BILLVERSIONPK="billversionpk";
/**
*ҵ������
*/
public static final String BUSITYPE="busitype";
/**
*��ע
*/
public static final String BZ="bz";
/**
*����ص�
*/
public static final String CCDD="ccdd";
/**
*��Ʒ�깤��
*/
public static final String CPWGDATE="cpwgdate";
/**
*����ʱ��
*/
public static final String CREATIONTIME="creationtime";
/**
*������
*/
public static final String CREATOR="creator";
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
*��������
*/
public static final String DHDH="dhdh";
/**
*������λ
*/
public static final String DHDW="dhdw";
/**
*��������
*/
public static final String DHSL="dhsl";
/**
*�޶�ö��
*/
public static final String EMENDENUM="emendenum";
/**
*�����
*/
public static final String GL="gl";
/**
*��ʱ
*/
public static final String GS="gs";
/**
*����
*/
public static final String GZ="gz";
/**
*���˵ص�
*/
public static final String JZDD="jzdd";
/**
*��������
*/
public static final String KGDATE="kgdate";
/**
*����޸�ʱ��
*/
public static final String LASTMAKETIME="lastmaketime";
/**
*�Ƶ�ʱ��
*/
public static final String MAKETIME="maketime";
/**
*�޸�ʱ��
*/
public static final String MODIFIEDTIME="modifiedtime";
/**
*�޸���
*/
public static final String MODIFIER="modifier";
/**
*ë���깤��
*/
public static final String MPWGDATE="mpwgdate";
/**
*����
*/
public static final String PK_GROUP="pk_group";
/**
*��Ŀ��֯
*/
public static final String PK_ORG="pk_org";
/**
*��Ŀ��֯
*/
public static final String PK_ORG_V="pk_org_v";
/**
*ʩ������������
*/
public String pk_sgd_add_h;
/**
*ʩ��������
*/
public static final String PK_SGD_H="pk_sgd_h";
/**
*ʩ��������
*/
public static final String SGDNO="sgdno";
/**
*����
*/
public static final String SGML_DEPT="sgml_dept";
/**
*��֯_���Ű汾��Ϣ
*/
public static final String SGML_DEPT_V="sgml_dept_v";
/**
*ʩ������
*/
public static final String SGYJ="sgyj";
/**
*ʵ�ʺϸ���
*/
public static final String SJHGDATE="sjhgdate";
/**
*ʵ���깤��
*/
public static final String SJWGDATE="sjwgdate";
/**
*ʵ��������
*/
public static final String SJYSDATE="sjysdate";
/**
*��Դ����id
*/
public static final String SRCBILLID="srcbillid";
/**
*Դͷ����hid
*/
public static final String FIRSTBILLHID="firstbillhid";
/**
*Դͷ����bid
*/
public static final String FIRSTBILLBID="firstbillbid";
/**
*��Դ���ݱ���id
*/
public static final String SRCBILLID_B="srcbillid_b";
/**
*��Դ��������
*/
public static final String SRCBILLTYPE="srcbilltype";
/**
*��������
*/
public static final String TASKNAME="taskname";
/**
*������
*/
public static final String TASKNO="taskno";
/**
*���ʱ�ܼ�
*/
public static final String TOTALGS="totalgs";
/**
*�ϼ�����
*/
public static final String TOTALNUM="totalnum";
/**
*��������
*/
public static final String TRANSTYPE="transtype";
/**
*��������pk
*/
public static final String TRANSTYPEPK="transtypepk";
/**
*ʱ���
*/
public UFDateTime ts;
/** 
* ��ȡ������ʱ
*
* @return ������ʱ
*/
public UFDouble getAddhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_ADD.ADDHOURS);
 } 

/** 
* ����������ʱ
*
* @param addhours ������ʱ
*/
public void setAddhours ( UFDouble addhours) {
this.setAttributeValue( SGDHVO_ADD.ADDHOURS,addhours);
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getApprovedate () {
return (UFDateTime) this.getAttributeValue( SGDHVO_ADD.APPROVEDATE);
 } 

/** 
* ��������ʱ��
*
* @param approvedate ����ʱ��
*/
public void setApprovedate ( UFDateTime approvedate) {
this.setAttributeValue( SGDHVO_ADD.APPROVEDATE,approvedate);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getApprovenote () {
return (String) this.getAttributeValue( SGDHVO_ADD.APPROVENOTE);
 } 

/** 
* ������������
*
* @param approvenote ��������
*/
public void setApprovenote ( String approvenote) {
this.setAttributeValue( SGDHVO_ADD.APPROVENOTE,approvenote);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getApprover () {
return (String) this.getAttributeValue( SGDHVO_ADD.APPROVER);
 } 

/** 
* ����������
*
* @param approver ������
*/
public void setApprover ( String approver) {
this.setAttributeValue( SGDHVO_ADD.APPROVER,approver);
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getApprovestatus () {
return (Integer) this.getAttributeValue( SGDHVO_ADD.APPROVESTATUS);
 } 

/** 
* ��������״̬
*
* @param approvestatus ����״̬
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.setAttributeValue( SGDHVO_ADD.APPROVESTATUS,approvestatus);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getBilldate () {
return (UFDate) this.getAttributeValue( SGDHVO_ADD.BILLDATE);
 } 

/** 
* ���õ�������
*
* @param billdate ��������
*/
public void setBilldate ( UFDate billdate) {
this.setAttributeValue( SGDHVO_ADD.BILLDATE,billdate);
 } 

/** 
* ��ȡ�Ƶ���
*
* @return �Ƶ���
*/
public String getBillmaker () {
return (String) this.getAttributeValue( SGDHVO_ADD.BILLMAKER);
 } 

/** 
* �����Ƶ���
*
* @param billmaker �Ƶ���
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( SGDHVO_ADD.BILLMAKER,billmaker);
 } 

/** 
* ��ȡ���ݺ�
*
* @return ���ݺ�
*/
public String getBillno () {
return (String) this.getAttributeValue( SGDHVO_ADD.BILLNO);
 } 

/** 
* ���õ��ݺ�
*
* @param billno ���ݺ�
*/
public void setBillno ( String billno) {
this.setAttributeValue( SGDHVO_ADD.BILLNO,billno);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getBilltype () {
return (String) this.getAttributeValue( SGDHVO_ADD.BILLTYPE);
 } 

/** 
* ���õ�������
*
* @param billtype ��������
*/
public void setBilltype ( String billtype) {
this.setAttributeValue( SGDHVO_ADD.BILLTYPE,billtype);
 } 

/** 
* ��ȡ���ݰ汾pk
*
* @return ���ݰ汾pk
*/
public String getBillversionpk () {
return (String) this.getAttributeValue( SGDHVO_ADD.BILLVERSIONPK);
 } 

/** 
* ���õ��ݰ汾pk
*
* @param billversionpk ���ݰ汾pk
*/
public void setBillversionpk ( String billversionpk) {
this.setAttributeValue( SGDHVO_ADD.BILLVERSIONPK,billversionpk);
 } 

/** 
* ��ȡҵ������
*
* @return ҵ������
*/
public String getBusitype () {
return (String) this.getAttributeValue( SGDHVO_ADD.BUSITYPE);
 } 

/** 
* ����ҵ������
*
* @param busitype ҵ������
*/
public void setBusitype ( String busitype) {
this.setAttributeValue( SGDHVO_ADD.BUSITYPE,busitype);
 } 

/** 
* ��ȡ��ע
*
* @return ��ע
*/
public String getBz () {
return (String) this.getAttributeValue( SGDHVO_ADD.BZ);
 } 

/** 
* ���ñ�ע
*
* @param bz ��ע
*/
public void setBz ( String bz) {
this.setAttributeValue( SGDHVO_ADD.BZ,bz);
 } 

/** 
* ��ȡ����ص�
*
* @return ����ص�
*/
public String getCcdd () {
return (String) this.getAttributeValue( SGDHVO_ADD.CCDD);
 } 

/** 
* ���ó���ص�
*
* @param ccdd ����ص�
*/
public void setCcdd ( String ccdd) {
this.setAttributeValue( SGDHVO_ADD.CCDD,ccdd);
 } 

/** 
* ��ȡ��Ʒ�깤��
*
* @return ��Ʒ�깤��
*/
public UFDate getCpwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_ADD.CPWGDATE);
 } 

/** 
* ���ò�Ʒ�깤��
*
* @param cpwgdate ��Ʒ�깤��
*/
public void setCpwgdate ( UFDate cpwgdate) {
this.setAttributeValue( SGDHVO_ADD.CPWGDATE,cpwgdate);
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_ADD.CREATIONTIME);
 } 

/** 
* ���ô���ʱ��
*
* @param creationtime ����ʱ��
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( SGDHVO_ADD.CREATIONTIME,creationtime);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getCreator () {
return (String) this.getAttributeValue( SGDHVO_ADD.CREATOR);
 } 

/** 
* ���ô�����
*
* @param creator ������
*/
public void setCreator ( String creator) {
this.setAttributeValue( SGDHVO_ADD.CREATOR,creator);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF1);
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( SGDHVO_ADD.DEF1,def1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getDef10 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF10);
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( SGDHVO_ADD.DEF10,def10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getDef11 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF11);
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( SGDHVO_ADD.DEF11,def11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF12);
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( SGDHVO_ADD.DEF12,def12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF13);
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( SGDHVO_ADD.DEF13,def13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF14);
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( SGDHVO_ADD.DEF14,def14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getDef15 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF15);
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( SGDHVO_ADD.DEF15,def15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF16);
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( SGDHVO_ADD.DEF16,def16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF17);
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( SGDHVO_ADD.DEF17,def17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF18);
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( SGDHVO_ADD.DEF18,def18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF19);
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( SGDHVO_ADD.DEF19,def19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF2);
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( SGDHVO_ADD.DEF2,def2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF20);
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( SGDHVO_ADD.DEF20,def20);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF3);
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( SGDHVO_ADD.DEF3,def3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF4);
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( SGDHVO_ADD.DEF4,def4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF5);
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( SGDHVO_ADD.DEF5,def5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getDef6 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF6);
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( SGDHVO_ADD.DEF6,def6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getDef7 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF7);
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( SGDHVO_ADD.DEF7,def7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getDef8 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF8);
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( SGDHVO_ADD.DEF8,def8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getDef9 () {
return (String) this.getAttributeValue( SGDHVO_ADD.DEF9);
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( SGDHVO_ADD.DEF9,def9);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getDhdh () {
return (String) this.getAttributeValue( SGDHVO_ADD.DHDH);
 } 

/** 
* ���ö�������
*
* @param dhdh ��������
*/
public void setDhdh ( String dhdh) {
this.setAttributeValue( SGDHVO_ADD.DHDH,dhdh);
 } 

/** 
* ��ȡ������λ
*
* @return ������λ
*/
public String getDhdw () {
return (String) this.getAttributeValue( SGDHVO_ADD.DHDW);
 } 

/** 
* ���ö�����λ
*
* @param dhdw ������λ
*/
public void setDhdw ( String dhdw) {
this.setAttributeValue( SGDHVO_ADD.DHDW,dhdw);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDouble getDhsl () {
return (UFDouble) this.getAttributeValue( SGDHVO_ADD.DHSL);
 } 

/** 
* ���ö�������
*
* @param dhsl ��������
*/
public void setDhsl ( UFDouble dhsl) {
this.setAttributeValue( SGDHVO_ADD.DHSL,dhsl);
 } 

/** 
* ��ȡ�޶�ö��
*
* @return �޶�ö��
*/
public Integer getEmendenum () {
return (Integer) this.getAttributeValue( SGDHVO_ADD.EMENDENUM);
 } 

/** 
* �����޶�ö��
*
* @param emendenum �޶�ö��
*/
public void setEmendenum ( Integer emendenum) {
this.setAttributeValue( SGDHVO_ADD.EMENDENUM,emendenum);
 } 

/** 
* ��ȡ�����
*
* @return �����
*/
public String getGl () {
return (String) this.getAttributeValue( SGDHVO_ADD.GL);
 } 

/** 
* ���ù����
*
* @param gl �����
*/
public void setGl ( String gl) {
this.setAttributeValue( SGDHVO_ADD.GL,gl);
 } 

/** 
* ��ȡ��ʱ
*
* @return ��ʱ
*/
public UFDouble getGs () {
return (UFDouble) this.getAttributeValue( SGDHVO_ADD.GS);
 } 

/** 
* ���ù�ʱ
*
* @param gs ��ʱ
*/
public void setGs ( UFDouble gs) {
this.setAttributeValue( SGDHVO_ADD.GS,gs);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getGz () {
return (String) this.getAttributeValue( SGDHVO_ADD.GZ);
 } 

/** 
* ���ù���
*
* @param gz ����
*/
public void setGz ( String gz) {
this.setAttributeValue( SGDHVO_ADD.GZ,gz);
 } 

/** 
* ��ȡ���˵ص�
*
* @return ���˵ص�
*/
public String getJzdd () {
return (String) this.getAttributeValue( SGDHVO_ADD.JZDD);
 } 

/** 
* ���ý��˵ص�
*
* @param jzdd ���˵ص�
*/
public void setJzdd ( String jzdd) {
this.setAttributeValue( SGDHVO_ADD.JZDD,jzdd);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getKgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_ADD.KGDATE);
 } 

/** 
* ���ÿ�������
*
* @param kgdate ��������
*/
public void setKgdate ( UFDate kgdate) {
this.setAttributeValue( SGDHVO_ADD.KGDATE,kgdate);
 } 

/** 
* ��ȡ����޸�ʱ��
*
* @return ����޸�ʱ��
*/
public UFDateTime getLastmaketime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_ADD.LASTMAKETIME);
 } 

/** 
* ��������޸�ʱ��
*
* @param lastmaketime ����޸�ʱ��
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.setAttributeValue( SGDHVO_ADD.LASTMAKETIME,lastmaketime);
 } 

/** 
* ��ȡ�Ƶ�ʱ��
*
* @return �Ƶ�ʱ��
*/
public UFDateTime getMaketime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_ADD.MAKETIME);
 } 

/** 
* �����Ƶ�ʱ��
*
* @param maketime �Ƶ�ʱ��
*/
public void setMaketime ( UFDateTime maketime) {
this.setAttributeValue( SGDHVO_ADD.MAKETIME,maketime);
 } 

/** 
* ��ȡ�޸�ʱ��
*
* @return �޸�ʱ��
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_ADD.MODIFIEDTIME);
 } 

/** 
* �����޸�ʱ��
*
* @param modifiedtime �޸�ʱ��
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( SGDHVO_ADD.MODIFIEDTIME,modifiedtime);
 } 

/** 
* ��ȡ�޸���
*
* @return �޸���
*/
public String getModifier () {
return (String) this.getAttributeValue( SGDHVO_ADD.MODIFIER);
 } 

/** 
* �����޸���
*
* @param modifier �޸���
*/
public void setModifier ( String modifier) {
this.setAttributeValue( SGDHVO_ADD.MODIFIER,modifier);
 } 

/** 
* ��ȡë���깤��
*
* @return ë���깤��
*/
public UFDate getMpwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_ADD.MPWGDATE);
 } 

/** 
* ����ë���깤��
*
* @param mpwgdate ë���깤��
*/
public void setMpwgdate ( UFDate mpwgdate) {
this.setAttributeValue( SGDHVO_ADD.MPWGDATE,mpwgdate);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_group () {
return (String) this.getAttributeValue( SGDHVO_ADD.PK_GROUP);
 } 

/** 
* ���ü���
*
* @param pk_group ����
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( SGDHVO_ADD.PK_GROUP,pk_group);
 } 

/** 
* ��ȡ��Ŀ��֯
*
* @return ��Ŀ��֯
*/
public String getPk_org () {
return (String) this.getAttributeValue( SGDHVO_ADD.PK_ORG);
 } 

/** 
* ������Ŀ��֯
*
* @param pk_org ��Ŀ��֯
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( SGDHVO_ADD.PK_ORG,pk_org);
 } 

/** 
* ��ȡ��Ŀ��֯
*
* @return ��Ŀ��֯
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( SGDHVO_ADD.PK_ORG_V);
 } 

/** 
* ������Ŀ��֯
*
* @param pk_org_v ��Ŀ��֯
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( SGDHVO_ADD.PK_ORG_V,pk_org_v);
 } 

/** 
* ��ȡʩ������������
*
* @return ʩ������������
*/
public String getPk_sgd_add_h () {
return this.pk_sgd_add_h;
 } 

/** 
* ����ʩ������������
*
* @param pk_sgd_add_h ʩ������������
*/
public void setPk_sgd_add_h ( String pk_sgd_add_h) {
this.pk_sgd_add_h=pk_sgd_add_h;
 } 

/** 
* ��ȡʩ��������
*
* @return ʩ��������
*/
public String getPk_sgd_h () {
return (String) this.getAttributeValue( SGDHVO_ADD.PK_SGD_H);
 } 

/** 
* ����ʩ��������
*
* @param pk_sgd_h ʩ��������
*/
public void setPk_sgd_h ( String pk_sgd_h) {
this.setAttributeValue( SGDHVO_ADD.PK_SGD_H,pk_sgd_h);
 } 

/** 
* ��ȡʩ��������
*
* @return ʩ��������
*/
public String getSgdno () {
return (String) this.getAttributeValue( SGDHVO_ADD.SGDNO);
 } 

/** 
* ����ʩ��������
*
* @param sgdno ʩ��������
*/
public void setSgdno ( String sgdno) {
this.setAttributeValue( SGDHVO_ADD.SGDNO,sgdno);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getSgml_dept () {
return (String) this.getAttributeValue( SGDHVO_ADD.SGML_DEPT);
 } 

/** 
* ���ò���
*
* @param sgml_dept ����
*/
public void setSgml_dept ( String sgml_dept) {
this.setAttributeValue( SGDHVO_ADD.SGML_DEPT,sgml_dept);
 } 

/** 
* ��ȡ��֯_���Ű汾��Ϣ
*
* @return ��֯_���Ű汾��Ϣ
*/
public String getSgml_dept_v () {
return (String) this.getAttributeValue( SGDHVO_ADD.SGML_DEPT_V);
 } 

/** 
* ������֯_���Ű汾��Ϣ
*
* @param sgml_dept_v ��֯_���Ű汾��Ϣ
*/
public void setSgml_dept_v ( String sgml_dept_v) {
this.setAttributeValue( SGDHVO_ADD.SGML_DEPT_V,sgml_dept_v);
 } 

/** 
* ��ȡʩ������
*
* @return ʩ������
*/
public String getSgyj () {
return (String) this.getAttributeValue( SGDHVO_ADD.SGYJ);
 } 

/** 
* ����ʩ������
*
* @param sgyj ʩ������
*/
public void setSgyj ( String sgyj) {
this.setAttributeValue( SGDHVO_ADD.SGYJ,sgyj);
 } 

/** 
* ��ȡʵ�ʺϸ���
*
* @return ʵ�ʺϸ���
*/
public UFDate getSjhgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_ADD.SJHGDATE);
 } 

/** 
* ����ʵ�ʺϸ���
*
* @param sjhgdate ʵ�ʺϸ���
*/
public void setSjhgdate ( UFDate sjhgdate) {
this.setAttributeValue( SGDHVO_ADD.SJHGDATE,sjhgdate);
 } 

/** 
* ��ȡʵ���깤��
*
* @return ʵ���깤��
*/
public UFDate getSjwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_ADD.SJWGDATE);
 } 

/** 
* ����ʵ���깤��
*
* @param sjwgdate ʵ���깤��
*/
public void setSjwgdate ( UFDate sjwgdate) {
this.setAttributeValue( SGDHVO_ADD.SJWGDATE,sjwgdate);
 } 

/** 
* ��ȡʵ��������
*
* @return ʵ��������
*/
public UFDate getSjysdate () {
return (UFDate) this.getAttributeValue( SGDHVO_ADD.SJYSDATE);
 } 

/** 
* ����ʵ��������
*
* @param sjysdate ʵ��������
*/
public void setSjysdate ( UFDate sjysdate) {
this.setAttributeValue( SGDHVO_ADD.SJYSDATE,sjysdate);
 } 

/** 
* ��ȡ��Դ����id
*
* @return ��Դ����id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( SGDHVO_ADD.SRCBILLID);
 } 

/** 
* ������Դ����id
*
* @param srcbillid ��Դ����id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( SGDHVO_ADD.SRCBILLID,srcbillid);
 } 
/** 
* ��ȡԴͷ����hid
*
* @return Դͷ����hid
*/
public String getFirstbillhid () {
return (String) this.getAttributeValue( SGDHVO_ADD.FIRSTBILLHID);
 } 

/** 
* ����Դͷ����hid
*
* @param firstbillhid Դͷ����hid
*/
public void setFirstbillhid ( String firstbillhid) {
this.setAttributeValue( SGDHVO_ADD.FIRSTBILLHID,firstbillhid);
 } 

/** 
* ��ȡԴͷ����bid
*
* @return Դͷ����bid
*/
public String getFirstbillbid () {
return (String) this.getAttributeValue( SGDHVO_ADD.FIRSTBILLBID);
 } 

/** 
* ����Դͷ����bid
*
* @param firstbillbid Դͷ����bid
*/
public void setFirstbillbid ( String firstbillbid) {
this.setAttributeValue( SGDHVO_ADD.FIRSTBILLBID,firstbillbid);
 } 


/** 
* ��ȡ��Դ���ݱ���id
*
* @return ��Դ���ݱ���id
*/
public String getSrcbillid_b () {
return (String) this.getAttributeValue( SGDHVO_ADD.SRCBILLID_B);
 } 

/** 
* ������Դ���ݱ���id
*
* @param srcbillid_b ��Դ���ݱ���id
*/
public void setSrcbillid_b ( String srcbillid_b) {
this.setAttributeValue( SGDHVO_ADD.SRCBILLID_B,srcbillid_b);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getSrcbilltype () {
return (String) this.getAttributeValue( SGDHVO_ADD.SRCBILLTYPE);
 } 

/** 
* ������Դ��������
*
* @param srcbilltype ��Դ��������
*/
public void setSrcbilltype ( String srcbilltype) {
this.setAttributeValue( SGDHVO_ADD.SRCBILLTYPE,srcbilltype);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getTaskname () {
return (String) this.getAttributeValue( SGDHVO_ADD.TASKNAME);
 } 

/** 
* ������������
*
* @param taskname ��������
*/
public void setTaskname ( String taskname) {
this.setAttributeValue( SGDHVO_ADD.TASKNAME,taskname);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getTaskno () {
return (String) this.getAttributeValue( SGDHVO_ADD.TASKNO);
 } 

/** 
* ����������
*
* @param taskno ������
*/
public void setTaskno ( String taskno) {
this.setAttributeValue( SGDHVO_ADD.TASKNO,taskno);
 } 

/** 
* ��ȡ���ʱ�ܼ�
*
* @return ���ʱ�ܼ�
*/
public UFDouble getTotalgs () {
return (UFDouble) this.getAttributeValue( SGDHVO_ADD.TOTALGS);
 } 

/** 
* ���ö��ʱ�ܼ�
*
* @param totalgs ���ʱ�ܼ�
*/
public void setTotalgs ( UFDouble totalgs) {
this.setAttributeValue( SGDHVO_ADD.TOTALGS,totalgs);
 } 

/** 
* ��ȡ�ϼ�����
*
* @return �ϼ�����
*/
public UFDouble getTotalnum () {
return (UFDouble) this.getAttributeValue( SGDHVO_ADD.TOTALNUM);
 } 

/** 
* ���úϼ�����
*
* @param totalnum �ϼ�����
*/
public void setTotalnum ( UFDouble totalnum) {
this.setAttributeValue( SGDHVO_ADD.TOTALNUM,totalnum);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getTranstype () {
return (String) this.getAttributeValue( SGDHVO_ADD.TRANSTYPE);
 } 

/** 
* ���ý�������
*
* @param transtype ��������
*/
public void setTranstype ( String transtype) {
this.setAttributeValue( SGDHVO_ADD.TRANSTYPE,transtype);
 } 

/** 
* ��ȡ��������pk
*
* @return ��������pk
*/
public String getTranstypepk () {
return (String) this.getAttributeValue( SGDHVO_ADD.TRANSTYPEPK);
 } 

/** 
* ���ý�������pk
*
* @param transtypepk ��������pk
*/
public void setTranstypepk ( String transtypepk) {
this.setAttributeValue( SGDHVO_ADD.TRANSTYPEPK,transtypepk);
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
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.SGDADDHVO");
  }
}