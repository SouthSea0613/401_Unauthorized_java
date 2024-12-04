package part01;

import java.util.Scanner;

// 예외 클래스 필수 만드는 방법
class AgeInputException extends Exception{
	public AgeInputException() {
		super("유표하지 않은 나이가 입력되었습니다.\n");
	}
}

public class Ex07 {
	public static int readAge() throws AgeInputException {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if (age < 0) {
			throw new AgeInputException();
		}
		else {
			return age;
		}
	}
	
	public static void main(String[] args) {	// throws AgeInputException
		// TODO Auto-generated method stub
		while (true) {
			System.out.printf("나이를 입력하세요 : ");
	
			try {
				int age = readAge();
				System.out.printf("당신의 나이는 %d입니다.\n", age);
				break;
			} catch (AgeInputException e) {
				// TODO: handle exception
				System.out.printf(e.getMessage());
			}
		}
	}
}
