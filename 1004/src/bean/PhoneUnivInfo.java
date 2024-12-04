package bean;

public class PhoneUnivInfo extends PhoneInfo {
	private String major;
	private int grade;
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, int grade) {
		super(name, phoneNumber);
		this.major = major;
		this.grade = grade;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getGrade() {
		return grade;
	}
	
	@Override
	public String toString() {
		return super.getName() + ", " + major + " " + grade + "학년" + " : " + super.getPhoneNumber();
	}
}
