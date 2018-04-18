package nc.vo.plan.jx15;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class SGDHVO_EXC extends SuperVO {
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
*����ID
*/
public static final String BILLID="billid";
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
*Э������
*/
public static final String EXCDEPT="excdept";
/**
*Э�����Ű汾��Ϣ
*/
public static final String EXCDEPT_V="excdept_v";
/**
*��Э�ܹ�ʱ
*/
public static final String EXCHOURS="exchours";
/**
*Э�������¹�ʱ
*/
public static final String EXCNEWHOURS="excnewhours";
/**
*Э������ԭ��ʱ
*/
public static final String EXCOLDHOURS="excoldhours";
/**
*�����
*/
public static final String GL="gl";
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
*�����¹�ʱ
*/
public static final String NEWHOURS="newhours";
/**
*Դͷ��ʱ
*/
public static final String OLDHOURS="oldhours";
/**
*Դͷ����
*/
public static final String PK_DEPT="pk_dept";
/**
*Դͷ���Ű汾��Ϣ
*/
public static final String PK_DEPT_V="pk_dept_v";
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
*ʩ����ϵ������
*/
public String pk_sgd_exc_h;
/**
*ʩ��������
*/
public static final String PK_SGD_H="pk_sgd_h";
/**
*���ʱ
*/
public static final String PLANHOURS="planhours";
/**
*ʣ�๤ʱ
*/
public static final String REMAINHOURS="remainhours";
/**
*ʩ��������
*/
public static final String SGDNO="sgdno";
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
*��Դ���ݱ���id
*/
public static final String SRCBILLID_B="srcbillid_b";
/**
*��Դ��������
*/
public static final String SRCBILLTYPE="srcbilltype";
/**
*Դͷ����
*/
public String srcgz;
/**
*��������
*/
public static final String TASKNAME="taskname";
/**
*������
*/
public static final String TASKNO="taskno";
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
*���ù�ʱ
*/
public static final String USEDHOURS="usedhours";
/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getApprovedate () {
return (UFDateTime) this.getAttributeValue( SGDHVO_EXC.APPROVEDATE);
 } 

/** 
* ��������ʱ��
*
* @param approvedate ����ʱ��
*/
public void setApprovedate ( UFDateTime approvedate) {
this.setAttributeValue( SGDHVO_EXC.APPROVEDATE,approvedate);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getApprovenote () {
return (String) this.getAttributeValue( SGDHVO_EXC.APPROVENOTE);
 } 

/** 
* ������������
*
* @param approvenote ��������
*/
public void setApprovenote ( String approvenote) {
this.setAttributeValue( SGDHVO_EXC.APPROVENOTE,approvenote);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getApprover () {
return (String) this.getAttributeValue( SGDHVO_EXC.APPROVER);
 } 

/** 
* ����������
*
* @param approver ������
*/
public void setApprover ( String approver) {
this.setAttributeValue( SGDHVO_EXC.APPROVER,approver);
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getApprovestatus () {
return (Integer) this.getAttributeValue( SGDHVO_EXC.APPROVESTATUS);
 } 

/** 
* ��������״̬
*
* @param approvestatus ����״̬
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.setAttributeValue( SGDHVO_EXC.APPROVESTATUS,approvestatus);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getBilldate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.BILLDATE);
 } 

/** 
* ���õ�������
*
* @param billdate ��������
*/
public void setBilldate ( UFDate billdate) {
this.setAttributeValue( SGDHVO_EXC.BILLDATE,billdate);
 } 

/** 
* ��ȡ����ID
*
* @return ����ID
*/
public String getBillid () {
return (String) this.getAttributeValue( SGDHVO_EXC.BILLID);
 } 

/** 
* ���õ���ID
*
* @param billid ����ID
*/
public void setBillid ( String billid) {
this.setAttributeValue( SGDHVO_EXC.BILLID,billid);
 } 

/** 
* ��ȡ�Ƶ���
*
* @return �Ƶ���
*/
public String getBillmaker () {
return (String) this.getAttributeValue( SGDHVO_EXC.BILLMAKER);
 } 

/** 
* �����Ƶ���
*
* @param billmaker �Ƶ���
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( SGDHVO_EXC.BILLMAKER,billmaker);
 } 

/** 
* ��ȡ���ݺ�
*
* @return ���ݺ�
*/
public String getBillno () {
return (String) this.getAttributeValue( SGDHVO_EXC.BILLNO);
 } 

/** 
* ���õ��ݺ�
*
* @param billno ���ݺ�
*/
public void setBillno ( String billno) {
this.setAttributeValue( SGDHVO_EXC.BILLNO,billno);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getBilltype () {
return (String) this.getAttributeValue( SGDHVO_EXC.BILLTYPE);
 } 

/** 
* ���õ�������
*
* @param billtype ��������
*/
public void setBilltype ( String billtype) {
this.setAttributeValue( SGDHVO_EXC.BILLTYPE,billtype);
 } 

/** 
* ��ȡ���ݰ汾pk
*
* @return ���ݰ汾pk
*/
public String getBillversionpk () {
return (String) this.getAttributeValue( SGDHVO_EXC.BILLVERSIONPK);
 } 

/** 
* ���õ��ݰ汾pk
*
* @param billversionpk ���ݰ汾pk
*/
public void setBillversionpk ( String billversionpk) {
this.setAttributeValue( SGDHVO_EXC.BILLVERSIONPK,billversionpk);
 } 

/** 
* ��ȡҵ������
*
* @return ҵ������
*/
public String getBusitype () {
return (String) this.getAttributeValue( SGDHVO_EXC.BUSITYPE);
 } 

/** 
* ����ҵ������
*
* @param busitype ҵ������
*/
public void setBusitype ( String busitype) {
this.setAttributeValue( SGDHVO_EXC.BUSITYPE,busitype);
 } 

/** 
* ��ȡ��ע
*
* @return ��ע
*/
public String getBz () {
return (String) this.getAttributeValue( SGDHVO_EXC.BZ);
 } 

/** 
* ���ñ�ע
*
* @param bz ��ע
*/
public void setBz ( String bz) {
this.setAttributeValue( SGDHVO_EXC.BZ,bz);
 } 

/** 
* ��ȡ����ص�
*
* @return ����ص�
*/
public String getCcdd () {
return (String) this.getAttributeValue( SGDHVO_EXC.CCDD);
 } 

/** 
* ���ó���ص�
*
* @param ccdd ����ص�
*/
public void setCcdd ( String ccdd) {
this.setAttributeValue( SGDHVO_EXC.CCDD,ccdd);
 } 

/** 
* ��ȡ��Ʒ�깤��
*
* @return ��Ʒ�깤��
*/
public UFDate getCpwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.CPWGDATE);
 } 

/** 
* ���ò�Ʒ�깤��
*
* @param cpwgdate ��Ʒ�깤��
*/
public void setCpwgdate ( UFDate cpwgdate) {
this.setAttributeValue( SGDHVO_EXC.CPWGDATE,cpwgdate);
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_EXC.CREATIONTIME);
 } 

/** 
* ���ô���ʱ��
*
* @param creationtime ����ʱ��
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( SGDHVO_EXC.CREATIONTIME,creationtime);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getCreator () {
return (String) this.getAttributeValue( SGDHVO_EXC.CREATOR);
 } 

/** 
* ���ô�����
*
* @param creator ������
*/
public void setCreator ( String creator) {
this.setAttributeValue( SGDHVO_EXC.CREATOR,creator);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF1);
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( SGDHVO_EXC.DEF1,def1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getDef10 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF10);
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( SGDHVO_EXC.DEF10,def10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getDef11 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF11);
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( SGDHVO_EXC.DEF11,def11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF12);
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( SGDHVO_EXC.DEF12,def12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF13);
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( SGDHVO_EXC.DEF13,def13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF14);
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( SGDHVO_EXC.DEF14,def14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getDef15 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF15);
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( SGDHVO_EXC.DEF15,def15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF16);
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( SGDHVO_EXC.DEF16,def16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF17);
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( SGDHVO_EXC.DEF17,def17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF18);
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( SGDHVO_EXC.DEF18,def18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF19);
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( SGDHVO_EXC.DEF19,def19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF2);
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( SGDHVO_EXC.DEF2,def2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF20);
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( SGDHVO_EXC.DEF20,def20);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF3);
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( SGDHVO_EXC.DEF3,def3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF4);
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( SGDHVO_EXC.DEF4,def4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF5);
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( SGDHVO_EXC.DEF5,def5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getDef6 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF6);
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( SGDHVO_EXC.DEF6,def6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getDef7 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF7);
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( SGDHVO_EXC.DEF7,def7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getDef8 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF8);
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( SGDHVO_EXC.DEF8,def8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getDef9 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF9);
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( SGDHVO_EXC.DEF9,def9);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getDhdh () {
return (String) this.getAttributeValue( SGDHVO_EXC.DHDH);
 } 

/** 
* ���ö�������
*
* @param dhdh ��������
*/
public void setDhdh ( String dhdh) {
this.setAttributeValue( SGDHVO_EXC.DHDH,dhdh);
 } 

/** 
* ��ȡ������λ
*
* @return ������λ
*/
public String getDhdw () {
return (String) this.getAttributeValue( SGDHVO_EXC.DHDW);
 } 

/** 
* ���ö�����λ
*
* @param dhdw ������λ
*/
public void setDhdw ( String dhdw) {
this.setAttributeValue( SGDHVO_EXC.DHDW,dhdw);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDouble getDhsl () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.DHSL);
 } 

/** 
* ���ö�������
*
* @param dhsl ��������
*/
public void setDhsl ( UFDouble dhsl) {
this.setAttributeValue( SGDHVO_EXC.DHSL,dhsl);
 } 

/** 
* ��ȡ�޶�ö��
*
* @return �޶�ö��
*/
public Integer getEmendenum () {
return (Integer) this.getAttributeValue( SGDHVO_EXC.EMENDENUM);
 } 

/** 
* �����޶�ö��
*
* @param emendenum �޶�ö��
*/
public void setEmendenum ( Integer emendenum) {
this.setAttributeValue( SGDHVO_EXC.EMENDENUM,emendenum);
 } 

/** 
* ��ȡЭ������
*
* @return Э������
*/
public String getExcdept () {
return (String) this.getAttributeValue( SGDHVO_EXC.EXCDEPT);
 } 

/** 
* ����Э������
*
* @param excdept Э������
*/
public void setExcdept ( String excdept) {
this.setAttributeValue( SGDHVO_EXC.EXCDEPT,excdept);
 } 

/** 
* ��ȡЭ�����Ű汾��Ϣ
*
* @return Э�����Ű汾��Ϣ
*/
public String getExcdept_v () {
return (String) this.getAttributeValue( SGDHVO_EXC.EXCDEPT_V);
 } 

/** 
* ����Э�����Ű汾��Ϣ
*
* @param excdept_v Э�����Ű汾��Ϣ
*/
public void setExcdept_v ( String excdept_v) {
this.setAttributeValue( SGDHVO_EXC.EXCDEPT_V,excdept_v);
 } 

/** 
* ��ȡ��Э�ܹ�ʱ
*
* @return ��Э�ܹ�ʱ
*/
public UFDouble getExchours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.EXCHOURS);
 } 

/** 
* ������Э�ܹ�ʱ
*
* @param exchours ��Э�ܹ�ʱ
*/
public void setExchours ( UFDouble exchours) {
this.setAttributeValue( SGDHVO_EXC.EXCHOURS,exchours);
 } 

/** 
* ��ȡЭ�������¹�ʱ
*
* @return Э�������¹�ʱ
*/
public UFDouble getExcnewhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.EXCNEWHOURS);
 } 

/** 
* ����Э�������¹�ʱ
*
* @param excnewhours Э�������¹�ʱ
*/
public void setExcnewhours ( UFDouble excnewhours) {
this.setAttributeValue( SGDHVO_EXC.EXCNEWHOURS,excnewhours);
 } 

/** 
* ��ȡЭ������ԭ��ʱ
*
* @return Э������ԭ��ʱ
*/
public UFDouble getExcoldhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.EXCOLDHOURS);
 } 

/** 
* ����Э������ԭ��ʱ
*
* @param excoldhours Э������ԭ��ʱ
*/
public void setExcoldhours ( UFDouble excoldhours) {
this.setAttributeValue( SGDHVO_EXC.EXCOLDHOURS,excoldhours);
 } 

/** 
* ��ȡ�����
*
* @return �����
*/
public String getGl () {
return (String) this.getAttributeValue( SGDHVO_EXC.GL);
 } 

/** 
* ���ù����
*
* @param gl �����
*/
public void setGl ( String gl) {
this.setAttributeValue( SGDHVO_EXC.GL,gl);
 } 

/** 
* ��ȡ���˵ص�
*
* @return ���˵ص�
*/
public String getJzdd () {
return (String) this.getAttributeValue( SGDHVO_EXC.JZDD);
 } 

/** 
* ���ý��˵ص�
*
* @param jzdd ���˵ص�
*/
public void setJzdd ( String jzdd) {
this.setAttributeValue( SGDHVO_EXC.JZDD,jzdd);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getKgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.KGDATE);
 } 

/** 
* ���ÿ�������
*
* @param kgdate ��������
*/
public void setKgdate ( UFDate kgdate) {
this.setAttributeValue( SGDHVO_EXC.KGDATE,kgdate);
 } 

/** 
* ��ȡ����޸�ʱ��
*
* @return ����޸�ʱ��
*/
public UFDateTime getLastmaketime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_EXC.LASTMAKETIME);
 } 

/** 
* ��������޸�ʱ��
*
* @param lastmaketime ����޸�ʱ��
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.setAttributeValue( SGDHVO_EXC.LASTMAKETIME,lastmaketime);
 } 

/** 
* ��ȡ�Ƶ�ʱ��
*
* @return �Ƶ�ʱ��
*/
public UFDateTime getMaketime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_EXC.MAKETIME);
 } 

/** 
* �����Ƶ�ʱ��
*
* @param maketime �Ƶ�ʱ��
*/
public void setMaketime ( UFDateTime maketime) {
this.setAttributeValue( SGDHVO_EXC.MAKETIME,maketime);
 } 

/** 
* ��ȡ�޸�ʱ��
*
* @return �޸�ʱ��
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_EXC.MODIFIEDTIME);
 } 

/** 
* �����޸�ʱ��
*
* @param modifiedtime �޸�ʱ��
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( SGDHVO_EXC.MODIFIEDTIME,modifiedtime);
 } 

/** 
* ��ȡ�޸���
*
* @return �޸���
*/
public String getModifier () {
return (String) this.getAttributeValue( SGDHVO_EXC.MODIFIER);
 } 

/** 
* �����޸���
*
* @param modifier �޸���
*/
public void setModifier ( String modifier) {
this.setAttributeValue( SGDHVO_EXC.MODIFIER,modifier);
 } 

/** 
* ��ȡë���깤��
*
* @return ë���깤��
*/
public UFDate getMpwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.MPWGDATE);
 } 

/** 
* ����ë���깤��
*
* @param mpwgdate ë���깤��
*/
public void setMpwgdate ( UFDate mpwgdate) {
this.setAttributeValue( SGDHVO_EXC.MPWGDATE,mpwgdate);
 } 

/** 
* ��ȡ�����¹�ʱ
*
* @return �����¹�ʱ
*/
public UFDouble getNewhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.NEWHOURS);
 } 

/** 
* ���ò����¹�ʱ
*
* @param newhours �����¹�ʱ
*/
public void setNewhours ( UFDouble newhours) {
this.setAttributeValue( SGDHVO_EXC.NEWHOURS,newhours);
 } 

/** 
* ��ȡԴͷ��ʱ
*
* @return Դͷ��ʱ
*/
public UFDouble getOldhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.OLDHOURS);
 } 

/** 
* ����Դͷ��ʱ
*
* @param oldhours Դͷ��ʱ
*/
public void setOldhours ( UFDouble oldhours) {
this.setAttributeValue( SGDHVO_EXC.OLDHOURS,oldhours);
 } 

/** 
* ��ȡԴͷ����
*
* @return Դͷ����
*/
public String getPk_dept () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_DEPT);
 } 

/** 
* ����Դͷ����
*
* @param pk_dept Դͷ����
*/
public void setPk_dept ( String pk_dept) {
this.setAttributeValue( SGDHVO_EXC.PK_DEPT,pk_dept);
 } 

/** 
* ��ȡԴͷ���Ű汾��Ϣ
*
* @return Դͷ���Ű汾��Ϣ
*/
public String getPk_dept_v () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_DEPT_V);
 } 

/** 
* ����Դͷ���Ű汾��Ϣ
*
* @param pk_dept_v Դͷ���Ű汾��Ϣ
*/
public void setPk_dept_v ( String pk_dept_v) {
this.setAttributeValue( SGDHVO_EXC.PK_DEPT_V,pk_dept_v);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_group () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_GROUP);
 } 

/** 
* ���ü���
*
* @param pk_group ����
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( SGDHVO_EXC.PK_GROUP,pk_group);
 } 

/** 
* ��ȡ��Ŀ��֯
*
* @return ��Ŀ��֯
*/
public String getPk_org () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_ORG);
 } 

/** 
* ������Ŀ��֯
*
* @param pk_org ��Ŀ��֯
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( SGDHVO_EXC.PK_ORG,pk_org);
 } 

/** 
* ��ȡ��Ŀ��֯
*
* @return ��Ŀ��֯
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_ORG_V);
 } 

/** 
* ������Ŀ��֯
*
* @param pk_org_v ��Ŀ��֯
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( SGDHVO_EXC.PK_ORG_V,pk_org_v);
 } 

/** 
* ��ȡʩ����ϵ������
*
* @return ʩ����ϵ������
*/
public String getPk_sgd_exc_h () {
return this.pk_sgd_exc_h;
 } 

/** 
* ����ʩ����ϵ������
*
* @param pk_sgd_exc_h ʩ����ϵ������
*/
public void setPk_sgd_exc_h ( String pk_sgd_exc_h) {
this.pk_sgd_exc_h=pk_sgd_exc_h;
 } 

/** 
* ��ȡʩ��������
*
* @return ʩ��������
*/
public String getPk_sgd_h () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_SGD_H);
 } 

/** 
* ����ʩ��������
*
* @param pk_sgd_h ʩ��������
*/
public void setPk_sgd_h ( String pk_sgd_h) {
this.setAttributeValue( SGDHVO_EXC.PK_SGD_H,pk_sgd_h);
 } 

/** 
* ��ȡ���ʱ
*
* @return ���ʱ
*/
public UFDouble getPlanhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.PLANHOURS);
 } 

/** 
* ���ö��ʱ
*
* @param planhours ���ʱ
*/
public void setPlanhours ( UFDouble planhours) {
this.setAttributeValue( SGDHVO_EXC.PLANHOURS,planhours);
 } 

/** 
* ��ȡʣ�๤ʱ
*
* @return ʣ�๤ʱ
*/
public UFDouble getRemainhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.REMAINHOURS);
 } 

/** 
* ����ʣ�๤ʱ
*
* @param remainhours ʣ�๤ʱ
*/
public void setRemainhours ( UFDouble remainhours) {
this.setAttributeValue( SGDHVO_EXC.REMAINHOURS,remainhours);
 } 

/** 
* ��ȡʩ��������
*
* @return ʩ��������
*/
public String getSgdno () {
return (String) this.getAttributeValue( SGDHVO_EXC.SGDNO);
 } 

/** 
* ����ʩ��������
*
* @param sgdno ʩ��������
*/
public void setSgdno ( String sgdno) {
this.setAttributeValue( SGDHVO_EXC.SGDNO,sgdno);
 } 

/** 
* ��ȡʩ������
*
* @return ʩ������
*/
public String getSgyj () {
return (String) this.getAttributeValue( SGDHVO_EXC.SGYJ);
 } 

/** 
* ����ʩ������
*
* @param sgyj ʩ������
*/
public void setSgyj ( String sgyj) {
this.setAttributeValue( SGDHVO_EXC.SGYJ,sgyj);
 } 

/** 
* ��ȡʵ�ʺϸ���
*
* @return ʵ�ʺϸ���
*/
public UFDate getSjhgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.SJHGDATE);
 } 

/** 
* ����ʵ�ʺϸ���
*
* @param sjhgdate ʵ�ʺϸ���
*/
public void setSjhgdate ( UFDate sjhgdate) {
this.setAttributeValue( SGDHVO_EXC.SJHGDATE,sjhgdate);
 } 

/** 
* ��ȡʵ���깤��
*
* @return ʵ���깤��
*/
public UFDate getSjwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.SJWGDATE);
 } 

/** 
* ����ʵ���깤��
*
* @param sjwgdate ʵ���깤��
*/
public void setSjwgdate ( UFDate sjwgdate) {
this.setAttributeValue( SGDHVO_EXC.SJWGDATE,sjwgdate);
 } 

/** 
* ��ȡʵ��������
*
* @return ʵ��������
*/
public UFDate getSjysdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.SJYSDATE);
 } 

/** 
* ����ʵ��������
*
* @param sjysdate ʵ��������
*/
public void setSjysdate ( UFDate sjysdate) {
this.setAttributeValue( SGDHVO_EXC.SJYSDATE,sjysdate);
 } 

/** 
* ��ȡ��Դ����id
*
* @return ��Դ����id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( SGDHVO_EXC.SRCBILLID);
 } 

/** 
* ������Դ����id
*
* @param srcbillid ��Դ����id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( SGDHVO_EXC.SRCBILLID,srcbillid);
 } 

/** 
* ��ȡ��Դ���ݱ���id
*
* @return ��Դ���ݱ���id
*/
public String getSrcbillid_b () {
return (String) this.getAttributeValue( SGDHVO_EXC.SRCBILLID_B);
 } 

/** 
* ������Դ���ݱ���id
*
* @param srcbillid_b ��Դ���ݱ���id
*/
public void setSrcbillid_b ( String srcbillid_b) {
this.setAttributeValue( SGDHVO_EXC.SRCBILLID_B,srcbillid_b);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getSrcbilltype () {
return (String) this.getAttributeValue( SGDHVO_EXC.SRCBILLTYPE);
 } 

/** 
* ������Դ��������
*
* @param srcbilltype ��Դ��������
*/
public void setSrcbilltype ( String srcbilltype) {
this.setAttributeValue( SGDHVO_EXC.SRCBILLTYPE,srcbilltype);
 } 

/** 
* ��ȡԴͷ����
*
* @return Դͷ����
*/
public String getSrcgz () {
return this.srcgz;
 } 

/** 
* ����Դͷ����
*
* @param srcgz Դͷ����
*/
public void setSrcgz ( String srcgz) {
this.srcgz=srcgz;
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getTaskname () {
return (String) this.getAttributeValue( SGDHVO_EXC.TASKNAME);
 } 

/** 
* ������������
*
* @param taskname ��������
*/
public void setTaskname ( String taskname) {
this.setAttributeValue( SGDHVO_EXC.TASKNAME,taskname);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getTaskno () {
return (String) this.getAttributeValue( SGDHVO_EXC.TASKNO);
 } 

/** 
* ����������
*
* @param taskno ������
*/
public void setTaskno ( String taskno) {
this.setAttributeValue( SGDHVO_EXC.TASKNO,taskno);
 } 

/** 
* ��ȡ�ϼ�����
*
* @return �ϼ�����
*/
public Integer getTotalnum () {
return (Integer) this.getAttributeValue( SGDHVO_EXC.TOTALNUM);
 } 

/** 
* ���úϼ�����
*
* @param totalnum �ϼ�����
*/
public void setTotalnum ( Integer totalnum) {
this.setAttributeValue( SGDHVO_EXC.TOTALNUM,totalnum);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getTranstype () {
return (String) this.getAttributeValue( SGDHVO_EXC.TRANSTYPE);
 } 

/** 
* ���ý�������
*
* @param transtype ��������
*/
public void setTranstype ( String transtype) {
this.setAttributeValue( SGDHVO_EXC.TRANSTYPE,transtype);
 } 

/** 
* ��ȡ��������pk
*
* @return ��������pk
*/
public String getTranstypepk () {
return (String) this.getAttributeValue( SGDHVO_EXC.TRANSTYPEPK);
 } 

/** 
* ���ý�������pk
*
* @param transtypepk ��������pk
*/
public void setTranstypepk ( String transtypepk) {
this.setAttributeValue( SGDHVO_EXC.TRANSTYPEPK,transtypepk);
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
* ��ȡ���ù�ʱ
*
* @return ���ù�ʱ
*/
public UFDouble getUsedhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.USEDHOURS);
 } 

/** 
* �������ù�ʱ
*
* @param usedhours ���ù�ʱ
*/
public void setUsedhours ( UFDouble usedhours) {
this.setAttributeValue( SGDHVO_EXC.USEDHOURS,usedhours);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.SGDEXCHVO");
  }
}