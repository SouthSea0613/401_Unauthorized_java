package part2;
//회원 데이터 클래스
public class Member {
	private String id;
	private String pw;
	private int age;
	private String gender;
	
	
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
	public void showInfo() {
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
		System.out.println("age: "+age);
		System.out.println("gender: "+gender);
		
	}
	
	
}
