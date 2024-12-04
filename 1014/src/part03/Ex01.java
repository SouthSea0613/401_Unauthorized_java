package part03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("정수1 입력 : ");
		int a = scanner.nextInt();
		System.out.printf("정수2 입력 : ");
		int b = scanner.nextInt();
		
		try {
			// 예외가 발생 가능한 부분
			System.out.printf("나눗셈의 몫 : %d\n", a / b);
			System.out.printf("나눗셈의 나머지 : %d\n", a / b);
		} catch (ArithmeticException e) {
			// 예외 처리하는 부분
			System.out.printf("0으로 나눗셈 불가능\n");
			System.out.printf("%s\n", e.getMessage());
		}
		
		System.out.printf("종료");
	}
}
