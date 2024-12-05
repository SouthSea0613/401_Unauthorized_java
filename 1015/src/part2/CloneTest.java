package part2;

public class CloneTest {
	public static void main(String[] args) {
		Student org = new Student (200, "cha");
		
		try {
			Student cpy = (Student)org.clone(); 
			// .을 먼저 처리후에 형변환해야하기 때문에
			System.out.println(cpy);
			System.out.println(System.identityHashCode(org));
			System.out.println(System.identityHashCode(cpy));
		} catch (CloneNotSupportedException e) {
			System.out.println("복제 예외 발생");
			System.out.println(e.getMessage());
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
		System.out.println("정상진행...");
	}
}
