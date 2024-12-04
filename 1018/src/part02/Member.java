package part02;

public class Member{
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberId + " :\t" + memberName;
	}
}
