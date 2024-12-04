package Part1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이입력: ");
//		int age = sc.nextInt();
//		System.out.println("이름입력: ");
//		sc.nextLine(); //버퍼에 남아있는 엔터를 입력(받아) -> 버퍼 삭제(비워둠)
//		String name = sc.nextLine();
//		System.out.println("--------------");
//		System.out.println(age+","+name);
		
		
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			try {
				System.out.println("정수 입력: ");
				int num =sc.nextInt(); //nextint 에서 next는 문자받는데 공백 못 받아 -> Line넣으면 공백도 받아
				System.out.println("num: "+num);
				}catch(InputMismatchException e) {
					System.out.println("정수만 입력가능!!");
					sc.nextLine(); //문자열 공백 엔터 다 받음 -> 비우기
					System.out.println(e);
				}
				System.out.println("next...");
		}//while
	}//main
}//class	
