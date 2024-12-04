package part02;

class Student implements Cloneable{
	private int schoolNumber;
	private String name;
	
	public Student(int schoolNumber, String name) {
		this.schoolNumber = schoolNumber;
		this.name = name;
	}
	
	public int getSchoolNumber() {
		return schoolNumber;
	}
	
	public String getName() {
		return name;
	}	
	
	@Override
	public String toString() {
		return schoolNumber + " : " + name;
	}
	
	@Override
	public boolean equals(Object obj) {
		return schoolNumber == ((Student)obj).schoolNumber && name.equals(((Student)obj).name);
	}
	
	@Override
	public int hashCode() {
		return schoolNumber;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Student std1 = new Student(00, "south sea");
		Student std2 = new Student(00, "south sea");
		Student std3 = new Student(06, "east sea");
		
		System.out.printf("%s\n", std1.toString());
		System.out.printf("%s\n", std1);
		
		System.out.printf("---\n");
		
		System.out.printf("%b\n", std1 == std2);
		System.out.printf("%b\n", std1.equals(std2));
		System.out.printf("%b\n", std1.equals(std3));
		
		System.out.printf("---\n");
		
		System.out.printf("%d\n", std1.hashCode());
		System.out.printf("%d\n", std2.hashCode());
		System.out.printf("%d\n", std3.hashCode());
		System.out.printf("%d\n", System.identityHashCode(std1));
		System.out.printf("%d\n", System.identityHashCode(std2));
		System.out.printf("%d\n", System.identityHashCode(std3));
		
		System.out.printf("---\n");
		
		String str1 = new String("aaa");
		String str2 = new String("aaa");
		System.out.printf("%d\n", str1.hashCode());	// 그룹 number
		System.out.printf("%d\n", str2.hashCode());
		System.out.printf("%d\n", System.identityHashCode(str1));	// 진짜 hashcode
		System.out.printf("%d\n", System.identityHashCode(str2));
		
		System.out.printf("---\n");
		
		Student org1 = new Student(13, "west sea");
		try {
			Student org2 = (Student)org1.clone();
			System.out.printf("%s\n", org2);
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
