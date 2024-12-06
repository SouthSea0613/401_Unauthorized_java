package dto;

public class Member {
	private String userName;
	private String userPW;
	private String name;
	
	public Member(String userName, String userPW, String name) {
		this.userName = userName;
		this.userPW = userPW;
		this.name = name;
	}
	
	public String getUsername() {
		return userName;
	}
	
	public String getUserPW() {
		return userPW;
	}
	
	public String getName() {
		return name;
	}
}
