package part3;

import java.util.Objects;

public class Member {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String name) {
		super();
		this.memberId = memberId;
		this.memberName = name;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getName() {
		return memberName;
	}
	public void setName(String name) {
		this.memberName = name;
	}
	@Override
	public String toString() {
		return memberName+ " 회원님의 아이디는 "+memberId+" 입니다. ";
	}
	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}
	@Override
	public boolean equals(Object obj) {
		Member other = (Member) obj;{
		if (memberId == other.memberId)
			return true; //id, name 같은 경우
	}
	return false;
	}
	
}
