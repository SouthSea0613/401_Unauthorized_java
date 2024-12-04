package bean;

import java.util.Objects;

//데이터 저장 클래스
public class PhoneInfo {
	private String name;
	private String phone;

	// 다중정의 = 메소드 오버로딩.
	public PhoneInfo(String name, String phone) {
		this.name = name; // this는 현재 작업중인 페이지 에서!
		this.phone = phone;
//	 //this.birth=birth;
	}
// public PhoneInfo(String name, String phone) {
//	 this.name=name;
//	 this.phone=phone;
// }

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public PhoneInfo() {
		// TODO Auto-generated constructor stub
	}

	public void showPhoneInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		// if(birth!=null) { //!표는 부정의 뜻
		// System.out.println("생일 :"+birth);
		// }
		// System.out.println("----------------");
	}

//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		PhoneInfo cmp = (PhoneInfo)obj;
//		//if(name.equals(cmp.name))
//		if(name.compareTo(cmp.name)==0)
//			return true;
//		return false;
//	}

	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
}
