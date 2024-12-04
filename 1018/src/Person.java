
public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "(" + age + "세)";
	}
	@Override
	public int hashCode() {
		//return name.hashCode(); //이름 같은사람 모여
		//return age; //나이 같은사람 모여
		//return age+name.hashCode(); //나이, 이름 같은사람 모여
		return age%3+name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
		Person cmp = (Person)obj;
		if(name.equals(cmp.name) && age == cmp.age) {
			return true;
			}
		}
		return false;
	}
}
