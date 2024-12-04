package part1;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int total = 0, val = 0;
		Scanner key = new Scanner(System.in);
		boolean flag = false;
		while (true) { // true 사용하는 이유 무한루프
			System.out.print("숫자 입력(0 to quit):");
			val = key.nextInt();
			if (val == 0) {
				flag = true;
				break; // 반복문 탈출
			}
			total += val;
		}
		if (flag) {
			System.out.println("true: "+flag);
		} else {
			System.out.println("false: "+flag);
		}
		System.out.println("합계 = " + total);
	}
}
