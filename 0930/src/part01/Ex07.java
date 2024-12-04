package part01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// quiz3 임의의 정수를 입력받아 9까지의 단 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scanner.nextInt();
		for (int i = 2; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

}
