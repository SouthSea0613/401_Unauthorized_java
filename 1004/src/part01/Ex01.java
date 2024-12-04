package part01;

public class Ex01 {
	private static int sumTwoInt(int a, int b) {
		return a + b;
	}

	private static void showMyInfo(int a, double b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println("------");
	}
	
	// main
	public static void main(String[] args) {
		showMyInfo(1, 2.0);
		System.out.println(sumTwoInt(1, 2));
	}
}
