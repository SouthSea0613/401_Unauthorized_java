package test;

import java.util.Scanner;

public class Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해");
		int number = sc.nextInt();
		
		if(number<0) {
			System.out.println("홀수임");
		}else if (number % 2 == 0) {
			System.out.println("짝수임");
		}else {
			System.out.println("홀수임");
		}
		sc.close();
	}
}
//
//절차(지향)적~: c c++ cobol fortran 함수(프로시저)
//객체(지향)적~: c++ java c# phthon javaScript 상속 재사용 메소드
//소속이 없는 애들을 프로시저(함수) 11.4 12.1 13.4
//스크립트 언어: html, jsp, javaScript 홈페이지만들때 씀
//한번에 컴파일러(절차/객체)로 쫙! 번역할땐 시간이 걸려도 실행할땐 빠름 / 스크립트 언어는 한줄 번역실행 한줄 한줄~(인터프리터) 