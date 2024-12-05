package bean;

public class PhoneCompanyInfo extends PhoneInfo {
	private String company; //=null;
	
	public PhoneCompanyInfo(String name, String phone
			,String company) {
		super(name, phone);
		this.company=company;	
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company: "+company);
	}
}

