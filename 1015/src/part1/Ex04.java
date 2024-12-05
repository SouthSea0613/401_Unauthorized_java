package part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 입력 : " );
//		int age = sc.nextInt();
//		System.out.print("이름 입력 : ");
//		sc.nextLine();
//		String name = sc.nextLine();
//		System.out.println("--------------------");
//		System.out.println(age+ " , " +name);
//		
		Scanner sc = new Scanner(System.in);
		while ( true ) {
		try {
		System.out.print("정수 입력 : ");
		int num= sc.nextInt();
		System.out.println("num : " +num);
		} catch (InputMismatchException e )	{
			System.out.println("정수만 입력가능");
			sc.nextLine(); //문자열 , 공백, 엔터, 입력 -> 버퍼 삭제 효과가 있음
			System.out.println(e);
		}
		System.out.println("next....");
		}
	}
}
