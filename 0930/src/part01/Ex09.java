package part01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int total = 0, val;
		Scanner key = new Scanner(System.in);
		boolean flag = false;
		while (true) {
			System.out.print("숫자 입력(0 to quit) : ");
			val = key.nextInt();
			if (val == 0) {
				flag = true;
				break;
			}
			total += val;
		}
		System.out.println(flag);
		System.out.println("합계 = " + total);
	}

}
