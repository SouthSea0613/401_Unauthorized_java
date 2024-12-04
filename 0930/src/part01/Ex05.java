package part01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int start = 1, end, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		end = scanner.nextInt();
		sum = (start + end) * (end - start + 1) / 2;
		System.out.println(sum);
	}

}
