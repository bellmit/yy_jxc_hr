package nc.vo.jxc_hr.ordersheet;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class OrderEndSubVO extends SuperVO {
	/**
	 * 实际完工日期
	 */
	public static final String ACTCOMPLETDATE = "actcompletdate";
	/**
	 * 分项目
	 */
	public static final String CHILDPROJECT = "childproject";
	/**
	 * 外协预估
	 */
	public static final String COMMUNICATECOST = "communicatecost";
	/**
	 * 创建时间
	 */
	public static final String CREATIONTIME = "creationtime";
	/**
	 * 创建人
	 */
	public static final String CREATOR = "creator";
	/**
	 * 自定义项1
	 */
	public static final String DEF1 = "def1";
	/**
	 * 自定义项10
	 */
	public static final String DEF10 = "def10";
	/**
	 * 自定义项11
	 */
	public static final String DEF11 = "def11";
	/**
	 * 自定义项12
	 */
	public static final String DEF12 = "def12";
	/**
	 * 自定义项13
	 */
	public static final String DEF13 = "def13";
	/**
	 * 自定义项14
	 */
	public static final String DEF14 = "def14";
	/**
	 * 自定义项15
	 */
	public static final String DEF15 = "def15";
	/**
	 * 自定义项16
	 */
	public static final String DEF16 = "def16";
	/**
	 * 自定义项17
	 */
	public static final String DEF17 = "def17";
	/**
	 * 自定义项18
	 */
	public static final String DEF18 = "def18";
	/**
	 * 自定义项19
	 */
	public static final String DEF19 = "def19";
	/**
	 * 自定义项2
	 */
	public static final String DEF2 = "def2";
	/**
	 * 自定义项20
	 */
	public static final String DEF20 = "def20";
	/**
	 * 自定义项21
	 */
	public static final String DEF21 = "def21";
	/**
	 * 自定义项22
	 */
	public static final String DEF22 = "def22";
	/**
	 * 自定义项23
	 */
	public static final String DEF23 = "def23";
	/**
	 * 自定义项24
	 */
	public static final String DEF24 = "def24";
	/**
	 * 自定义项25
	 */
	public static final String DEF25 = "def25";
	/**
	 * 自定义项3
	 */
	public static final String DEF3 = "def3";
	/**
	 * 自定义项4
	 */
	public static final String DEF4 = "def4";
	/**
	 * 自定义项5
	 */
	public static final String DEF5 = "def5";
	/**
	 * 自定义项6
	 */
	public static final String DEF6 = "def6";
	/**
	 * 自定义项7
	 */
	public static final String DEF7 = "def7";
	/**
	 * 自定义项8
	 */
	public static final String DEF8 = "def8";
	/**
	 * 自定义项9
	 */
	public static final String DEF9 = "def9";
	/**
	 * 工令号
	 */
	public static final String GL = "gl";
	/**
	 * 主办部门
	 */
	public static final String HOSTDEPT = "hostdept";
	/**
	 * 材料预估
	 */
	public static final String METERIALCOST = "meterialcost";
	/**
	 * 修改时间
	 */
	public static final String MODIFIEDTIME = "modifiedtime";
	/**
	 * 修改人
	 */
	public static final String MODIFIER = "modifier";
	/**
	 * 备注
	 */
	public static final String NOTE = "note";
	/**
	 * 工令状态
	 */
	public static final String ORDERSTATUS = "orderstatus";
	/**
	 * 其他
	 */
	public static final String OTHERSCOST = "otherscost";
	/**
	 * 上层单据主键
	 */
	public String pk_ordersheet;
	/**
	 * 子表主键
	 */
	public String pk_ordersub;
	/**
	 * 计划完工日期
	 */
	public static final String PLANENDDATE = "planenddate";
	/**
	 * 计划开工日期
	 */
	public static final String PLANSTARTDATE = "planstartdate";
	/**
	 * 产品工程名称
	 */
	public static final String PRODUCTNAME = "productname";
	/**
	 * 项目
	 */
	public static final String PROJECT = "project";
	/**
	 * 人工预估
	 */
	public static final String PSNCOST = "psncost";
	/**
	 * 行号
	 */
	public static final String ROWNO = "rowno";
	/**
	 * 来源单据子表id
	 */
	public static final String SRCBILLBID = "srcbillbid";
	/**
	 * 来源单据id
	 */
	public static final String SRCBILLID = "srcbillid";
	/**
	 * 来源单据类型
	 */
	public static final String SRCBILLTYPE = "srcbilltype";
	/**
	 * 开工依据
	 */
	public static final String STARTSBASE = "startsbase";
	/**
	 * 总计
	 */
	public static final String TOTALCOST = "totalcost";
	/**
	 * 时间戳
	 */
	public UFDateTime ts;
	/**
	 * 年份
	 */
	public static final String YEAR = "year";

	/**
	 * 获取实际完工日期
	 * 
	 * @return 实际完工日期
	 */
	public UFDate getActcompletdate() {
		return (UFDate) this.getAttributeValue(OrderEndSubVO.ACTCOMPLETDATE);
	}

	/**
	 * 设置实际完工日期
	 * 
	 * @param actcompletdate
	 *            实际完工日期
	 */
	public void setActcompletdate(UFDate actcompletdate) {
		this.setAttributeValue(OrderEndSubVO.ACTCOMPLETDATE, actcompletdate);
	}

	/**
	 * 获取分项目
	 * 
	 * @return 分项目
	 */
	public String getChildproject() {
		return (String) this.getAttributeValue(OrderEndSubVO.CHILDPROJECT);
	}

	/**
	 * 设置分项目
	 * 
	 * @param childproject
	 *            分项目
	 */
	public void setChildproject(String childproject) {
		this.setAttributeValue(OrderEndSubVO.CHILDPROJECT, childproject);
	}

	/**
	 * 获取外协预估
	 * 
	 * @return 外协预估
	 */
	public UFDouble getCommunicatecost() {
		return (UFDouble) this.getAttributeValue(OrderEndSubVO.COMMUNICATECOST);
	}

	/**
	 * 设置外协预估
	 * 
	 * @param communicatecost
	 *            外协预估
	 */
	public void setCommunicatecost(UFDouble communicatecost) {
		this.setAttributeValue(OrderEndSubVO.COMMUNICATECOST, communicatecost);
	}

	/**
	 * 获取创建时间
	 * 
	 * @return 创建时间
	 */
	public UFDate getCreationtime() {
		return (UFDate) this.getAttributeValue(OrderEndSubVO.CREATIONTIME);
	}

	/**
	 * 设置创建时间
	 * 
	 * @param creationtime
	 *            创建时间
	 */
	public void setCreationtime(UFDate creationtime) {
		this.setAttributeValue(OrderEndSubVO.CREATIONTIME, creationtime);
	}

	/**
	 * 获取创建人
	 * 
	 * @return 创建人
	 */
	public String getCreator() {
		return (String) this.getAttributeValue(OrderEndSubVO.CREATOR);
	}

	/**
	 * 设置创建人
	 * 
	 * @param creator
	 *            创建人
	 */
	public void setCreator(String creator) {
		this.setAttributeValue(OrderEndSubVO.CREATOR, creator);
	}

	/**
	 * 获取自定义项1
	 * 
	 * @return 自定义项1
	 */
	public String getDef1() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF1);
	}

	/**
	 * 设置自定义项1
	 * 
	 * @param def1
	 *            自定义项1
	 */
	public void setDef1(String def1) {
		this.setAttributeValue(OrderEndSubVO.DEF1, def1);
	}

	/**
	 * 获取自定义项10
	 * 
	 * @return 自定义项10
	 */
	public String getDef10() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF10);
	}

	/**
	 * 设置自定义项10
	 * 
	 * @param def10
	 *            自定义项10
	 */
	public void setDef10(String def10) {
		this.setAttributeValue(OrderEndSubVO.DEF10, def10);
	}

	/**
	 * 获取自定义项11
	 * 
	 * @return 自定义项11
	 */
	public String getDef11() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF11);
	}

	/**
	 * 设置自定义项11
	 * 
	 * @param def11
	 *            自定义项11
	 */
	public void setDef11(String def11) {
		this.setAttributeValue(OrderEndSubVO.DEF11, def11);
	}

	/**
	 * 获取自定义项12
	 * 
	 * @return 自定义项12
	 */
	public String getDef12() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF12);
	}

	/**
	 * 设置自定义项12
	 * 
	 * @param def12
	 *            自定义项12
	 */
	public void setDef12(String def12) {
		this.setAttributeValue(OrderEndSubVO.DEF12, def12);
	}

	/**
	 * 获取自定义项13
	 * 
	 * @return 自定义项13
	 */
	public String getDef13() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF13);
	}

	/**
	 * 设置自定义项13
	 * 
	 * @param def13
	 *            自定义项13
	 */
	public void setDef13(String def13) {
		this.setAttributeValue(OrderEndSubVO.DEF13, def13);
	}

	/**
	 * 获取自定义项14
	 * 
	 * @return 自定义项14
	 */
	public String getDef14() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF14);
	}

	/**
	 * 设置自定义项14
	 * 
	 * @param def14
	 *            自定义项14
	 */
	public void setDef14(String def14) {
		this.setAttributeValue(OrderEndSubVO.DEF14, def14);
	}

	/**
	 * 获取自定义项15
	 * 
	 * @return 自定义项15
	 */
	public String getDef15() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF15);
	}

	/**
	 * 设置自定义项15
	 * 
	 * @param def15
	 *            自定义项15
	 */
	public void setDef15(String def15) {
		this.setAttributeValue(OrderEndSubVO.DEF15, def15);
	}

	/**
	 * 获取自定义项16
	 * 
	 * @return 自定义项16
	 */
	public String getDef16() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF16);
	}

	/**
	 * 设置自定义项16
	 * 
	 * @param def16
	 *            自定义项16
	 */
	public void setDef16(String def16) {
		this.setAttributeValue(OrderEndSubVO.DEF16, def16);
	}

	/**
	 * 获取自定义项17
	 * 
	 * @return 自定义项17
	 */
	public String getDef17() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF17);
	}

	/**
	 * 设置自定义项17
	 * 
	 * @param def17
	 *            自定义项17
	 */
	public void setDef17(String def17) {
		this.setAttributeValue(OrderEndSubVO.DEF17, def17);
	}

	/**
	 * 获取自定义项18
	 * 
	 * @return 自定义项18
	 */
	public String getDef18() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF18);
	}

	/**
	 * 设置自定义项18
	 * 
	 * @param def18
	 *            自定义项18
	 */
	public void setDef18(String def18) {
		this.setAttributeValue(OrderEndSubVO.DEF18, def18);
	}

	/**
	 * 获取自定义项19
	 * 
	 * @return 自定义项19
	 */
	public String getDef19() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF19);
	}

	/**
	 * 设置自定义项19
	 * 
	 * @param def19
	 *            自定义项19
	 */
	public void setDef19(String def19) {
		this.setAttributeValue(OrderEndSubVO.DEF19, def19);
	}

	/**
	 * 获取自定义项2
	 * 
	 * @return 自定义项2
	 */
	public String getDef2() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF2);
	}

	/**
	 * 设置自定义项2
	 * 
	 * @param def2
	 *            自定义项2
	 */
	public void setDef2(String def2) {
		this.setAttributeValue(OrderEndSubVO.DEF2, def2);
	}

	/**
	 * 获取自定义项20
	 * 
	 * @return 自定义项20
	 */
	public String getDef20() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF20);
	}

	/**
	 * 设置自定义项20
	 * 
	 * @param def20
	 *            自定义项20
	 */
	public void setDef20(String def20) {
		this.setAttributeValue(OrderEndSubVO.DEF20, def20);
	}

	/**
	 * 获取自定义项21
	 * 
	 * @return 自定义项21
	 */
	public String getDef21() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF21);
	}

	/**
	 * 设置自定义项21
	 * 
	 * @param def21
	 *            自定义项21
	 */
	public void setDef21(String def21) {
		this.setAttributeValue(OrderEndSubVO.DEF21, def21);
	}

	/**
	 * 获取自定义项22
	 * 
	 * @return 自定义项22
	 */
	public String getDef22() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF22);
	}

	/**
	 * 设置自定义项22
	 * 
	 * @param def22
	 *            自定义项22
	 */
	public void setDef22(String def22) {
		this.setAttributeValue(OrderEndSubVO.DEF22, def22);
	}

	/**
	 * 获取自定义项23
	 * 
	 * @return 自定义项23
	 */
	public String getDef23() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF23);
	}

	/**
	 * 设置自定义项23
	 * 
	 * @param def23
	 *            自定义项23
	 */
	public void setDef23(String def23) {
		this.setAttributeValue(OrderEndSubVO.DEF23, def23);
	}

	/**
	 * 获取自定义项24
	 * 
	 * @return 自定义项24
	 */
	public String getDef24() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF24);
	}

	/**
	 * 设置自定义项24
	 * 
	 * @param def24
	 *            自定义项24
	 */
	public void setDef24(String def24) {
		this.setAttributeValue(OrderEndSubVO.DEF24, def24);
	}

	/**
	 * 获取自定义项25
	 * 
	 * @return 自定义项25
	 */
	public String getDef25() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF25);
	}

	/**
	 * 设置自定义项25
	 * 
	 * @param def25
	 *            自定义项25
	 */
	public void setDef25(String def25) {
		this.setAttributeValue(OrderEndSubVO.DEF25, def25);
	}

	/**
	 * 获取自定义项3
	 * 
	 * @return 自定义项3
	 */
	public String getDef3() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF3);
	}

	/**
	 * 设置自定义项3
	 * 
	 * @param def3
	 *            自定义项3
	 */
	public void setDef3(String def3) {
		this.setAttributeValue(OrderEndSubVO.DEF3, def3);
	}

	/**
	 * 获取自定义项4
	 * 
	 * @return 自定义项4
	 */
	public String getDef4() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF4);
	}

	/**
	 * 设置自定义项4
	 * 
	 * @param def4
	 *            自定义项4
	 */
	public void setDef4(String def4) {
		this.setAttributeValue(OrderEndSubVO.DEF4, def4);
	}

	/**
	 * 获取自定义项5
	 * 
	 * @return 自定义项5
	 */
	public String getDef5() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF5);
	}

	/**
	 * 设置自定义项5
	 * 
	 * @param def5
	 *            自定义项5
	 */
	public void setDef5(String def5) {
		this.setAttributeValue(OrderEndSubVO.DEF5, def5);
	}

	/**
	 * 获取自定义项6
	 * 
	 * @return 自定义项6
	 */
	public String getDef6() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF6);
	}

	/**
	 * 设置自定义项6
	 * 
	 * @param def6
	 *            自定义项6
	 */
	public void setDef6(String def6) {
		this.setAttributeValue(OrderEndSubVO.DEF6, def6);
	}

	/**
	 * 获取自定义项7
	 * 
	 * @return 自定义项7
	 */
	public String getDef7() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF7);
	}

	/**
	 * 设置自定义项7
	 * 
	 * @param def7
	 *            自定义项7
	 */
	public void setDef7(String def7) {
		this.setAttributeValue(OrderEndSubVO.DEF7, def7);
	}

	/**
	 * 获取自定义项8
	 * 
	 * @return 自定义项8
	 */
	public String getDef8() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF8);
	}

	/**
	 * 设置自定义项8
	 * 
	 * @param def8
	 *            自定义项8
	 */
	public void setDef8(String def8) {
		this.setAttributeValue(OrderEndSubVO.DEF8, def8);
	}

	/**
	 * 获取自定义项9
	 * 
	 * @return 自定义项9
	 */
	public String getDef9() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF9);
	}

	/**
	 * 设置自定义项9
	 * 
	 * @param def9
	 *            自定义项9
	 */
	public void setDef9(String def9) {
		this.setAttributeValue(OrderEndSubVO.DEF9, def9);
	}

	/**
	 * 获取工令号
	 * 
	 * @return 工令号
	 */
	public String getGl() {
		return (String) this.getAttributeValue(OrderEndSubVO.GL);
	}

	/**
	 * 设置工令号
	 * 
	 * @param gl
	 *            工令号
	 */
	public void setGl(String gl) {
		this.setAttributeValue(OrderEndSubVO.GL, gl);
	}

	/**
	 * 获取主办部门
	 * 
	 * @return 主办部门
	 */
	public String getHostdept() {
		return (String) this.getAttributeValue(OrderEndSubVO.HOSTDEPT);
	}

	/**
	 * 设置主办部门
	 * 
	 * @param hostdept
	 *            主办部门
	 */
	public void setHostdept(String hostdept) {
		this.setAttributeValue(OrderEndSubVO.HOSTDEPT, hostdept);
	}

	/**
	 * 获取材料预估
	 * 
	 * @return 材料预估
	 */
	public UFDouble getMeterialcost() {
		return (UFDouble) this.getAttributeValue(OrderEndSubVO.METERIALCOST);
	}

	/**
	 * 设置材料预估
	 * 
	 * @param meterialcost
	 *            材料预估
	 */
	public void setMeterialcost(UFDouble meterialcost) {
		this.setAttributeValue(OrderEndSubVO.METERIALCOST, meterialcost);
	}

	/**
	 * 获取修改时间
	 * 
	 * @return 修改时间
	 */
	public UFDate getModifiedtime() {
		return (UFDate) this.getAttributeValue(OrderEndSubVO.MODIFIEDTIME);
	}

	/**
	 * 设置修改时间
	 * 
	 * @param modifiedtime
	 *            修改时间
	 */
	public void setModifiedtime(UFDate modifiedtime) {
		this.setAttributeValue(OrderEndSubVO.MODIFIEDTIME, modifiedtime);
	}

	/**
	 * 获取修改人
	 * 
	 * @return 修改人
	 */
	public String getModifier() {
		return (String) this.getAttributeValue(OrderEndSubVO.MODIFIER);
	}

	/**
	 * 设置修改人
	 * 
	 * @param modifier
	 *            修改人
	 */
	public void setModifier(String modifier) {
		this.setAttributeValue(OrderEndSubVO.MODIFIER, modifier);
	}

	/**
	 * 获取备注
	 * 
	 * @return 备注
	 */
	public String getNote() {
		return (String) this.getAttributeValue(OrderEndSubVO.NOTE);
	}

	/**
	 * 设置备注
	 * 
	 * @param note
	 *            备注
	 */
	public void setNote(String note) {
		this.setAttributeValue(OrderEndSubVO.NOTE, note);
	}

	/**
	 * 获取工令状态
	 * 
	 * @return 工令状态
	 * @see String
	 */
	public String getOrderstatus() {
		return (String) this.getAttributeValue(OrderEndSubVO.ORDERSTATUS);
	}

	/**
	 * 设置工令状态
	 * 
	 * @param orderstatus
	 *            工令状态
	 * @see String
	 */
	public void setOrderstatus(String orderstatus) {
		this.setAttributeValue(OrderEndSubVO.ORDERSTATUS, orderstatus);
	}

	/**
	 * 获取其他
	 * 
	 * @return 其他
	 */
	public UFDouble getOtherscost() {
		return (UFDouble) this.getAttributeValue(OrderEndSubVO.OTHERSCOST);
	}

	/**
	 * 设置其他
	 * 
	 * @param otherscost
	 *            其他
	 */
	public void setOtherscost(UFDouble otherscost) {
		this.setAttributeValue(OrderEndSubVO.OTHERSCOST, otherscost);
	}

	/**
	 * 获取上层单据主键
	 * 
	 * @return 上层单据主键
	 */
	public String getPk_ordersheet() {
		return this.pk_ordersheet;
	}

	/**
	 * 设置上层单据主键
	 * 
	 * @param pk_ordersheet
	 *            上层单据主键
	 */
	public void setPk_ordersheet(String pk_ordersheet) {
		this.pk_ordersheet = pk_ordersheet;
	}

	/**
	 * 获取子表主键
	 * 
	 * @return 子表主键
	 */
	public String getPk_ordersub() {
		return this.pk_ordersub;
	}

	/**
	 * 设置子表主键
	 * 
	 * @param pk_ordersub
	 *            子表主键
	 */
	public void setPk_ordersub(String pk_ordersub) {
		this.pk_ordersub = pk_ordersub;
	}

	/**
	 * 获取计划完工日期
	 * 
	 * @return 计划完工日期
	 */
	public UFDate getPlanenddate() {
		return (UFDate) this.getAttributeValue(OrderEndSubVO.PLANENDDATE);
	}

	/**
	 * 设置计划完工日期
	 * 
	 * @param planenddate
	 *            计划完工日期
	 */
	public void setPlanenddate(UFDate planenddate) {
		this.setAttributeValue(OrderEndSubVO.PLANENDDATE, planenddate);
	}

	/**
	 * 获取计划开工日期
	 * 
	 * @return 计划开工日期
	 */
	public UFDate getPlanstartdate() {
		return (UFDate) this.getAttributeValue(OrderEndSubVO.PLANSTARTDATE);
	}

	/**
	 * 设置计划开工日期
	 * 
	 * @param planstartdate
	 *            计划开工日期
	 */
	public void setPlanstartdate(UFDate planstartdate) {
		this.setAttributeValue(OrderEndSubVO.PLANSTARTDATE, planstartdate);
	}

	/**
	 * 获取产品工程名称
	 * 
	 * @return 产品工程名称
	 */
	public String getProductname() {
		return (String) this.getAttributeValue(OrderEndSubVO.PRODUCTNAME);
	}

	/**
	 * 设置产品工程名称
	 * 
	 * @param productname
	 *            产品工程名称
	 */
	public void setProductname(String productname) {
		this.setAttributeValue(OrderEndSubVO.PRODUCTNAME, productname);
	}

	/**
	 * 获取项目
	 * 
	 * @return 项目
	 */
	public String getProject() {
		return (String) this.getAttributeValue(OrderEndSubVO.PROJECT);
	}

	/**
	 * 设置项目
	 * 
	 * @param project
	 *            项目
	 */
	public void setProject(String project) {
		this.setAttributeValue(OrderEndSubVO.PROJECT, project);
	}

	/**
	 * 获取人工预估
	 * 
	 * @return 人工预估
	 */
	public UFDouble getPsncost() {
		return (UFDouble) this.getAttributeValue(OrderEndSubVO.PSNCOST);
	}

	/**
	 * 设置人工预估
	 * 
	 * @param psncost
	 *            人工预估
	 */
	public void setPsncost(UFDouble psncost) {
		this.setAttributeValue(OrderEndSubVO.PSNCOST, psncost);
	}

	/**
	 * 获取行号
	 * 
	 * @return 行号
	 */
	public String getRowno() {
		return (String) this.getAttributeValue(OrderEndSubVO.ROWNO);
	}

	/**
	 * 设置行号
	 * 
	 * @param rowno
	 *            行号
	 */
	public void setRowno(String rowno) {
		this.setAttributeValue(OrderEndSubVO.ROWNO, rowno);
	}

	/**
	 * 获取来源单据子表id
	 * 
	 * @return 来源单据子表id
	 */
	public String getSrcbillbid() {
		return (String) this.getAttributeValue(OrderEndSubVO.SRCBILLBID);
	}

	/**
	 * 设置来源单据子表id
	 * 
	 * @param srcbillbid
	 *            来源单据子表id
	 */
	public void setSrcbillbid(String srcbillbid) {
		this.setAttributeValue(OrderEndSubVO.SRCBILLBID, srcbillbid);
	}

	/**
	 * 获取来源单据id
	 * 
	 * @return 来源单据id
	 */
	public String getSrcbillid() {
		return (String) this.getAttributeValue(OrderEndSubVO.SRCBILLID);
	}

	/**
	 * 设置来源单据id
	 * 
	 * @param srcbillid
	 *            来源单据id
	 */
	public void setSrcbillid(String srcbillid) {
		this.setAttributeValue(OrderEndSubVO.SRCBILLID, srcbillid);
	}

	/**
	 * 获取来源单据类型
	 * 
	 * @return 来源单据类型
	 */
	public String getSrcbilltype() {
		return (String) this.getAttributeValue(OrderEndSubVO.SRCBILLTYPE);
	}

	/**
	 * 设置来源单据类型
	 * 
	 * @param srcbilltype
	 *            来源单据类型
	 */
	public void setSrcbilltype(String srcbilltype) {
		this.setAttributeValue(OrderEndSubVO.SRCBILLTYPE, srcbilltype);
	}

	/**
	 * 获取开工依据
	 * 
	 * @return 开工依据
	 */
	public String getStartsbase() {
		return (String) this.getAttributeValue(OrderEndSubVO.STARTSBASE);
	}

	/**
	 * 设置开工依据
	 * 
	 * @param startsbase
	 *            开工依据
	 */
	public void setStartsbase(String startsbase) {
		this.setAttributeValue(OrderEndSubVO.STARTSBASE, startsbase);
	}

	/**
	 * 获取总计
	 * 
	 * @return 总计
	 */
	public UFDouble getTotalcost() {
		return (UFDouble) this.getAttributeValue(OrderEndSubVO.TOTALCOST);
	}

	/**
	 * 设置总计
	 * 
	 * @param totalcost
	 *            总计
	 */
	public void setTotalcost(UFDouble totalcost) {
		this.setAttributeValue(OrderEndSubVO.TOTALCOST, totalcost);
	}

	/**
	 * 获取时间戳
	 * 
	 * @return 时间戳
	 */
	public UFDateTime getTs() {
		return this.ts;
	}

	/**
	 * 设置时间戳
	 * 
	 * @param ts
	 *            时间戳
	 */
	public void setTs(UFDateTime ts) {
		this.ts = ts;
	}

	/**
	 * 获取年份
	 * 
	 * @return 年份
	 */
	public Integer getYear() {
		return (Integer) this.getAttributeValue(OrderEndSubVO.YEAR);
	}

	/**
	 * 设置年份
	 * 
	 * @param year
	 *            年份
	 */
	public void setYear(Integer year) {
		this.setAttributeValue(OrderEndSubVO.YEAR, year);
	}

	@Override
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("jxc_hr.OrderEndSubVO");
	}
}