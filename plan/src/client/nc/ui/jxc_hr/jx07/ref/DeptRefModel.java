package nc.ui.jxc_hr.jx07.ref;

import nc.ui.bd.ref.AbstractRefModel;

public class DeptRefModel extends AbstractRefModel {
	
	public DeptRefModel(){
		super();	
	}
	
	@Override
	public void setRefTitle(String title) {//参照对应的编码字段
		super.setRefTitle(title);
	}
	@Override
	public String[] getFieldCode() {//表数据的字段编码
		return new String[]{
				"code",
				"name"
			
		};
	}
	
	@Override
	public String[] getFieldName() {//表数据的字段名称
		return new String[]{
				"编码",
				"名称"
		};
	}
	
	@Override
	public String[] getHiddenFieldCode() {//表数据需要隐藏的字段编码
		return new String[]{
				"pk_dept"
		};
	}
	
	@Override
	public String getTableName() {//表数据的表名
		return "org_dept";
	}
	
	@Override
	public String getPkFieldCode() {//表数据的主键字段
		return "pk_dept";
	}

	@Override
	public String getRefCodeField() {//参照对应的编码字段
		return "code";
	}
	
	@Override
	public String getRefNameField() {//参照对应的名称字段
		return "name";
	}
	
	@Override
	public String getWherePart() {//表数据的过滤条件
		String wherePart = super.getWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " isnull(dr,0) = 0 and code like '__'";
		}else{
			wherePart += " and isnull(dr,0) = 0 and code like '__'";
		}
		return wherePart;
	}
}
