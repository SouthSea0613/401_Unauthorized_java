package part1;

import java.util.Scanner;

public class ProgrammerDefineException {
	public static void main(String[] ars) {
		while (true) {
			System.out.print("나이를 입력하세요: ");
			try {
				int age = readAge(); // 3. throws에 의해 이동된 예외처리
				System.out.println("당신은 " + age + "세 입니다.");
				break;  // try안에 만족하는 값이 입력되었을 때 종료하고 싶다면 break 사용!!!!
			} catch (AgeInputException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("next-----------");
		}
	}

	private static int readAge() throws AgeInputException {
		Scanner keyboard = new Scanner(System.in);
		int age = keyboard.nextInt();
		if (age < 0) {
//			AgeInputException excpt = new AgeInputException();
			System.out.println("나이를 정확하게 입력바랍니다.");
			throw new AgeInputException();
		}
		return age;
	}

}
