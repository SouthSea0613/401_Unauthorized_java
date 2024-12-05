package part2;

class Student implements Cloneable{ //Cloneable  텅비어있음
	private int sNo;
	private String name;
	public Student(int no, String name) {
		this.sNo=no;
		this.name=name;
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {// 접근범위가 큰쪽으로는 변경가능
		// 복제가 발생하지않는 오류가 생기면 던짐
		// 필수 예외가 발생함
		return super.clone(); 
	}


	@Override
	public int hashCode() {
		return sNo; //해시값 : 메모리의 그룹번호
	}
	@Override
	public boolean equals(Object obj) {
		Student cmp=(Student)obj; // 눈높이 낮추기용
		if(this.sNo==cmp.sNo && name.equals(cmp.name)) { 
			// cmp , obj 둘다 student 2 를 가리킴
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", name=" + name + "]";
	}

	
	
	
}
public class EqualsTest {
	public static void main(String[] args) {
		Student std1=new Student(100, "Lee");
		Student std2=new Student(100, "Lee");
//		System.out.println(std1==std2);//참조값 비교
		System.out.println(std1.equals(std2));// 동등 (내용비교) 내용비교 재정의
		System.out.println(std1.hashCode());//100, 그룹번호
		System.out.println(std2.hashCode());//100, 그룹번호
		System.out.println(std1); //toString()
		System.out.println(std2); 
//		System.out.println(System.identityHashCode(std1));
//		System.out.println(System.identityHashCode(std2));
//		System.out.println("-------------------");
//		String str1=new String("aaa");
//		String str2=new String("aaa");
//		System.out.println(str1.hashCode()); //96321, 그룹번호
//		System.out.println(str2.hashCode()); //96321, 그룹번호
//		System.out.println(System.identityHashCode(str1));//617901222 
//		System.out.println(System.identityHashCode(str2));//1159190947
	}
}
