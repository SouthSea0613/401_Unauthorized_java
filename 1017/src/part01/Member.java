package part01;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	@Override
	public String toString() {
		return memberId + "\t" + memberName;
	}
}
