package Part2;

public class CloneTest {
	public static void main(String[] args) {
		Student org=new Student(200,"cha");
		
		try {
			Student cpy=(Student)org.clone();
			System.err.println(cpy);
			System.out.println(System.identityHashCode(org));
			System.out.println(System.identityHashCode(cpy));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("복제 예외 발생");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("정상 진행...");
	}
}
