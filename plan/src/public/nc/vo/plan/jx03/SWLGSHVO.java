package nc.vo.plan.jx03;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class SWLGSHVO extends SuperVO {
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
*code
*/
public static final String CODE="code";
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
*�޶�ö��
*/
public static final String EMENDENUM="emendenum";
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
*name
*/
public static final String NAME="name";
/**
*����
*/
public static final String PK_GROUP="pk_group";
/**
*��֯
*/
public static final String PK_ORG="pk_org";
/**
*��֯�汾
*/
public static final String PK_ORG_V="pk_org_v";
/**
*ʵ������ʱ����
*/
public String pk_swlgs_h;
/**
*������֯
*/
public static final String PKORG="pkorg";
/**
*�к�
*/
public static final String ROWNO="rowno";
/**
*��Դ����id
*/
public static final String SRCBILLID="srcbillid";
/**
*��Դ��������
*/
public static final String SRCBILLTYPE="srcbilltype";
/**
*����
*/
public static final String SWLGS_DEPT="swlgs_dept";
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
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getApprovedate () {
return (UFDateTime) this.getAttributeValue( SWLGSHVO.APPROVEDATE);
 } 

/** 
* ��������ʱ��
*
* @param approvedate ����ʱ��
*/
public void setApprovedate ( UFDateTime approvedate) {
this.setAttributeValue( SWLGSHVO.APPROVEDATE,approvedate);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getApprovenote () {
return (String) this.getAttributeValue( SWLGSHVO.APPROVENOTE);
 } 

/** 
* ������������
*
* @param approvenote ��������
*/
public void setApprovenote ( String approvenote) {
this.setAttributeValue( SWLGSHVO.APPROVENOTE,approvenote);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getApprover () {
return (String) this.getAttributeValue( SWLGSHVO.APPROVER);
 } 

/** 
* ����������
*
* @param approver ������
*/
public void setApprover ( String approver) {
this.setAttributeValue( SWLGSHVO.APPROVER,approver);
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getApprovestatus () {
return (Integer) this.getAttributeValue( SWLGSHVO.APPROVESTATUS);
 } 

/** 
* ��������״̬
*
* @param approvestatus ����״̬
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.setAttributeValue( SWLGSHVO.APPROVESTATUS,approvestatus);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getBilldate () {
return (UFDate) this.getAttributeValue( SWLGSHVO.BILLDATE);
 } 

/** 
* ���õ�������
*
* @param billdate ��������
*/
public void setBilldate ( UFDate billdate) {
this.setAttributeValue( SWLGSHVO.BILLDATE,billdate);
 } 

/** 
* ��ȡ�Ƶ���
*
* @return �Ƶ���
*/
public String getBillmaker () {
return (String) this.getAttributeValue( SWLGSHVO.BILLMAKER);
 } 

/** 
* �����Ƶ���
*
* @param billmaker �Ƶ���
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( SWLGSHVO.BILLMAKER,billmaker);
 } 

/** 
* ��ȡ���ݺ�
*
* @return ���ݺ�
*/
public String getBillno () {
return (String) this.getAttributeValue( SWLGSHVO.BILLNO);
 } 

/** 
* ���õ��ݺ�
*
* @param billno ���ݺ�
*/
public void setBillno ( String billno) {
this.setAttributeValue( SWLGSHVO.BILLNO,billno);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getBilltype () {
return (String) this.getAttributeValue( SWLGSHVO.BILLTYPE);
 } 

/** 
* ���õ�������
*
* @param billtype ��������
*/
public void setBilltype ( String billtype) {
this.setAttributeValue( SWLGSHVO.BILLTYPE,billtype);
 } 

/** 
* ��ȡ���ݰ汾pk
*
* @return ���ݰ汾pk
*/
public String getBillversionpk () {
return (String) this.getAttributeValue( SWLGSHVO.BILLVERSIONPK);
 } 

/** 
* ���õ��ݰ汾pk
*
* @param billversionpk ���ݰ汾pk
*/
public void setBillversionpk ( String billversionpk) {
this.setAttributeValue( SWLGSHVO.BILLVERSIONPK,billversionpk);
 } 

/** 
* ��ȡҵ������
*
* @return ҵ������
*/
public String getBusitype () {
return (String) this.getAttributeValue( SWLGSHVO.BUSITYPE);
 } 

/** 
* ����ҵ������
*
* @param busitype ҵ������
*/
public void setBusitype ( String busitype) {
this.setAttributeValue( SWLGSHVO.BUSITYPE,busitype);
 } 

/** 
* ��ȡcode
*
* @return code
*/
public String getCode () {
return (String) this.getAttributeValue( SWLGSHVO.CODE);
 } 

/** 
* ����code
*
* @param code code
*/
public void setCode ( String code) {
this.setAttributeValue( SWLGSHVO.CODE,code);
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( SWLGSHVO.CREATIONTIME);
 } 

/** 
* ���ô���ʱ��
*
* @param creationtime ����ʱ��
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( SWLGSHVO.CREATIONTIME,creationtime);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getCreator () {
return (String) this.getAttributeValue( SWLGSHVO.CREATOR);
 } 

/** 
* ���ô�����
*
* @param creator ������
*/
public void setCreator ( String creator) {
this.setAttributeValue( SWLGSHVO.CREATOR,creator);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF1);
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( SWLGSHVO.DEF1,def1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getDef10 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF10);
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( SWLGSHVO.DEF10,def10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getDef11 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF11);
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( SWLGSHVO.DEF11,def11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF12);
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( SWLGSHVO.DEF12,def12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF13);
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( SWLGSHVO.DEF13,def13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF14);
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( SWLGSHVO.DEF14,def14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getDef15 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF15);
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( SWLGSHVO.DEF15,def15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF16);
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( SWLGSHVO.DEF16,def16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF17);
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( SWLGSHVO.DEF17,def17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF18);
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( SWLGSHVO.DEF18,def18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF19);
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( SWLGSHVO.DEF19,def19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF2);
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( SWLGSHVO.DEF2,def2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF20);
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( SWLGSHVO.DEF20,def20);
 } 

/** 
* ��ȡ�Զ�����21
*
* @return �Զ�����21
*/
public String getDef21 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF21);
 } 

/** 
* �����Զ�����21
*
* @param def21 �Զ�����21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( SWLGSHVO.DEF21,def21);
 } 

/** 
* ��ȡ�Զ�����22
*
* @return �Զ�����22
*/
public String getDef22 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF22);
 } 

/** 
* �����Զ�����22
*
* @param def22 �Զ�����22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( SWLGSHVO.DEF22,def22);
 } 

/** 
* ��ȡ�Զ�����23
*
* @return �Զ�����23
*/
public String getDef23 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF23);
 } 

/** 
* �����Զ�����23
*
* @param def23 �Զ�����23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( SWLGSHVO.DEF23,def23);
 } 

/** 
* ��ȡ�Զ�����24
*
* @return �Զ�����24
*/
public String getDef24 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF24);
 } 

/** 
* �����Զ�����24
*
* @param def24 �Զ�����24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( SWLGSHVO.DEF24,def24);
 } 

/** 
* ��ȡ�Զ�����25
*
* @return �Զ�����25
*/
public String getDef25 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF25);
 } 

/** 
* �����Զ�����25
*
* @param def25 �Զ�����25
*/
public void setDef25 ( String def25) {
this.setAttributeValue( SWLGSHVO.DEF25,def25);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF3);
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( SWLGSHVO.DEF3,def3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF4);
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( SWLGSHVO.DEF4,def4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF5);
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( SWLGSHVO.DEF5,def5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getDef6 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF6);
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( SWLGSHVO.DEF6,def6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getDef7 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF7);
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( SWLGSHVO.DEF7,def7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getDef8 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF8);
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( SWLGSHVO.DEF8,def8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getDef9 () {
return (String) this.getAttributeValue( SWLGSHVO.DEF9);
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( SWLGSHVO.DEF9,def9);
 } 

/** 
* ��ȡ�޶�ö��
*
* @return �޶�ö��
*/
public Integer getEmendenum () {
return (Integer) this.getAttributeValue( SWLGSHVO.EMENDENUM);
 } 

/** 
* �����޶�ö��
*
* @param emendenum �޶�ö��
*/
public void setEmendenum ( Integer emendenum) {
this.setAttributeValue( SWLGSHVO.EMENDENUM,emendenum);
 } 

/** 
* ��ȡ����޸�ʱ��
*
* @return ����޸�ʱ��
*/
public UFDateTime getLastmaketime () {
return (UFDateTime) this.getAttributeValue( SWLGSHVO.LASTMAKETIME);
 } 

/** 
* ��������޸�ʱ��
*
* @param lastmaketime ����޸�ʱ��
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.setAttributeValue( SWLGSHVO.LASTMAKETIME,lastmaketime);
 } 

/** 
* ��ȡ�Ƶ�ʱ��
*
* @return �Ƶ�ʱ��
*/
public UFDateTime getMaketime () {
return (UFDateTime) this.getAttributeValue( SWLGSHVO.MAKETIME);
 } 

/** 
* �����Ƶ�ʱ��
*
* @param maketime �Ƶ�ʱ��
*/
public void setMaketime ( UFDateTime maketime) {
this.setAttributeValue( SWLGSHVO.MAKETIME,maketime);
 } 

/** 
* ��ȡ�޸�ʱ��
*
* @return �޸�ʱ��
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( SWLGSHVO.MODIFIEDTIME);
 } 

/** 
* �����޸�ʱ��
*
* @param modifiedtime �޸�ʱ��
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( SWLGSHVO.MODIFIEDTIME,modifiedtime);
 } 

/** 
* ��ȡ�޸���
*
* @return �޸���
*/
public String getModifier () {
return (String) this.getAttributeValue( SWLGSHVO.MODIFIER);
 } 

/** 
* �����޸���
*
* @param modifier �޸���
*/
public void setModifier ( String modifier) {
this.setAttributeValue( SWLGSHVO.MODIFIER,modifier);
 } 

/** 
* ��ȡname
*
* @return name
*/
public String getName () {
return (String) this.getAttributeValue( SWLGSHVO.NAME);
 } 

/** 
* ����name
*
* @param name name
*/
public void setName ( String name) {
this.setAttributeValue( SWLGSHVO.NAME,name);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_group () {
return (String) this.getAttributeValue( SWLGSHVO.PK_GROUP);
 } 

/** 
* ���ü���
*
* @param pk_group ����
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( SWLGSHVO.PK_GROUP,pk_group);
 } 

/** 
* ��ȡ��֯
*
* @return ��֯
*/
public String getPk_org () {
return (String) this.getAttributeValue( SWLGSHVO.PK_ORG);
 } 

/** 
* ������֯
*
* @param pk_org ��֯
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( SWLGSHVO.PK_ORG,pk_org);
 } 

/** 
* ��ȡ��֯�汾
*
* @return ��֯�汾
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( SWLGSHVO.PK_ORG_V);
 } 

/** 
* ������֯�汾
*
* @param pk_org_v ��֯�汾
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( SWLGSHVO.PK_ORG_V,pk_org_v);
 } 

/** 
* ��ȡʵ������ʱ����
*
* @return ʵ������ʱ����
*/
public String getPk_swlgs_h () {
return this.pk_swlgs_h;
 } 

/** 
* ����ʵ������ʱ����
*
* @param pk_swlgs_h ʵ������ʱ����
*/
public void setPk_swlgs_h ( String pk_swlgs_h) {
this.pk_swlgs_h=pk_swlgs_h;
 } 

/** 
* ��ȡ������֯
*
* @return ������֯
*/
public String getPkorg () {
return (String) this.getAttributeValue( SWLGSHVO.PKORG);
 } 

/** 
* ����������֯
*
* @param pkorg ������֯
*/
public void setPkorg ( String pkorg) {
this.setAttributeValue( SWLGSHVO.PKORG,pkorg);
 } 

/** 
* ��ȡ�к�
*
* @return �к�
*/
public String getRowno () {
return (String) this.getAttributeValue( SWLGSHVO.ROWNO);
 } 

/** 
* �����к�
*
* @param rowno �к�
*/
public void setRowno ( String rowno) {
this.setAttributeValue( SWLGSHVO.ROWNO,rowno);
 } 

/** 
* ��ȡ��Դ����id
*
* @return ��Դ����id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( SWLGSHVO.SRCBILLID);
 } 

/** 
* ������Դ����id
*
* @param srcbillid ��Դ����id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( SWLGSHVO.SRCBILLID,srcbillid);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getSrcbilltype () {
return (String) this.getAttributeValue( SWLGSHVO.SRCBILLTYPE);
 } 

/** 
* ������Դ��������
*
* @param srcbilltype ��Դ��������
*/
public void setSrcbilltype ( String srcbilltype) {
this.setAttributeValue( SWLGSHVO.SRCBILLTYPE,srcbilltype);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getSwlgs_dept () {
return (String) this.getAttributeValue( SWLGSHVO.SWLGS_DEPT);
 } 

/** 
* ���ò���
*
* @param swlgs_dept ����
*/
public void setSwlgs_dept ( String swlgs_dept) {
this.setAttributeValue( SWLGSHVO.SWLGS_DEPT,swlgs_dept);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getTranstype () {
return (String) this.getAttributeValue( SWLGSHVO.TRANSTYPE);
 } 

/** 
* ���ý�������
*
* @param transtype ��������
*/
public void setTranstype ( String transtype) {
this.setAttributeValue( SWLGSHVO.TRANSTYPE,transtype);
 } 

/** 
* ��ȡ��������pk
*
* @return ��������pk
*/
public String getTranstypepk () {
return (String) this.getAttributeValue( SWLGSHVO.TRANSTYPEPK);
 } 

/** 
* ���ý�������pk
*
* @param transtypepk ��������pk
*/
public void setTranstypepk ( String transtypepk) {
this.setAttributeValue( SWLGSHVO.TRANSTYPEPK,transtypepk);
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
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.SWLGSHVO");
  }
}