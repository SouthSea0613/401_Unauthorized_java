package bean;

public class PhoneUnivInfo extends PhoneInfo{
	private String major;
	private int grade;
	
	public PhoneUnivInfo(String name, String number, String maj, int gd) {
		super(name, number);
		this.major=maj;
		this.grade=gd;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "이름: "+super.getName()+"\n번호: "+super.getNumber()+"\n전공: "+major+"\n학년: "+grade;
	}
//	@Override
//	public void showPhoneInfo() {
//		super.showPhoneInfo();
//		System.out.println("전공: "+major);
//		System.out.println("학년: "+grade);
//	}
//	
	
	}

