package part01;

/* 제어문
 * 1. if, else, switch-case
 * 2. for, while, do-while
 * */

public class Ex02 {

	public static void main(String[] args) {
		// 제어문
		int num = 1;
		if (num > 0) {
			System.out.println("양수");
		}
		else if (num < 0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
		// System.out.println("next-");
		
		// quiz #1
		int kor = 55;
		char grade = 'F';	// 참조형
		if (kor <= 100 && kor >= 90) {
			grade = 'A';
		}
		else if (kor >= 80) {
			grade = 'B';
		}
		else if (kor >= 70) {
			grade = 'C';
		}
		else if (kor >= 60) {
			grade = 'D';
		}
		System.out.println(grade);
	}

}
