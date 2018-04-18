package nc.vo.plan.ht01;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class HtHVO extends SuperVO {
/**
*审批时间
*/
public UFDateTime approvedate;
/**
*审批批语
*/
public String approvenote;
/**
*审批人
*/
public String approver;
/**
*审批状态
*/
public Integer approvestatus;
/**
*单据日期
*/
public static final String BILLDATE="billdate";
/**
*单据ID
*/
public String billid;
/**
*制单人
*/
public String billmaker;
/**
*单据号
*/
public String billno;
/**
*单据类型
*/
public String billtype;
/**
*单据版本pk
*/
public String billversionpk;
/**
*业务类型
*/
public String busitype;
/**
*code
*/
public String code;
/**
*创建时间
*/
public UFDateTime creationtime;
/**
*创建人
*/
public String creator;
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
public Integer emendenum;
/**
*部门
*/
public static final String HT_DEPT="ht_dept";
/**
*id
*/
public String id;
/**
*最后修改时间
*/
public UFDateTime lastmaketime;
/**
*制单时间
*/
public UFDateTime maketime;
/**
*修改时间
*/
public UFDateTime modifiedtime;
/**
*修改人
*/
public String modifier;
/**
*name
*/
public String name;
/**
*组织_部门版本信息
*/
public static final String PK_DEPT_V="pk_dept_v";
/**
*集团
*/
public String pk_group;
/**
*合同单主键
*/
public String pk_ht_h;
/**
*组织
*/
public String pk_org;
/**
*组织版本
*/
public String pk_org_v;
/**
*所属组织
*/
public String pkorg;
/**
*行号
*/
public String rowno;
/**
*来源单据id
*/
public String srcbillid;
/**
*来源单据类型
*/
public String srcbilltype;
/**
*交易类型
*/
public String transtype;
/**
*交易类型pk
*/
public String transtypepk;
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
return this.approvedate;
 } 

/** 
* 设置审批时间
*
* @param approvedate 审批时间
*/
public void setApprovedate ( UFDateTime approvedate) {
this.approvedate=approvedate;
 } 

/** 
* 获取审批批语
*
* @return 审批批语
*/
public String getApprovenote () {
return this.approvenote;
 } 

/** 
* 设置审批批语
*
* @param approvenote 审批批语
*/
public void setApprovenote ( String approvenote) {
this.approvenote=approvenote;
 } 

/** 
* 获取审批人
*
* @return 审批人
*/
public String getApprover () {
return this.approver;
 } 

/** 
* 设置审批人
*
* @param approver 审批人
*/
public void setApprover ( String approver) {
this.approver=approver;
 } 

/** 
* 获取审批状态
*
* @return 审批状态
* @see String
*/
public Integer getApprovestatus () {
return this.approvestatus;
 } 

/** 
* 设置审批状态
*
* @param approvestatus 审批状态
* @see String
*/
public void setApprovestatus ( Integer approvestatus) {
this.approvestatus=approvestatus;
 } 

/** 
* 获取单据日期
*
* @return 单据日期
*/
public UFDate getBilldate () {
return (UFDate) this.getAttributeValue( HtHVO.BILLDATE);
 } 

/** 
* 设置单据日期
*
* @param billdate 单据日期
*/
public void setBilldate ( UFDate billdate) {
this.setAttributeValue( HtHVO.BILLDATE,billdate);
 } 

/** 
* 获取单据ID
*
* @return 单据ID
*/
public String getBillid () {
return this.billid;
 } 

/** 
* 设置单据ID
*
* @param billid 单据ID
*/
public void setBillid ( String billid) {
this.billid=billid;
 } 

/** 
* 获取制单人
*
* @return 制单人
*/
public String getBillmaker () {
return this.billmaker;
 } 

/** 
* 设置制单人
*
* @param billmaker 制单人
*/
public void setBillmaker ( String billmaker) {
this.billmaker=billmaker;
 } 

/** 
* 获取单据号
*
* @return 单据号
*/
public String getBillno () {
return this.billno;
 } 

/** 
* 设置单据号
*
* @param billno 单据号
*/
public void setBillno ( String billno) {
this.billno=billno;
 } 

/** 
* 获取单据类型
*
* @return 单据类型
*/
public String getBilltype () {
return this.billtype;
 } 

/** 
* 设置单据类型
*
* @param billtype 单据类型
*/
public void setBilltype ( String billtype) {
this.billtype=billtype;
 } 

/** 
* 获取单据版本pk
*
* @return 单据版本pk
*/
public String getBillversionpk () {
return this.billversionpk;
 } 

/** 
* 设置单据版本pk
*
* @param billversionpk 单据版本pk
*/
public void setBillversionpk ( String billversionpk) {
this.billversionpk=billversionpk;
 } 

/** 
* 获取业务类型
*
* @return 业务类型
*/
public String getBusitype () {
return this.busitype;
 } 

/** 
* 设置业务类型
*
* @param busitype 业务类型
*/
public void setBusitype ( String busitype) {
this.busitype=busitype;
 } 

/** 
* 获取code
*
* @return code
*/
public String getCode () {
return this.code;
 } 

/** 
* 设置code
*
* @param code code
*/
public void setCode ( String code) {
this.code=code;
 } 

/** 
* 获取创建时间
*
* @return 创建时间
*/
public UFDateTime getCreationtime () {
return this.creationtime;
 } 

/** 
* 设置创建时间
*
* @param creationtime 创建时间
*/
public void setCreationtime ( UFDateTime creationtime) {
this.creationtime=creationtime;
 } 

/** 
* 获取创建人
*
* @return 创建人
*/
public String getCreator () {
return this.creator;
 } 

/** 
* 设置创建人
*
* @param creator 创建人
*/
public void setCreator ( String creator) {
this.creator=creator;
 } 

/** 
* 获取自定义项1
*
* @return 自定义项1
*/
public String getDef1 () {
return (String) this.getAttributeValue( HtHVO.DEF1);
 } 

/** 
* 设置自定义项1
*
* @param def1 自定义项1
*/
public void setDef1 ( String def1) {
this.setAttributeValue( HtHVO.DEF1,def1);
 } 

/** 
* 获取自定义项10
*
* @return 自定义项10
*/
public Integer getDef10 () {
return (Integer) this.getAttributeValue( HtHVO.DEF10);
 } 

/** 
* 设置自定义项10
*
* @param def10 自定义项10
*/
public void setDef10 ( Integer def10) {
this.setAttributeValue( HtHVO.DEF10,def10);
 } 

/** 
* 获取自定义项11
*
* @return 自定义项11
*/
public Integer getDef11 () {
return (Integer) this.getAttributeValue( HtHVO.DEF11);
 } 

/** 
* 设置自定义项11
*
* @param def11 自定义项11
*/
public void setDef11 ( Integer def11) {
this.setAttributeValue( HtHVO.DEF11,def11);
 } 

/** 
* 获取自定义项12
*
* @return 自定义项12
*/
public String getDef12 () {
return (String) this.getAttributeValue( HtHVO.DEF12);
 } 

/** 
* 设置自定义项12
*
* @param def12 自定义项12
*/
public void setDef12 ( String def12) {
this.setAttributeValue( HtHVO.DEF12,def12);
 } 

/** 
* 获取自定义项13
*
* @return 自定义项13
*/
public String getDef13 () {
return (String) this.getAttributeValue( HtHVO.DEF13);
 } 

/** 
* 设置自定义项13
*
* @param def13 自定义项13
*/
public void setDef13 ( String def13) {
this.setAttributeValue( HtHVO.DEF13,def13);
 } 

/** 
* 获取自定义项14
*
* @return 自定义项14
*/
public String getDef14 () {
return (String) this.getAttributeValue( HtHVO.DEF14);
 } 

/** 
* 设置自定义项14
*
* @param def14 自定义项14
*/
public void setDef14 ( String def14) {
this.setAttributeValue( HtHVO.DEF14,def14);
 } 

/** 
* 获取自定义项15
*
* @return 自定义项15
*/
public UFDate getDef15 () {
return (UFDate) this.getAttributeValue( HtHVO.DEF15);
 } 

/** 
* 设置自定义项15
*
* @param def15 自定义项15
*/
public void setDef15 ( UFDate def15) {
this.setAttributeValue( HtHVO.DEF15,def15);
 } 

/** 
* 获取自定义项16
*
* @return 自定义项16
*/
public UFDate getDef16 () {
return (UFDate) this.getAttributeValue( HtHVO.DEF16);
 } 

/** 
* 设置自定义项16
*
* @param def16 自定义项16
*/
public void setDef16 ( UFDate def16) {
this.setAttributeValue( HtHVO.DEF16,def16);
 } 

/** 
* 获取自定义项17
*
* @return 自定义项17
*/
public UFDateTime getDef17 () {
return (UFDateTime) this.getAttributeValue( HtHVO.DEF17);
 } 

/** 
* 设置自定义项17
*
* @param def17 自定义项17
*/
public void setDef17 ( UFDateTime def17) {
this.setAttributeValue( HtHVO.DEF17,def17);
 } 

/** 
* 获取自定义项18
*
* @return 自定义项18
*/
public UFDateTime getDef18 () {
return (UFDateTime) this.getAttributeValue( HtHVO.DEF18);
 } 

/** 
* 设置自定义项18
*
* @param def18 自定义项18
*/
public void setDef18 ( UFDateTime def18) {
this.setAttributeValue( HtHVO.DEF18,def18);
 } 

/** 
* 获取自定义项19
*
* @return 自定义项19
*/
public UFBoolean getDef19 () {
return (UFBoolean) this.getAttributeValue( HtHVO.DEF19);
 } 

/** 
* 设置自定义项19
*
* @param def19 自定义项19
*/
public void setDef19 ( UFBoolean def19) {
this.setAttributeValue( HtHVO.DEF19,def19);
 } 

/** 
* 获取自定义项2
*
* @return 自定义项2
*/
public String getDef2 () {
return (String) this.getAttributeValue( HtHVO.DEF2);
 } 

/** 
* 设置自定义项2
*
* @param def2 自定义项2
*/
public void setDef2 ( String def2) {
this.setAttributeValue( HtHVO.DEF2,def2);
 } 

/** 
* 获取自定义项20
*
* @return 自定义项20
*/
public String getDef20 () {
return (String) this.getAttributeValue( HtHVO.DEF20);
 } 

/** 
* 设置自定义项20
*
* @param def20 自定义项20
*/
public void setDef20 ( String def20) {
this.setAttributeValue( HtHVO.DEF20,def20);
 } 

/** 
* 获取自定义项21
*
* @return 自定义项21
*/
public String getDef21 () {
return (String) this.getAttributeValue( HtHVO.DEF21);
 } 

/** 
* 设置自定义项21
*
* @param def21 自定义项21
*/
public void setDef21 ( String def21) {
this.setAttributeValue( HtHVO.DEF21,def21);
 } 

/** 
* 获取自定义项22
*
* @return 自定义项22
*/
public String getDef22 () {
return (String) this.getAttributeValue( HtHVO.DEF22);
 } 

/** 
* 设置自定义项22
*
* @param def22 自定义项22
*/
public void setDef22 ( String def22) {
this.setAttributeValue( HtHVO.DEF22,def22);
 } 

/** 
* 获取自定义项23
*
* @return 自定义项23
*/
public String getDef23 () {
return (String) this.getAttributeValue( HtHVO.DEF23);
 } 

/** 
* 设置自定义项23
*
* @param def23 自定义项23
*/
public void setDef23 ( String def23) {
this.setAttributeValue( HtHVO.DEF23,def23);
 } 

/** 
* 获取自定义项24
*
* @return 自定义项24
*/
public String getDef24 () {
return (String) this.getAttributeValue( HtHVO.DEF24);
 } 

/** 
* 设置自定义项24
*
* @param def24 自定义项24
*/
public void setDef24 ( String def24) {
this.setAttributeValue( HtHVO.DEF24,def24);
 } 

/** 
* 获取自定义项25
*
* @return 自定义项25
*/
public String getDef25 () {
return (String) this.getAttributeValue( HtHVO.DEF25);
 } 

/** 
* 设置自定义项25
*
* @param def25 自定义项25
*/
public void setDef25 ( String def25) {
this.setAttributeValue( HtHVO.DEF25,def25);
 } 

/** 
* 获取自定义项3
*
* @return 自定义项3
*/
public String getDef3 () {
return (String) this.getAttributeValue( HtHVO.DEF3);
 } 

/** 
* 设置自定义项3
*
* @param def3 自定义项3
*/
public void setDef3 ( String def3) {
this.setAttributeValue( HtHVO.DEF3,def3);
 } 

/** 
* 获取自定义项4
*
* @return 自定义项4
*/
public String getDef4 () {
return (String) this.getAttributeValue( HtHVO.DEF4);
 } 

/** 
* 设置自定义项4
*
* @param def4 自定义项4
*/
public void setDef4 ( String def4) {
this.setAttributeValue( HtHVO.DEF4,def4);
 } 

/** 
* 获取自定义项5
*
* @return 自定义项5
*/
public String getDef5 () {
return (String) this.getAttributeValue( HtHVO.DEF5);
 } 

/** 
* 设置自定义项5
*
* @param def5 自定义项5
*/
public void setDef5 ( String def5) {
this.setAttributeValue( HtHVO.DEF5,def5);
 } 

/** 
* 获取自定义项6
*
* @return 自定义项6
*/
public String getDef6 () {
return (String) this.getAttributeValue( HtHVO.DEF6);
 } 

/** 
* 设置自定义项6
*
* @param def6 自定义项6
*/
public void setDef6 ( String def6) {
this.setAttributeValue( HtHVO.DEF6,def6);
 } 

/** 
* 获取自定义项7
*
* @return 自定义项7
*/
public String getDef7 () {
return (String) this.getAttributeValue( HtHVO.DEF7);
 } 

/** 
* 设置自定义项7
*
* @param def7 自定义项7
*/
public void setDef7 ( String def7) {
this.setAttributeValue( HtHVO.DEF7,def7);
 } 

/** 
* 获取自定义项8
*
* @return 自定义项8
*/
public UFDouble getDef8 () {
return (UFDouble) this.getAttributeValue( HtHVO.DEF8);
 } 

/** 
* 设置自定义项8
*
* @param def8 自定义项8
*/
public void setDef8 ( UFDouble def8) {
this.setAttributeValue( HtHVO.DEF8,def8);
 } 

/** 
* 获取自定义项9
*
* @return 自定义项9
*/
public UFDouble getDef9 () {
return (UFDouble) this.getAttributeValue( HtHVO.DEF9);
 } 

/** 
* 设置自定义项9
*
* @param def9 自定义项9
*/
public void setDef9 ( UFDouble def9) {
this.setAttributeValue( HtHVO.DEF9,def9);
 } 

/** 
* 获取修订枚举
*
* @return 修订枚举
*/
public Integer getEmendenum () {
return this.emendenum;
 } 

/** 
* 设置修订枚举
*
* @param emendenum 修订枚举
*/
public void setEmendenum ( Integer emendenum) {
this.emendenum=emendenum;
 } 

/** 
* 获取部门
*
* @return 部门
*/
public String getHt_dept () {
return (String) this.getAttributeValue( HtHVO.HT_DEPT);
 } 

/** 
* 设置部门
*
* @param ht_dept 部门
*/
public void setHt_dept ( String ht_dept) {
this.setAttributeValue( HtHVO.HT_DEPT,ht_dept);
 } 

/** 
* 获取id
*
* @return id
*/
public String getId () {
return this.id;
 } 

/** 
* 设置id
*
* @param id id
*/
public void setId ( String id) {
this.id=id;
 } 

/** 
* 获取最后修改时间
*
* @return 最后修改时间
*/
public UFDateTime getLastmaketime () {
return this.lastmaketime;
 } 

/** 
* 设置最后修改时间
*
* @param lastmaketime 最后修改时间
*/
public void setLastmaketime ( UFDateTime lastmaketime) {
this.lastmaketime=lastmaketime;
 } 

/** 
* 获取制单时间
*
* @return 制单时间
*/
public UFDateTime getMaketime () {
return this.maketime;
 } 

/** 
* 设置制单时间
*
* @param maketime 制单时间
*/
public void setMaketime ( UFDateTime maketime) {
this.maketime=maketime;
 } 

/** 
* 获取修改时间
*
* @return 修改时间
*/
public UFDateTime getModifiedtime () {
return this.modifiedtime;
 } 

/** 
* 设置修改时间
*
* @param modifiedtime 修改时间
*/
public void setModifiedtime ( UFDateTime modifiedtime) {
this.modifiedtime=modifiedtime;
 } 

/** 
* 获取修改人
*
* @return 修改人
*/
public String getModifier () {
return this.modifier;
 } 

/** 
* 设置修改人
*
* @param modifier 修改人
*/
public void setModifier ( String modifier) {
this.modifier=modifier;
 } 

/** 
* 获取name
*
* @return name
*/
public String getName () {
return this.name;
 } 

/** 
* 设置name
*
* @param name name
*/
public void setName ( String name) {
this.name=name;
 } 

/** 
* 获取组织_部门版本信息
*
* @return 组织_部门版本信息
*/
public String getPk_dept_v () {
return (String) this.getAttributeValue( HtHVO.PK_DEPT_V);
 } 

/** 
* 设置组织_部门版本信息
*
* @param pk_dept_v 组织_部门版本信息
*/
public void setPk_dept_v ( String pk_dept_v) {
this.setAttributeValue( HtHVO.PK_DEPT_V,pk_dept_v);
 } 

/** 
* 获取集团
*
* @return 集团
*/
public String getPk_group () {
return this.pk_group;
 } 

/** 
* 设置集团
*
* @param pk_group 集团
*/
public void setPk_group ( String pk_group) {
this.pk_group=pk_group;
 } 

/** 
* 获取合同单主键
*
* @return 合同单主键
*/
public String getPk_ht_h () {
return this.pk_ht_h;
 } 

/** 
* 设置合同单主键
*
* @param pk_ht_h 合同单主键
*/
public void setPk_ht_h ( String pk_ht_h) {
this.pk_ht_h=pk_ht_h;
 } 

/** 
* 获取组织
*
* @return 组织
*/
public String getPk_org () {
return this.pk_org;
 } 

/** 
* 设置组织
*
* @param pk_org 组织
*/
public void setPk_org ( String pk_org) {
this.pk_org=pk_org;
 } 

/** 
* 获取组织版本
*
* @return 组织版本
*/
public String getPk_org_v () {
return this.pk_org_v;
 } 

/** 
* 设置组织版本
*
* @param pk_org_v 组织版本
*/
public void setPk_org_v ( String pk_org_v) {
this.pk_org_v=pk_org_v;
 } 

/** 
* 获取所属组织
*
* @return 所属组织
*/
public String getPkorg () {
return this.pkorg;
 } 

/** 
* 设置所属组织
*
* @param pkorg 所属组织
*/
public void setPkorg ( String pkorg) {
this.pkorg=pkorg;
 } 

/** 
* 获取行号
*
* @return 行号
*/
public String getRowno () {
return this.rowno;
 } 

/** 
* 设置行号
*
* @param rowno 行号
*/
public void setRowno ( String rowno) {
this.rowno=rowno;
 } 

/** 
* 获取来源单据id
*
* @return 来源单据id
*/
public String getSrcbillid () {
return this.srcbillid;
 } 

/** 
* 设置来源单据id
*
* @param srcbillid 来源单据id
*/
public void setSrcbillid ( String srcbillid) {
this.srcbillid=srcbillid;
 } 

/** 
* 获取来源单据类型
*
* @return 来源单据类型
*/
public String getSrcbilltype () {
return this.srcbilltype;
 } 

/** 
* 设置来源单据类型
*
* @param srcbilltype 来源单据类型
*/
public void setSrcbilltype ( String srcbilltype) {
this.srcbilltype=srcbilltype;
 } 

/** 
* 获取交易类型
*
* @return 交易类型
*/
public String getTranstype () {
return this.transtype;
 } 

/** 
* 设置交易类型
*
* @param transtype 交易类型
*/
public void setTranstype ( String transtype) {
this.transtype=transtype;
 } 

/** 
* 获取交易类型pk
*
* @return 交易类型pk
*/
public String getTranstypepk () {
return this.transtypepk;
 } 

/** 
* 设置交易类型pk
*
* @param transtypepk 交易类型pk
*/
public void setTranstypepk ( String transtypepk) {
this.transtypepk=transtypepk;
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
    return VOMetaFactory.getInstance().getVOMeta("jxc_hr.htVO");
  }
}