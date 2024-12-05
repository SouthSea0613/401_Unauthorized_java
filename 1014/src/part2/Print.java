package part2;
//public abstract 생략가능
public interface Print {
	void print(int a); //추상 메소드
	public void show (String str); // 권장, 추상메소드
	
	//jdk 1.8 에서 추가됨
//	public static void print2() {
//		System.out.println("print");
//	}
//	public default void print() {
//		System.out.println("print");
//	}
}
