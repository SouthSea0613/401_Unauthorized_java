package practice;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int i = sc.nextInt();

		if (i < 0) {
			System.out.println("너는 음수니까 꺼져");
		} else if(i % 2 == 0) {
			System.out.println("짝수 박수짝짝");
		} else {
			System.out.println("홀수지롱");
		}
	}
}
