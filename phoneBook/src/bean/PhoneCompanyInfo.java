package bean;

public class PhoneCompanyInfo extends PhoneInfo {
	private String company;

	public PhoneCompanyInfo(String name, String phone, String company) {
		super(name, phone);
		this.company=company;
	}
	
	public PhoneCompanyInfo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("회사: "+company);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
