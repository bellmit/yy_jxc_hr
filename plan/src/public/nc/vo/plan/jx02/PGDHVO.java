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
*审批时间
*/
public static final String APPROVEDATE="approvedate";
/**
*审批批语
*/
public static final String APPROVENOTE="approvenote";
/**
*审批人
*/
public static final String APPROVER="approver";
/**
*审批状态
*/
public static final String APPROVESTATUS="approvestatus";
/**
*单据日期
*/
public static final String BILLDATE="billdate";
/**
*制单人
*/
public static final String BILLMAKER="billmaker";
/**
*单据号
*/
public static final String BILLNO="billno";
/**
*单据类型
*/
public static final String BILLTYPE="billtype";
/**
*单据版本pk
*/
public static final String BILLVERSIONPK="billversionpk";
/**
*部门审核人
*/
public static final String BMSHR="bmshr";
/**
*部门审核日期
*/
public static final String BMSHSJ="bmshsj";
/**
*部门填报人
*/
public static final String BMTBR="bmtbr";
/**
*表体工时汇总
*/
public static final String BODYGSTOTAL="bodygstotal";
/**
*业务类型
*/
public static final String BUSITYPE="busitype";
/**
*code
*/
public static final String CODE="code";
/**
*产品名称
*/
public static final String CPMC="cpmc";
/**
*创建时间
*/
public static final String CREATIONTIME="creationtime";
/**
*创建人
*
*/
public static final String CREATOR="creator";
/**
*自定义项1
*/
public static final String DEF1="def1";
/**
*自定义项10
*/
public static final String DEF10="def10";
/**
*自定义项11
*/
public static final String DEF11="def11";
/**
*自定义项12
*/
public static final String DEF12="def12";
/**
*自定义项13
*/
public static final String DEF13="def13";
/**
*自定义项14
*/
public static final String DEF14="def14";
/**
*自定义项15
*/
public static final String DEF15="def15";
/**
*自定义项16
*/
public static final String DEF16="def16";
/**
*自定义项17
*/
public static final String DEF17="def17";
/**
*自定义项18
*/
public static final String DEF18="def18";
/**
*自定义项19
*/
public static final String DEF19="def19";
/**
*自定义项2
*/
public static final String DEF2="def2";
/**
*自定义项20
*/
public static final String DEF20="def20";
/**
*自定义项21
*/
public static final String DEF21="def21";
/**
*自定义项22
*/
public static final String DEF22="def22";
/**
*自定义项23
*/
public static final String DEF23="def23";
/**
*自定义项24
*/
public static final String DEF24="def24";
/**
*自定义项25
*/
public static final String DEF25="def25";
/**
*自定义项26
*/
public static final String DEF26="def26";
/**
*自定义项27
*/
public static final String DEF27="def27";
/**
*自定义项3
*/
public static final String DEF3="def3";
/**
*自定义项4
*/
public static final String DEF4="def4";
/**
*自定义项5
*/
public static final String DEF5="def5";
/**
*自定义项6
*/
public static final String DEF6="def6";
/**
*自定义项7
*/
public static final String DEF7="def7";
/**
*自定义项8
*/
public static final String DEF8="def8";
/**
*自定义项9
*/
public static final String DEF9="def9";
/**
*修订枚举
*/
public static final String EMENDENUM="emendenum";
/**
*完工日期
*/
public static final String FINISHDATE="finishdate";
/**
*工程单
*/
public UFBoolean gcd;
/**
*工程内容
*/
public static final String GCNR="gcnr";
/**
*工令
*/
public static final String GL="gl";
/**
*工时
*/
public static final String GS="gs";
/**
*工序
*/
public static final String GX="gx";
/**
*工种
*/
public static final String GZ="gz";
/**
*故障维修记录单
*/
public UFBoolean gzwxjld;
/**
*加工件数
*/
public static final String JGJS="jgjs";
/**
*件号
*/
public static final String JH="jh";
/**
*开发自定义项1
*/
public static final String KDEF1="kdef1";
/**
*开发自定义项2
*/
public static final String KDEF2="kdef2";
/**
*开发自定义项3
*/
public static final String KDEF3="kdef3";
/**
*开发自定义项4
*/
public static final String KDEF4="kdef4";
/**
*开发自定义项5
*/
public static final String KDEF5="kdef5";
/**
*开票日期
*/
public static final String KPRQ="kprq";
/**
*最后修改时间
*/
public static final String LASTMAKETIME="lastmaketime";
/**
*零件名称
*/
public static final String LJMC="ljmc";
/**
*制单时间
*/
public static final String MAKETIME="maketime";
/**
*备注
*/
public static final String MEMO="memo";
/**
*修改时间
*/
public static final String MODIFIEDTIME="modifiedtime";
/**
*修改人
*/
public static final String MODIFIER="modifier";
/**
*name
*/
public static final String NAME="name";
/**
*难易程度
*/
public static final String NYCD="nycd";
/**
*人员
*/
public static final String PEOPLE="people";
/**
*部门
*/
public static final String PGD_DEPT="pgd_dept";
/**
*部门多版本
*/
public static final String PGD_DEPT_V="pgd_dept_v";
/**
*集团
*/
public static final String PK_GROUP="pk_group";
/**
*组织
*/
public static final String PK_ORG="pk_org";
/**
*组织版本
*/
public static final String PK_ORG_V="pk_org_v";
/**
*派工卡主键
*/
public String pk_pgk_h;
/**
*地点
*/
public static final String PLACE="place";
/**
*临修器材消耗清单
*/
public UFBoolean qcxhqd;
/**
*接收日期
*/
public static final String RECEIVEDTIME="receivedtime";
/**
*生产处审定人
*/
public static final String SCCSDR="sccsdr";
/**
*生产处审定日期
*/
public static final String SCCSDSJ="sccsdsj";
/**
*生产处审核人
*/
public static final String SCCSHR="sccshr";
/**
*生产处审核日期
*/
public static final String SCCSHSJ="sccshsj";
/**
*接收人
*/
public static final String SENDEE="sendee";
/**
*签发人
*/
public static final String SIGNER="signer";
/**
*签发日期
*/
public static final String SIGNTIME="signtime";
/**
*来源单据表体id
*/
public static final String SRCBILLBODYID="srcbillbodyid";
/**
*来源单据id
*/
public static final String SRCBILLID="srcbillid";
/**
*来源单据类型
*/
public static final String SRCBILLTYPE="srcbilltype";
/**
*填报日期
*/
public static final String TBTIME="tbtime";
/**
*投料件数
*/
public static final String TLJS="tljs";
/**
*交易类型
*/
public static final String TRANSTYPE="transtype";
/**
*交易类型pk
*/
public static final String TRANSTYPEPK="transtypepk";
/**
*时间戳
*/
public UFDateTime ts;
/**
*完工验收单
*/
public UFBoolean wgysd;
/**
*要求
*/
public static final String YQ="yq";
/** 
* 获取审批时间
*
* @return 审批时间
*/
public UFDateTime getApprovedate () {
return (UFDateTime) this.getAttributeValue( PGDHVO.APPROVEDATE);
 } 

/** 
* 设置审批时间
*
* @param approvedate 审批时间
*/
public void setApprovedate ( UFDateTime approvedate) {
this.setAttributeValue( PGDHVO.APPROVEDATE,approvedate);
 } 

/** 
* 获取审批批语
*
* @return 审批批语
*/
public String getApprovenote () {
return (String) this.getAttributeValue( PGDHVO.APPROVENOTE);
 } 

/** 
* 设置审批批语
*
* @param approvenote 审批批语
*/
public void setApprovenote ( String approvenote) {
this.setAttributeValue( PGDHVO.APPROVENOTE,approvenote);
 } 

/** 
* 获取审批人
*
* @return 审批人
*/
public String getApprover () {
return (String) this.getAttributeValue( PGDHVO.APPROVER);
 } 

/** 
* 设置审批人
*
* @param approver 审批人
*/
public void setApprover ( String approver) {
this.setAttributeValue( PGDHVO.APPROVER,approver);
 } 

/** 
* 获取审批状态
*
* @return 审批状态
* @see String
*/
public Integer getApprovestatus () {
return (Integer) this.getAttributeValue( PGDHVO.APPROVESTATUS);
 } 

/** 
* 设置审批状态
*
* @param approvestatus 审批状态
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.setAttributeValue( PGDHVO.APPROVESTATUS,approvestatus);
 } 

/** 
* 获取单据日期
*
* @return 单据日期
*/
public UFDate getBilldate () {
return (UFDate) this.getAttributeValue( PGDHVO.BILLDATE);
 } 

/** 
* 设置单据日期
*
* @param billdate 单据日期
*/
public void setBilldate ( UFDate billdate) {
this.setAttributeValue( PGDHVO.BILLDATE,billdate);
 } 

/** 
* 获取制单人
*
* @return 制单人
*/
public String getBillmaker () {
return (String) this.getAttributeValue( PGDHVO.BILLMAKER);
 } 

/** 
* 设置制单人
*
* @param billmaker 制单人
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( PGDHVO.BILLMAKER,billmaker);
 } 

/** 
* 获取单据号
*
* @return 单据号
*/
public String getBillno () {
return (String) this.getAttributeValue( PGDHVO.BILLNO);
 } 

/** 
* 设置单据号
*
* @param billno 单据号
*/
public void setBillno ( String billno) {
this.setAttributeValue( PGDHVO.BILLNO,billno);
 } 

/** 
* 获取单据类型
*
* @return 单据类型
*/
public String getBilltype () {
return (String) this.getAttributeValue( PGDHVO.BILLTYPE);
 } 

/** 
* 设置单据类型
*
* @param billtype 单据类型
*/
public void setBilltype ( String billtype) {
this.setAttributeValue( PGDHVO.BILLTYPE,billtype);
 } 

/** 
* 获取单据版本pk
*
* @return 单据版本pk
*/
public String getBillversionpk () {
return (String) this.getAttributeValue( PGDHVO.BILLVERSIONPK);
 } 

/** 
* 设置单据版本pk
*
* @param billversionpk 单据版本pk
*/
public void setBillversionpk ( String billversionpk) {
this.setAttributeValue( PGDHVO.BILLVERSIONPK,billversionpk);
 } 

/** 
* 获取部门审核人
*
* @return 部门审核人
*/
public String getBmshr () {
return (String) this.getAttributeValue( PGDHVO.BMSHR);
 } 

/** 
* 设置部门审核人
*
* @param bmshr 部门审核人
*/
public void setBmshr ( String bmshr) {
this.setAttributeValue( PGDHVO.BMSHR,bmshr);
 } 

/** 
* 获取部门审核日期
*
* @return 部门审核日期
*/
public UFDateTime getBmshsj () {
return (UFDateTime) this.getAttributeValue( PGDHVO.BMSHSJ);
 } 

/** 
* 设置部门审核日期
*
* @param bmshsj 部门审核日期
*/
public void setBmshsj ( UFDateTime bmshsj) {
this.setAttributeValue( PGDHVO.BMSHSJ,bmshsj);
 } 

/** 
* 获取部门填报人
*
* @return 部门填报人
*/
public String getBmtbr () {
return (String) this.getAttributeValue( PGDHVO.BMTBR);
 } 

/** 
* 设置部门填报人
*
* @param bmtbr 部门填报人
*/
public void setBmtbr ( String bmtbr) {
this.setAttributeValue( PGDHVO.BMTBR,bmtbr);
 } 

/** 
* 获取表体工时汇总
*
* @return 表体工时汇总
*/
public UFDouble getBodygstotal () {
return (UFDouble) this.getAttributeValue( PGDHVO.BODYGSTOTAL);
 } 

/** 
* 设置表体工时汇总
*
* @param bodygstotal 表体工时汇总
*/
public void setBodygstotal ( UFDouble bodygstotal) {
this.setAttributeValue( PGDHVO.BODYGSTOTAL,bodygstotal);
 } 

/** 
* 获取业务类型
*
* @return 业务类型
*/
public String getBusitype () {
return (String) this.getAttributeValue( PGDHVO.BUSITYPE);
 } 

/** 
* 设置业务类型
*
* @param busitype 业务类型
*/
public void setBusitype ( String busitype) {
this.setAttributeValue( PGDHVO.BUSITYPE,busitype);
 } 

/** 
* 获取code
*
* @return code
*/
public String getCode () {
return (String) this.getAttributeValue( PGDHVO.CODE);
 } 

/** 
* 设置code
*
* @param code code
*/
public void setCode ( String code) {
this.setAttributeValue( PGDHVO.CODE,code);
 } 

/** 
* 获取产品名称
*
* @return 产品名称
*/
public String getCpmc () {
return (String) this.getAttributeValue( PGDHVO.CPMC);
 } 

/** 
* 设置产品名称
*
* @param cpmc 产品名称
*/
public void setCpmc ( String cpmc) {
this.setAttributeValue( PGDHVO.CPMC,cpmc);
 } 

/** 
* 获取创建时间
*
* @return 创建时间
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.CREATIONTIME);
 } 

/** 
* 设置创建时间
*
* @param creationtime 创建时间
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( PGDHVO.CREATIONTIME,creationtime);
 } 

/** 
* 获取创建人
*
* @return 创建人
*/
public String getCreator () {
return (String) this.getAttributeValue( PGDHVO.CREATOR);
 } 

/** 
* 设置创建人
*
* @param creator 创建人
*/
public void setCreator ( String creator) {
this.setAttributeValue( PGDHVO.CREATOR,creator);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getDef1 () {
return (String) this.getAttributeValue( PGDHVO.DEF1);
 } 

/** 
* 设置自定义项1
*
* @param def1 自定义项1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( PGDHVO.DEF1,def1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getDef10 () {
return (String) this.getAttributeValue( PGDHVO.DEF10);
 } 

/** 
* 设置自定义项10
*
* @param def10 自定义项10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( PGDHVO.DEF10,def10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getDef11 () {
return (String) this.getAttributeValue( PGDHVO.DEF11);
 } 

/** 
* 设置自定义项11
*
* @param def11 自定义项11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( PGDHVO.DEF11,def11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getDef12 () {
return (String) this.getAttributeValue( PGDHVO.DEF12);
 } 

/** 
* 设置自定义项12
*
* @param def12 自定义项12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( PGDHVO.DEF12,def12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getDef13 () {
return (String) this.getAttributeValue( PGDHVO.DEF13);
 } 

/** 
* 设置自定义项13
*
* @param def13 自定义项13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( PGDHVO.DEF13,def13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getDef14 () {
return (String) this.getAttributeValue( PGDHVO.DEF14);
 } 

/** 
* 设置自定义项14
*
* @param def14 自定义项14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( PGDHVO.DEF14,def14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getDef15 () {
return (String) this.getAttributeValue( PGDHVO.DEF15);
 } 

/** 
* 设置自定义项15
*
* @param def15 自定义项15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( PGDHVO.DEF15,def15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getDef16 () {
return (String) this.getAttributeValue( PGDHVO.DEF16);
 } 

/** 
* 设置自定义项16
*
* @param def16 自定义项16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( PGDHVO.DEF16,def16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getDef17 () {
return (String) this.getAttributeValue( PGDHVO.DEF17);
 } 

/** 
* 设置自定义项17
*
* @param def17 自定义项17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( PGDHVO.DEF17,def17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getDef18 () {
return (String) this.getAttributeValue( PGDHVO.DEF18);
 } 

/** 
* 设置自定义项18
*
* @param def18 自定义项18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( PGDHVO.DEF18,def18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getDef19 () {
return (String) this.getAttributeValue( PGDHVO.DEF19);
 } 

/** 
* 设置自定义项19
*
* @param def19 自定义项19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( PGDHVO.DEF19,def19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getDef2 () {
return (String) this.getAttributeValue( PGDHVO.DEF2);
 } 

/** 
* 设置自定义项2
*
* @param def2 自定义项2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( PGDHVO.DEF2,def2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getDef20 () {
return (String) this.getAttributeValue( PGDHVO.DEF20);
 } 

/** 
* 设置自定义项20
*
* @param def20 自定义项20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( PGDHVO.DEF20,def20);
 } 

/** 
* 获取自定义项21
*
* @return 自定义项21
*/
public String getDef21 () {
return (String) this.getAttributeValue( PGDHVO.DEF21);
 } 

/** 
* 设置自定义项21
*
* @param def21 自定义项21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( PGDHVO.DEF21,def21);
 } 

/** 
* 获取自定义项22
*
* @return 自定义项22
*/
public String getDef22 () {
return (String) this.getAttributeValue( PGDHVO.DEF22);
 } 

/** 
* 设置自定义项22
*
* @param def22 自定义项22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( PGDHVO.DEF22,def22);
 } 

/** 
* 获取自定义项23
*
* @return 自定义项23
*/
public String getDef23 () {
return (String) this.getAttributeValue( PGDHVO.DEF23);
 } 

/** 
* 设置自定义项23
*
* @param def23 自定义项23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( PGDHVO.DEF23,def23);
 } 

/** 
* 获取自定义项24
*
* @return 自定义项24
*/
public String getDef24 () {
return (String) this.getAttributeValue( PGDHVO.DEF24);
 } 

/** 
* 设置自定义项24
*
* @param def24 自定义项24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( PGDHVO.DEF24,def24);
 } 

/** 
* 获取自定义项25
*
* @return 自定义项25
*/
public String getDef25 () {
return (String) this.getAttributeValue( PGDHVO.DEF25);
 } 

/** 
* 设置自定义项25
*
* @param def25 自定义项25
*/
public void setDef25 ( String def25) {
this.setAttributeValue( PGDHVO.DEF25,def25);
 } 

/** 
* 获取自定义项26
*
* @return 自定义项26
*/
public String getDef26 () {
return (String) this.getAttributeValue( PGDHVO.DEF26);
 } 

/** 
* 设置自定义项26
*
* @param def26 自定义项26
*/
public void setDef26 ( String def26) {
this.setAttributeValue( PGDHVO.DEF26,def26);
 } 

/** 
* 获取自定义项27
*
* @return 自定义项27
*/
public String getDef27 () {
return (String) this.getAttributeValue( PGDHVO.DEF27);
 } 

/** 
* 设置自定义项27
*
* @param def27 自定义项27
*/
public void setDef27 ( String def27) {
this.setAttributeValue( PGDHVO.DEF27,def27);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getDef3 () {
return (String) this.getAttributeValue( PGDHVO.DEF3);
 } 

/** 
* 设置自定义项3
*
* @param def3 自定义项3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( PGDHVO.DEF3,def3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getDef4 () {
return (String) this.getAttributeValue( PGDHVO.DEF4);
 } 

/** 
* 设置自定义项4
*
* @param def4 自定义项4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( PGDHVO.DEF4,def4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getDef5 () {
return (String) this.getAttributeValue( PGDHVO.DEF5);
 } 

/** 
* 设置自定义项5
*
* @param def5 自定义项5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( PGDHVO.DEF5,def5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getDef6 () {
return (String) this.getAttributeValue( PGDHVO.DEF6);
 } 

/** 
* 设置自定义项6
*
* @param def6 自定义项6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( PGDHVO.DEF6,def6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getDef7 () {
return (String) this.getAttributeValue( PGDHVO.DEF7);
 } 

/** 
* 设置自定义项7
*
* @param def7 自定义项7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( PGDHVO.DEF7,def7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getDef8 () {
return (String) this.getAttributeValue( PGDHVO.DEF8);
 } 

/** 
* 设置自定义项8
*
* @param def8 自定义项8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( PGDHVO.DEF8,def8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getDef9 () {
return (String) this.getAttributeValue( PGDHVO.DEF9);
 } 

/** 
* 设置自定义项9
*
* @param def9 自定义项9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( PGDHVO.DEF9,def9);
 } 

/** 
* 获取修订枚举
*
* @return 修订枚举
*/
public Integer getEmendenum () {
return (Integer) this.getAttributeValue( PGDHVO.EMENDENUM);
 } 

/** 
* 设置修订枚举
*
* @param emendenum 修订枚举
*/
public void setEmendenum ( Integer emendenum) {
this.setAttributeValue( PGDHVO.EMENDENUM,emendenum);
 } 

/** 
* 获取完工日期
*
* @return 完工日期
*/
public UFDateTime getFinishdate () {
return (UFDateTime) this.getAttributeValue( PGDHVO.FINISHDATE);
 } 

/** 
* 设置完工日期
*
* @param finishdate 完工日期
*/
public void setFinishdate ( UFDateTime finishdate) {
this.setAttributeValue( PGDHVO.FINISHDATE,finishdate);
 } 

/** 
* 获取工程单
*
* @return 工程单
*/
public UFBoolean getGcd () {
return this.gcd;
 } 

/** 
* 设置工程单
*
* @param gcd 工程单
*/
public void setGcd ( UFBoolean gcd) {
this.gcd=gcd;
 } 

/** 
* 获取工程内容
*
* @return 工程内容
*/
public String getGcnr () {
return (String) this.getAttributeValue( PGDHVO.GCNR);
 } 

/** 
* 设置工程内容
*
* @param gcnr 工程内容
*/
public void setGcnr ( String gcnr) {
this.setAttributeValue( PGDHVO.GCNR,gcnr);
 } 

/** 
* 获取工令
*
* @return 工令
*/
public String getGl () {
return (String) this.getAttributeValue( PGDHVO.GL);
 } 

/** 
* 设置工令
*
* @param gl 工令
*/
public void setGl ( String gl) {
this.setAttributeValue( PGDHVO.GL,gl);
 } 

/** 
* 获取工时
*
* @return 工时
*/
public UFDouble getGs () {
return (UFDouble) this.getAttributeValue( PGDHVO.GS);
 } 

/** 
* 设置工时
*
* @param gs 工时
*/
public void setGs ( UFDouble gs) {
this.setAttributeValue( PGDHVO.GS,gs);
 } 

/** 
* 获取工序
*
* @return 工序
*/
public String getGx () {
return (String) this.getAttributeValue( PGDHVO.GX);
 } 

/** 
* 设置工序
*
* @param gx 工序
*/
public void setGx ( String gx) {
this.setAttributeValue( PGDHVO.GX,gx);
 } 

/** 
* 获取工种
*
* @return 工种
*/
public String getGz () {
return (String) this.getAttributeValue( PGDHVO.GZ);
 } 

/** 
* 设置工种
*
* @param gz 工种
*/
public void setGz ( String gz) {
this.setAttributeValue( PGDHVO.GZ,gz);
 } 

/** 
* 获取故障维修记录单
*
* @return 故障维修记录单
*/
public UFBoolean getGzwxjld () {
return this.gzwxjld;
 } 

/** 
* 设置故障维修记录单
*
* @param gzwxjld 故障维修记录单
*/
public void setGzwxjld ( UFBoolean gzwxjld) {
this.gzwxjld=gzwxjld;
 } 

/** 
* 获取加工件数
*
* @return 加工件数
*/
public Integer getJgjs () {
return (Integer) this.getAttributeValue( PGDHVO.JGJS);
 } 

/** 
* 设置加工件数
*
* @param jgjs 加工件数
*/
public void setJgjs ( Integer jgjs) {
this.setAttributeValue( PGDHVO.JGJS,jgjs);
 } 

/** 
* 获取件号
*
* @return 件号
*/
public String getJh () {
return (String) this.getAttributeValue( PGDHVO.JH);
 } 

/** 
* 设置件号
*
* @param jh 件号
*/
public void setJh ( String jh) {
this.setAttributeValue( PGDHVO.JH,jh);
 } 

/** 
* 获取开发自定义项1
*
* @return 开发自定义项1
*/
public String getKdef1 () {
return (String) this.getAttributeValue( PGDHVO.KDEF1);
 } 

/** 
* 设置开发自定义项1
*
* @param kdef1 开发自定义项1
*/
public void setKdef1 ( String kdef1) {
this.setAttributeValue( PGDHVO.KDEF1,kdef1);
 } 

/** 
* 获取开发自定义项2
*
* @return 开发自定义项2
*/
public String getKdef2 () {
return (String) this.getAttributeValue( PGDHVO.KDEF2);
 } 

/** 
* 设置开发自定义项2
*
* @param kdef2 开发自定义项2
*/
public void setKdef2 ( String kdef2) {
this.setAttributeValue( PGDHVO.KDEF2,kdef2);
 } 

/** 
* 获取开发自定义项3
*
* @return 开发自定义项3
*/
public String getKdef3 () {
return (String) this.getAttributeValue( PGDHVO.KDEF3);
 } 

/** 
* 设置开发自定义项3
*
* @param kdef3 开发自定义项3
*/
public void setKdef3 ( String kdef3) {
this.setAttributeValue( PGDHVO.KDEF3,kdef3);
 } 

/** 
* 获取开发自定义项4
*
* @return 开发自定义项4
*/
public String getKdef4 () {
return (String) this.getAttributeValue( PGDHVO.KDEF4);
 } 

/** 
* 设置开发自定义项4
*
* @param kdef4 开发自定义项4
*/
public void setKdef4 ( String kdef4) {
this.setAttributeValue( PGDHVO.KDEF4,kdef4);
 } 

/** 
* 获取开发自定义项5
*
* @return 开发自定义项5
*/
public String getKdef5 () {
return (String) this.getAttributeValue( PGDHVO.KDEF5);
 } 

/** 
* 设置开发自定义项5
*
* @param kdef5 开发自定义项5
*/
public void setKdef5 ( String kdef5) {
this.setAttributeValue( PGDHVO.KDEF5,kdef5);
 } 

/** 
* 获取开票日期
*
* @return 开票日期
*/
public UFDate getKprq () {
return (UFDate) this.getAttributeValue( PGDHVO.KPRQ);
 } 

/** 
* 设置开票日期
*
* @param kprq 开票日期
*/
public void setKprq ( UFDate kprq) {
this.setAttributeValue( PGDHVO.KPRQ,kprq);
 } 

/** 
* 获取最后修改时间
*
* @return 最后修改时间
*/
public UFDateTime getLastmaketime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.LASTMAKETIME);
 } 

/** 
* 设置最后修改时间
*
* @param lastmaketime 最后修改时间
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.setAttributeValue( PGDHVO.LASTMAKETIME,lastmaketime);
 } 

/** 
* 获取零件名称
*
* @return 零件名称
*/
public String getLjmc () {
return (String) this.getAttributeValue( PGDHVO.LJMC);
 } 

/** 
* 设置零件名称
*
* @param ljmc 零件名称
*/
public void setLjmc ( String ljmc) {
this.setAttributeValue( PGDHVO.LJMC,ljmc);
 } 

/** 
* 获取制单时间
*
* @return 制单时间
*/
public UFDateTime getMaketime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.MAKETIME);
 } 

/** 
* 设置制单时间
*
* @param maketime 制单时间
*/
public void setMaketime ( UFDateTime maketime) {
this.setAttributeValue( PGDHVO.MAKETIME,maketime);
 } 

/** 
* 获取备注
*
* @return 备注
*/
public String getMemo () {
return (String) this.getAttributeValue( PGDHVO.MEMO);
 } 

/** 
* 设置备注
*
* @param memo 备注
*/
public void setMemo ( String memo) {
this.setAttributeValue( PGDHVO.MEMO,memo);
 } 

/** 
* 获取修改时间
*
* @return 修改时间
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.MODIFIEDTIME);
 } 

/** 
* 设置修改时间
*
* @param modifiedtime 修改时间
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( PGDHVO.MODIFIEDTIME,modifiedtime);
 } 

/** 
* 获取修改人
*
* @return 修改人
*/
public String getModifier () {
return (String) this.getAttributeValue( PGDHVO.MODIFIER);
 } 

/** 
* 设置修改人
*
* @param modifier 修改人
*/
public void setModifier ( String modifier) {
this.setAttributeValue( PGDHVO.MODIFIER,modifier);
 } 

/** 
* 获取name
*
* @return name
*/
public String getName () {
return (String) this.getAttributeValue( PGDHVO.NAME);
 } 

/** 
* 设置name
*
* @param name name
*/
public void setName ( String name) {
this.setAttributeValue( PGDHVO.NAME,name);
 } 

/** 
* 获取难易程度
*
* @return 难易程度
* @see String
*/
public String getNycd () {
return (String) this.getAttributeValue( PGDHVO.NYCD);
 } 

/** 
* 设置难易程度
*
* @param nycd 难易程度
* @see String
*/
public void setNycd ( String nycd) {
this.setAttributeValue( PGDHVO.NYCD,nycd);
 } 

/** 
* 获取人员
*
* @return 人员
*/
public String getPeople () {
return (String) this.getAttributeValue( PGDHVO.PEOPLE);
 } 

/** 
* 设置人员
*
* @param people 人员
*/
public void setPeople ( String people) {
this.setAttributeValue( PGDHVO.PEOPLE,people);
 } 

/** 
* 获取部门
*
* @return 部门
*/
public String getPgd_dept () {
return (String) this.getAttributeValue( PGDHVO.PGD_DEPT);
 } 

/** 
* 设置部门
*
* @param pgd_dept 部门
*/
public void setPgd_dept ( String pgd_dept) {
this.setAttributeValue( PGDHVO.PGD_DEPT,pgd_dept);
 } 

/** 
* 获取部门多版本
*
* @return 部门多版本
*/
public String getPgd_dept_v () {
return (String) this.getAttributeValue( PGDHVO.PGD_DEPT_V);
 } 

/** 
* 设置部门多版本
*
* @param pgd_dept_v 部门多版本
*/
public void setPgd_dept_v ( String pgd_dept_v) {
this.setAttributeValue( PGDHVO.PGD_DEPT_V,pgd_dept_v);
 } 

/** 
* 获取集团
*
* @return 集团
*/
public String getPk_group () {
return (String) this.getAttributeValue( PGDHVO.PK_GROUP);
 } 

/** 
* 设置集团
*
* @param pk_group 集团
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( PGDHVO.PK_GROUP,pk_group);
 } 

/** 
* 获取组织
*
* @return 组织
*/
public String getPk_org () {
return (String) this.getAttributeValue( PGDHVO.PK_ORG);
 } 

/** 
* 设置组织
*
* @param pk_org 组织
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( PGDHVO.PK_ORG,pk_org);
 } 

/** 
* 获取组织版本
*
* @return 组织版本
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( PGDHVO.PK_ORG_V);
 } 

/** 
* 设置组织版本
*
* @param pk_org_v 组织版本
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( PGDHVO.PK_ORG_V,pk_org_v);
 } 

/** 
* 获取派工卡主键
*
* @return 派工卡主键
*/
public String getPk_pgk_h () {
return this.pk_pgk_h;
 } 

/** 
* 设置派工卡主键
*
* @param pk_pgk_h 派工卡主键
*/
public void setPk_pgk_h ( String pk_pgk_h) {
this.pk_pgk_h=pk_pgk_h;
 } 

/** 
* 获取地点
*
* @return 地点
*/
public String getPlace () {
return (String) this.getAttributeValue( PGDHVO.PLACE);
 } 

/** 
* 设置地点
*
* @param place 地点
*/
public void setPlace ( String place) {
this.setAttributeValue( PGDHVO.PLACE,place);
 } 

/** 
* 获取临修器材消耗清单
*
* @return 临修器材消耗清单
*/
public UFBoolean getQcxhqd () {
return this.qcxhqd;
 } 

/** 
* 设置临修器材消耗清单
*
* @param qcxhqd 临修器材消耗清单
*/
public void setQcxhqd ( UFBoolean qcxhqd) {
this.qcxhqd=qcxhqd;
 } 

/** 
* 获取接收日期
*
* @return 接收日期
*/
public UFDateTime getReceivedtime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.RECEIVEDTIME);
 } 

/** 
* 设置接收日期
*
* @param receivedtime 接收日期
*/
public void setReceivedtime ( UFDateTime receivedtime) {
this.setAttributeValue( PGDHVO.RECEIVEDTIME,receivedtime);
 } 

/** 
* 获取生产处审定人
*
* @return 生产处审定人
*/
public String getSccsdr () {
return (String) this.getAttributeValue( PGDHVO.SCCSDR);
 } 

/** 
* 设置生产处审定人
*
* @param sccsdr 生产处审定人
*/
public void setSccsdr ( String sccsdr) {
this.setAttributeValue( PGDHVO.SCCSDR,sccsdr);
 } 

/** 
* 获取生产处审定日期
*
* @return 生产处审定日期
*/
public UFDateTime getSccsdsj () {
return (UFDateTime) this.getAttributeValue( PGDHVO.SCCSDSJ);
 } 

/** 
* 设置生产处审定日期
*
* @param sccsdsj 生产处审定日期
*/
public void setSccsdsj ( UFDateTime sccsdsj) {
this.setAttributeValue( PGDHVO.SCCSDSJ,sccsdsj);
 } 

/** 
* 获取生产处审核人
*
* @return 生产处审核人
*/
public String getSccshr () {
return (String) this.getAttributeValue( PGDHVO.SCCSHR);
 } 

/** 
* 设置生产处审核人
*
* @param sccshr 生产处审核人
*/
public void setSccshr ( String sccshr) {
this.setAttributeValue( PGDHVO.SCCSHR,sccshr);
 } 

/** 
* 获取生产处审核日期
*
* @return 生产处审核日期
*/
public UFDateTime getSccshsj () {
return (UFDateTime) this.getAttributeValue( PGDHVO.SCCSHSJ);
 } 

/** 
* 设置生产处审核日期
*
* @param sccshsj 生产处审核日期
*/
public void setSccshsj ( UFDateTime sccshsj) {
this.setAttributeValue( PGDHVO.SCCSHSJ,sccshsj);
 } 

/** 
* 获取接收人
*
* @return 接收人
*/
public String getSendee () {
return (String) this.getAttributeValue( PGDHVO.SENDEE);
 } 

/** 
* 设置接收人
*
* @param sendee 接收人
*/
public void setSendee ( String sendee) {
this.setAttributeValue( PGDHVO.SENDEE,sendee);
 } 

/** 
* 获取签发人
*
* @return 签发人
*/
public String getSigner () {
return (String) this.getAttributeValue( PGDHVO.SIGNER);
 } 

/** 
* 设置签发人
*
* @param signer 签发人
*/
public void setSigner ( String signer) {
this.setAttributeValue( PGDHVO.SIGNER,signer);
 } 

/** 
* 获取签发日期
*
* @return 签发日期
*/
public UFDateTime getSigntime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.SIGNTIME);
 } 

/** 
* 设置签发日期
*
* @param signtime 签发日期
*/
public void setSigntime ( UFDateTime signtime) {
this.setAttributeValue( PGDHVO.SIGNTIME,signtime);
 } 

/** 
* 获取来源单据表体id
*
* @return 来源单据表体id
*/
public String getSrcbillbodyid () {
return (String) this.getAttributeValue( PGDHVO.SRCBILLBODYID);
 } 

/** 
* 设置来源单据表体id
*
* @param srcbillbodyid 来源单据表体id
*/
public void setSrcbillbodyid ( String srcbillbodyid) {
this.setAttributeValue( PGDHVO.SRCBILLBODYID,srcbillbodyid);
 } 

/** 
* 获取来源单据id
*
* @return 来源单据id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( PGDHVO.SRCBILLID);
 } 

/** 
* 设置来源单据id
*
* @param srcbillid 来源单据id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( PGDHVO.SRCBILLID,srcbillid);
 } 

/** 
* 获取来源单据类型
*
* @return 来源单据类型
*/
public String getSrcbilltype () {
return (String) this.getAttributeValue( PGDHVO.SRCBILLTYPE);
 } 

/** 
* 设置来源单据类型
*
* @param srcbilltype 来源单据类型
*/
public void setSrcbilltype ( String srcbilltype) {
this.setAttributeValue( PGDHVO.SRCBILLTYPE,srcbilltype);
 } 

/** 
* 获取填报日期
*
* @return 填报日期
*/
public UFDateTime getTbtime () {
return (UFDateTime) this.getAttributeValue( PGDHVO.TBTIME);
 } 

/** 
* 设置填报日期
*
* @param tbtime 填报日期
*/
public void setTbtime ( UFDateTime tbtime) {
this.setAttributeValue( PGDHVO.TBTIME,tbtime);
 } 

/** 
* 获取投料件数
*
* @return 投料件数
*/
public Integer getTljs () {
return (Integer) this.getAttributeValue( PGDHVO.TLJS);
 } 

/** 
* 设置投料件数
*
* @param tljs 投料件数
*/
public void setTljs ( Integer tljs) {
this.setAttributeValue( PGDHVO.TLJS,tljs);
 } 

/** 
* 获取交易类型
*
* @return 交易类型
*/
public String getTranstype () {
return (String) this.getAttributeValue( PGDHVO.TRANSTYPE);
 } 

/** 
* 设置交易类型
*
* @param transtype 交易类型
*/
public void setTranstype ( String transtype) {
this.setAttributeValue( PGDHVO.TRANSTYPE,transtype);
 } 

/** 
* 获取交易类型pk
*
* @return 交易类型pk
*/
public String getTranstypepk () {
return (String) this.getAttributeValue( PGDHVO.TRANSTYPEPK);
 } 

/** 
* 设置交易类型pk
*
* @param transtypepk 交易类型pk
*/
public void setTranstypepk ( String transtypepk) {
this.setAttributeValue( PGDHVO.TRANSTYPEPK,transtypepk);
 } 

/** 
* 获取时间戳
*
* @return 时间戳
*/
public UFDateTime getTs () {
return this.ts;
 } 

/** 
* 设置时间戳
*
* @param ts 时间戳
*/
public void setTs ( UFDateTime ts) {
this.ts=ts;
 } 

/** 
* 获取完工验收单
*
* @return 完工验收单
*/
public UFBoolean getWgysd () {
return this.wgysd;
 } 

/** 
* 设置完工验收单
*
* @param wgysd 完工验收单
*/
public void setWgysd ( UFBoolean wgysd) {
this.wgysd=wgysd;
 } 

/** 
* 获取要求
*
* @return 要求
*/
public String getYq () {
return (String) this.getAttributeValue( PGDHVO.YQ);
 } 

/** 
* 设置要求
*
* @param yq 要求
*/
public void setYq ( String yq) {
this.setAttributeValue( PGDHVO.YQ,yq);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.PGDHVO");
  }
}