package part01;

public class Ex01 {
	public static void main(String[] args) {
		showData(new Integer(100));
		showData(200);
		
		System.out.printf("---\n");
		
		Integer num1 = 127;
		Integer num2 = 127;
		System.out.printf("%d\n", System.identityHashCode(num1));
		System.out.printf("%d\n", System.identityHashCode(num2));
		if (num1 == num2) {
			System.out.printf("참조값 같음\n");
		}
		else {
			System.out.printf("참조값 다름\n");
		}
		
		if (num1.equals(num2)) {
			System.out.printf("값이 같음\n");
		}
		else {
			System.out.printf("값이 다름\n");
		}
		
		System.out.printf("---\n");
		
		Integer num3 = 128;
		Integer num4 = 128;
		System.out.printf("%d\n", System.identityHashCode(num3));
		System.out.printf("%d\n", System.identityHashCode(num4));
		if (num3 == num4) {
			System.out.printf("참조값 같음\n");
		}
		else {
			System.out.printf("참조값 다름\n");
		}
		
		if (num3.equals(num4)) {
			System.out.printf("값이 같음\n");
		}
		else {
			System.out.printf("값이 다름\n");
		}
		
		System.out.printf("---\n");
		
		String val = "100";
		int num = Integer.parseInt(val);
		System.out.printf("%d\n", num + 1);
	}
	
	private static void showData(Integer integer) {
		System.out.printf("%s\n", integer++);
		System.out.printf("%s\n", integer);
	}
}
