package nc.jxc.pub.voucherVO;

import nc.vo.pub.SuperVO;

public class CashFlowVO extends SuperVO{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String m_pk_currtype;
	public double money;
	public double moneymain;
	public String pk_cashflow;
	
	
	public String getM_pk_currtype() {
		return m_pk_currtype;
	}
	public void setM_pk_currtype(String m_pk_currtype) {
		this.m_pk_currtype = m_pk_currtype;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public double getMoneymain() {
		return moneymain;
	}
	public void setMoneymain(double moneymain) {
		this.moneymain = moneymain;
	}
	public String getPk_cashflow() {
		return pk_cashflow;
	}
	public void setPk_cashflow(String pk_cashflow) {
		this.pk_cashflow = pk_cashflow;
	}
	@Override
	public String getPKFieldName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getParentPKFieldName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return null;
	}

}
