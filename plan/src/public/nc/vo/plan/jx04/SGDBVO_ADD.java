package nc.vo.plan.jx04;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class SGDBVO_ADD extends SuperVO {
/**
*增补工时
*/
public static final String ADDHOURS="addhours";
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
*备注
*/
public static final String BZ="bz";
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
*部门
*/
public static final String DEPT="dept";
/**
*单据日期
*/
public static final String DJDATE="djdate";
/**
*修订枚举
*/
public static final String EMENDENUM="emendenum";
/**
*工时
*/
public static final String GS="gs";
/**
*工种
*/
public static final String GZ="gz";
/**
*是否外扩外协
*/
public static final String ISEXT="isext";
/**
*是否主工种
*/
public static final String ISMAIN="ismain";
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
*施工增补单明细主键
*/
public String pk_sgd_add_b;
/**
*上层单据主键
*/
public String pk_sgd_add_h;
/**
*行号
*/
public static final String ROWNO="rowno";
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
* 获取增补工时
*
* @return 增补工时
*/
public UFDouble getAddhours () {
return (UFDouble) this.getAttributeValue( SGDBVO_ADD.ADDHOURS);
 } 

/** 
* 设置增补工时
*
* @param addhours 增补工时
*/
public void setAddhours ( UFDouble addhours) {
this.setAttributeValue( SGDBVO_ADD.ADDHOURS,addhours);
 } 

/** 
* 获取审批时间
*
* @return 审批时间
*/
public UFDateTime getApprovedate () {
return (UFDateTime) this.getAttributeValue( SGDBVO_ADD.APPROVEDATE);
 } 

/** 
* 设置审批时间
*
* @param approvedate 审批时间
*/
public void setApprovedate ( UFDateTime approvedate) {
this.setAttributeValue( SGDBVO_ADD.APPROVEDATE,approvedate);
 } 

/** 
* 获取审批批语
*
* @return 审批批语
*/
public String getApprovenote () {
return (String) this.getAttributeValue( SGDBVO_ADD.APPROVENOTE);
 } 

/** 
* 设置审批批语
*
* @param approvenote 审批批语
*/
public void setApprovenote ( String approvenote) {
this.setAttributeValue( SGDBVO_ADD.APPROVENOTE,approvenote);
 } 

/** 
* 获取审批人
*
* @return 审批人
*/
public String getApprover () {
return (String) this.getAttributeValue( SGDBVO_ADD.APPROVER);
 } 

/** 
* 设置审批人
*
* @param approver 审批人
*/
public void setApprover ( String approver) {
this.setAttributeValue( SGDBVO_ADD.APPROVER,approver);
 } 

/** 
* 获取审批状态
*
* @return 审批状态
* @see String
*/
public Integer getApprovestatus () {
return (Integer) this.getAttributeValue( SGDBVO_ADD.APPROVESTATUS);
 } 

/** 
* 设置审批状态
*
* @param approvestatus 审批状态
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.setAttributeValue( SGDBVO_ADD.APPROVESTATUS,approvestatus);
 } 

/** 
* 获取单据ID
*
* @return 单据ID
*/
public String getBillid () {
return (String) this.getAttributeValue( SGDBVO_ADD.BILLID);
 } 

/** 
* 设置单据ID
*
* @param billid 单据ID
*/
public void setBillid ( String billid) {
this.setAttributeValue( SGDBVO_ADD.BILLID,billid);
 } 

/** 
* 获取制单人
*
* @return 制单人
*/
public String getBillmaker () {
return (String) this.getAttributeValue( SGDBVO_ADD.BILLMAKER);
 } 

/** 
* 设置制单人
*
* @param billmaker 制单人
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( SGDBVO_ADD.BILLMAKER,billmaker);
 } 

/** 
* 获取单据号
*
* @return 单据号
*/
public String getBillno () {
return (String) this.getAttributeValue( SGDBVO_ADD.BILLNO);
 } 

/** 
* 设置单据号
*
* @param billno 单据号
*/
public void setBillno ( String billno) {
this.setAttributeValue( SGDBVO_ADD.BILLNO,billno);
 } 

/** 
* 获取单据类型
*
* @return 单据类型
*/
public String getBilltype () {
return (String) this.getAttributeValue( SGDBVO_ADD.BILLTYPE);
 } 

/** 
* 设置单据类型
*
* @param billtype 单据类型
*/
public void setBilltype ( String billtype) {
this.setAttributeValue( SGDBVO_ADD.BILLTYPE,billtype);
 } 

/** 
* 获取单据版本pk
*
* @return 单据版本pk
*/
public String getBillversionpk () {
return (String) this.getAttributeValue( SGDBVO_ADD.BILLVERSIONPK);
 } 

/** 
* 设置单据版本pk
*
* @param billversionpk 单据版本pk
*/
public void setBillversionpk ( String billversionpk) {
this.setAttributeValue( SGDBVO_ADD.BILLVERSIONPK,billversionpk);
 } 

/** 
* 获取业务类型
*
* @return 业务类型
*/
public String getBusitype () {
return (String) this.getAttributeValue( SGDBVO_ADD.BUSITYPE);
 } 

/** 
* 设置业务类型
*
* @param busitype 业务类型
*/
public void setBusitype ( String busitype) {
this.setAttributeValue( SGDBVO_ADD.BUSITYPE,busitype);
 } 

/** 
* 获取备注
*
* @return 备注
*/
public String getBz () {
return (String) this.getAttributeValue( SGDBVO_ADD.BZ);
 } 

/** 
* 设置备注
*
* @param bz 备注
*/
public void setBz ( String bz) {
this.setAttributeValue( SGDBVO_ADD.BZ,bz);
 } 

/** 
* 获取创建时间
*
* @return 创建时间
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( SGDBVO_ADD.CREATIONTIME);
 } 

/** 
* 设置创建时间
*
* @param creationtime 创建时间
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( SGDBVO_ADD.CREATIONTIME,creationtime);
 } 

/** 
* 获取创建人
*
* @return 创建人
*/
public String getCreator () {
return (String) this.getAttributeValue( SGDBVO_ADD.CREATOR);
 } 

/** 
* 设置创建人
*
* @param creator 创建人
*/
public void setCreator ( String creator) {
this.setAttributeValue( SGDBVO_ADD.CREATOR,creator);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getDef1 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF1);
 } 

/** 
* 设置自定义项1
*
* @param def1 自定义项1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( SGDBVO_ADD.DEF1,def1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getDef10 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF10);
 } 

/** 
* 设置自定义项10
*
* @param def10 自定义项10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( SGDBVO_ADD.DEF10,def10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getDef11 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF11);
 } 

/** 
* 设置自定义项11
*
* @param def11 自定义项11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( SGDBVO_ADD.DEF11,def11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getDef12 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF12);
 } 

/** 
* 设置自定义项12
*
* @param def12 自定义项12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( SGDBVO_ADD.DEF12,def12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getDef13 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF13);
 } 

/** 
* 设置自定义项13
*
* @param def13 自定义项13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( SGDBVO_ADD.DEF13,def13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getDef14 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF14);
 } 

/** 
* 设置自定义项14
*
* @param def14 自定义项14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( SGDBVO_ADD.DEF14,def14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getDef15 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF15);
 } 

/** 
* 设置自定义项15
*
* @param def15 自定义项15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( SGDBVO_ADD.DEF15,def15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getDef16 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF16);
 } 

/** 
* 设置自定义项16
*
* @param def16 自定义项16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( SGDBVO_ADD.DEF16,def16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getDef17 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF17);
 } 

/** 
* 设置自定义项17
*
* @param def17 自定义项17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( SGDBVO_ADD.DEF17,def17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getDef18 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF18);
 } 

/** 
* 设置自定义项18
*
* @param def18 自定义项18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( SGDBVO_ADD.DEF18,def18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getDef19 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF19);
 } 

/** 
* 设置自定义项19
*
* @param def19 自定义项19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( SGDBVO_ADD.DEF19,def19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getDef2 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF2);
 } 

/** 
* 设置自定义项2
*
* @param def2 自定义项2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( SGDBVO_ADD.DEF2,def2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getDef20 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF20);
 } 

/** 
* 设置自定义项20
*
* @param def20 自定义项20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( SGDBVO_ADD.DEF20,def20);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getDef3 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF3);
 } 

/** 
* 设置自定义项3
*
* @param def3 自定义项3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( SGDBVO_ADD.DEF3,def3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getDef4 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF4);
 } 

/** 
* 设置自定义项4
*
* @param def4 自定义项4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( SGDBVO_ADD.DEF4,def4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getDef5 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF5);
 } 

/** 
* 设置自定义项5
*
* @param def5 自定义项5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( SGDBVO_ADD.DEF5,def5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getDef6 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF6);
 } 

/** 
* 设置自定义项6
*
* @param def6 自定义项6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( SGDBVO_ADD.DEF6,def6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getDef7 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF7);
 } 

/** 
* 设置自定义项7
*
* @param def7 自定义项7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( SGDBVO_ADD.DEF7,def7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getDef8 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF8);
 } 

/** 
* 设置自定义项8
*
* @param def8 自定义项8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( SGDBVO_ADD.DEF8,def8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getDef9 () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEF9);
 } 

/** 
* 设置自定义项9
*
* @param def9 自定义项9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( SGDBVO_ADD.DEF9,def9);
 } 

/** 
* 获取部门
*
* @return 部门
*/
public String getDept () {
return (String) this.getAttributeValue( SGDBVO_ADD.DEPT);
 } 

/** 
* 设置部门
*
* @param dept 部门
*/
public void setDept ( String dept) {
this.setAttributeValue( SGDBVO_ADD.DEPT,dept);
 } 

/** 
* 获取单据日期
*
* @return 单据日期
*/
public UFDate getDjdate () {
return (UFDate) this.getAttributeValue( SGDBVO_ADD.DJDATE);
 } 

/** 
* 设置单据日期
*
* @param djdate 单据日期
*/
public void setDjdate ( UFDate djdate) {
this.setAttributeValue( SGDBVO_ADD.DJDATE,djdate);
 } 

/** 
* 获取修订枚举
*
* @return 修订枚举
*/
public Integer getEmendenum () {
return (Integer) this.getAttributeValue( SGDBVO_ADD.EMENDENUM);
 } 

/** 
* 设置修订枚举
*
* @param emendenum 修订枚举
*/
public void setEmendenum ( Integer emendenum) {
this.setAttributeValue( SGDBVO_ADD.EMENDENUM,emendenum);
 } 

/** 
* 获取工时
*
* @return 工时
*/
public UFDouble getGs () {
return (UFDouble) this.getAttributeValue( SGDBVO_ADD.GS);
 } 

/** 
* 设置工时
*
* @param gs 工时
*/
public void setGs ( UFDouble gs) {
this.setAttributeValue( SGDBVO_ADD.GS,gs);
 } 

/** 
* 获取工种
*
* @return 工种
*/
public String getGz () {
return (String) this.getAttributeValue( SGDBVO_ADD.GZ);
 } 

/** 
* 设置工种
*
* @param gz 工种
*/
public void setGz ( String gz) {
this.setAttributeValue( SGDBVO_ADD.GZ,gz);
 } 

/** 
* 获取是否外扩外协
*
* @return 是否外扩外协
*/
public UFBoolean getIsext () {
return (UFBoolean) this.getAttributeValue( SGDBVO_ADD.ISEXT);
 } 

/** 
* 设置是否外扩外协
*
* @param isext 是否外扩外协
*/
public void setIsext ( UFBoolean isext) {
this.setAttributeValue( SGDBVO_ADD.ISEXT,isext);
 } 

/** 
* 获取是否主工种
*
* @return 是否主工种
*/
public UFBoolean getIsmain () {
return (UFBoolean) this.getAttributeValue( SGDBVO_ADD.ISMAIN);
 } 

/** 
* 设置是否主工种
*
* @param ismain 是否主工种
*/
public void setIsmain ( UFBoolean ismain) {
this.setAttributeValue( SGDBVO_ADD.ISMAIN,ismain);
 } 

/** 
* 获取最后修改时间
*
* @return 最后修改时间
*/
public UFDateTime getLastmaketime () {
return (UFDateTime) this.getAttributeValue( SGDBVO_ADD.LASTMAKETIME);
 } 

/** 
* 设置最后修改时间
*
* @param lastmaketime 最后修改时间
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.setAttributeValue( SGDBVO_ADD.LASTMAKETIME,lastmaketime);
 } 

/** 
* 获取制单时间
*
* @return 制单时间
*/
public UFDateTime getMaketime () {
return (UFDateTime) this.getAttributeValue( SGDBVO_ADD.MAKETIME);
 } 

/** 
* 设置制单时间
*
* @param maketime 制单时间
*/
public void setMaketime ( UFDateTime maketime) {
this.setAttributeValue( SGDBVO_ADD.MAKETIME,maketime);
 } 

/** 
* 获取修改时间
*
* @return 修改时间
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( SGDBVO_ADD.MODIFIEDTIME);
 } 

/** 
* 设置修改时间
*
* @param modifiedtime 修改时间
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( SGDBVO_ADD.MODIFIEDTIME,modifiedtime);
 } 

/** 
* 获取修改人
*
* @return 修改人
*/
public String getModifier () {
return (String) this.getAttributeValue( SGDBVO_ADD.MODIFIER);
 } 

/** 
* 设置修改人
*
* @param modifier 修改人
*/
public void setModifier ( String modifier) {
this.setAttributeValue( SGDBVO_ADD.MODIFIER,modifier);
 } 

/** 
* 获取集团
*
* @return 集团
*/
public String getPk_group () {
return (String) this.getAttributeValue( SGDBVO_ADD.PK_GROUP);
 } 

/** 
* 设置集团
*
* @param pk_group 集团
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( SGDBVO_ADD.PK_GROUP,pk_group);
 } 

/** 
* 获取项目组织
*
* @return 项目组织
*/
public String getPk_org () {
return (String) this.getAttributeValue( SGDBVO_ADD.PK_ORG);
 } 

/** 
* 设置项目组织
*
* @param pk_org 项目组织
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( SGDBVO_ADD.PK_ORG,pk_org);
 } 

/** 
* 获取项目组织
*
* @return 项目组织
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( SGDBVO_ADD.PK_ORG_V);
 } 

/** 
* 设置项目组织
*
* @param pk_org_v 项目组织
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( SGDBVO_ADD.PK_ORG_V,pk_org_v);
 } 

/** 
* 获取施工增补单明细主键
*
* @return 施工增补单明细主键
*/
public String getPk_sgd_add_b () {
return this.pk_sgd_add_b;
 } 

/** 
* 设置施工增补单明细主键
*
* @param pk_sgd_add_b 施工增补单明细主键
*/
public void setPk_sgd_add_b ( String pk_sgd_add_b) {
this.pk_sgd_add_b=pk_sgd_add_b;
 } 

/** 
* 获取上层单据主键
*
* @return 上层单据主键
*/
public String getPk_sgd_add_h () {
return this.pk_sgd_add_h;
 } 

/** 
* 设置上层单据主键
*
* @param pk_sgd_add_h 上层单据主键
*/
public void setPk_sgd_add_h ( String pk_sgd_add_h) {
this.pk_sgd_add_h=pk_sgd_add_h;
 } 

/** 
* 获取行号
*
* @return 行号
*/
public String getRowno () {
return (String) this.getAttributeValue( SGDBVO_ADD.ROWNO);
 } 

/** 
* 设置行号
*
* @param rowno 行号
*/
public void setRowno ( String rowno) {
this.setAttributeValue( SGDBVO_ADD.ROWNO,rowno);
 } 

/** 
* 获取来源单据id
*
* @return 来源单据id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( SGDBVO_ADD.SRCBILLID);
 } 

/** 
* 设置来源单据id
*
* @param srcbillid 来源单据id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( SGDBVO_ADD.SRCBILLID,srcbillid);
 } 

/** 
* 获取来源单据表体id
*
* @return 来源单据表体id
*/
public String getSrcbillid_b () {
return (String) this.getAttributeValue( SGDBVO_ADD.SRCBILLID_B);
 } 

/** 
* 设置来源单据表体id
*
* @param srcbillid_b 来源单据表体id
*/
public void setSrcbillid_b ( String srcbillid_b) {
this.setAttributeValue( SGDBVO_ADD.SRCBILLID_B,srcbillid_b);
 } 

/** 
* 获取来源单据类型
*
* @return 来源单据类型
*/
public String getSrcbilltype () {
return (String) this.getAttributeValue( SGDBVO_ADD.SRCBILLTYPE);
 } 

/** 
* 设置来源单据类型
*
* @param srcbilltype 来源单据类型
*/
public void setSrcbilltype ( String srcbilltype) {
this.setAttributeValue( SGDBVO_ADD.SRCBILLTYPE,srcbilltype);
 } 

/** 
* 获取交易类型
*
* @return 交易类型
*/
public String getTranstype () {
return (String) this.getAttributeValue( SGDBVO_ADD.TRANSTYPE);
 } 

/** 
* 设置交易类型
*
* @param transtype 交易类型
*/
public void setTranstype ( String transtype) {
this.setAttributeValue( SGDBVO_ADD.TRANSTYPE,transtype);
 } 

/** 
* 获取交易类型pk
*
* @return 交易类型pk
*/
public String getTranstypepk () {
return (String) this.getAttributeValue( SGDBVO_ADD.TRANSTYPEPK);
 } 

/** 
* 设置交易类型pk
*
* @param transtypepk 交易类型pk
*/
public void setTranstypepk ( String transtypepk) {
this.setAttributeValue( SGDBVO_ADD.TRANSTYPEPK,transtypepk);
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
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.SGDADDBVO");
  }
}