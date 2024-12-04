package practice;

import java.util.Scanner;

public class EX04 {
	// 10.25 1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요!");
		int a = sc.nextInt();

		if (a % 3 == 0) {
			System.out.println("짝짝짝! 3의 배수");
		} else {
			System.out.println("땡땡땡! 3의 배수 아니지~");
		}
	}
}
