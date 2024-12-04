package part2;

class Student {
	private int sNo;
	private String name;

	public Student(int sNo, String name) {
		this.sNo = sNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "학번은 " + sNo + "번 이지롱\n이름은 " + name + " 입니당♬";
//		return sNo+","+name; // 문자열로 반환
//		return sNo+""; // 문자열로 반환
//		return String.valueOf(sNo);
	}

	@Override
	public int hashCode() {
		return sNo; // 100 해시값 : 메모리의 그룹번호
	}

	@Override
	public boolean equals(Object obj) {
//		Student cmp = (Student)obj;
		if (this.sNo == ((Student) obj).sNo) {
//		if (this.sNo == cmp.sNo && name.equals(cmp.name)) {
			return true;
		}
		return false;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		System.out.println(std1 == std2); // 참조값 비교
		System.out.println(std1.equals(std2)); // 내용 비교를 위해 override 사용
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		System.out.println("-------------------------------");
		String str1 = new String("aaa");
		String str2 = new String("aaa");
		System.out.println(str1.hashCode()); // 그룹은 같다
		System.out.println(str2.hashCode()); // 그룹은 같다
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
