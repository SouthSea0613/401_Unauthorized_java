package practice;

import java.util.Scanner;

public class Multiple {
	//10.25 2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("숫자 입력: ");
		int a = sc.nextInt();
		System.out.print("곱할 수 입력: ");
		int b = sc.nextInt();
		
		if (b < 0) {
			b = -b;
			a = -a;
		}
		for(int i = 0; i < b; i++) {
			sum += a;
		}
		System.out.println("총 합: "+sum);
	}
}