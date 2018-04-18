package nc.vo.plan.jx01;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class SGDHVO extends SuperVO {
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
*单据ID
*/
public static final String BILLID="billid";
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
*业务类型
*/
public static final String BUSITYPE="busitype";
/**
*出差地点
*/
public static final String CCDD="ccdd";
/**
*产品完工期
*/
public static final String CPWGDATE="cpwgdate";
/**
*创建时间
*/
public static final String CREATIONTIME="creationtime";
/**
*创建人
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
*订货单号
*/
public static final String DHDH="dhdh";
/**
*订货单位
*/
public static final String DHDW="dhdw";
/**
*订货数量
*/
public static final String DHSL="dhsl";
/**
*修订枚举
*/
public static final String EMENDENUM="emendenum";
/**
*工令号
*/
public static final String GL="gl";
/**
*结账地点
*/
public static final String JZDD="jzdd";
/**
*开工日期
*/
public static final String KGDATE="kgdate";
/**
*最后修改时间
*/
public static final String LASTMAKETIME="lastmaketime";
/**
*制单时间
*/
public static final String MAKETIME="maketime";
/**
*修改时间
*/
public static final String MODIFIEDTIME="modifiedtime";
/**
*修改人
*/
public static final String MODIFIER="modifier";
/**
*毛坯完工期
*/
public static final String MPWGDATE="mpwgdate";
/**
*部门
*/
public static final String PK_DEPT="pk_dept";
/**
*组织_部门版本信息
*/
public static final String PK_DEPT_V="pk_dept_v";
/**
*集团
*/
public static final String PK_GROUP="pk_group";
/**
*项目组织
*/
public static final String PK_ORG="pk_org";
/**
*项目组织
*/
public static final String PK_ORG_V="pk_org_v";
/**
*施工单主键
*/
public String pk_sgd_h;
/**
*施工依据
*/
public static final String SGYJ="sgyj";
/**
*实际合格期
*/
public static final String SJHGDATE="sjhgdate";
/**
*实际完工期
*/
public static final String SJWGDATE="sjwgdate";
/**
*实际验收期
*/
public static final String SJYSDATE="sjysdate";
/**
*来源单据id
*/
public static final String SRCBILLID="srcbillid";
/**
*来源单据表体id
*/
public static final String SRCBILLID_B="srcbillid_b";
/**
*来源单据类型
*/
public static final String SRCBILLTYPE="srcbilltype";
/**
*任务名称
*/
public static final String TASKNAME="taskname";
/**
*任务编号
*/
public static final String TASKNO="taskno";
/**
*定额工时总计
*/
public static final String TOTALGS="totalgs";
/**
*合计数量
*/
public static final String TOTALNUM="totalnum";
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
* 获取审批时间
*
* @return 审批时间
*/
public UFDateTime getApprovedate () {
return (UFDateTime) this.getAttributeValue( SGDHVO.APPROVEDATE);
 } 

/** 
* 设置审批时间
*
* @param approvedate 审批时间
*/
public void setApprovedate ( UFDateTime approvedate) {
this.setAttributeValue( SGDHVO.APPROVEDATE,approvedate);
 } 

/** 
* 获取审批批语
*
* @return 审批批语
*/
public String getApprovenote () {
return (String) this.getAttributeValue( SGDHVO.APPROVENOTE);
 } 

/** 
* 设置审批批语
*
* @param approvenote 审批批语
*/
public void setApprovenote ( String approvenote) {
this.setAttributeValue( SGDHVO.APPROVENOTE,approvenote);
 } 

/** 
* 获取审批人
*
* @return 审批人
*/
public String getApprover () {
return (String) this.getAttributeValue( SGDHVO.APPROVER);
 } 

/** 
* 设置审批人
*
* @param approver 审批人
*/
public void setApprover ( String approver) {
this.setAttributeValue( SGDHVO.APPROVER,approver);
 } 

/** 
* 获取审批状态
*
* @return 审批状态
* @see String
*/
public Integer getApprovestatus () {
return (Integer) this.getAttributeValue( SGDHVO.APPROVESTATUS);
 } 

/** 
* 设置审批状态
*
* @param approvestatus 审批状态
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.setAttributeValue( SGDHVO.APPROVESTATUS,approvestatus);
 } 

/** 
* 获取单据日期
*
* @return 单据日期
*/
public UFDate getBilldate () {
return (UFDate) this.getAttributeValue( SGDHVO.BILLDATE);
 } 

/** 
* 设置单据日期
*
* @param billdate 单据日期
*/
public void setBilldate ( UFDate billdate) {
this.setAttributeValue( SGDHVO.BILLDATE,billdate);
 } 

/** 
* 获取单据ID
*
* @return 单据ID
*/
public String getBillid () {
return (String) this.getAttributeValue( SGDHVO.BILLID);
 } 

/** 
* 设置单据ID
*
* @param billid 单据ID
*/
public void setBillid ( String billid) {
this.setAttributeValue( SGDHVO.BILLID,billid);
 } 

/** 
* 获取制单人
*
* @return 制单人
*/
public String getBillmaker () {
return (String) this.getAttributeValue( SGDHVO.BILLMAKER);
 } 

/** 
* 设置制单人
*
* @param billmaker 制单人
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( SGDHVO.BILLMAKER,billmaker);
 } 

/** 
* 获取单据号
*
* @return 单据号
*/
public String getBillno () {
return (String) this.getAttributeValue( SGDHVO.BILLNO);
 } 

/** 
* 设置单据号
*
* @param billno 单据号
*/
public void setBillno ( String billno) {
this.setAttributeValue( SGDHVO.BILLNO,billno);
 } 

/** 
* 获取单据类型
*
* @return 单据类型
*/
public String getBilltype () {
return (String) this.getAttributeValue( SGDHVO.BILLTYPE);
 } 

/** 
* 设置单据类型
*
* @param billtype 单据类型
*/
public void setBilltype ( String billtype) {
this.setAttributeValue( SGDHVO.BILLTYPE,billtype);
 } 

/** 
* 获取单据版本pk
*
* @return 单据版本pk
*/
public String getBillversionpk () {
return (String) this.getAttributeValue( SGDHVO.BILLVERSIONPK);
 } 

/** 
* 设置单据版本pk
*
* @param billversionpk 单据版本pk
*/
public void setBillversionpk ( String billversionpk) {
this.setAttributeValue( SGDHVO.BILLVERSIONPK,billversionpk);
 } 

/** 
* 获取业务类型
*
* @return 业务类型
*/
public String getBusitype () {
return (String) this.getAttributeValue( SGDHVO.BUSITYPE);
 } 

/** 
* 设置业务类型
*
* @param busitype 业务类型
*/
public void setBusitype ( String busitype) {
this.setAttributeValue( SGDHVO.BUSITYPE,busitype);
 } 

/** 
* 获取出差地点
*
* @return 出差地点
*/
public String getCcdd () {
return (String) this.getAttributeValue( SGDHVO.CCDD);
 } 

/** 
* 设置出差地点
*
* @param ccdd 出差地点
*/
public void setCcdd ( String ccdd) {
this.setAttributeValue( SGDHVO.CCDD,ccdd);
 } 

/** 
* 获取产品完工期
*
* @return 产品完工期
*/
public UFDate getCpwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO.CPWGDATE);
 } 

/** 
* 设置产品完工期
*
* @param cpwgdate 产品完工期
*/
public void setCpwgdate ( UFDate cpwgdate) {
this.setAttributeValue( SGDHVO.CPWGDATE,cpwgdate);
 } 

/** 
* 获取创建时间
*
* @return 创建时间
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( SGDHVO.CREATIONTIME);
 } 

/** 
* 设置创建时间
*
* @param creationtime 创建时间
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( SGDHVO.CREATIONTIME,creationtime);
 } 

/** 
* 获取创建人
*
* @return 创建人
*/
public String getCreator () {
return (String) this.getAttributeValue( SGDHVO.CREATOR);
 } 

/** 
* 设置创建人
*
* @param creator 创建人
*/
public void setCreator ( String creator) {
this.setAttributeValue( SGDHVO.CREATOR,creator);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getDef1 () {
return (String) this.getAttributeValue( SGDHVO.DEF1);
 } 

/** 
* 设置自定义项1
*
* @param def1 自定义项1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( SGDHVO.DEF1,def1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getDef10 () {
return (String) this.getAttributeValue( SGDHVO.DEF10);
 } 

/** 
* 设置自定义项10
*
* @param def10 自定义项10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( SGDHVO.DEF10,def10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getDef11 () {
return (String) this.getAttributeValue( SGDHVO.DEF11);
 } 

/** 
* 设置自定义项11
*
* @param def11 自定义项11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( SGDHVO.DEF11,def11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getDef12 () {
return (String) this.getAttributeValue( SGDHVO.DEF12);
 } 

/** 
* 设置自定义项12
*
* @param def12 自定义项12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( SGDHVO.DEF12,def12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getDef13 () {
return (String) this.getAttributeValue( SGDHVO.DEF13);
 } 

/** 
* 设置自定义项13
*
* @param def13 自定义项13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( SGDHVO.DEF13,def13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getDef14 () {
return (String) this.getAttributeValue( SGDHVO.DEF14);
 } 

/** 
* 设置自定义项14
*
* @param def14 自定义项14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( SGDHVO.DEF14,def14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getDef15 () {
return (String) this.getAttributeValue( SGDHVO.DEF15);
 } 

/** 
* 设置自定义项15
*
* @param def15 自定义项15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( SGDHVO.DEF15,def15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getDef16 () {
return (String) this.getAttributeValue( SGDHVO.DEF16);
 } 

/** 
* 设置自定义项16
*
* @param def16 自定义项16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( SGDHVO.DEF16,def16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getDef17 () {
return (String) this.getAttributeValue( SGDHVO.DEF17);
 } 

/** 
* 设置自定义项17
*
* @param def17 自定义项17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( SGDHVO.DEF17,def17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getDef18 () {
return (String) this.getAttributeValue( SGDHVO.DEF18);
 } 

/** 
* 设置自定义项18
*
* @param def18 自定义项18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( SGDHVO.DEF18,def18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getDef19 () {
return (String) this.getAttributeValue( SGDHVO.DEF19);
 } 

/** 
* 设置自定义项19
*
* @param def19 自定义项19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( SGDHVO.DEF19,def19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getDef2 () {
return (String) this.getAttributeValue( SGDHVO.DEF2);
 } 

/** 
* 设置自定义项2
*
* @param def2 自定义项2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( SGDHVO.DEF2,def2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getDef20 () {
return (String) this.getAttributeValue( SGDHVO.DEF20);
 } 

/** 
* 设置自定义项20
*
* @param def20 自定义项20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( SGDHVO.DEF20,def20);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getDef3 () {
return (String) this.getAttributeValue( SGDHVO.DEF3);
 } 

/** 
* 设置自定义项3
*
* @param def3 自定义项3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( SGDHVO.DEF3,def3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getDef4 () {
return (String) this.getAttributeValue( SGDHVO.DEF4);
 } 

/** 
* 设置自定义项4
*
* @param def4 自定义项4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( SGDHVO.DEF4,def4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getDef5 () {
return (String) this.getAttributeValue( SGDHVO.DEF5);
 } 

/** 
* 设置自定义项5
*
* @param def5 自定义项5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( SGDHVO.DEF5,def5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getDef6 () {
return (String) this.getAttributeValue( SGDHVO.DEF6);
 } 

/** 
* 设置自定义项6
*
* @param def6 自定义项6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( SGDHVO.DEF6,def6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getDef7 () {
return (String) this.getAttributeValue( SGDHVO.DEF7);
 } 

/** 
* 设置自定义项7
*
* @param def7 自定义项7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( SGDHVO.DEF7,def7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getDef8 () {
return (String) this.getAttributeValue( SGDHVO.DEF8);
 } 

/** 
* 设置自定义项8
*
* @param def8 自定义项8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( SGDHVO.DEF8,def8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getDef9 () {
return (String) this.getAttributeValue( SGDHVO.DEF9);
 } 

/** 
* 设置自定义项9
*
* @param def9 自定义项9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( SGDHVO.DEF9,def9);
 } 

/** 
* 获取订货单号
*
* @return 订货单号
*/
public String getDhdh () {
return (String) this.getAttributeValue( SGDHVO.DHDH);
 } 

/** 
* 设置订货单号
*
* @param dhdh 订货单号
*/
public void setDhdh ( String dhdh) {
this.setAttributeValue( SGDHVO.DHDH,dhdh);
 } 

/** 
* 获取订货单位
*
* @return 订货单位
*/
public String getDhdw () {
return (String) this.getAttributeValue( SGDHVO.DHDW);
 } 

/** 
* 设置订货单位
*
* @param dhdw 订货单位
*/
public void setDhdw ( String dhdw) {
this.setAttributeValue( SGDHVO.DHDW,dhdw);
 } 

/** 
* 获取订货数量
*
* @return 订货数量
*/
public UFDouble getDhsl () {
return (UFDouble) this.getAttributeValue( SGDHVO.DHSL);
 } 

/** 
* 设置订货数量
*
* @param dhsl 订货数量
*/
public void setDhsl ( UFDouble dhsl) {
this.setAttributeValue( SGDHVO.DHSL,dhsl);
 } 

/** 
* 获取修订枚举
*
* @return 修订枚举
*/
public Integer getEmendenum () {
return (Integer) this.getAttributeValue( SGDHVO.EMENDENUM);
 } 

/** 
* 设置修订枚举
*
* @param emendenum 修订枚举
*/
public void setEmendenum ( Integer emendenum) {
this.setAttributeValue( SGDHVO.EMENDENUM,emendenum);
 } 

/** 
* 获取工令号
*
* @return 工令号
*/
public String getGl () {
return (String) this.getAttributeValue( SGDHVO.GL);
 } 

/** 
* 设置工令号
*
* @param gl 工令号
*/
public void setGl ( String gl) {
this.setAttributeValue( SGDHVO.GL,gl);
 } 

/** 
* 获取结账地点
*
* @return 结账地点
*/
public String getJzdd () {
return (String) this.getAttributeValue( SGDHVO.JZDD);
 } 

/** 
* 设置结账地点
*
* @param jzdd 结账地点
*/
public void setJzdd ( String jzdd) {
this.setAttributeValue( SGDHVO.JZDD,jzdd);
 } 

/** 
* 获取开工日期
*
* @return 开工日期
*/
public UFDate getKgdate () {
return (UFDate) this.getAttributeValue( SGDHVO.KGDATE);
 } 

/** 
* 设置开工日期
*
* @param kgdate 开工日期
*/
public void setKgdate ( UFDate kgdate) {
this.setAttributeValue( SGDHVO.KGDATE,kgdate);
 } 

/** 
* 获取最后修改时间
*
* @return 最后修改时间
*/
public UFDateTime getLastmaketime () {
return (UFDateTime) this.getAttributeValue( SGDHVO.LASTMAKETIME);
 } 

/** 
* 设置最后修改时间
*
* @param lastmaketime 最后修改时间
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.setAttributeValue( SGDHVO.LASTMAKETIME,lastmaketime);
 } 

/** 
* 获取制单时间
*
* @return 制单时间
*/
public UFDateTime getMaketime () {
return (UFDateTime) this.getAttributeValue( SGDHVO.MAKETIME);
 } 

/** 
* 设置制单时间
*
* @param maketime 制单时间
*/
public void setMaketime ( UFDateTime maketime) {
this.setAttributeValue( SGDHVO.MAKETIME,maketime);
 } 

/** 
* 获取修改时间
*
* @return 修改时间
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( SGDHVO.MODIFIEDTIME);
 } 

/** 
* 设置修改时间
*
* @param modifiedtime 修改时间
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( SGDHVO.MODIFIEDTIME,modifiedtime);
 } 

/** 
* 获取修改人
*
* @return 修改人
*/
public String getModifier () {
return (String) this.getAttributeValue( SGDHVO.MODIFIER);
 } 

/** 
* 设置修改人
*
* @param modifier 修改人
*/
public void setModifier ( String modifier) {
this.setAttributeValue( SGDHVO.MODIFIER,modifier);
 } 

/** 
* 获取毛坯完工期
*
* @return 毛坯完工期
*/
public UFDate getMpwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO.MPWGDATE);
 } 

/** 
* 设置毛坯完工期
*
* @param mpwgdate 毛坯完工期
*/
public void setMpwgdate ( UFDate mpwgdate) {
this.setAttributeValue( SGDHVO.MPWGDATE,mpwgdate);
 } 

/** 
* 获取部门
*
* @return 部门
*/
public String getPk_dept () {
return (String) this.getAttributeValue( SGDHVO.PK_DEPT);
 } 

/** 
* 设置部门
*
* @param pk_dept 部门
*/
public void setPk_dept ( String pk_dept) {
this.setAttributeValue( SGDHVO.PK_DEPT,pk_dept);
 } 

/** 
* 获取组织_部门版本信息
*
* @return 组织_部门版本信息
*/
public String getPk_dept_v () {
return (String) this.getAttributeValue( SGDHVO.PK_DEPT_V);
 } 

/** 
* 设置组织_部门版本信息
*
* @param pk_dept_v 组织_部门版本信息
*/
public void setPk_dept_v ( String pk_dept_v) {
this.setAttributeValue( SGDHVO.PK_DEPT_V,pk_dept_v);
 } 

/** 
* 获取集团
*
* @return 集团
*/
public String getPk_group () {
return (String) this.getAttributeValue( SGDHVO.PK_GROUP);
 } 

/** 
* 设置集团
*
* @param pk_group 集团
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( SGDHVO.PK_GROUP,pk_group);
 } 

/** 
* 获取项目组织
*
* @return 项目组织
*/
public String getPk_org () {
return (String) this.getAttributeValue( SGDHVO.PK_ORG);
 } 

/** 
* 设置项目组织
*
* @param pk_org 项目组织
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( SGDHVO.PK_ORG,pk_org);
 } 

/** 
* 获取项目组织
*
* @return 项目组织
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( SGDHVO.PK_ORG_V);
 } 

/** 
* 设置项目组织
*
* @param pk_org_v 项目组织
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( SGDHVO.PK_ORG_V,pk_org_v);
 } 

/** 
* 获取施工单主键
*
* @return 施工单主键
*/
public String getPk_sgd_h () {
return this.pk_sgd_h;
 } 

/** 
* 设置施工单主键
*
* @param pk_sgd_h 施工单主键
*/
public void setPk_sgd_h ( String pk_sgd_h) {
this.pk_sgd_h=pk_sgd_h;
 } 

/** 
* 获取施工依据
*
* @return 施工依据
*/
public String getSgyj () {
return (String) this.getAttributeValue( SGDHVO.SGYJ);
 } 

/** 
* 设置施工依据
*
* @param sgyj 施工依据
*/
public void setSgyj ( String sgyj) {
this.setAttributeValue( SGDHVO.SGYJ,sgyj);
 } 

/** 
* 获取实际合格期
*
* @return 实际合格期
*/
public UFDate getSjhgdate () {
return (UFDate) this.getAttributeValue( SGDHVO.SJHGDATE);
 } 

/** 
* 设置实际合格期
*
* @param sjhgdate 实际合格期
*/
public void setSjhgdate ( UFDate sjhgdate) {
this.setAttributeValue( SGDHVO.SJHGDATE,sjhgdate);
 } 

/** 
* 获取实际完工期
*
* @return 实际完工期
*/
public UFDate getSjwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO.SJWGDATE);
 } 

/** 
* 设置实际完工期
*
* @param sjwgdate 实际完工期
*/
public void setSjwgdate ( UFDate sjwgdate) {
this.setAttributeValue( SGDHVO.SJWGDATE,sjwgdate);
 } 

/** 
* 获取实际验收期
*
* @return 实际验收期
*/
public UFDate getSjysdate () {
return (UFDate) this.getAttributeValue( SGDHVO.SJYSDATE);
 } 

/** 
* 设置实际验收期
*
* @param sjysdate 实际验收期
*/
public void setSjysdate ( UFDate sjysdate) {
this.setAttributeValue( SGDHVO.SJYSDATE,sjysdate);
 } 

/** 
* 获取来源单据id
*
* @return 来源单据id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( SGDHVO.SRCBILLID);
 } 

/** 
* 设置来源单据id
*
* @param srcbillid 来源单据id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( SGDHVO.SRCBILLID,srcbillid);
 } 

/** 
* 获取来源单据表体id
*
* @return 来源单据表体id
*/
public String getSrcbillid_b () {
return (String) this.getAttributeValue( SGDHVO.SRCBILLID_B);
 } 

/** 
* 设置来源单据表体id
*
* @param srcbillid_b 来源单据表体id
*/
public void setSrcbillid_b ( String srcbillid_b) {
this.setAttributeValue( SGDHVO.SRCBILLID_B,srcbillid_b);
 } 

/** 
* 获取来源单据类型
*
* @return 来源单据类型
*/
public String getSrcbilltype () {
return (String) this.getAttributeValue( SGDHVO.SRCBILLTYPE);
 } 

/** 
* 设置来源单据类型
*
* @param srcbilltype 来源单据类型
*/
public void setSrcbilltype ( String srcbilltype) {
this.setAttributeValue( SGDHVO.SRCBILLTYPE,srcbilltype);
 } 

/** 
* 获取任务名称
*
* @return 任务名称
*/
public String getTaskname () {
return (String) this.getAttributeValue( SGDHVO.TASKNAME);
 } 

/** 
* 设置任务名称
*
* @param taskname 任务名称
*/
public void setTaskname ( String taskname) {
this.setAttributeValue( SGDHVO.TASKNAME,taskname);
 } 

/** 
* 获取任务编号
*
* @return 任务编号
*/
public String getTaskno () {
return (String) this.getAttributeValue( SGDHVO.TASKNO);
 } 

/** 
* 设置任务编号
*
* @param taskno 任务编号
*/
public void setTaskno ( String taskno) {
this.setAttributeValue( SGDHVO.TASKNO,taskno);
 } 

/** 
* 获取定额工时总计
*
* @return 定额工时总计
*/
public UFDouble getTotalgs () {
return (UFDouble) this.getAttributeValue( SGDHVO.TOTALGS);
 } 

/** 
* 设置定额工时总计
*
* @param totalgs 定额工时总计
*/
public void setTotalgs ( UFDouble totalgs) {
this.setAttributeValue( SGDHVO.TOTALGS,totalgs);
 } 

/** 
* 获取合计数量
*
* @return 合计数量
*/
public UFDouble getTotalnum () {
return (UFDouble) this.getAttributeValue( SGDHVO.TOTALNUM);
 } 

/** 
* 设置合计数量
*
* @param totalnum 合计数量
*/
public void setTotalnum ( UFDouble totalnum) {
this.setAttributeValue( SGDHVO.TOTALNUM,totalnum);
 } 

/** 
* 获取交易类型
*
* @return 交易类型
*/
public String getTranstype () {
return (String) this.getAttributeValue( SGDHVO.TRANSTYPE);
 } 

/** 
* 设置交易类型
*
* @param transtype 交易类型
*/
public void setTranstype ( String transtype) {
this.setAttributeValue( SGDHVO.TRANSTYPE,transtype);
 } 

/** 
* 获取交易类型pk
*
* @return 交易类型pk
*/
public String getTranstypepk () {
return (String) this.getAttributeValue( SGDHVO.TRANSTYPEPK);
 } 

/** 
* 设置交易类型pk
*
* @param transtypepk 交易类型pk
*/
public void setTranstypepk ( String transtypepk) {
this.setAttributeValue( SGDHVO.TRANSTYPEPK,transtypepk);
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


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.SGDHVO");
  }
}