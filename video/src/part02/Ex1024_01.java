package part02;

public class Ex1024_01 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.printf("현재 : a = %d, b = %d\n", a, b);
		
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.printf("교환 : a = %d, b = %d\n", a, b);
	}
}
