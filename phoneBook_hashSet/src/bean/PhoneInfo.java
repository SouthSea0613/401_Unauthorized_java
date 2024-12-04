package bean;

import java.util.Objects;

//데이터 클래스
public class PhoneInfo {
	private String name;
	private String phoneNum;
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	//생성자, 메소드 오버로딩(월요일)
	public PhoneInfo(String name, String phoneNum, String birth) {
		this.name=name;
		this.phoneNum=phoneNum;
	}
	public PhoneInfo(String name, String phoneNum) {
		this.name=name;
		this.phoneNum=phoneNum;
	}
	//메소드, 후손클래스맞게 재정의 할것
	public void showPhoneInfo() {
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+this.phoneNum);
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		PhoneInfo cmp = (PhoneInfo)obj;
		//if(name.equals(cmp.name))
		if(name.compareTo(cmp.name)==0)
			return true;
		return false;
	}
}