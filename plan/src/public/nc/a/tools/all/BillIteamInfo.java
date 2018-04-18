package nc.a.tools.all;

/**
 * ½çÃæ×´Ì¬
 * 
 * @author shidl
 * 
 */
public enum BillIteamInfo {

	Head("head"),

	Body("body");

	private String type;

	private BillIteamInfo(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.type;
	}

}
