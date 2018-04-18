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
*备注
*/
public static final String BZ="bz";
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
*协作部门
*/
public static final String EXCDEPT="excdept";
/**
*协作部门版本信息
*/
public static final String EXCDEPT_V="excdept_v";
/**
*内协总工时
*/
public static final String EXCHOURS="exchours";
/**
*协作部门新工时
*/
public static final String EXCNEWHOURS="excnewhours";
/**
*协作部门原工时
*/
public static final String EXCOLDHOURS="excoldhours";
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
*部门新工时
*/
public static final String NEWHOURS="newhours";
/**
*源头工时
*/
public static final String OLDHOURS="oldhours";
/**
*源头部门
*/
public static final String PK_DEPT="pk_dept";
/**
*源头部门版本信息
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
*施工联系单主键
*/
public String pk_sgd_exc_h;
/**
*施工单主键
*/
public static final String PK_SGD_H="pk_sgd_h";
/**
*定额工时
*/
public static final String PLANHOURS="planhours";
/**
*剩余工时
*/
public static final String REMAINHOURS="remainhours";
/**
*施工单单号
*/
public static final String SGDNO="sgdno";
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
*源头工种
*/
public String srcgz;
/**
*任务名称
*/
public static final String TASKNAME="taskname";
/**
*任务编号
*/
public static final String TASKNO="taskno";
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
*已用工时
*/
public static final String USEDHOURS="usedhours";
/** 
* 获取审批时间
*
* @return 审批时间
*/
public UFDateTime getApprovedate () {
return (UFDateTime) this.getAttributeValue( SGDHVO_EXC.APPROVEDATE);
 } 

/** 
* 设置审批时间
*
* @param approvedate 审批时间
*/
public void setApprovedate ( UFDateTime approvedate) {
this.setAttributeValue( SGDHVO_EXC.APPROVEDATE,approvedate);
 } 

/** 
* 获取审批批语
*
* @return 审批批语
*/
public String getApprovenote () {
return (String) this.getAttributeValue( SGDHVO_EXC.APPROVENOTE);
 } 

/** 
* 设置审批批语
*
* @param approvenote 审批批语
*/
public void setApprovenote ( String approvenote) {
this.setAttributeValue( SGDHVO_EXC.APPROVENOTE,approvenote);
 } 

/** 
* 获取审批人
*
* @return 审批人
*/
public String getApprover () {
return (String) this.getAttributeValue( SGDHVO_EXC.APPROVER);
 } 

/** 
* 设置审批人
*
* @param approver 审批人
*/
public void setApprover ( String approver) {
this.setAttributeValue( SGDHVO_EXC.APPROVER,approver);
 } 

/** 
* 获取审批状态
*
* @return 审批状态
* @see String
*/
public Integer getApprovestatus () {
return (Integer) this.getAttributeValue( SGDHVO_EXC.APPROVESTATUS);
 } 

/** 
* 设置审批状态
*
* @param approvestatus 审批状态
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.setAttributeValue( SGDHVO_EXC.APPROVESTATUS,approvestatus);
 } 

/** 
* 获取单据日期
*
* @return 单据日期
*/
public UFDate getBilldate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.BILLDATE);
 } 

/** 
* 设置单据日期
*
* @param billdate 单据日期
*/
public void setBilldate ( UFDate billdate) {
this.setAttributeValue( SGDHVO_EXC.BILLDATE,billdate);
 } 

/** 
* 获取单据ID
*
* @return 单据ID
*/
public String getBillid () {
return (String) this.getAttributeValue( SGDHVO_EXC.BILLID);
 } 

/** 
* 设置单据ID
*
* @param billid 单据ID
*/
public void setBillid ( String billid) {
this.setAttributeValue( SGDHVO_EXC.BILLID,billid);
 } 

/** 
* 获取制单人
*
* @return 制单人
*/
public String getBillmaker () {
return (String) this.getAttributeValue( SGDHVO_EXC.BILLMAKER);
 } 

/** 
* 设置制单人
*
* @param billmaker 制单人
*/
public void setBillmaker ( String billmaker) {
this.setAttributeValue( SGDHVO_EXC.BILLMAKER,billmaker);
 } 

/** 
* 获取单据号
*
* @return 单据号
*/
public String getBillno () {
return (String) this.getAttributeValue( SGDHVO_EXC.BILLNO);
 } 

/** 
* 设置单据号
*
* @param billno 单据号
*/
public void setBillno ( String billno) {
this.setAttributeValue( SGDHVO_EXC.BILLNO,billno);
 } 

/** 
* 获取单据类型
*
* @return 单据类型
*/
public String getBilltype () {
return (String) this.getAttributeValue( SGDHVO_EXC.BILLTYPE);
 } 

/** 
* 设置单据类型
*
* @param billtype 单据类型
*/
public void setBilltype ( String billtype) {
this.setAttributeValue( SGDHVO_EXC.BILLTYPE,billtype);
 } 

/** 
* 获取单据版本pk
*
* @return 单据版本pk
*/
public String getBillversionpk () {
return (String) this.getAttributeValue( SGDHVO_EXC.BILLVERSIONPK);
 } 

/** 
* 设置单据版本pk
*
* @param billversionpk 单据版本pk
*/
public void setBillversionpk ( String billversionpk) {
this.setAttributeValue( SGDHVO_EXC.BILLVERSIONPK,billversionpk);
 } 

/** 
* 获取业务类型
*
* @return 业务类型
*/
public String getBusitype () {
return (String) this.getAttributeValue( SGDHVO_EXC.BUSITYPE);
 } 

/** 
* 设置业务类型
*
* @param busitype 业务类型
*/
public void setBusitype ( String busitype) {
this.setAttributeValue( SGDHVO_EXC.BUSITYPE,busitype);
 } 

/** 
* 获取备注
*
* @return 备注
*/
public String getBz () {
return (String) this.getAttributeValue( SGDHVO_EXC.BZ);
 } 

/** 
* 设置备注
*
* @param bz 备注
*/
public void setBz ( String bz) {
this.setAttributeValue( SGDHVO_EXC.BZ,bz);
 } 

/** 
* 获取出差地点
*
* @return 出差地点
*/
public String getCcdd () {
return (String) this.getAttributeValue( SGDHVO_EXC.CCDD);
 } 

/** 
* 设置出差地点
*
* @param ccdd 出差地点
*/
public void setCcdd ( String ccdd) {
this.setAttributeValue( SGDHVO_EXC.CCDD,ccdd);
 } 

/** 
* 获取产品完工期
*
* @return 产品完工期
*/
public UFDate getCpwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.CPWGDATE);
 } 

/** 
* 设置产品完工期
*
* @param cpwgdate 产品完工期
*/
public void setCpwgdate ( UFDate cpwgdate) {
this.setAttributeValue( SGDHVO_EXC.CPWGDATE,cpwgdate);
 } 

/** 
* 获取创建时间
*
* @return 创建时间
*/
public UFDateTime getCreationtime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_EXC.CREATIONTIME);
 } 

/** 
* 设置创建时间
*
* @param creationtime 创建时间
*/
public void setCreationtime ( UFDateTime creationtime) {
this.setAttributeValue( SGDHVO_EXC.CREATIONTIME,creationtime);
 } 

/** 
* 获取创建人
*
* @return 创建人
*/
public String getCreator () {
return (String) this.getAttributeValue( SGDHVO_EXC.CREATOR);
 } 

/** 
* 设置创建人
*
* @param creator 创建人
*/
public void setCreator ( String creator) {
this.setAttributeValue( SGDHVO_EXC.CREATOR,creator);
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getDef1 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF1);
 } 

/** 
* 设置自定义项1
*
* @param def1 自定义项1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( SGDHVO_EXC.DEF1,def1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public String getDef10 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF10);
 } 

/** 
* 设置自定义项10
*
* @param def10 自定义项10
*/
public void setDef10 ( String def10) {
this.setAttributeValue( SGDHVO_EXC.DEF10,def10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public String getDef11 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF11);
 } 

/** 
* 设置自定义项11
*
* @param def11 自定义项11
*/
public void setDef11 ( String def11) {
this.setAttributeValue( SGDHVO_EXC.DEF11,def11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getDef12 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF12);
 } 

/** 
* 设置自定义项12
*
* @param def12 自定义项12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( SGDHVO_EXC.DEF12,def12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getDef13 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF13);
 } 

/** 
* 设置自定义项13
*
* @param def13 自定义项13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( SGDHVO_EXC.DEF13,def13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getDef14 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF14);
 } 

/** 
* 设置自定义项14
*
* @param def14 自定义项14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( SGDHVO_EXC.DEF14,def14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public String getDef15 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF15);
 } 

/** 
* 设置自定义项15
*
* @param def15 自定义项15
*/
public void setDef15 ( String def15) {
this.setAttributeValue( SGDHVO_EXC.DEF15,def15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public String getDef16 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF16);
 } 

/** 
* 设置自定义项16
*
* @param def16 自定义项16
*/
public void setDef16 ( String def16) {
this.setAttributeValue( SGDHVO_EXC.DEF16,def16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public String getDef17 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF17);
 } 

/** 
* 设置自定义项17
*
* @param def17 自定义项17
*/
public void setDef17 ( String def17) {
this.setAttributeValue( SGDHVO_EXC.DEF17,def17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public String getDef18 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF18);
 } 

/** 
* 设置自定义项18
*
* @param def18 自定义项18
*/
public void setDef18 ( String def18) {
this.setAttributeValue( SGDHVO_EXC.DEF18,def18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public String getDef19 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF19);
 } 

/** 
* 设置自定义项19
*
* @param def19 自定义项19
*/
public void setDef19 ( String def19) {
this.setAttributeValue( SGDHVO_EXC.DEF19,def19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getDef2 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF2);
 } 

/** 
* 设置自定义项2
*
* @param def2 自定义项2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( SGDHVO_EXC.DEF2,def2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getDef20 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF20);
 } 

/** 
* 设置自定义项20
*
* @param def20 自定义项20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( SGDHVO_EXC.DEF20,def20);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getDef3 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF3);
 } 

/** 
* 设置自定义项3
*
* @param def3 自定义项3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( SGDHVO_EXC.DEF3,def3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getDef4 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF4);
 } 

/** 
* 设置自定义项4
*
* @param def4 自定义项4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( SGDHVO_EXC.DEF4,def4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getDef5 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF5);
 } 

/** 
* 设置自定义项5
*
* @param def5 自定义项5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( SGDHVO_EXC.DEF5,def5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getDef6 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF6);
 } 

/** 
* 设置自定义项6
*
* @param def6 自定义项6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( SGDHVO_EXC.DEF6,def6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getDef7 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF7);
 } 

/** 
* 设置自定义项7
*
* @param def7 自定义项7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( SGDHVO_EXC.DEF7,def7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public String getDef8 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF8);
 } 

/** 
* 设置自定义项8
*
* @param def8 自定义项8
*/
public void setDef8 ( String def8) {
this.setAttributeValue( SGDHVO_EXC.DEF8,def8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public String getDef9 () {
return (String) this.getAttributeValue( SGDHVO_EXC.DEF9);
 } 

/** 
* 设置自定义项9
*
* @param def9 自定义项9
*/
public void setDef9 ( String def9) {
this.setAttributeValue( SGDHVO_EXC.DEF9,def9);
 } 

/** 
* 获取订货单号
*
* @return 订货单号
*/
public String getDhdh () {
return (String) this.getAttributeValue( SGDHVO_EXC.DHDH);
 } 

/** 
* 设置订货单号
*
* @param dhdh 订货单号
*/
public void setDhdh ( String dhdh) {
this.setAttributeValue( SGDHVO_EXC.DHDH,dhdh);
 } 

/** 
* 获取订货单位
*
* @return 订货单位
*/
public String getDhdw () {
return (String) this.getAttributeValue( SGDHVO_EXC.DHDW);
 } 

/** 
* 设置订货单位
*
* @param dhdw 订货单位
*/
public void setDhdw ( String dhdw) {
this.setAttributeValue( SGDHVO_EXC.DHDW,dhdw);
 } 

/** 
* 获取订货数量
*
* @return 订货数量
*/
public UFDouble getDhsl () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.DHSL);
 } 

/** 
* 设置订货数量
*
* @param dhsl 订货数量
*/
public void setDhsl ( UFDouble dhsl) {
this.setAttributeValue( SGDHVO_EXC.DHSL,dhsl);
 } 

/** 
* 获取修订枚举
*
* @return 修订枚举
*/
public Integer getEmendenum () {
return (Integer) this.getAttributeValue( SGDHVO_EXC.EMENDENUM);
 } 

/** 
* 设置修订枚举
*
* @param emendenum 修订枚举
*/
public void setEmendenum ( Integer emendenum) {
this.setAttributeValue( SGDHVO_EXC.EMENDENUM,emendenum);
 } 

/** 
* 获取协作部门
*
* @return 协作部门
*/
public String getExcdept () {
return (String) this.getAttributeValue( SGDHVO_EXC.EXCDEPT);
 } 

/** 
* 设置协作部门
*
* @param excdept 协作部门
*/
public void setExcdept ( String excdept) {
this.setAttributeValue( SGDHVO_EXC.EXCDEPT,excdept);
 } 

/** 
* 获取协作部门版本信息
*
* @return 协作部门版本信息
*/
public String getExcdept_v () {
return (String) this.getAttributeValue( SGDHVO_EXC.EXCDEPT_V);
 } 

/** 
* 设置协作部门版本信息
*
* @param excdept_v 协作部门版本信息
*/
public void setExcdept_v ( String excdept_v) {
this.setAttributeValue( SGDHVO_EXC.EXCDEPT_V,excdept_v);
 } 

/** 
* 获取内协总工时
*
* @return 内协总工时
*/
public UFDouble getExchours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.EXCHOURS);
 } 

/** 
* 设置内协总工时
*
* @param exchours 内协总工时
*/
public void setExchours ( UFDouble exchours) {
this.setAttributeValue( SGDHVO_EXC.EXCHOURS,exchours);
 } 

/** 
* 获取协作部门新工时
*
* @return 协作部门新工时
*/
public UFDouble getExcnewhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.EXCNEWHOURS);
 } 

/** 
* 设置协作部门新工时
*
* @param excnewhours 协作部门新工时
*/
public void setExcnewhours ( UFDouble excnewhours) {
this.setAttributeValue( SGDHVO_EXC.EXCNEWHOURS,excnewhours);
 } 

/** 
* 获取协作部门原工时
*
* @return 协作部门原工时
*/
public UFDouble getExcoldhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.EXCOLDHOURS);
 } 

/** 
* 设置协作部门原工时
*
* @param excoldhours 协作部门原工时
*/
public void setExcoldhours ( UFDouble excoldhours) {
this.setAttributeValue( SGDHVO_EXC.EXCOLDHOURS,excoldhours);
 } 

/** 
* 获取工令号
*
* @return 工令号
*/
public String getGl () {
return (String) this.getAttributeValue( SGDHVO_EXC.GL);
 } 

/** 
* 设置工令号
*
* @param gl 工令号
*/
public void setGl ( String gl) {
this.setAttributeValue( SGDHVO_EXC.GL,gl);
 } 

/** 
* 获取结账地点
*
* @return 结账地点
*/
public String getJzdd () {
return (String) this.getAttributeValue( SGDHVO_EXC.JZDD);
 } 

/** 
* 设置结账地点
*
* @param jzdd 结账地点
*/
public void setJzdd ( String jzdd) {
this.setAttributeValue( SGDHVO_EXC.JZDD,jzdd);
 } 

/** 
* 获取开工日期
*
* @return 开工日期
*/
public UFDate getKgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.KGDATE);
 } 

/** 
* 设置开工日期
*
* @param kgdate 开工日期
*/
public void setKgdate ( UFDate kgdate) {
this.setAttributeValue( SGDHVO_EXC.KGDATE,kgdate);
 } 

/** 
* 获取最后修改时间
*
* @return 最后修改时间
*/
public UFDateTime getLastmaketime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_EXC.LASTMAKETIME);
 } 

/** 
* 设置最后修改时间
*
* @param lastmaketime 最后修改时间
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.setAttributeValue( SGDHVO_EXC.LASTMAKETIME,lastmaketime);
 } 

/** 
* 获取制单时间
*
* @return 制单时间
*/
public UFDateTime getMaketime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_EXC.MAKETIME);
 } 

/** 
* 设置制单时间
*
* @param maketime 制单时间
*/
public void setMaketime ( UFDateTime maketime) {
this.setAttributeValue( SGDHVO_EXC.MAKETIME,maketime);
 } 

/** 
* 获取修改时间
*
* @return 修改时间
*/
public UFDateTime getModifiedtime () {
return (UFDateTime) this.getAttributeValue( SGDHVO_EXC.MODIFIEDTIME);
 } 

/** 
* 设置修改时间
*
* @param modifiedtime 修改时间
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.setAttributeValue( SGDHVO_EXC.MODIFIEDTIME,modifiedtime);
 } 

/** 
* 获取修改人
*
* @return 修改人
*/
public String getModifier () {
return (String) this.getAttributeValue( SGDHVO_EXC.MODIFIER);
 } 

/** 
* 设置修改人
*
* @param modifier 修改人
*/
public void setModifier ( String modifier) {
this.setAttributeValue( SGDHVO_EXC.MODIFIER,modifier);
 } 

/** 
* 获取毛坯完工期
*
* @return 毛坯完工期
*/
public UFDate getMpwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.MPWGDATE);
 } 

/** 
* 设置毛坯完工期
*
* @param mpwgdate 毛坯完工期
*/
public void setMpwgdate ( UFDate mpwgdate) {
this.setAttributeValue( SGDHVO_EXC.MPWGDATE,mpwgdate);
 } 

/** 
* 获取部门新工时
*
* @return 部门新工时
*/
public UFDouble getNewhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.NEWHOURS);
 } 

/** 
* 设置部门新工时
*
* @param newhours 部门新工时
*/
public void setNewhours ( UFDouble newhours) {
this.setAttributeValue( SGDHVO_EXC.NEWHOURS,newhours);
 } 

/** 
* 获取源头工时
*
* @return 源头工时
*/
public UFDouble getOldhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.OLDHOURS);
 } 

/** 
* 设置源头工时
*
* @param oldhours 源头工时
*/
public void setOldhours ( UFDouble oldhours) {
this.setAttributeValue( SGDHVO_EXC.OLDHOURS,oldhours);
 } 

/** 
* 获取源头部门
*
* @return 源头部门
*/
public String getPk_dept () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_DEPT);
 } 

/** 
* 设置源头部门
*
* @param pk_dept 源头部门
*/
public void setPk_dept ( String pk_dept) {
this.setAttributeValue( SGDHVO_EXC.PK_DEPT,pk_dept);
 } 

/** 
* 获取源头部门版本信息
*
* @return 源头部门版本信息
*/
public String getPk_dept_v () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_DEPT_V);
 } 

/** 
* 设置源头部门版本信息
*
* @param pk_dept_v 源头部门版本信息
*/
public void setPk_dept_v ( String pk_dept_v) {
this.setAttributeValue( SGDHVO_EXC.PK_DEPT_V,pk_dept_v);
 } 

/** 
* 获取集团
*
* @return 集团
*/
public String getPk_group () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_GROUP);
 } 

/** 
* 设置集团
*
* @param pk_group 集团
*/
public void setPk_group ( String pk_group) {
this.setAttributeValue( SGDHVO_EXC.PK_GROUP,pk_group);
 } 

/** 
* 获取项目组织
*
* @return 项目组织
*/
public String getPk_org () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_ORG);
 } 

/** 
* 设置项目组织
*
* @param pk_org 项目组织
*/
public void setPk_org ( String pk_org) {
this.setAttributeValue( SGDHVO_EXC.PK_ORG,pk_org);
 } 

/** 
* 获取项目组织
*
* @return 项目组织
*/
public String getPk_org_v () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_ORG_V);
 } 

/** 
* 设置项目组织
*
* @param pk_org_v 项目组织
*/
public void setPk_org_v ( String pk_org_v) {
this.setAttributeValue( SGDHVO_EXC.PK_ORG_V,pk_org_v);
 } 

/** 
* 获取施工联系单主键
*
* @return 施工联系单主键
*/
public String getPk_sgd_exc_h () {
return this.pk_sgd_exc_h;
 } 

/** 
* 设置施工联系单主键
*
* @param pk_sgd_exc_h 施工联系单主键
*/
public void setPk_sgd_exc_h ( String pk_sgd_exc_h) {
this.pk_sgd_exc_h=pk_sgd_exc_h;
 } 

/** 
* 获取施工单主键
*
* @return 施工单主键
*/
public String getPk_sgd_h () {
return (String) this.getAttributeValue( SGDHVO_EXC.PK_SGD_H);
 } 

/** 
* 设置施工单主键
*
* @param pk_sgd_h 施工单主键
*/
public void setPk_sgd_h ( String pk_sgd_h) {
this.setAttributeValue( SGDHVO_EXC.PK_SGD_H,pk_sgd_h);
 } 

/** 
* 获取定额工时
*
* @return 定额工时
*/
public UFDouble getPlanhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.PLANHOURS);
 } 

/** 
* 设置定额工时
*
* @param planhours 定额工时
*/
public void setPlanhours ( UFDouble planhours) {
this.setAttributeValue( SGDHVO_EXC.PLANHOURS,planhours);
 } 

/** 
* 获取剩余工时
*
* @return 剩余工时
*/
public UFDouble getRemainhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.REMAINHOURS);
 } 

/** 
* 设置剩余工时
*
* @param remainhours 剩余工时
*/
public void setRemainhours ( UFDouble remainhours) {
this.setAttributeValue( SGDHVO_EXC.REMAINHOURS,remainhours);
 } 

/** 
* 获取施工单单号
*
* @return 施工单单号
*/
public String getSgdno () {
return (String) this.getAttributeValue( SGDHVO_EXC.SGDNO);
 } 

/** 
* 设置施工单单号
*
* @param sgdno 施工单单号
*/
public void setSgdno ( String sgdno) {
this.setAttributeValue( SGDHVO_EXC.SGDNO,sgdno);
 } 

/** 
* 获取施工依据
*
* @return 施工依据
*/
public String getSgyj () {
return (String) this.getAttributeValue( SGDHVO_EXC.SGYJ);
 } 

/** 
* 设置施工依据
*
* @param sgyj 施工依据
*/
public void setSgyj ( String sgyj) {
this.setAttributeValue( SGDHVO_EXC.SGYJ,sgyj);
 } 

/** 
* 获取实际合格期
*
* @return 实际合格期
*/
public UFDate getSjhgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.SJHGDATE);
 } 

/** 
* 设置实际合格期
*
* @param sjhgdate 实际合格期
*/
public void setSjhgdate ( UFDate sjhgdate) {
this.setAttributeValue( SGDHVO_EXC.SJHGDATE,sjhgdate);
 } 

/** 
* 获取实际完工期
*
* @return 实际完工期
*/
public UFDate getSjwgdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.SJWGDATE);
 } 

/** 
* 设置实际完工期
*
* @param sjwgdate 实际完工期
*/
public void setSjwgdate ( UFDate sjwgdate) {
this.setAttributeValue( SGDHVO_EXC.SJWGDATE,sjwgdate);
 } 

/** 
* 获取实际验收期
*
* @return 实际验收期
*/
public UFDate getSjysdate () {
return (UFDate) this.getAttributeValue( SGDHVO_EXC.SJYSDATE);
 } 

/** 
* 设置实际验收期
*
* @param sjysdate 实际验收期
*/
public void setSjysdate ( UFDate sjysdate) {
this.setAttributeValue( SGDHVO_EXC.SJYSDATE,sjysdate);
 } 

/** 
* 获取来源单据id
*
* @return 来源单据id
*/
public String getSrcbillid () {
return (String) this.getAttributeValue( SGDHVO_EXC.SRCBILLID);
 } 

/** 
* 设置来源单据id
*
* @param srcbillid 来源单据id
*/
public void setSrcbillid ( String srcbillid) {
this.setAttributeValue( SGDHVO_EXC.SRCBILLID,srcbillid);
 } 

/** 
* 获取来源单据表体id
*
* @return 来源单据表体id
*/
public String getSrcbillid_b () {
return (String) this.getAttributeValue( SGDHVO_EXC.SRCBILLID_B);
 } 

/** 
* 设置来源单据表体id
*
* @param srcbillid_b 来源单据表体id
*/
public void setSrcbillid_b ( String srcbillid_b) {
this.setAttributeValue( SGDHVO_EXC.SRCBILLID_B,srcbillid_b);
 } 

/** 
* 获取来源单据类型
*
* @return 来源单据类型
*/
public String getSrcbilltype () {
return (String) this.getAttributeValue( SGDHVO_EXC.SRCBILLTYPE);
 } 

/** 
* 设置来源单据类型
*
* @param srcbilltype 来源单据类型
*/
public void setSrcbilltype ( String srcbilltype) {
this.setAttributeValue( SGDHVO_EXC.SRCBILLTYPE,srcbilltype);
 } 

/** 
* 获取源头工种
*
* @return 源头工种
*/
public String getSrcgz () {
return this.srcgz;
 } 

/** 
* 设置源头工种
*
* @param srcgz 源头工种
*/
public void setSrcgz ( String srcgz) {
this.srcgz=srcgz;
 } 

/** 
* 获取任务名称
*
* @return 任务名称
*/
public String getTaskname () {
return (String) this.getAttributeValue( SGDHVO_EXC.TASKNAME);
 } 

/** 
* 设置任务名称
*
* @param taskname 任务名称
*/
public void setTaskname ( String taskname) {
this.setAttributeValue( SGDHVO_EXC.TASKNAME,taskname);
 } 

/** 
* 获取任务编号
*
* @return 任务编号
*/
public String getTaskno () {
return (String) this.getAttributeValue( SGDHVO_EXC.TASKNO);
 } 

/** 
* 设置任务编号
*
* @param taskno 任务编号
*/
public void setTaskno ( String taskno) {
this.setAttributeValue( SGDHVO_EXC.TASKNO,taskno);
 } 

/** 
* 获取合计数量
*
* @return 合计数量
*/
public Integer getTotalnum () {
return (Integer) this.getAttributeValue( SGDHVO_EXC.TOTALNUM);
 } 

/** 
* 设置合计数量
*
* @param totalnum 合计数量
*/
public void setTotalnum ( Integer totalnum) {
this.setAttributeValue( SGDHVO_EXC.TOTALNUM,totalnum);
 } 

/** 
* 获取交易类型
*
* @return 交易类型
*/
public String getTranstype () {
return (String) this.getAttributeValue( SGDHVO_EXC.TRANSTYPE);
 } 

/** 
* 设置交易类型
*
* @param transtype 交易类型
*/
public void setTranstype ( String transtype) {
this.setAttributeValue( SGDHVO_EXC.TRANSTYPE,transtype);
 } 

/** 
* 获取交易类型pk
*
* @return 交易类型pk
*/
public String getTranstypepk () {
return (String) this.getAttributeValue( SGDHVO_EXC.TRANSTYPEPK);
 } 

/** 
* 设置交易类型pk
*
* @param transtypepk 交易类型pk
*/
public void setTranstypepk ( String transtypepk) {
this.setAttributeValue( SGDHVO_EXC.TRANSTYPEPK,transtypepk);
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
* 获取已用工时
*
* @return 已用工时
*/
public UFDouble getUsedhours () {
return (UFDouble) this.getAttributeValue( SGDHVO_EXC.USEDHOURS);
 } 

/** 
* 设置已用工时
*
* @param usedhours 已用工时
*/
public void setUsedhours ( UFDouble usedhours) {
this.setAttributeValue( SGDHVO_EXC.USEDHOURS,usedhours);
 } 


  @Override
  public IVOMeta getMetaData() {
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.SGDEXCHVO");
  }
}