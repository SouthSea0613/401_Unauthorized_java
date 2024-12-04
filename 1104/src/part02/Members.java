package part02;

// DTO : Data transeferObj
public class Members {
	private String id;
	private String name;
	private String gender;
	private int age;
	
	public Members() {
	}
	
	public Members(String id, String name, String gender, int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "ID : " + id + "\t NAME : " + name + "\t GENDER : " + gender + "\t AGE : " + age;
	}
}