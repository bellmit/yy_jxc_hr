package nc.vo.plan.jx02;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class PGDHVO extends SuperVO {
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
*���������
*/
public static final String BMSHR="bmshr";
/**
*�����������
*/
public static final String BMSHSJ="bmshsj";
/**
*�������
*/
public static final String BMTBR="bmtbr";
/**
*���幤ʱ����
*/
public static final String BODYGSTOTAL="bodygstotal";
/**
*ҵ������
*/
public static final String BUSITYPE="busitype";
/**
*code
*/
public static final String CODE="code";
/**
*��Ʒ����
*/
public static final String CPMC="cpmc";
/**
*����ʱ��
*/
public static final String CREATIONTIME="creationtime";
/**
*������
*
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
*�޶�ö��
*/
public static final String EMENDENUM="emendenum";
/**
*�깤����
*/
public static final String FINISHDATE="finishdate";
/**
*���̵�
*/
public UFBoolean gcd;
/**
*��������
*/
public static final String GCNR="gcnr";
/**
*����
*/
public static final String GL="gl";
/**
*��ʱ
*/
public static final String GS="gs";
/**
*����
*/
public static final String GX="gx";
/**
*����
*/
public static final String GZ="gz";
/**
*����ά�޼�¼��
*/
public UFBoolean gzwxjld;
/**
*�ӹ�����
*/
public static final String JGJS="jgjs";
/**
*����
*/
public static final String JH="jh";
/**
*�����Զ�����1
*/
public static final String KDEF1="kdef1";
/**
*�����Զ�����2
*/
public static final String KDEF2="kdef2";
/**
*�����Զ�����3
*/
public static final String KDEF3="kdef3";
/**
*�����Զ�����4
*/
public static final String KDEF4="kdef4";
/**
*�����Զ�����5
*/
public static final String KDEF5="kdef5";
/**
*��Ʊ����
*/
public static final String KPRQ="kprq";
/**
*����޸�ʱ��
*/
public static final String LASTMAKETIME="lastmaketime";
/**
*�������
*/
public static final String LJMC="ljmc";
/**
*�Ƶ�ʱ��
*/
public static final String MAKETIME="maketime";
/**
*��ע
*/
public static final String MEMO="memo";
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
*���׳̶�
*/
public static final String NYCD="nycd";
/**
*��Ա
*/
public static final String PEOPLE="people";
/**
*����
*/
public static final String PGD_DEPT="pgd_dept";
/**
*���Ŷ�汾
*/
public static final String PGD_DEPT_V="pgd_dept_v";
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
*�ɹ�������
*/
public String pk_pgk_h;
/**
*�ص�
*/
public static final String PLACE="place";
/**
*�������������嵥
*/
public UFBoolean qcxhqd;
/**
*��������
*/
public static final String RECEIVEDTIME="receivedtime";
/**
*����������
*/
public static final String SCCSDR="sccsdr";
/**
*������������
*/
public static final String SCCSDSJ="sccsdsj";
/**
*�����������
*/
public static final String SCCSHR="sccshr";
/**
*�������������
*/
public static final String SCCSHSJ="sccshsj";
/**
*������
*/
public static final String SENDEE="sendee";
/**
*ǩ����
*/
public static final String SIGNER="signer";
/**
*ǩ������
*/
public static final String SIGNTIME="signtime";
/**
*��Դ���ݱ���id
*/
public static final String SRCBILLBODYID="srcbillbodyid";
/**
*��Դ����id
*/
public static final String SRCBILLID="srcbillid";
/**
*��Դ��������
*/
public static final String SRCBILLTYPE="srcbilltype";
/**
*�����
*/
public static final String TBTIME="tbtime";
/**
*Ͷ�ϼ���
*/
public static final String TLJS="tljs";
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
*�깤���յ�
*/
public UFBoolean wgysd;
/**
*Ҫ��
*/
public static final String YQ="yq";
/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getApprovedate () {
return (UFDateTime) this.getAttributeValue( PGDHVO.APPROVEDATE);
 } 

/** 
* ��������ʱ��
*
* @param approvedate ����ʱ��
*/
public void setApprovedate ( UFDateTime approvedate) {
this.setAttributeValue( PGDHVO.APPROVEDATE,approvedate);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getApprovenote () {
return (String) this.getAttributeValue( PGDHVO.APPROVENOTE);
 } 

/** 
* ������������
*
* @param approvenote ��������
*/
public void setApprovenote ( String approvenote) {
this.setAttributeValue( PGDHVO.APPROVENOTE,approvenote);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getApprover () {
return (String) this.getAttributeValue( PGDHVO.APPROVER);
 } 

/** 
* ����������
*
* @param approver ������
*/
public void setApprover ( String approver) {
this.setAttributeValue( PGDHVO.APPROVER,approver);
 } 

/** 
* ��ȡ����״̬
*
* @return ����״̬
* @see String
*/
public Integer getApprovestatus () {
return (Integer) this.getAttributeValue( PGDHVO.APPROVESTATUS);
 } 

/** 
* ��������״̬
*
* @param approvestatus ����״̬
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.setAttributeValue( PGDHVO.APPROVESTATUS,approvestatus);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDate getBilldate () {
return (UFDate) this.getAttributeValue( PGDHVO.BILLDATE);
 } 

/** 
* ���õ�������
*
* @param billdate ��������
*/
public void setBilldate ( UFDate billdate) {
this.setAttributeValue( PGDHVO.BILLDATE,billdate);
 } 

/** 
* ��ȡ�Ƶ���
*
* @return �Ƶ���
*/
public String getBillmaker () {
return (String) this.getAttributeValue( PGDHVO.BILLMAKER);
 } 

/** 
* �����Ƶ���
*
* @param billmaker �Ƶ���
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( PGDHVO.BILLMAKER,billmaker);
 } 

/** 
* ��ȡ���ݺ�
*
* @return ���ݺ�
*/
public String getBillno () {
return (String) this.getAttributeValue( PGDHVO.BILLNO);
 } 

/** 
* ���õ��ݺ�
*
* @param billno ���ݺ�
*/
public void setBillno ( String billno) {
this.setAttributeValue( PGDHVO.BILLNO,billno);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getBilltype () {
return (String) this.getAttributeValue( PGDHVO.BILLTYPE);
 } 

/** 
* ���õ�������
*
* @param billtype ��������
*/
public void setBilltype ( String billtype) {
this.setAttributeValue( PGDHVO.BILLTYPE,billtype);
 } 

/** 
* ��ȡ���ݰ汾pk
*
* @return ���ݰ汾pk
*/
public String getBillversionpk () {
return (String) this.getAttributeValue( PGDHVO.BILLVERSIONPK);
 } 

/** 
* ���õ��ݰ汾pk
*
* @param billversionpk ���ݰ汾pk
*/
public void setBillversionpk ( String billversionpk) {
this.setAttributeValue( PGDHVO.BILLVERSIONPK,billversionpk);
 } 

/** 
* ��ȡ���������
*
* @return ���������
*/
public String getBmshr () {
return (String) this.getAttributeValue( PGDHVO.BMSHR);
 } 

/** 
* ���ò��������
*
* @param bmshr ���������
*/
public void setBmshr ( String bmshr) {
this.setAttributeValue( PGDHVO.BMSHR,bmshr);
 } 

/** 
* ��ȡ�����������
*
* @return �����������
*/
public UFDateTime getBmshsj () {
return (UFDateTime) this.getAttributeValue( PGDHVO.BMSHSJ);
 } 

/** 
* ���ò����������
*
* @param bmshsj �����������
*/
public void setBmshsj ( UFDateTime bmshsj) {
this.setAttributeValue( PGDHVO.BMSHSJ,bmshsj);
 } 

/** 
* ��ȡ�������
*
* @return �������
*/
public String getBmtbr () {
return (String) this.getAttributeValue( PGDHVO.BMTBR);
 } 

/** 
* ���ò������
*
* @param bmtbr �������
*/
public void setBmtbr ( String bmtbr) {
this.setAttributeValue( PGDHVO.BMTBR,bmtbr);
 } 

/** 
* ��ȡ���幤ʱ����
*
* @return ���幤ʱ����
*/
public UFDouble getBodygstotal () {
return (UFDouble) this.getAttributeValue( PGDHVO.BODYGSTOTAL);
 } 

/** 
* ���ñ��幤ʱ����
*
* @param bodygstotal ���幤ʱ����
*/
public void setBodygstotal ( UFDouble bodygstotal) {
this.setAttributeValue( PGDHVO.BODYGSTOTAL,bodygstotal);
 } 

/** 
* ��ȡҵ������
*
* @return ҵ������
*/
public String getBusitype () {
return (String) this.getAttributeValue( PGDHVO.BUSITYPE);
 } 

/** 
* ����ҵ������
*
* @param busitype ҵ������
*/
public void setBusitype ( String busitype) {
this.setAttributeValue( PGDHVO.BUSITYPE,busitype);
 } 

/** 
* ��ȡcode
*
* @return code
*/
public String getCode () {
return (String) this.getAttributeValue( PGDHVO.CODE);
 } 

/** 
* ����code
*
* @param code code
*/
public void setCode ( String code) {
this.setAttributeValue( PGDHVO.CODE,code);
 } 

/** 
* ��ȡ��Ʒ����
*
* @return ��Ʒ����
*/
public String getCpmc () {
return (String) this.getAttributeValue( PGDHVO.CPMC);
 } 

/** 
* ���ò�Ʒ����
*
* @param cpmc ��Ʒ����
*/
public void setCpmc ( String cpmc) {
this.setAttributeValue( PGDHVO.CPMC,cpmc);
 } 

/** 
* ��ȡ����ʱ��
*
* @return ����ʱ��
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.CREATIONTIME);
 } 

/** 
* ���ô���ʱ��
*
* @param creationtime ����ʱ��
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( PGDHVO.CREATIONTIME,creationtime);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getCreator () {
return (String) this.getAttributeValue( PGDHVO.CREATOR);
 } 

/** 
* ���ô�����
*
* @param creator ������
*/
public void setCreator ( String creator) {
this.setAttributeValue( PGDHVO.CREATOR,creator);
 } 

/** 
* ��ȡ�Զ�����1
*
* @return �Զ�����1
*/
public String getDef1 () {
return (String) this.getAttributeValue( PGDHVO.DEF1);
 } 

/** 
* �����Զ�����1
*
* @param def1 �Զ�����1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( PGDHVO.DEF1,def1);
 } 

/** 
* ��ȡ�Զ�����10
*
* @return �Զ�����10
*/
public String getDef10 () {
return (String) this.getAttributeValue( PGDHVO.DEF10);
 } 

/** 
* �����Զ�����10
*
* @param def10 �Զ�����10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( PGDHVO.DEF10,def10);
 } 

/** 
* ��ȡ�Զ�����11
*
* @return �Զ�����11
*/
public String getDef11 () {
return (String) this.getAttributeValue( PGDHVO.DEF11);
 } 

/** 
* �����Զ�����11
*
* @param def11 �Զ�����11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( PGDHVO.DEF11,def11);
 } 

/** 
* ��ȡ�Զ�����12
*
* @return �Զ�����12
*/
public String getDef12 () {
return (String) this.getAttributeValue( PGDHVO.DEF12);
 } 

/** 
* �����Զ�����12
*
* @param def12 �Զ�����12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( PGDHVO.DEF12,def12);
 } 

/** 
* ��ȡ�Զ�����13
*
* @return �Զ�����13
*/
public String getDef13 () {
return (String) this.getAttributeValue( PGDHVO.DEF13);
 } 

/** 
* �����Զ�����13
*
* @param def13 �Զ�����13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( PGDHVO.DEF13,def13);
 } 

/** 
* ��ȡ�Զ�����14
*
* @return �Զ�����14
*/
public String getDef14 () {
return (String) this.getAttributeValue( PGDHVO.DEF14);
 } 

/** 
* �����Զ�����14
*
* @param def14 �Զ�����14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( PGDHVO.DEF14,def14);
 } 

/** 
* ��ȡ�Զ�����15
*
* @return �Զ�����15
*/
public String getDef15 () {
return (String) this.getAttributeValue( PGDHVO.DEF15);
 } 

/** 
* �����Զ�����15
*
* @param def15 �Զ�����15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( PGDHVO.DEF15,def15);
 } 

/** 
* ��ȡ�Զ�����16
*
* @return �Զ�����16
*/
public String getDef16 () {
return (String) this.getAttributeValue( PGDHVO.DEF16);
 } 

/** 
* �����Զ�����16
*
* @param def16 �Զ�����16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( PGDHVO.DEF16,def16);
 } 

/** 
* ��ȡ�Զ�����17
*
* @return �Զ�����17
*/
public String getDef17 () {
return (String) this.getAttributeValue( PGDHVO.DEF17);
 } 

/** 
* �����Զ�����17
*
* @param def17 �Զ�����17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( PGDHVO.DEF17,def17);
 } 

/** 
* ��ȡ�Զ�����18
*
* @return �Զ�����18
*/
public String getDef18 () {
return (String) this.getAttributeValue( PGDHVO.DEF18);
 } 

/** 
* �����Զ�����18
*
* @param def18 �Զ�����18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( PGDHVO.DEF18,def18);
 } 

/** 
* ��ȡ�Զ�����19
*
* @return �Զ�����19
*/
public String getDef19 () {
return (String) this.getAttributeValue( PGDHVO.DEF19);
 } 

/** 
* �����Զ�����19
*
* @param def19 �Զ�����19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( PGDHVO.DEF19,def19);
 } 

/** 
* ��ȡ�Զ�����2
*
* @return �Զ�����2
*/
public String getDef2 () {
return (String) this.getAttributeValue( PGDHVO.DEF2);
 } 

/** 
* �����Զ�����2
*
* @param def2 �Զ�����2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( PGDHVO.DEF2,def2);
 } 

/** 
* ��ȡ�Զ�����20
*
* @return �Զ�����20
*/
public String getDef20 () {
return (String) this.getAttributeValue( PGDHVO.DEF20);
 } 

/** 
* �����Զ�����20
*
* @param def20 �Զ�����20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( PGDHVO.DEF20,def20);
 } 

/** 
* ��ȡ�Զ�����21
*
* @return �Զ�����21
*/
public String getDef21 () {
return (String) this.getAttributeValue( PGDHVO.DEF21);
 } 

/** 
* �����Զ�����21
*
* @param def21 �Զ�����21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( PGDHVO.DEF21,def21);
 } 

/** 
* ��ȡ�Զ�����22
*
* @return �Զ�����22
*/
public String getDef22 () {
return (String) this.getAttributeValue( PGDHVO.DEF22);
 } 

/** 
* �����Զ�����22
*
* @param def22 �Զ�����22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( PGDHVO.DEF22,def22);
 } 

/** 
* ��ȡ�Զ�����23
*
* @return �Զ�����23
*/
public String getDef23 () {
return (String) this.getAttributeValue( PGDHVO.DEF23);
 } 

/** 
* �����Զ�����23
*
* @param def23 �Զ�����23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( PGDHVO.DEF23,def23);
 } 

/** 
* ��ȡ�Զ�����24
*
* @return �Զ�����24
*/
public String getDef24 () {
return (String) this.getAttributeValue( PGDHVO.DEF24);
 } 

/** 
* �����Զ�����24
*
* @param def24 �Զ�����24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( PGDHVO.DEF24,def24);
 } 

/** 
* ��ȡ�Զ�����25
*
* @return �Զ�����25
*/
public String getDef25 () {
return (String) this.getAttributeValue( PGDHVO.DEF25);
 } 

/** 
* �����Զ�����25
*
* @param def25 �Զ�����25
*/
public void setDef25 ( String def25) {
this.setAttributeValue( PGDHVO.DEF25,def25);
 } 

/** 
* ��ȡ�Զ�����26
*
* @return �Զ�����26
*/
public String getDef26 () {
return (String) this.getAttributeValue( PGDHVO.DEF26);
 } 

/** 
* �����Զ�����26
*
* @param def26 �Զ�����26
*/
public void setDef26 ( String def26) {
this.setAttributeValue( PGDHVO.DEF26,def26);
 } 

/** 
* ��ȡ�Զ�����27
*
* @return �Զ�����27
*/
public String getDef27 () {
return (String) this.getAttributeValue( PGDHVO.DEF27);
 } 

/** 
* �����Զ�����27
*
* @param def27 �Զ�����27
*/
public void setDef27 ( String def27) {
this.setAttributeValue( PGDHVO.DEF27,def27);
 } 

/** 
* ��ȡ�Զ�����3
*
* @return �Զ�����3
*/
public String getDef3 () {
return (String) this.getAttributeValue( PGDHVO.DEF3);
 } 

/** 
* �����Զ�����3
*
* @param def3 �Զ�����3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( PGDHVO.DEF3,def3);
 } 

/** 
* ��ȡ�Զ�����4
*
* @return �Զ�����4
*/
public String getDef4 () {
return (String) this.getAttributeValue( PGDHVO.DEF4);
 } 

/** 
* �����Զ�����4
*
* @param def4 �Զ�����4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( PGDHVO.DEF4,def4);
 } 

/** 
* ��ȡ�Զ�����5
*
* @return �Զ�����5
*/
public String getDef5 () {
return (String) this.getAttributeValue( PGDHVO.DEF5);
 } 

/** 
* �����Զ�����5
*
* @param def5 �Զ�����5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( PGDHVO.DEF5,def5);
 } 

/** 
* ��ȡ�Զ�����6
*
* @return �Զ�����6
*/
public String getDef6 () {
return (String) this.getAttributeValue( PGDHVO.DEF6);
 } 

/** 
* �����Զ�����6
*
* @param def6 �Զ�����6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( PGDHVO.DEF6,def6);
 } 

/** 
* ��ȡ�Զ�����7
*
* @return �Զ�����7
*/
public String getDef7 () {
return (String) this.getAttributeValue( PGDHVO.DEF7);
 } 

/** 
* �����Զ�����7
*
* @param def7 �Զ�����7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( PGDHVO.DEF7,def7);
 } 

/** 
* ��ȡ�Զ�����8
*
* @return �Զ�����8
*/
public String getDef8 () {
return (String) this.getAttributeValue( PGDHVO.DEF8);
 } 

/** 
* �����Զ�����8
*
* @param def8 �Զ�����8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( PGDHVO.DEF8,def8);
 } 

/** 
* ��ȡ�Զ�����9
*
* @return �Զ�����9
*/
public String getDef9 () {
return (String) this.getAttributeValue( PGDHVO.DEF9);
 } 

/** 
* �����Զ�����9
*
* @param def9 �Զ�����9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( PGDHVO.DEF9,def9);
 } 

/** 
* ��ȡ�޶�ö��
*
* @return �޶�ö��
*/
public Integer getEmendenum () {
return (Integer) this.getAttributeValue( PGDHVO.EMENDENUM);
 } 

/** 
* �����޶�ö��
*
* @param emendenum �޶�ö��
*/
public void setEmendenum ( Integer emendenum) {
this.setAttributeValue( PGDHVO.EMENDENUM,emendenum);
 } 

/** 
* ��ȡ�깤����
*
* @return �깤����
*/
public UFDateTime getFinishdate () {
return (UFDateTime) this.getAttributeValue( PGDHVO.FINISHDATE);
 } 

/** 
* �����깤����
*
* @param finishdate �깤����
*/
public void setFinishdate ( UFDateTime finishdate) {
this.setAttributeValue( PGDHVO.FINISHDATE,finishdate);
 } 

/** 
* ��ȡ���̵�
*
* @return ���̵�
*/
public UFBoolean getGcd () {
return this.gcd;
 } 

/** 
* ���ù��̵�
*
* @param gcd ���̵�
*/
public void setGcd ( UFBoolean gcd) {
this.gcd=gcd;
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getGcnr () {
return (String) this.getAttributeValue( PGDHVO.GCNR);
 } 

/** 
* ���ù�������
*
* @param gcnr ��������
*/
public void setGcnr ( String gcnr) {
this.setAttributeValue( PGDHVO.GCNR,gcnr);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getGl () {
return (String) this.getAttributeValue( PGDHVO.GL);
 } 

/** 
* ���ù���
*
* @param gl ����
*/
public void setGl ( String gl) {
this.setAttributeValue( PGDHVO.GL,gl);
 } 

/** 
* ��ȡ��ʱ
*
* @return ��ʱ
*/
public UFDouble getGs () {
return (UFDouble) this.getAttributeValue( PGDHVO.GS);
 } 

/** 
* ���ù�ʱ
*
* @param gs ��ʱ
*/
public void setGs ( UFDouble gs) {
this.setAttributeValue( PGDHVO.GS,gs);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getGx () {
return (String) this.getAttributeValue( PGDHVO.GX);
 } 

/** 
* ���ù���
*
* @param gx ����
*/
public void setGx ( String gx) {
this.setAttributeValue( PGDHVO.GX,gx);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getGz () {
return (String) this.getAttributeValue( PGDHVO.GZ);
 } 

/** 
* ���ù���
*
* @param gz ����
*/
public void setGz ( String gz) {
this.setAttributeValue( PGDHVO.GZ,gz);
 } 

/** 
* ��ȡ����ά�޼�¼��
*
* @return ����ά�޼�¼��
*/
public UFBoolean getGzwxjld () {
return this.gzwxjld;
 } 

/** 
* ���ù���ά�޼�¼��
*
* @param gzwxjld ����ά�޼�¼��
*/
public void setGzwxjld ( UFBoolean gzwxjld) {
this.gzwxjld=gzwxjld;
 } 

/** 
* ��ȡ�ӹ�����
*
* @return �ӹ�����
*/
public Integer getJgjs () {
return (Integer) this.getAttributeValue( PGDHVO.JGJS);
 } 

/** 
* ���üӹ�����
*
* @param jgjs �ӹ�����
*/
public void setJgjs ( Integer jgjs) {
this.setAttributeValue( PGDHVO.JGJS,jgjs);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getJh () {
return (String) this.getAttributeValue( PGDHVO.JH);
 } 

/** 
* ���ü���
*
* @param jh ����
*/
public void setJh ( String jh) {
this.setAttributeValue( PGDHVO.JH,jh);
 } 

/** 
* ��ȡ�����Զ�����1
*
* @return �����Զ�����1
*/
public String getKdef1 () {
return (String) this.getAttributeValue( PGDHVO.KDEF1);
 } 

/** 
* ���ÿ����Զ�����1
*
* @param kdef1 �����Զ�����1
*/
public void setKdef1 ( String kdef1) {
this.setAttributeValue( PGDHVO.KDEF1,kdef1);
 } 

/** 
* ��ȡ�����Զ�����2
*
* @return �����Զ�����2
*/
public String getKdef2 () {
return (String) this.getAttributeValue( PGDHVO.KDEF2);
 } 

/** 
* ���ÿ����Զ�����2
*
* @param kdef2 �����Զ�����2
*/
public void setKdef2 ( String kdef2) {
this.setAttributeValue( PGDHVO.KDEF2,kdef2);
 } 

/** 
* ��ȡ�����Զ�����3
*
* @return �����Զ�����3
*/
public String getKdef3 () {
return (String) this.getAttributeValue( PGDHVO.KDEF3);
 } 

/** 
* ���ÿ����Զ�����3
*
* @param kdef3 �����Զ�����3
*/
public void setKdef3 ( String kdef3) {
this.setAttributeValue( PGDHVO.KDEF3,kdef3);
 } 

/** 
* ��ȡ�����Զ�����4
*
* @return �����Զ�����4
*/
public String getKdef4 () {
return (String) this.getAttributeValue( PGDHVO.KDEF4);
 } 

/** 
* ���ÿ����Զ�����4
*
* @param kdef4 �����Զ�����4
*/
public void setKdef4 ( String kdef4) {
this.setAttributeValue( PGDHVO.KDEF4,kdef4);
 } 

/** 
* ��ȡ�����Զ�����5
*
* @return �����Զ�����5
*/
public String getKdef5 () {
return (String) this.getAttributeValue( PGDHVO.KDEF5);
 } 

/** 
* ���ÿ����Զ�����5
*
* @param kdef5 �����Զ�����5
*/
public void setKdef5 ( String kdef5) {
this.setAttributeValue( PGDHVO.KDEF5,kdef5);
 } 

/** 
* ��ȡ��Ʊ����
*
* @return ��Ʊ����
*/
public UFDate getKprq () {
return (UFDate) this.getAttributeValue( PGDHVO.KPRQ);
 } 

/** 
* ���ÿ�Ʊ����
*
* @param kprq ��Ʊ����
*/
public void setKprq ( UFDate kprq) {
this.setAttributeValue( PGDHVO.KPRQ,kprq);
 } 

/** 
* ��ȡ����޸�ʱ��
*
* @return ����޸�ʱ��
*/
public UFDateTime getLastmaketime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.LASTMAKETIME);
 } 

/** 
* ��������޸�ʱ��
*
* @param lastmaketime ����޸�ʱ��
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.setAttributeValue( PGDHVO.LASTMAKETIME,lastmaketime);
 } 

/** 
* ��ȡ�������
*
* @return �������
*/
public String getLjmc () {
return (String) this.getAttributeValue( PGDHVO.LJMC);
 } 

/** 
* �����������
*
* @param ljmc �������
*/
public void setLjmc ( String ljmc) {
this.setAttributeValue( PGDHVO.LJMC,ljmc);
 } 

/** 
* ��ȡ�Ƶ�ʱ��
*
* @return �Ƶ�ʱ��
*/
public UFDateTime getMaketime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.MAKETIME);
 } 

/** 
* �����Ƶ�ʱ��
*
* @param maketime �Ƶ�ʱ��
*/
public void setMaketime ( UFDateTime maketime) {
this.setAttributeValue( PGDHVO.MAKETIME,maketime);
 } 

/** 
* ��ȡ��ע
*
* @return ��ע
*/
public String getMemo () {
return (String) this.getAttributeValue( PGDHVO.MEMO);
 } 

/** 
* ���ñ�ע
*
* @param memo ��ע
*/
public void setMemo ( String memo) {
this.setAttributeValue( PGDHVO.MEMO,memo);
 } 

/** 
* ��ȡ�޸�ʱ��
*
* @return �޸�ʱ��
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.MODIFIEDTIME);
 } 

/** 
* �����޸�ʱ��
*
* @param modifiedtime �޸�ʱ��
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( PGDHVO.MODIFIEDTIME,modifiedtime);
 } 

/** 
* ��ȡ�޸���
*
* @return �޸���
*/
public String getModifier () {
return (String) this.getAttributeValue( PGDHVO.MODIFIER);
 } 

/** 
* �����޸���
*
* @param modifier �޸���
*/
public void setModifier ( String modifier) {
this.setAttributeValue( PGDHVO.MODIFIER,modifier);
 } 

/** 
* ��ȡname
*
* @return name
*/
public String getName () {
return (String) this.getAttributeValue( PGDHVO.NAME);
 } 

/** 
* ����name
*
* @param name name
*/
public void setName ( String name) {
this.setAttributeValue( PGDHVO.NAME,name);
 } 

/** 
* ��ȡ���׳̶�
*
* @return ���׳̶�
* @see String
*/
public String getNycd () {
return (String) this.getAttributeValue( PGDHVO.NYCD);
 } 

/** 
* �������׳̶�
*
* @param nycd ���׳̶�
* @see String
*/
public void setNycd ( String nycd) {
this.setAttributeValue( PGDHVO.NYCD,nycd);
 } 

/** 
* ��ȡ��Ա
*
* @return ��Ա
*/
public String getPeople () {
return (String) this.getAttributeValue( PGDHVO.PEOPLE);
 } 

/** 
* ������Ա
*
* @param people ��Ա
*/
public void setPeople ( String people) {
this.setAttributeValue( PGDHVO.PEOPLE,people);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPgd_dept () {
return (String) this.getAttributeValue( PGDHVO.PGD_DEPT);
 } 

/** 
* ���ò���
*
* @param pgd_dept ����
*/
public void setPgd_dept ( String pgd_dept) {
this.setAttributeValue( PGDHVO.PGD_DEPT,pgd_dept);
 } 

/** 
* ��ȡ���Ŷ�汾
*
* @return ���Ŷ�汾
*/
public String getPgd_dept_v () {
return (String) this.getAttributeValue( PGDHVO.PGD_DEPT_V);
 } 

/** 
* ���ò��Ŷ�汾
*
* @param pgd_dept_v ���Ŷ�汾
*/
public void setPgd_dept_v ( String pgd_dept_v) {
this.setAttributeValue( PGDHVO.PGD_DEPT_V,pgd_dept_v);
 } 

/** 
* ��ȡ����
*
* @return ����
*/
public String getPk_group () {
return (String) this.getAttributeValue( PGDHVO.PK_GROUP);
 } 

/** 
* ���ü���
*
* @param pk_group ����
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( PGDHVO.PK_GROUP,pk_group);
 } 

/** 
* ��ȡ��֯
*
* @return ��֯
*/
public String getPk_org () {
return (String) this.getAttributeValue( PGDHVO.PK_ORG);
 } 

/** 
* ������֯
*
* @param pk_org ��֯
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( PGDHVO.PK_ORG,pk_org);
 } 

/** 
* ��ȡ��֯�汾
*
* @return ��֯�汾
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( PGDHVO.PK_ORG_V);
 } 

/** 
* ������֯�汾
*
* @param pk_org_v ��֯�汾
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( PGDHVO.PK_ORG_V,pk_org_v);
 } 

/** 
* ��ȡ�ɹ�������
*
* @return �ɹ�������
*/
public String getPk_pgk_h () {
return this.pk_pgk_h;
 } 

/** 
* �����ɹ�������
*
* @param pk_pgk_h �ɹ�������
*/
public void setPk_pgk_h ( String pk_pgk_h) {
this.pk_pgk_h=pk_pgk_h;
 } 

/** 
* ��ȡ�ص�
*
* @return �ص�
*/
public String getPlace () {
return (String) this.getAttributeValue( PGDHVO.PLACE);
 } 

/** 
* ���õص�
*
* @param place �ص�
*/
public void setPlace ( String place) {
this.setAttributeValue( PGDHVO.PLACE,place);
 } 

/** 
* ��ȡ�������������嵥
*
* @return �������������嵥
*/
public UFBoolean getQcxhqd () {
return this.qcxhqd;
 } 

/** 
* �����������������嵥
*
* @param qcxhqd �������������嵥
*/
public void setQcxhqd ( UFBoolean qcxhqd) {
this.qcxhqd=qcxhqd;
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public UFDateTime getReceivedtime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.RECEIVEDTIME);
 } 

/** 
* ���ý�������
*
* @param receivedtime ��������
*/
public void setReceivedtime ( UFDateTime receivedtime) {
this.setAttributeValue( PGDHVO.RECEIVEDTIME,receivedtime);
 } 

/** 
* ��ȡ����������
*
* @return ����������
*/
public String getSccsdr () {
return (String) this.getAttributeValue( PGDHVO.SCCSDR);
 } 

/** 
* ��������������
*
* @param sccsdr ����������
*/
public void setSccsdr ( String sccsdr) {
this.setAttributeValue( PGDHVO.SCCSDR,sccsdr);
 } 

/** 
* ��ȡ������������
*
* @return ������������
*/
public UFDateTime getSccsdsj () {
return (UFDateTime) this.getAttributeValue( PGDHVO.SCCSDSJ);
 } 

/** 
* ����������������
*
* @param sccsdsj ������������
*/
public void setSccsdsj ( UFDateTime sccsdsj) {
this.setAttributeValue( PGDHVO.SCCSDSJ,sccsdsj);
 } 

/** 
* ��ȡ�����������
*
* @return �����������
*/
public String getSccshr () {
return (String) this.getAttributeValue( PGDHVO.SCCSHR);
 } 

/** 
* ���������������
*
* @param sccshr �����������
*/
public void setSccshr ( String sccshr) {
this.setAttributeValue( PGDHVO.SCCSHR,sccshr);
 } 

/** 
* ��ȡ�������������
*
* @return �������������
*/
public UFDateTime getSccshsj () {
return (UFDateTime) this.getAttributeValue( PGDHVO.SCCSHSJ);
 } 

/** 
* �����������������
*
* @param sccshsj �������������
*/
public void setSccshsj ( UFDateTime sccshsj) {
this.setAttributeValue( PGDHVO.SCCSHSJ,sccshsj);
 } 

/** 
* ��ȡ������
*
* @return ������
*/
public String getSendee () {
return (String) this.getAttributeValue( PGDHVO.SENDEE);
 } 

/** 
* ���ý�����
*
* @param sendee ������
*/
public void setSendee ( String sendee) {
this.setAttributeValue( PGDHVO.SENDEE,sendee);
 } 

/** 
* ��ȡǩ����
*
* @return ǩ����
*/
public String getSigner () {
return (String) this.getAttributeValue( PGDHVO.SIGNER);
 } 

/** 
* ����ǩ����
*
* @param signer ǩ����
*/
public void setSigner ( String signer) {
this.setAttributeValue( PGDHVO.SIGNER,signer);
 } 

/** 
* ��ȡǩ������
*
* @return ǩ������
*/
public UFDateTime getSigntime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.SIGNTIME);
 } 

/** 
* ����ǩ������
*
* @param signtime ǩ������
*/
public void setSigntime ( UFDateTime signtime) {
this.setAttributeValue( PGDHVO.SIGNTIME,signtime);
 } 

/** 
* ��ȡ��Դ���ݱ���id
*
* @return ��Դ���ݱ���id
*/
public String getSrcbillbodyid () {
return (String) this.getAttributeValue( PGDHVO.SRCBILLBODYID);
 } 

/** 
* ������Դ���ݱ���id
*
* @param srcbillbodyid ��Դ���ݱ���id
*/
public void setSrcbillbodyid ( String srcbillbodyid) {
this.setAttributeValue( PGDHVO.SRCBILLBODYID,srcbillbodyid);
 } 

/** 
* ��ȡ��Դ����id
*
* @return ��Դ����id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( PGDHVO.SRCBILLID);
 } 

/** 
* ������Դ����id
*
* @param srcbillid ��Դ����id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( PGDHVO.SRCBILLID,srcbillid);
 } 

/** 
* ��ȡ��Դ��������
*
* @return ��Դ��������
*/
public String getSrcbilltype () {
return (String) this.getAttributeValue( PGDHVO.SRCBILLTYPE);
 } 

/** 
* ������Դ��������
*
* @param srcbilltype ��Դ��������
*/
public void setSrcbilltype ( String srcbilltype) {
this.setAttributeValue( PGDHVO.SRCBILLTYPE,srcbilltype);
 } 

/** 
* ��ȡ�����
*
* @return �����
*/
public UFDateTime getTbtime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.TBTIME);
 } 

/** 
* ���������
*
* @param tbtime �����
*/
public void setTbtime ( UFDateTime tbtime) {
this.setAttributeValue( PGDHVO.TBTIME,tbtime);
 } 

/** 
* ��ȡͶ�ϼ���
*
* @return Ͷ�ϼ���
*/
public Integer getTljs () {
return (Integer) this.getAttributeValue( PGDHVO.TLJS);
 } 

/** 
* ����Ͷ�ϼ���
*
* @param tljs Ͷ�ϼ���
*/
public void setTljs ( Integer tljs) {
this.setAttributeValue( PGDHVO.TLJS,tljs);
 } 

/** 
* ��ȡ��������
*
* @return ��������
*/
public String getTranstype () {
return (String) this.getAttributeValue( PGDHVO.TRANSTYPE);
 } 

/** 
* ���ý�������
*
* @param transtype ��������
*/
public void setTranstype ( String transtype) {
this.setAttributeValue( PGDHVO.TRANSTYPE,transtype);
 } 

/** 
* ��ȡ��������pk
*
* @return ��������pk
*/
public String getTranstypepk () {
return (String) this.getAttributeValue( PGDHVO.TRANSTYPEPK);
 } 

/** 
* ���ý�������pk
*
* @param transtypepk ��������pk
*/
public void setTranstypepk ( String transtypepk) {
this.setAttributeValue( PGDHVO.TRANSTYPEPK,transtypepk);
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
* ��ȡ�깤���յ�
*
* @return �깤���յ�
*/
public UFBoolean getWgysd () {
return this.wgysd;
 } 

/** 
* �����깤���յ�
*
* @param wgysd �깤���յ�
*/
public void setWgysd ( UFBoolean wgysd) {
this.wgysd=wgysd;
 } 

/** 
* ��ȡҪ��
*
* @return Ҫ��
*/
public String getYq () {
return (String) this.getAttributeValue( PGDHVO.YQ);
 } 

/** 
* ����Ҫ��
*
* @param yq Ҫ��
*/
public void setYq ( String yq) {
this.setAttributeValue( PGDHVO.YQ,yq);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.PGDHVO");
  }
}