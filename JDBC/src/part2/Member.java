package part2;

// DTO : Data Transfer Object (bean 종류 중 하나)
public class Member {
	private String id;
	private String pw;
	private int age;
	private String gender;
	

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", age=" + age + ", gender=" + gender +"]";
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
