package dto;

// 시험에는 필요없는영역 > userfreindly
public class Forward {
	private boolean isRedirect = false;
	private String path;
	
	public Forward(boolean isRedirect, String path) {
		this.isRedirect = isRedirect;
		this.path = path;
	}
	
	public boolean isRedirect() {
		return isRedirect;
	}
	
	public String getPath() {
		return path;
	}
}
