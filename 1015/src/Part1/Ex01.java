package Part1;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.print("두 개의 정수 입력: ");
		Scanner keyboard=new Scanner(System.in);
		int num1=keyboard.nextInt();
		int num2=keyboard.nextInt();
		
		try {
			//예외가 발생 가능한 코드
		System.out.println("나눗셈 결과의 몫: "+(num1/num2));
		System.out.println("나눗셈 결과의 나머지: "+(num1%num2));
		System.out.println("예외가 없을때 정상진행...");
		}catch(ArithmeticException e) {
			//예외를 처리하는 코드
			System.out.println("나눗셈 불가능");
			//예외클래스, getMessage()
			System.out.println(e.getMessage()); // (e) = e.toString 생략
			e.printStackTrace(); //예외 발생 위치
		}
			//예외를 처리 하든 안 하든 
		System.out.println("정상 진행...");
		System.out.println("프로그램 종료");
	}
}
