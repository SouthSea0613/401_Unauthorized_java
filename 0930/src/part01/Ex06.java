package part01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// quiz2 합계가 100을 초과하는 최초의 i, sum 출력
		int i = 1, sum = 0;
		while(sum <= 100) {
			sum += ++i;
		}
		System.out.println(i + ", " + sum);
	}

}
