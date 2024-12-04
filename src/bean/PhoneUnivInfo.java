package bean;

public class PhoneUnivInfo extends PhoneInfo {
	private String major;
	private int year;
	
	public PhoneUnivInfo(String name, String phone,
			String major, int year) {
		super(name,phone);  //PhoneInfo(name,phone)
		this.major=major;
		this.year=year;
	}
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major: "+major);
		System.out.println("year: "+year);
	}
}
