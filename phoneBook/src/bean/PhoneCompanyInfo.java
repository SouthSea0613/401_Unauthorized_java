package bean;

public class PhoneCompanyInfo extends PhoneInfo {
	private String company;
	
	public PhoneCompanyInfo(String name, String number, String com) {
		super(name, number);
		this.company=com;
	}
	@Override
	public String toString() {
		return "이름: "+super.getName()+"\n번호: "+super.getNumber()+"\n회사: "+company;
	}
//	@Override
//	public void showPhoneInfo() {
//		super.showPhoneInfo();
//		System.out.println("회사: "+company);
//	}
}
