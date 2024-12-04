package Part1;

import java.util.Scanner;

public class ProgrammerDefineException {
	public static void main(String[] args) {
		System.out.print("나이를 입력하세요: ");
		try {
			int age = readAge(); // throws에 의해 이동된 예외처리 포인트
			System.out.println("당신은 " + age + "세입니다.");
		} catch (AgeInputException e) { // 예외 처리 코드
			System.out.println(e.getMessage()); // e.printStackTrace(); 변경해 볼것.
		}
		System.out.println("next...");
	}

	public static int readAge() throws AgeInputException // AgeInputException는 던져버린다
	{
		Scanner keyboard = new Scanner(System.in);
		int age = keyboard.nextInt();
		if (age < 0) {
			// AgeInputException excpt = new AgeInputException();
			throw new AgeInputException(); // 예외가 발생한 지점 명시.
		}
		return age;
	} // readAge 메소드
} // 클래스
