package zzz;

import java.util.Scanner;


public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int a = sc.nextInt();
		if ((a % 3) == 0) {			
			System.out.println("-------------------");
			System.out.println("딩동댕♬ 3의 배수입니다.");
		} else {
			System.out.println("-------------------");
			System.out.println("땡!");
		}
	}
}