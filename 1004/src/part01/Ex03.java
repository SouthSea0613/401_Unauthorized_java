package part01;

public class Ex03 {
	private static void showNum() {
		int num = 0;
		System.out.println(++num);
	}
	
	public static void main(String[] args) {
		// scope(변수 유효범위)
		showNum();
	}
}
