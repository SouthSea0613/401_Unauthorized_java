package part01;

public class Ex01 {
	public static void main(String[] args) {
		System.out.printf("박스 크기(1) : %d\n", box(1));
		System.out.printf("박스 크기(1, 2) : %d\n", box(1, 2));
		System.out.printf("박스 크기(1, 2, 3) : %d\n", box(1, 2, 3));
	}
	
	private static int box(int a, int b, int c) {
		return a * b * c;
	}
	
	private static int box(int a, int b) {
		return box(a, b, 1);
	}
	
	private static int box(int a) {
		return box(a, 1, 1);
	}
}
