package nc.ui.jxc_hr.jx08.ref;

import nc.ui.bd.ref.AbstractRefModel;

public class GlRefModel extends AbstractRefModel {
	private String memo=null;
	private String mnecode=null;	
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMnecode() {
		return mnecode;
	}

	public void setMnecode(String mnecode) {
		this.mnecode = mnecode;
	}

	public GlRefModel(){
		super();	
	}
	
	@Override
	public void setRefTitle(String title) {//���ն�Ӧ�ı����ֶ�
		super.setRefTitle(title);
	}
	@Override
	public String[] getFieldCode() {//�����ݵ��ֶα���
		return new String[]{
				"code",
				"name",
				"memo",
				"mnecode"
		};
	}
	
	@Override
	public String[] getFieldName() {//�����ݵ��ֶ�����
		return new String[]{
				"����",
				"����",
				"��ע",
				"������"
		};
	}
	
	@Override
	public String[] getHiddenFieldCode() {//��������Ҫ���ص��ֶα���
		return new String[]{
				"pk_defdoc"
		};
	}
	
	@Override
	public String getTableName() {//�����ݵı���
		return "bd_defdoc";
	}
	
	@Override
	public String getPkFieldCode() {//�����ݵ������ֶ�
		return "pk_defdoc";
	}

	@Override
	public String getRefCodeField() {//���ն�Ӧ�ı����ֶ�
		return "code";
	}
	
	@Override
	public String getRefNameField() {//���ն�Ӧ�������ֶ�
		return "name";
	}

	@Override
	public Object getPara() {
		// TODO �Զ����ɵķ������
		return "memo";
	}

	@Override
	public String getWherePart() {//�����ݵĹ�������
		String wherePart = super.getWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " isnull(dr,0) = 0 and enablestate=2";
		}else{
			wherePart += " and isnull(dr,0) = 0 and enablestate=2";
		}
		return wherePart;
	}
}
