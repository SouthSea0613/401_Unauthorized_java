package part2;

import java.util.Date;

//bean(DTO : Data Transfer Object)
public class Member {
	private String id;
	private String pw;
	private int age;
//	private Date regDate;
	private String gender; //1 or 0 or m or w
	
	
	@Override
	public String toString() {
		String str = "Member [id=" + id + ", pw=" + pw + ", age=" + age + ", gender=" + gender + "]";
		if(gender.equals("1")) {
			str+="남자";
		}else {
			str+="여자";
		}
		str+="]";
		return str;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
