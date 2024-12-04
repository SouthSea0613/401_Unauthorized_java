package bean;

public class PhoneUnivInfo extends PhoneInfo {
	private String major; 
	private String year;
	
	public PhoneUnivInfo(String name, String phone, String major, String year) {
		super(name,phone); //PhoneInfo(name, phone)
		this.major=major;
		this.year=year;
	}
	
	public PhoneUnivInfo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("전공: "+major);
		System.out.println("학년: "+year);
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	

}
