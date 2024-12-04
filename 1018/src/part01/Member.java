package part01;

public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return memberId + " :\t" + memberName;
	}
	
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		if (memberId > member.memberId) {
			return 1;
		}
		else if (memberId < member.memberId) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
