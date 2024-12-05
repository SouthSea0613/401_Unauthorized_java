package dto;

//포워딩 방식은 2개야 ^_^ 이건 재미로!
public class Forward {
	// true 일 경우 redirect포워딩
	// false 일 경우 (dispatcher)포워딩
	private boolean isRedirect; // 기본 값은 false야!
	private String path; // 이건 포워딩 할 jsp 또는 url인거 알지?
	
	
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
