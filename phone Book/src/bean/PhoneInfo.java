package bean;

//데이터 클래스
public class PhoneInfo {
	private String name;
	private  String phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//생성자, 메소드 오버로딩(월요일)
//	public PhoneInfo(String name, String phoneNum, String birth) {
//		this.name=name;
//		this.phoneNum=phoneNum;
//	}
	public PhoneInfo(String name, String phone) {
		this.name=name;
		this.phone=phone;
	}
	//메소드, 후손클래스맞게 재정의 할것
	public void showPhoneInfo() {
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+this.phone);
	}
}
