package nc.vo.jxc_hr.ordersheet;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class OrderStartVO extends SuperVO {
/**
*��������
*/
public static final String APPLY_DATE="apply_date";
/**
*���뵥���
*/
public static final String APPLYCODE="applycode";
/**
*����
*/
public static final String APPLYDEPT="applydept";
/**
*��֯_���Ű汾��Ϣ
*/
public static final String APPLYDEPT_V="applydept_v";
/**
*��������
*/
public static final String APPROVE_NOTE="approve_note";
/**
*����״̬
*/
public static final String APPROVE_STATE="approve_state";
/**
*����ʱ��
*/
public static final String APPROVE_TIME="approve_time";
/**
*������
*/
public static final String APPROVER="approver";
/**
*��������
*/
public static final String BILLDATE="billdate";
/**
*�Ƶ���
*/
public static final String BILLMAKER="billmaker";
/**
*��������
*/
public static final String BILLTYPE="billtype";
/**
*���ݰ汾pk
*/
public String billversionpk;
/**
*ҵ������
*/
public static final String BUSITYPE="busitype";
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
*�������ڵ��
*/
public static final String FUN_CODE="fun_code";
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
public static final String PK_GROUP="pk_group";
/**
*����
*/
public String pk_ordersheet;
/**
*��֯
*/
public static final String PK_ORG="pk_org";
/**
*��֯�汾
*/
public static final String PK_ORG_V="pk_org_v";
/**
*��������
*/
public static final String PUBLISHDATE="publishdate";
/**
*��Դ����id
*/
public static final String SRCBILLID="srcbillid";
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
* ��ȡ��������
*
* @return ��������
*/
public UFDate getApply_date () {
return (UFDate) this.getAttributeValue( OrderStartVO.APPLY_DATE);
 } 

/** 
* ������������
*
* @param apply_date ��������
*/
public void setApply_date ( UFDate apply_date) {
this.setAttributeValue( OrderStartVO.APPLY_DATE,apply_date);
 } 

/** 
* ��ȡ���뵥���
*
* @return ���뵥���
*/
public String getApplycode () {
return (String) this.getAttributeValue( OrderStartVO.APPLYCODE);
 } 

/** 
* �������뵥���
*
* @param applycode ���뵥���
*/
public void setApplycode ( String applycode) {
this.setAttributeValue( OrderStartVO.APPLYCODE,applycode);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getApplydept () {
return (String) this.getAttributeValue( OrderStartVO.APPLYDEPT);
 } 

/** 
* ���ò���
*
* @param applydept ����
*/
public void setApplydept ( String applydept) {
this.setAttributeValue( OrderStartVO.APPLYDEPT,applydept);
 } 

/** 
* ��ȡ��֯_���Ű汾��Ϣ
*
* @return ��֯_���Ű汾��Ϣ
*/
public String getApplydept_v () {
return (String) this.getAttributeValue( OrderStartVO.APPLYDEPT_V);
 } 

/** 
* ������֯_���Ű汾��Ϣ
*
* @param applydept_v ��֯_���Ű汾��Ϣ
*/
public void setApplydept_v ( String applydept_v) {
this.setAttributeValue( OrderStartVO.APPLYDEPT_V,applydept_v);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getApprove_note () {
return (String) this.getAttributeValue( OrderStartVO.APPROVE_NOTE);
 } 

/** 
* ������������
*
* @param approve_note ��������
*/
public void setApprove_note ( String approve_note) {
this.setAttributeValue( OrderStartVO.APPROVE_NOTE,approve_note);
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getApprove_state () {
return (Integer) this.getAttributeValue( OrderStartVO.APPROVE_STATE);
 } 

/** 
* ��������״̬
*
* @param approve_state ����״̬
* @see String
*/
public void setApprove_state ( Integer approve_state) {
this.setAttributeValue( OrderStartVO.APPROVE_STATE,approve_state);
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getApprove_time () {
return (UFDateTime) this.getAttributeValue( OrderStartVO.APPROVE_TIME);
 } 

/** 
* ��������ʱ��
*
* @param approve_time ����ʱ��
*/
public void setApprove_time ( UFDateTime approve_time) {
this.setAttributeValue( OrderStartVO.APPROVE_TIME,approve_time);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getApprover () {
return (String) this.getAttributeValue( OrderStartVO.APPROVER);
 } 

/** 
* ����������
*
* @param approver ������
*/
public void setApprover ( String approver) {
this.setAttributeValue( OrderStartVO.APPROVER,approver);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getBilldate () {
return (UFDate) this.getAttributeValue( OrderStartVO.BILLDATE);
 } 

/** 
* ���õ�������
*
* @param billdate ��������
*/
public void setBilldate ( UFDate billdate) {
this.setAttributeValue( OrderStartVO.BILLDATE,billdate);
 } 

/** 
* ��ȡ�Ƶ���
*
* @return �Ƶ���
*/
public String getBillmaker () {
return (String) this.getAttributeValue( OrderStartVO.BILLMAKER);
 } 

/** 
* �����Ƶ���
*
* @param billmaker �Ƶ���
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( OrderStartVO.BILLMAKER,billmaker);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getBilltype () {
return (String) this.getAttributeValue( OrderStartVO.BILLTYPE);
 } 

/** 
* ���õ�������
*
* @param billtype ��������
*/
public void setBilltype ( String billtype) {
this.setAttributeValue( OrderStartVO.BILLTYPE,billtype);
 } 

/** 
* ��ȡ���ݰ汾pk
*
* @return ���ݰ汾pk
*/
public String getBillversionpk () {
return this.billversionpk;
 } 

/** 
* ���õ��ݰ汾pk
*
* @param billversionpk ���ݰ汾pk
*/
public void setBillversionpk ( String billversionpk) {
this.billversionpk=billversionpk;
 } 

/** 
* ��ȡҵ������
*
* @return ҵ������
*/
public String getBusitype () {
return (String) this.getAttributeValue( OrderStartVO.BUSITYPE);
 } 

/** 
* ����ҵ������
*
* @param busitype ҵ������
*/
public void setBusitype ( String busitype) {
this.setAttributeValue( OrderStartVO.BUSITYPE,busitype);
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDate getCreationtime () {
return (UFDate) this.getAttributeValue( OrderStartVO.CREATIONTIME);
 } 

/** 
* ���ô���ʱ��
*
* @param creationtime ����ʱ��
*/
public void setCreationtime ( UFDate creationtime) {
this.setAttributeValue( OrderStartVO.CREATIONTIME,creationtime);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getCreator () {
return (String) this.getAttributeValue( OrderStartVO.CREATOR);
 } 

/** 
* ���ô�����
*
* @param creator ������
*/
public void setCreator ( String creator) {
this.setAttributeValue( OrderStartVO.CREATOR,creator);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return (String) this.getAttributeValue( OrderStartVO.DEF1);
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( OrderStartVO.DEF1,def1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getDef10 () {
return (String) this.getAttributeValue( OrderStartVO.DEF10);
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( OrderStartVO.DEF10,def10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getDef11 () {
return (String) this.getAttributeValue( OrderStartVO.DEF11);
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( OrderStartVO.DEF11,def11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return (String) this.getAttributeValue( OrderStartVO.DEF12);
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( OrderStartVO.DEF12,def12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return (String) this.getAttributeValue( OrderStartVO.DEF13);
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( OrderStartVO.DEF13,def13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return (String) this.getAttributeValue( OrderStartVO.DEF14);
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( OrderStartVO.DEF14,def14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getDef15 () {
return (String) this.getAttributeValue( OrderStartVO.DEF15);
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( OrderStartVO.DEF15,def15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return (String) this.getAttributeValue( OrderStartVO.DEF16);
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( OrderStartVO.DEF16,def16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return (String) this.getAttributeValue( OrderStartVO.DEF17);
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( OrderStartVO.DEF17,def17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return (String) this.getAttributeValue( OrderStartVO.DEF18);
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( OrderStartVO.DEF18,def18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return (String) this.getAttributeValue( OrderStartVO.DEF19);
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( OrderStartVO.DEF19,def19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return (String) this.getAttributeValue( OrderStartVO.DEF2);
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( OrderStartVO.DEF2,def2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return (String) this.getAttributeValue( OrderStartVO.DEF20);
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( OrderStartVO.DEF20,def20);
 } 

/** 
* ��ȡ�Զ�����21
*
* @return �Զ�����21
*/
public String getDef21 () {
return (String) this.getAttributeValue( OrderStartVO.DEF21);
 } 

/** 
* �����Զ�����21
*
* @param def21 �Զ�����21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( OrderStartVO.DEF21,def21);
 } 

/** 
* ��ȡ�Զ�����22
*
* @return �Զ�����22
*/
public String getDef22 () {
return (String) this.getAttributeValue( OrderStartVO.DEF22);
 } 

/** 
* �����Զ�����22
*
* @param def22 �Զ�����22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( OrderStartVO.DEF22,def22);
 } 

/** 
* ��ȡ�Զ�����23
*
* @return �Զ�����23
*/
public String getDef23 () {
return (String) this.getAttributeValue( OrderStartVO.DEF23);
 } 

/** 
* �����Զ�����23
*
* @param def23 �Զ�����23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( OrderStartVO.DEF23,def23);
 } 

/** 
* ��ȡ�Զ�����24
*
* @return �Զ�����24
*/
public String getDef24 () {
return (String) this.getAttributeValue( OrderStartVO.DEF24);
 } 

/** 
* �����Զ�����24
*
* @param def24 �Զ�����24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( OrderStartVO.DEF24,def24);
 } 

/** 
* ��ȡ�Զ�����25
*
* @return �Զ�����25
*/
public String getDef25 () {
return (String) this.getAttributeValue( OrderStartVO.DEF25);
 } 

/** 
* �����Զ�����25
*
* @param def25 �Զ�����25
*/
public void setDef25 ( String def25) {
this.setAttributeValue( OrderStartVO.DEF25,def25);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return (String) this.getAttributeValue( OrderStartVO.DEF3);
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( OrderStartVO.DEF3,def3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return (String) this.getAttributeValue( OrderStartVO.DEF4);
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( OrderStartVO.DEF4,def4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return (String) this.getAttributeValue( OrderStartVO.DEF5);
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( OrderStartVO.DEF5,def5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getDef6 () {
return (String) this.getAttributeValue( OrderStartVO.DEF6);
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( OrderStartVO.DEF6,def6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getDef7 () {
return (String) this.getAttributeValue( OrderStartVO.DEF7);
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( OrderStartVO.DEF7,def7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getDef8 () {
return (String) this.getAttributeValue( OrderStartVO.DEF8);
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( OrderStartVO.DEF8,def8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getDef9 () {
return (String) this.getAttributeValue( OrderStartVO.DEF9);
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( OrderStartVO.DEF9,def9);
 } 

/** 
* ��ȡ�޶�ö��
*
* @return �޶�ö��
*/
public Integer getEmendenum () {
return (Integer) this.getAttributeValue( OrderStartVO.EMENDENUM);
 } 

/** 
* �����޶�ö��
*
* @param emendenum �޶�ö��
*/
public void setEmendenum ( Integer emendenum) {
this.setAttributeValue( OrderStartVO.EMENDENUM,emendenum);
 } 

/** 
* ��ȡ�������ڵ��
*
* @return �������ڵ��
*/
public String getFun_code () {
return (String) this.getAttributeValue( OrderStartVO.FUN_CODE);
 } 

/** 
* �����������ڵ��
*
* @param fun_code �������ڵ��
*/
public void setFun_code ( String fun_code) {
this.setAttributeValue( OrderStartVO.FUN_CODE,fun_code);
 } 

/** 
* ��ȡ�޸�ʱ��
*
* @return �޸�ʱ��
*/
public UFDate getModifiedtime () {
return (UFDate) this.getAttributeValue( OrderStartVO.MODIFIEDTIME);
 } 

/** 
* �����޸�ʱ��
*
* @param modifiedtime �޸�ʱ��
*/
public void setModifiedtime ( UFDate modifiedtime) {
this.setAttributeValue( OrderStartVO.MODIFIEDTIME,modifiedtime);
 } 

/** 
* ��ȡ�޸���
*
* @return �޸���
*/
public String getModifier () {
return (String) this.getAttributeValue( OrderStartVO.MODIFIER);
 } 

/** 
* �����޸���
*
* @param modifier �޸���
*/
public void setModifier ( String modifier) {
this.setAttributeValue( OrderStartVO.MODIFIER,modifier);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_group () {
return (String) this.getAttributeValue( OrderStartVO.PK_GROUP);
 } 

/** 
* ���ü���
*
* @param pk_group ����
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( OrderStartVO.PK_GROUP,pk_group);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_ordersheet () {
return this.pk_ordersheet;
 } 

/** 
* ��������
*
* @param pk_ordersheet ����
*/
public void setPk_ordersheet ( String pk_ordersheet) {
this.pk_ordersheet=pk_ordersheet;
 } 

/** 
* ��ȡ��֯
*
* @return ��֯
*/
public String getPk_org () {
return (String) this.getAttributeValue( OrderStartVO.PK_ORG);
 } 

/** 
* ������֯
*
* @param pk_org ��֯
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( OrderStartVO.PK_ORG,pk_org);
 } 

/** 
* ��ȡ��֯�汾
*
* @return ��֯�汾
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( OrderStartVO.PK_ORG_V);
 } 

/** 
* ������֯�汾
*
* @param pk_org_v ��֯�汾
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( OrderStartVO.PK_ORG_V,pk_org_v);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getPublishdate () {
return (UFDate) this.getAttributeValue( OrderStartVO.PUBLISHDATE);
 } 

/** 
* ���÷�������
*
* @param publishdate ��������
*/
public void setPublishdate ( UFDate publishdate) {
this.setAttributeValue( OrderStartVO.PUBLISHDATE,publishdate);
 } 

/** 
* ��ȡ��Դ����id
*
* @return ��Դ����id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( OrderStartVO.SRCBILLID);
 } 

/** 
* ������Դ����id
*
* @param srcbillid ��Դ����id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( OrderStartVO.SRCBILLID,srcbillid);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getSrcbilltype () {
return (String) this.getAttributeValue( OrderStartVO.SRCBILLTYPE);
 } 

/** 
* ������Դ��������
*
* @param srcbilltype ��Դ��������
*/
public void setSrcbilltype ( String srcbilltype) {
this.setAttributeValue( OrderStartVO.SRCBILLTYPE,srcbilltype);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getTranstype () {
return (String) this.getAttributeValue( OrderStartVO.TRANSTYPE);
 } 

/** 
* ���ý�������
*
* @param transtype ��������
*/
public void setTranstype ( String transtype) {
this.setAttributeValue( OrderStartVO.TRANSTYPE,transtype);
 } 

/** 
* ��ȡ��������pk
*
* @return ��������pk
*/
public String getTranstypepk () {
return (String) this.getAttributeValue( OrderStartVO.TRANSTYPEPK);
 } 

/** 
* ���ý�������pk
*
* @param transtypepk ��������pk
*/
public void setTranstypepk ( String transtypepk) {
this.setAttributeValue( OrderStartVO.TRANSTYPEPK,transtypepk);
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
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.OrderStartVO");
  }
}