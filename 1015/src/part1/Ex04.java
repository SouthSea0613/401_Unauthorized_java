package part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] ars) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이: ");
//		int age = sc.nextInt();
//		System.out.print("이름: ");
//		sc.nextLine(); // 버퍼에 남아있는 엔터를 입력(=버퍼 삭제)
//		String str = sc.nextLine();  //next는 공백, 엔터 입력 못함
//		System.out.println("--------------");
//		System.out.println(age+", "+str);
//		
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("정수 입력: ");
				int num = sc.nextInt();
				System.out.println("숫자: " +num);
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력가능");
				sc.nextLine();
				System.out.println(e);
			}
			System.out.println("next....");
		}
	}
}
