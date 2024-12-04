package part01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.printf("정수 입력 : ");
				int num = scanner.nextInt();
				System.out.printf("num : %d\n", num);
				break;
			}
			catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.printf("%s\n", e);
			}
			scanner.nextLine();
		}
	}
}
