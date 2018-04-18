package nc.vo.plan.jx01;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class SGDBVO extends SuperVO {
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
public static final String DJDATE="djdate";
/**
*�޶�ö��
*/
public static final String EMENDENUM="emendenum";
/**
*��ʱ
*/
public static final String GS="gs";
/**
*����
*/
public static final String GZ="gz";
/**
*�Ƿ�������Э
*/
public static final String ISEXT="isext";
/**
*�Ƿ�������
*/
public static final String ISMAIN="ismain";
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
*����
*/
public static final String PK_DEPT="pk_dept";
/**
*��֯_���Ű汾��Ϣ
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
*ʩ������ϸ����
*/
public String pk_sgd_b;
/**
*�ϲ㵥������
*/
public String pk_sgd_h;
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
*��Դ��������
*/
public static final String SRCBILLTYPE="srcbilltype";
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
return (UFDateTime) this.getAttributeValue( SGDBVO.APPROVEDATE);
 } 

/** 
* ��������ʱ��
*
* @param approvedate ����ʱ��
*/
public void setApprovedate ( UFDateTime approvedate) {
this.setAttributeValue( SGDBVO.APPROVEDATE,approvedate);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getApprovenote () {
return (String) this.getAttributeValue( SGDBVO.APPROVENOTE);
 } 

/** 
* ������������
*
* @param approvenote ��������
*/
public void setApprovenote ( String approvenote) {
this.setAttributeValue( SGDBVO.APPROVENOTE,approvenote);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getApprover () {
return (String) this.getAttributeValue( SGDBVO.APPROVER);
 } 

/** 
* ����������
*
* @param approver ������
*/
public void setApprover ( String approver) {
this.setAttributeValue( SGDBVO.APPROVER,approver);
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getApprovestatus () {
return (Integer) this.getAttributeValue( SGDBVO.APPROVESTATUS);
 } 

/** 
* ��������״̬
*
* @param approvestatus ����״̬
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.setAttributeValue( SGDBVO.APPROVESTATUS,approvestatus);
 } 

/** 
* ��ȡ����ID
*
* @return ����ID
*/
public String getBillid () {
return (String) this.getAttributeValue( SGDBVO.BILLID);
 } 

/** 
* ���õ���ID
*
* @param billid ����ID
*/
public void setBillid ( String billid) {
this.setAttributeValue( SGDBVO.BILLID,billid);
 } 

/** 
* ��ȡ�Ƶ���
*
* @return �Ƶ���
*/
public String getBillmaker () {
return (String) this.getAttributeValue( SGDBVO.BILLMAKER);
 } 

/** 
* �����Ƶ���
*
* @param billmaker �Ƶ���
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( SGDBVO.BILLMAKER,billmaker);
 } 

/** 
* ��ȡ���ݺ�
*
* @return ���ݺ�
*/
public String getBillno () {
return (String) this.getAttributeValue( SGDBVO.BILLNO);
 } 

/** 
* ���õ��ݺ�
*
* @param billno ���ݺ�
*/
public void setBillno ( String billno) {
this.setAttributeValue( SGDBVO.BILLNO,billno);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getBilltype () {
return (String) this.getAttributeValue( SGDBVO.BILLTYPE);
 } 

/** 
* ���õ�������
*
* @param billtype ��������
*/
public void setBilltype ( String billtype) {
this.setAttributeValue( SGDBVO.BILLTYPE,billtype);
 } 

/** 
* ��ȡ���ݰ汾pk
*
* @return ���ݰ汾pk
*/
public String getBillversionpk () {
return (String) this.getAttributeValue( SGDBVO.BILLVERSIONPK);
 } 

/** 
* ���õ��ݰ汾pk
*
* @param billversionpk ���ݰ汾pk
*/
public void setBillversionpk ( String billversionpk) {
this.setAttributeValue( SGDBVO.BILLVERSIONPK,billversionpk);
 } 

/** 
* ��ȡҵ������
*
* @return ҵ������
*/
public String getBusitype () {
return (String) this.getAttributeValue( SGDBVO.BUSITYPE);
 } 

/** 
* ����ҵ������
*
* @param busitype ҵ������
*/
public void setBusitype ( String busitype) {
this.setAttributeValue( SGDBVO.BUSITYPE,busitype);
 } 

/** 
* ��ȡ��ע
*
* @return ��ע
*/
public String getBz () {
return (String) this.getAttributeValue( SGDBVO.BZ);
 } 

/** 
* ���ñ�ע
*
* @param bz ��ע
*/
public void setBz ( String bz) {
this.setAttributeValue( SGDBVO.BZ,bz);
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( SGDBVO.CREATIONTIME);
 } 

/** 
* ���ô���ʱ��
*
* @param creationtime ����ʱ��
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( SGDBVO.CREATIONTIME,creationtime);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getCreator () {
return (String) this.getAttributeValue( SGDBVO.CREATOR);
 } 

/** 
* ���ô�����
*
* @param creator ������
*/
public void setCreator ( String creator) {
this.setAttributeValue( SGDBVO.CREATOR,creator);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return (String) this.getAttributeValue( SGDBVO.DEF1);
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( SGDBVO.DEF1,def1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getDef10 () {
return (String) this.getAttributeValue( SGDBVO.DEF10);
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( SGDBVO.DEF10,def10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getDef11 () {
return (String) this.getAttributeValue( SGDBVO.DEF11);
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( SGDBVO.DEF11,def11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return (String) this.getAttributeValue( SGDBVO.DEF12);
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( SGDBVO.DEF12,def12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return (String) this.getAttributeValue( SGDBVO.DEF13);
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( SGDBVO.DEF13,def13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return (String) this.getAttributeValue( SGDBVO.DEF14);
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( SGDBVO.DEF14,def14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getDef15 () {
return (String) this.getAttributeValue( SGDBVO.DEF15);
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( SGDBVO.DEF15,def15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return (String) this.getAttributeValue( SGDBVO.DEF16);
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( SGDBVO.DEF16,def16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return (String) this.getAttributeValue( SGDBVO.DEF17);
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( SGDBVO.DEF17,def17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return (String) this.getAttributeValue( SGDBVO.DEF18);
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( SGDBVO.DEF18,def18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return (String) this.getAttributeValue( SGDBVO.DEF19);
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( SGDBVO.DEF19,def19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return (String) this.getAttributeValue( SGDBVO.DEF2);
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( SGDBVO.DEF2,def2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return (String) this.getAttributeValue( SGDBVO.DEF20);
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( SGDBVO.DEF20,def20);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return (String) this.getAttributeValue( SGDBVO.DEF3);
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( SGDBVO.DEF3,def3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return (String) this.getAttributeValue( SGDBVO.DEF4);
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( SGDBVO.DEF4,def4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return (String) this.getAttributeValue( SGDBVO.DEF5);
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( SGDBVO.DEF5,def5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getDef6 () {
return (String) this.getAttributeValue( SGDBVO.DEF6);
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( SGDBVO.DEF6,def6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getDef7 () {
return (String) this.getAttributeValue( SGDBVO.DEF7);
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( SGDBVO.DEF7,def7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getDef8 () {
return (String) this.getAttributeValue( SGDBVO.DEF8);
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( SGDBVO.DEF8,def8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getDef9 () {
return (String) this.getAttributeValue( SGDBVO.DEF9);
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( SGDBVO.DEF9,def9);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getDjdate () {
return (UFDate) this.getAttributeValue( SGDBVO.DJDATE);
 } 

/** 
* ���õ�������
*
* @param djdate ��������
*/
public void setDjdate ( UFDate djdate) {
this.setAttributeValue( SGDBVO.DJDATE,djdate);
 } 

/** 
* ��ȡ�޶�ö��
*
* @return �޶�ö��
*/
public Integer getEmendenum () {
return (Integer) this.getAttributeValue( SGDBVO.EMENDENUM);
 } 

/** 
* �����޶�ö��
*
* @param emendenum �޶�ö��
*/
public void setEmendenum ( Integer emendenum) {
this.setAttributeValue( SGDBVO.EMENDENUM,emendenum);
 } 

/** 
* ��ȡ��ʱ
*
* @return ��ʱ
*/
public UFDouble getGs () {
return (UFDouble) this.getAttributeValue( SGDBVO.GS);
 } 

/** 
* ���ù�ʱ
*
* @param gs ��ʱ
*/
public void setGs ( UFDouble gs) {
this.setAttributeValue( SGDBVO.GS,gs);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getGz () {
return (String) this.getAttributeValue( SGDBVO.GZ);
 } 

/** 
* ���ù���
*
* @param gz ����
*/
public void setGz ( String gz) {
this.setAttributeValue( SGDBVO.GZ,gz);
 } 

/** 
* ��ȡ�Ƿ�������Э
*
* @return �Ƿ�������Э
*/
public UFBoolean getIsext () {
return (UFBoolean) this.getAttributeValue( SGDBVO.ISEXT);
 } 

/** 
* �����Ƿ�������Э
*
* @param isext �Ƿ�������Э
*/
public void setIsext ( UFBoolean isext) {
this.setAttributeValue( SGDBVO.ISEXT,isext);
 } 

/** 
* ��ȡ�Ƿ�������
*
* @return �Ƿ�������
*/
public UFBoolean getIsmain () {
return (UFBoolean) this.getAttributeValue( SGDBVO.ISMAIN);
 } 

/** 
* �����Ƿ�������
*
* @param ismain �Ƿ�������
*/
public void setIsmain ( UFBoolean ismain) {
this.setAttributeValue( SGDBVO.ISMAIN,ismain);
 } 

/** 
* ��ȡ����޸�ʱ��
*
* @return ����޸�ʱ��
*/
public UFDateTime getLastmaketime () {
return (UFDateTime) this.getAttributeValue( SGDBVO.LASTMAKETIME);
 } 

/** 
* ��������޸�ʱ��
*
* @param lastmaketime ����޸�ʱ��
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.setAttributeValue( SGDBVO.LASTMAKETIME,lastmaketime);
 } 

/** 
* ��ȡ�Ƶ�ʱ��
*
* @return �Ƶ�ʱ��
*/
public UFDateTime getMaketime () {
return (UFDateTime) this.getAttributeValue( SGDBVO.MAKETIME);
 } 

/** 
* �����Ƶ�ʱ��
*
* @param maketime �Ƶ�ʱ��
*/
public void setMaketime ( UFDateTime maketime) {
this.setAttributeValue( SGDBVO.MAKETIME,maketime);
 } 

/** 
* ��ȡ�޸�ʱ��
*
* @return �޸�ʱ��
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( SGDBVO.MODIFIEDTIME);
 } 

/** 
* �����޸�ʱ��
*
* @param modifiedtime �޸�ʱ��
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( SGDBVO.MODIFIEDTIME,modifiedtime);
 } 

/** 
* ��ȡ�޸���
*
* @return �޸���
*/
public String getModifier () {
return (String) this.getAttributeValue( SGDBVO.MODIFIER);
 } 

/** 
* �����޸���
*
* @param modifier �޸���
*/
public void setModifier ( String modifier) {
this.setAttributeValue( SGDBVO.MODIFIER,modifier);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_dept () {
return (String) this.getAttributeValue( SGDBVO.PK_DEPT);
 } 

/** 
* ���ò���
*
* @param pk_dept ����
*/
public void setPk_dept ( String pk_dept) {
this.setAttributeValue( SGDBVO.PK_DEPT,pk_dept);
 } 

/** 
* ��ȡ��֯_���Ű汾��Ϣ
*
* @return ��֯_���Ű汾��Ϣ
*/
public String getPk_dept_v () {
return (String) this.getAttributeValue( SGDBVO.PK_DEPT_V);
 } 

/** 
* ������֯_���Ű汾��Ϣ
*
* @param pk_dept_v ��֯_���Ű汾��Ϣ
*/
public void setPk_dept_v ( String pk_dept_v) {
this.setAttributeValue( SGDBVO.PK_DEPT_V,pk_dept_v);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_group () {
return (String) this.getAttributeValue( SGDBVO.PK_GROUP);
 } 

/** 
* ���ü���
*
* @param pk_group ����
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( SGDBVO.PK_GROUP,pk_group);
 } 

/** 
* ��ȡ��Ŀ��֯
*
* @return ��Ŀ��֯
*/
public String getPk_org () {
return (String) this.getAttributeValue( SGDBVO.PK_ORG);
 } 

/** 
* ������Ŀ��֯
*
* @param pk_org ��Ŀ��֯
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( SGDBVO.PK_ORG,pk_org);
 } 

/** 
* ��ȡ��Ŀ��֯
*
* @return ��Ŀ��֯
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( SGDBVO.PK_ORG_V);
 } 

/** 
* ������Ŀ��֯
*
* @param pk_org_v ��Ŀ��֯
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( SGDBVO.PK_ORG_V,pk_org_v);
 } 

/** 
* ��ȡʩ������ϸ����
*
* @return ʩ������ϸ����
*/
public String getPk_sgd_b () {
return this.pk_sgd_b;
 } 

/** 
* ����ʩ������ϸ����
*
* @param pk_sgd_b ʩ������ϸ����
*/
public void setPk_sgd_b ( String pk_sgd_b) {
this.pk_sgd_b=pk_sgd_b;
 } 

/** 
* ��ȡ�ϲ㵥������
*
* @return �ϲ㵥������
*/
public String getPk_sgd_h () {
return this.pk_sgd_h;
 } 

/** 
* �����ϲ㵥������
*
* @param pk_sgd_h �ϲ㵥������
*/
public void setPk_sgd_h ( String pk_sgd_h) {
this.pk_sgd_h=pk_sgd_h;
 } 

/** 
* ��ȡ�к�
*
* @return �к�
*/
public String getRowno () {
return (String) this.getAttributeValue( SGDBVO.ROWNO);
 } 

/** 
* �����к�
*
* @param rowno �к�
*/
public void setRowno ( String rowno) {
this.setAttributeValue( SGDBVO.ROWNO,rowno);
 } 

/** 
* ��ȡ��Դ����id
*
* @return ��Դ����id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( SGDBVO.SRCBILLID);
 } 

/** 
* ������Դ����id
*
* @param srcbillid ��Դ����id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( SGDBVO.SRCBILLID,srcbillid);
 } 

/** 
* ��ȡ��Դ���ݱ���id
*
* @return ��Դ���ݱ���id
*/
public String getSrcbillid_b () {
return (String) this.getAttributeValue( SGDBVO.SRCBILLID_B);
 } 

/** 
* ������Դ���ݱ���id
*
* @param srcbillid_b ��Դ���ݱ���id
*/
public void setSrcbillid_b ( String srcbillid_b) {
this.setAttributeValue( SGDBVO.SRCBILLID_B,srcbillid_b);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getSrcbilltype () {
return (String) this.getAttributeValue( SGDBVO.SRCBILLTYPE);
 } 

/** 
* ������Դ��������
*
* @param srcbilltype ��Դ��������
*/
public void setSrcbilltype ( String srcbilltype) {
this.setAttributeValue( SGDBVO.SRCBILLTYPE,srcbilltype);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getTranstype () {
return (String) this.getAttributeValue( SGDBVO.TRANSTYPE);
 } 

/** 
* ���ý�������
*
* @param transtype ��������
*/
public void setTranstype ( String transtype) {
this.setAttributeValue( SGDBVO.TRANSTYPE,transtype);
 } 

/** 
* ��ȡ��������pk
*
* @return ��������pk
*/
public String getTranstypepk () {
return (String) this.getAttributeValue( SGDBVO.TRANSTYPEPK);
 } 

/** 
* ���ý�������pk
*
* @param transtypepk ��������pk
*/
public void setTranstypepk ( String transtypepk) {
this.setAttributeValue( SGDBVO.TRANSTYPEPK,transtypepk);
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
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.SGDBVO");
  }
}