package nc.ui.jxc_hr.jx07.ref;

import nc.ui.bd.ref.AbstractRefModel;

public class DeptRefModel extends AbstractRefModel {
	
	public DeptRefModel(){
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
				"name"
			
		};
	}
	
	@Override
	public String[] getFieldName() {//�����ݵ��ֶ�����
		return new String[]{
				"����",
				"����"
		};
	}
	
	@Override
	public String[] getHiddenFieldCode() {//��������Ҫ���ص��ֶα���
		return new String[]{
				"pk_dept"
		};
	}
	
	@Override
	public String getTableName() {//�����ݵı���
		return "org_dept";
	}
	
	@Override
	public String getPkFieldCode() {//�����ݵ������ֶ�
		return "pk_dept";
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
	public String getWherePart() {//�����ݵĹ�������
		String wherePart = super.getWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " isnull(dr,0) = 0 and code like '__'";
		}else{
			wherePart += " and isnull(dr,0) = 0 and code like '__'";
		}
		return wherePart;
	}
}
