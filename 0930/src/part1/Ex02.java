package part1;

//제어문 : 실행흐름을 제어하는 명령문
//1. if 문, if~else 문, ...
//2. 반복문 : while 문 , for , do~while
public class Ex02 {
	// if 뒤에만 조건문 달림
	public static void main(String[] args) {
//		int kor = 85; // 0~100 사이
			//90점 이상 : A학점
			//80점 이상 :B학점
			//70점 이상 : C학점
			//60점 이상 : D학점
			//60점 미만 : A학점
		//if (90<=kor && kor<=100) , (80<=kor && kor<=89)=(kor>=80)
		int kor = 50;
		//String grade=" "; //String : 문자를 저장하는 자료형 class
		String grade=null;
		if (kor>=90) {
			grade="A학점";
		}else if (kor>=80) {
			grade="B학점";
		}else if (kor>=70) {
			grade="C학점";
		}else if (kor>=60) {
			grade="d학점";
		}else if (kor<60) {
		grade="F학점";
		}
			System.out.println("당신의 학점은 " + grade);
			System.out.println("program end");

//		int num = 0; // 정수 +10, 0, -10
//		if (num < 0) {
//			System.out.println("음수");
//		} else if (num > 0) {
//			System.out.println("양수");
//		} else {
//			System.out.println("제로");
//		}
//		System.out.println("next");
//		System.out.println("program end");
	}

	}
