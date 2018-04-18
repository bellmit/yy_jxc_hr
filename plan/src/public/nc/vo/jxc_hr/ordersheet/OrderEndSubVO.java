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
	 * ʵ���깤����
	 */
	public static final String ACTCOMPLETDATE = "actcompletdate";
	/**
	 * ����Ŀ
	 */
	public static final String CHILDPROJECT = "childproject";
	/**
	 * ��ЭԤ��
	 */
	public static final String COMMUNICATECOST = "communicatecost";
	/**
	 * ����ʱ��
	 */
	public static final String CREATIONTIME = "creationtime";
	/**
	 * ������
	 */
	public static final String CREATOR = "creator";
	/**
	 * �Զ�����1
	 */
	public static final String DEF1 = "def1";
	/**
	 * �Զ�����10
	 */
	public static final String DEF10 = "def10";
	/**
	 * �Զ�����11
	 */
	public static final String DEF11 = "def11";
	/**
	 * �Զ�����12
	 */
	public static final String DEF12 = "def12";
	/**
	 * �Զ�����13
	 */
	public static final String DEF13 = "def13";
	/**
	 * �Զ�����14
	 */
	public static final String DEF14 = "def14";
	/**
	 * �Զ�����15
	 */
	public static final String DEF15 = "def15";
	/**
	 * �Զ�����16
	 */
	public static final String DEF16 = "def16";
	/**
	 * �Զ�����17
	 */
	public static final String DEF17 = "def17";
	/**
	 * �Զ�����18
	 */
	public static final String DEF18 = "def18";
	/**
	 * �Զ�����19
	 */
	public static final String DEF19 = "def19";
	/**
	 * �Զ�����2
	 */
	public static final String DEF2 = "def2";
	/**
	 * �Զ�����20
	 */
	public static final String DEF20 = "def20";
	/**
	 * �Զ�����21
	 */
	public static final String DEF21 = "def21";
	/**
	 * �Զ�����22
	 */
	public static final String DEF22 = "def22";
	/**
	 * �Զ�����23
	 */
	public static final String DEF23 = "def23";
	/**
	 * �Զ�����24
	 */
	public static final String DEF24 = "def24";
	/**
	 * �Զ�����25
	 */
	public static final String DEF25 = "def25";
	/**
	 * �Զ�����3
	 */
	public static final String DEF3 = "def3";
	/**
	 * �Զ�����4
	 */
	public static final String DEF4 = "def4";
	/**
	 * �Զ�����5
	 */
	public static final String DEF5 = "def5";
	/**
	 * �Զ�����6
	 */
	public static final String DEF6 = "def6";
	/**
	 * �Զ�����7
	 */
	public static final String DEF7 = "def7";
	/**
	 * �Զ�����8
	 */
	public static final String DEF8 = "def8";
	/**
	 * �Զ�����9
	 */
	public static final String DEF9 = "def9";
	/**
	 * �����
	 */
	public static final String GL = "gl";
	/**
	 * ���첿��
	 */
	public static final String HOSTDEPT = "hostdept";
	/**
	 * ����Ԥ��
	 */
	public static final String METERIALCOST = "meterialcost";
	/**
	 * �޸�ʱ��
	 */
	public static final String MODIFIEDTIME = "modifiedtime";
	/**
	 * �޸���
	 */
	public static final String MODIFIER = "modifier";
	/**
	 * ��ע
	 */
	public static final String NOTE = "note";
	/**
	 * ����״̬
	 */
	public static final String ORDERSTATUS = "orderstatus";
	/**
	 * ����
	 */
	public static final String OTHERSCOST = "otherscost";
	/**
	 * �ϲ㵥������
	 */
	public String pk_ordersheet;
	/**
	 * �ӱ�����
	 */
	public String pk_ordersub;
	/**
	 * �ƻ��깤����
	 */
	public static final String PLANENDDATE = "planenddate";
	/**
	 * �ƻ���������
	 */
	public static final String PLANSTARTDATE = "planstartdate";
	/**
	 * ��Ʒ��������
	 */
	public static final String PRODUCTNAME = "productname";
	/**
	 * ��Ŀ
	 */
	public static final String PROJECT = "project";
	/**
	 * �˹�Ԥ��
	 */
	public static final String PSNCOST = "psncost";
	/**
	 * �к�
	 */
	public static final String ROWNO = "rowno";
	/**
	 * ��Դ�����ӱ�id
	 */
	public static final String SRCBILLBID = "srcbillbid";
	/**
	 * ��Դ����id
	 */
	public static final String SRCBILLID = "srcbillid";
	/**
	 * ��Դ��������
	 */
	public static final String SRCBILLTYPE = "srcbilltype";
	/**
	 * ��������
	 */
	public static final String STARTSBASE = "startsbase";
	/**
	 * �ܼ�
	 */
	public static final String TOTALCOST = "totalcost";
	/**
	 * ʱ���
	 */
	public UFDateTime ts;
	/**
	 * ���
	 */
	public static final String YEAR = "year";

	/**
	 * ��ȡʵ���깤����
	 * 
	 * @return ʵ���깤����
	 */
	public UFDate getActcompletdate() {
		return (UFDate) this.getAttributeValue(OrderEndSubVO.ACTCOMPLETDATE);
	}

	/**
	 * ����ʵ���깤����
	 * 
	 * @param actcompletdate
	 *            ʵ���깤����
	 */
	public void setActcompletdate(UFDate actcompletdate) {
		this.setAttributeValue(OrderEndSubVO.ACTCOMPLETDATE, actcompletdate);
	}

	/**
	 * ��ȡ����Ŀ
	 * 
	 * @return ����Ŀ
	 */
	public String getChildproject() {
		return (String) this.getAttributeValue(OrderEndSubVO.CHILDPROJECT);
	}

	/**
	 * ���÷���Ŀ
	 * 
	 * @param childproject
	 *            ����Ŀ
	 */
	public void setChildproject(String childproject) {
		this.setAttributeValue(OrderEndSubVO.CHILDPROJECT, childproject);
	}

	/**
	 * ��ȡ��ЭԤ��
	 * 
	 * @return ��ЭԤ��
	 */
	public UFDouble getCommunicatecost() {
		return (UFDouble) this.getAttributeValue(OrderEndSubVO.COMMUNICATECOST);
	}

	/**
	 * ������ЭԤ��
	 * 
	 * @param communicatecost
	 *            ��ЭԤ��
	 */
	public void setCommunicatecost(UFDouble communicatecost) {
		this.setAttributeValue(OrderEndSubVO.COMMUNICATECOST, communicatecost);
	}

	/**
	 * ��ȡ����ʱ��
	 * 
	 * @return ����ʱ��
	 */
	public UFDate getCreationtime() {
		return (UFDate) this.getAttributeValue(OrderEndSubVO.CREATIONTIME);
	}

	/**
	 * ���ô���ʱ��
	 * 
	 * @param creationtime
	 *            ����ʱ��
	 */
	public void setCreationtime(UFDate creationtime) {
		this.setAttributeValue(OrderEndSubVO.CREATIONTIME, creationtime);
	}

	/**
	 * ��ȡ������
	 * 
	 * @return ������
	 */
	public String getCreator() {
		return (String) this.getAttributeValue(OrderEndSubVO.CREATOR);
	}

	/**
	 * ���ô�����
	 * 
	 * @param creator
	 *            ������
	 */
	public void setCreator(String creator) {
		this.setAttributeValue(OrderEndSubVO.CREATOR, creator);
	}

	/**
	 * ��ȡ�Զ�����1
	 * 
	 * @return �Զ�����1
	 */
	public String getDef1() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF1);
	}

	/**
	 * �����Զ�����1
	 * 
	 * @param def1
	 *            �Զ�����1
	 */
	public void setDef1(String def1) {
		this.setAttributeValue(OrderEndSubVO.DEF1, def1);
	}

	/**
	 * ��ȡ�Զ�����10
	 * 
	 * @return �Զ�����10
	 */
	public String getDef10() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF10);
	}

	/**
	 * �����Զ�����10
	 * 
	 * @param def10
	 *            �Զ�����10
	 */
	public void setDef10(String def10) {
		this.setAttributeValue(OrderEndSubVO.DEF10, def10);
	}

	/**
	 * ��ȡ�Զ�����11
	 * 
	 * @return �Զ�����11
	 */
	public String getDef11() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF11);
	}

	/**
	 * �����Զ�����11
	 * 
	 * @param def11
	 *            �Զ�����11
	 */
	public void setDef11(String def11) {
		this.setAttributeValue(OrderEndSubVO.DEF11, def11);
	}

	/**
	 * ��ȡ�Զ�����12
	 * 
	 * @return �Զ�����12
	 */
	public String getDef12() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF12);
	}

	/**
	 * �����Զ�����12
	 * 
	 * @param def12
	 *            �Զ�����12
	 */
	public void setDef12(String def12) {
		this.setAttributeValue(OrderEndSubVO.DEF12, def12);
	}

	/**
	 * ��ȡ�Զ�����13
	 * 
	 * @return �Զ�����13
	 */
	public String getDef13() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF13);
	}

	/**
	 * �����Զ�����13
	 * 
	 * @param def13
	 *            �Զ�����13
	 */
	public void setDef13(String def13) {
		this.setAttributeValue(OrderEndSubVO.DEF13, def13);
	}

	/**
	 * ��ȡ�Զ�����14
	 * 
	 * @return �Զ�����14
	 */
	public String getDef14() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF14);
	}

	/**
	 * �����Զ�����14
	 * 
	 * @param def14
	 *            �Զ�����14
	 */
	public void setDef14(String def14) {
		this.setAttributeValue(OrderEndSubVO.DEF14, def14);
	}

	/**
	 * ��ȡ�Զ�����15
	 * 
	 * @return �Զ�����15
	 */
	public String getDef15() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF15);
	}

	/**
	 * �����Զ�����15
	 * 
	 * @param def15
	 *            �Զ�����15
	 */
	public void setDef15(String def15) {
		this.setAttributeValue(OrderEndSubVO.DEF15, def15);
	}

	/**
	 * ��ȡ�Զ�����16
	 * 
	 * @return �Զ�����16
	 */
	public String getDef16() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF16);
	}

	/**
	 * �����Զ�����16
	 * 
	 * @param def16
	 *            �Զ�����16
	 */
	public void setDef16(String def16) {
		this.setAttributeValue(OrderEndSubVO.DEF16, def16);
	}

	/**
	 * ��ȡ�Զ�����17
	 * 
	 * @return �Զ�����17
	 */
	public String getDef17() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF17);
	}

	/**
	 * �����Զ�����17
	 * 
	 * @param def17
	 *            �Զ�����17
	 */
	public void setDef17(String def17) {
		this.setAttributeValue(OrderEndSubVO.DEF17, def17);
	}

	/**
	 * ��ȡ�Զ�����18
	 * 
	 * @return �Զ�����18
	 */
	public String getDef18() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF18);
	}

	/**
	 * �����Զ�����18
	 * 
	 * @param def18
	 *            �Զ�����18
	 */
	public void setDef18(String def18) {
		this.setAttributeValue(OrderEndSubVO.DEF18, def18);
	}

	/**
	 * ��ȡ�Զ�����19
	 * 
	 * @return �Զ�����19
	 */
	public String getDef19() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF19);
	}

	/**
	 * �����Զ�����19
	 * 
	 * @param def19
	 *            �Զ�����19
	 */
	public void setDef19(String def19) {
		this.setAttributeValue(OrderEndSubVO.DEF19, def19);
	}

	/**
	 * ��ȡ�Զ�����2
	 * 
	 * @return �Զ�����2
	 */
	public String getDef2() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF2);
	}

	/**
	 * �����Զ�����2
	 * 
	 * @param def2
	 *            �Զ�����2
	 */
	public void setDef2(String def2) {
		this.setAttributeValue(OrderEndSubVO.DEF2, def2);
	}

	/**
	 * ��ȡ�Զ�����20
	 * 
	 * @return �Զ�����20
	 */
	public String getDef20() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF20);
	}

	/**
	 * �����Զ�����20
	 * 
	 * @param def20
	 *            �Զ�����20
	 */
	public void setDef20(String def20) {
		this.setAttributeValue(OrderEndSubVO.DEF20, def20);
	}

	/**
	 * ��ȡ�Զ�����21
	 * 
	 * @return �Զ�����21
	 */
	public String getDef21() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF21);
	}

	/**
	 * �����Զ�����21
	 * 
	 * @param def21
	 *            �Զ�����21
	 */
	public void setDef21(String def21) {
		this.setAttributeValue(OrderEndSubVO.DEF21, def21);
	}

	/**
	 * ��ȡ�Զ�����22
	 * 
	 * @return �Զ�����22
	 */
	public String getDef22() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF22);
	}

	/**
	 * �����Զ�����22
	 * 
	 * @param def22
	 *            �Զ�����22
	 */
	public void setDef22(String def22) {
		this.setAttributeValue(OrderEndSubVO.DEF22, def22);
	}

	/**
	 * ��ȡ�Զ�����23
	 * 
	 * @return �Զ�����23
	 */
	public String getDef23() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF23);
	}

	/**
	 * �����Զ�����23
	 * 
	 * @param def23
	 *            �Զ�����23
	 */
	public void setDef23(String def23) {
		this.setAttributeValue(OrderEndSubVO.DEF23, def23);
	}

	/**
	 * ��ȡ�Զ�����24
	 * 
	 * @return �Զ�����24
	 */
	public String getDef24() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF24);
	}

	/**
	 * �����Զ�����24
	 * 
	 * @param def24
	 *            �Զ�����24
	 */
	public void setDef24(String def24) {
		this.setAttributeValue(OrderEndSubVO.DEF24, def24);
	}

	/**
	 * ��ȡ�Զ�����25
	 * 
	 * @return �Զ�����25
	 */
	public String getDef25() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF25);
	}

	/**
	 * �����Զ�����25
	 * 
	 * @param def25
	 *            �Զ�����25
	 */
	public void setDef25(String def25) {
		this.setAttributeValue(OrderEndSubVO.DEF25, def25);
	}

	/**
	 * ��ȡ�Զ�����3
	 * 
	 * @return �Զ�����3
	 */
	public String getDef3() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF3);
	}

	/**
	 * �����Զ�����3
	 * 
	 * @param def3
	 *            �Զ�����3
	 */
	public void setDef3(String def3) {
		this.setAttributeValue(OrderEndSubVO.DEF3, def3);
	}

	/**
	 * ��ȡ�Զ�����4
	 * 
	 * @return �Զ�����4
	 */
	public String getDef4() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF4);
	}

	/**
	 * �����Զ�����4
	 * 
	 * @param def4
	 *            �Զ�����4
	 */
	public void setDef4(String def4) {
		this.setAttributeValue(OrderEndSubVO.DEF4, def4);
	}

	/**
	 * ��ȡ�Զ�����5
	 * 
	 * @return �Զ�����5
	 */
	public String getDef5() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF5);
	}

	/**
	 * �����Զ�����5
	 * 
	 * @param def5
	 *            �Զ�����5
	 */
	public void setDef5(String def5) {
		this.setAttributeValue(OrderEndSubVO.DEF5, def5);
	}

	/**
	 * ��ȡ�Զ�����6
	 * 
	 * @return �Զ�����6
	 */
	public String getDef6() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF6);
	}

	/**
	 * �����Զ�����6
	 * 
	 * @param def6
	 *            �Զ�����6
	 */
	public void setDef6(String def6) {
		this.setAttributeValue(OrderEndSubVO.DEF6, def6);
	}

	/**
	 * ��ȡ�Զ�����7
	 * 
	 * @return �Զ�����7
	 */
	public String getDef7() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF7);
	}

	/**
	 * �����Զ�����7
	 * 
	 * @param def7
	 *            �Զ�����7
	 */
	public void setDef7(String def7) {
		this.setAttributeValue(OrderEndSubVO.DEF7, def7);
	}

	/**
	 * ��ȡ�Զ�����8
	 * 
	 * @return �Զ�����8
	 */
	public String getDef8() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF8);
	}

	/**
	 * �����Զ�����8
	 * 
	 * @param def8
	 *            �Զ�����8
	 */
	public void setDef8(String def8) {
		this.setAttributeValue(OrderEndSubVO.DEF8, def8);
	}

	/**
	 * ��ȡ�Զ�����9
	 * 
	 * @return �Զ�����9
	 */
	public String getDef9() {
		return (String) this.getAttributeValue(OrderEndSubVO.DEF9);
	}

	/**
	 * �����Զ�����9
	 * 
	 * @param def9
	 *            �Զ�����9
	 */
	public void setDef9(String def9) {
		this.setAttributeValue(OrderEndSubVO.DEF9, def9);
	}

	/**
	 * ��ȡ�����
	 * 
	 * @return �����
	 */
	public String getGl() {
		return (String) this.getAttributeValue(OrderEndSubVO.GL);
	}

	/**
	 * ���ù����
	 * 
	 * @param gl
	 *            �����
	 */
	public void setGl(String gl) {
		this.setAttributeValue(OrderEndSubVO.GL, gl);
	}

	/**
	 * ��ȡ���첿��
	 * 
	 * @return ���첿��
	 */
	public String getHostdept() {
		return (String) this.getAttributeValue(OrderEndSubVO.HOSTDEPT);
	}

	/**
	 * �������첿��
	 * 
	 * @param hostdept
	 *            ���첿��
	 */
	public void setHostdept(String hostdept) {
		this.setAttributeValue(OrderEndSubVO.HOSTDEPT, hostdept);
	}

	/**
	 * ��ȡ����Ԥ��
	 * 
	 * @return ����Ԥ��
	 */
	public UFDouble getMeterialcost() {
		return (UFDouble) this.getAttributeValue(OrderEndSubVO.METERIALCOST);
	}

	/**
	 * ���ò���Ԥ��
	 * 
	 * @param meterialcost
	 *            ����Ԥ��
	 */
	public void setMeterialcost(UFDouble meterialcost) {
		this.setAttributeValue(OrderEndSubVO.METERIALCOST, meterialcost);
	}

	/**
	 * ��ȡ�޸�ʱ��
	 * 
	 * @return �޸�ʱ��
	 */
	public UFDate getModifiedtime() {
		return (UFDate) this.getAttributeValue(OrderEndSubVO.MODIFIEDTIME);
	}

	/**
	 * �����޸�ʱ��
	 * 
	 * @param modifiedtime
	 *            �޸�ʱ��
	 */
	public void setModifiedtime(UFDate modifiedtime) {
		this.setAttributeValue(OrderEndSubVO.MODIFIEDTIME, modifiedtime);
	}

	/**
	 * ��ȡ�޸���
	 * 
	 * @return �޸���
	 */
	public String getModifier() {
		return (String) this.getAttributeValue(OrderEndSubVO.MODIFIER);
	}

	/**
	 * �����޸���
	 * 
	 * @param modifier
	 *            �޸���
	 */
	public void setModifier(String modifier) {
		this.setAttributeValue(OrderEndSubVO.MODIFIER, modifier);
	}

	/**
	 * ��ȡ��ע
	 * 
	 * @return ��ע
	 */
	public String getNote() {
		return (String) this.getAttributeValue(OrderEndSubVO.NOTE);
	}

	/**
	 * ���ñ�ע
	 * 
	 * @param note
	 *            ��ע
	 */
	public void setNote(String note) {
		this.setAttributeValue(OrderEndSubVO.NOTE, note);
	}

	/**
	 * ��ȡ����״̬
	 * 
	 * @return ����״̬
	 * @see String
	 */
	public String getOrderstatus() {
		return (String) this.getAttributeValue(OrderEndSubVO.ORDERSTATUS);
	}

	/**
	 * ���ù���״̬
	 * 
	 * @param orderstatus
	 *            ����״̬
	 * @see String
	 */
	public void setOrderstatus(String orderstatus) {
		this.setAttributeValue(OrderEndSubVO.ORDERSTATUS, orderstatus);
	}

	/**
	 * ��ȡ����
	 * 
	 * @return ����
	 */
	public UFDouble getOtherscost() {
		return (UFDouble) this.getAttributeValue(OrderEndSubVO.OTHERSCOST);
	}

	/**
	 * ��������
	 * 
	 * @param otherscost
	 *            ����
	 */
	public void setOtherscost(UFDouble otherscost) {
		this.setAttributeValue(OrderEndSubVO.OTHERSCOST, otherscost);
	}

	/**
	 * ��ȡ�ϲ㵥������
	 * 
	 * @return �ϲ㵥������
	 */
	public String getPk_ordersheet() {
		return this.pk_ordersheet;
	}

	/**
	 * �����ϲ㵥������
	 * 
	 * @param pk_ordersheet
	 *            �ϲ㵥������
	 */
	public void setPk_ordersheet(String pk_ordersheet) {
		this.pk_ordersheet = pk_ordersheet;
	}

	/**
	 * ��ȡ�ӱ�����
	 * 
	 * @return �ӱ�����
	 */
	public String getPk_ordersub() {
		return this.pk_ordersub;
	}

	/**
	 * �����ӱ�����
	 * 
	 * @param pk_ordersub
	 *            �ӱ�����
	 */
	public void setPk_ordersub(String pk_ordersub) {
		this.pk_ordersub = pk_ordersub;
	}

	/**
	 * ��ȡ�ƻ��깤����
	 * 
	 * @return �ƻ��깤����
	 */
	public UFDate getPlanenddate() {
		return (UFDate) this.getAttributeValue(OrderEndSubVO.PLANENDDATE);
	}

	/**
	 * ���üƻ��깤����
	 * 
	 * @param planenddate
	 *            �ƻ��깤����
	 */
	public void setPlanenddate(UFDate planenddate) {
		this.setAttributeValue(OrderEndSubVO.PLANENDDATE, planenddate);
	}

	/**
	 * ��ȡ�ƻ���������
	 * 
	 * @return �ƻ���������
	 */
	public UFDate getPlanstartdate() {
		return (UFDate) this.getAttributeValue(OrderEndSubVO.PLANSTARTDATE);
	}

	/**
	 * ���üƻ���������
	 * 
	 * @param planstartdate
	 *            �ƻ���������
	 */
	public void setPlanstartdate(UFDate planstartdate) {
		this.setAttributeValue(OrderEndSubVO.PLANSTARTDATE, planstartdate);
	}

	/**
	 * ��ȡ��Ʒ��������
	 * 
	 * @return ��Ʒ��������
	 */
	public String getProductname() {
		return (String) this.getAttributeValue(OrderEndSubVO.PRODUCTNAME);
	}

	/**
	 * ���ò�Ʒ��������
	 * 
	 * @param productname
	 *            ��Ʒ��������
	 */
	public void setProductname(String productname) {
		this.setAttributeValue(OrderEndSubVO.PRODUCTNAME, productname);
	}

	/**
	 * ��ȡ��Ŀ
	 * 
	 * @return ��Ŀ
	 */
	public String getProject() {
		return (String) this.getAttributeValue(OrderEndSubVO.PROJECT);
	}

	/**
	 * ������Ŀ
	 * 
	 * @param project
	 *            ��Ŀ
	 */
	public void setProject(String project) {
		this.setAttributeValue(OrderEndSubVO.PROJECT, project);
	}

	/**
	 * ��ȡ�˹�Ԥ��
	 * 
	 * @return �˹�Ԥ��
	 */
	public UFDouble getPsncost() {
		return (UFDouble) this.getAttributeValue(OrderEndSubVO.PSNCOST);
	}

	/**
	 * �����˹�Ԥ��
	 * 
	 * @param psncost
	 *            �˹�Ԥ��
	 */
	public void setPsncost(UFDouble psncost) {
		this.setAttributeValue(OrderEndSubVO.PSNCOST, psncost);
	}

	/**
	 * ��ȡ�к�
	 * 
	 * @return �к�
	 */
	public String getRowno() {
		return (String) this.getAttributeValue(OrderEndSubVO.ROWNO);
	}

	/**
	 * �����к�
	 * 
	 * @param rowno
	 *            �к�
	 */
	public void setRowno(String rowno) {
		this.setAttributeValue(OrderEndSubVO.ROWNO, rowno);
	}

	/**
	 * ��ȡ��Դ�����ӱ�id
	 * 
	 * @return ��Դ�����ӱ�id
	 */
	public String getSrcbillbid() {
		return (String) this.getAttributeValue(OrderEndSubVO.SRCBILLBID);
	}

	/**
	 * ������Դ�����ӱ�id
	 * 
	 * @param srcbillbid
	 *            ��Դ�����ӱ�id
	 */
	public void setSrcbillbid(String srcbillbid) {
		this.setAttributeValue(OrderEndSubVO.SRCBILLBID, srcbillbid);
	}

	/**
	 * ��ȡ��Դ����id
	 * 
	 * @return ��Դ����id
	 */
	public String getSrcbillid() {
		return (String) this.getAttributeValue(OrderEndSubVO.SRCBILLID);
	}

	/**
	 * ������Դ����id
	 * 
	 * @param srcbillid
	 *            ��Դ����id
	 */
	public void setSrcbillid(String srcbillid) {
		this.setAttributeValue(OrderEndSubVO.SRCBILLID, srcbillid);
	}

	/**
	 * ��ȡ��Դ��������
	 * 
	 * @return ��Դ��������
	 */
	public String getSrcbilltype() {
		return (String) this.getAttributeValue(OrderEndSubVO.SRCBILLTYPE);
	}

	/**
	 * ������Դ��������
	 * 
	 * @param srcbilltype
	 *            ��Դ��������
	 */
	public void setSrcbilltype(String srcbilltype) {
		this.setAttributeValue(OrderEndSubVO.SRCBILLTYPE, srcbilltype);
	}

	/**
	 * ��ȡ��������
	 * 
	 * @return ��������
	 */
	public String getStartsbase() {
		return (String) this.getAttributeValue(OrderEndSubVO.STARTSBASE);
	}

	/**
	 * ���ÿ�������
	 * 
	 * @param startsbase
	 *            ��������
	 */
	public void setStartsbase(String startsbase) {
		this.setAttributeValue(OrderEndSubVO.STARTSBASE, startsbase);
	}

	/**
	 * ��ȡ�ܼ�
	 * 
	 * @return �ܼ�
	 */
	public UFDouble getTotalcost() {
		return (UFDouble) this.getAttributeValue(OrderEndSubVO.TOTALCOST);
	}

	/**
	 * �����ܼ�
	 * 
	 * @param totalcost
	 *            �ܼ�
	 */
	public void setTotalcost(UFDouble totalcost) {
		this.setAttributeValue(OrderEndSubVO.TOTALCOST, totalcost);
	}

	/**
	 * ��ȡʱ���
	 * 
	 * @return ʱ���
	 */
	public UFDateTime getTs() {
		return this.ts;
	}

	/**
	 * ����ʱ���
	 * 
	 * @param ts
	 *            ʱ���
	 */
	public void setTs(UFDateTime ts) {
		this.ts = ts;
	}

	/**
	 * ��ȡ���
	 * 
	 * @return ���
	 */
	public Integer getYear() {
		return (Integer) this.getAttributeValue(OrderEndSubVO.YEAR);
	}

	/**
	 * �������
	 * 
	 * @param year
	 *            ���
	 */
	public void setYear(Integer year) {
		this.setAttributeValue(OrderEndSubVO.YEAR, year);
	}

	@Override
	public IVOMeta getMetaData() {
		return VOMetaFactory.getInstance().getVOMeta("jxc_hr.OrderEndSubVO");
	}
}