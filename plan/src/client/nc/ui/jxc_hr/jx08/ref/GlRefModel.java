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
	public void setRefTitle(String title) {//参照对应的编码字段
		super.setRefTitle(title);
	}
	@Override
	public String[] getFieldCode() {//表数据的字段编码
		return new String[]{
				"code",
				"name",
				"memo",
				"mnecode"
		};
	}
	
	@Override
	public String[] getFieldName() {//表数据的字段名称
		return new String[]{
				"编码",
				"名称",
				"备注",
				"助记码"
		};
	}
	
	@Override
	public String[] getHiddenFieldCode() {//表数据需要隐藏的字段编码
		return new String[]{
				"pk_defdoc"
		};
	}
	
	@Override
	public String getTableName() {//表数据的表名
		return "bd_defdoc";
	}
	
	@Override
	public String getPkFieldCode() {//表数据的主键字段
		return "pk_defdoc";
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
	public Object getPara() {
		// TODO 自动生成的方法存根
		return "memo";
	}

	@Override
	public String getWherePart() {//表数据的过滤条件
		String wherePart = super.getWherePart();
		if(null == wherePart || "".equals(wherePart.trim())){
			wherePart = " isnull(dr,0) = 0 and enablestate=2";
		}else{
			wherePart += " and isnull(dr,0) = 0 and enablestate=2";
		}
		return wherePart;
	}
}
