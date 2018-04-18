package nc.jxc.pub.vo;

import nc.vo.pub.SuperVO;

/**
 * 同步信息处理VO
 * @author June
 *
 */
@SuppressWarnings("serial")
public class ErrorMsgVO extends SuperVO{
	
	public String title;
	
	public String content;
	
	public String ts;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
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
