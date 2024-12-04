package practice;

import java.util.Scanner;

public class Ex01 {
	// 10.23 배열1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int i;
		int sum = 0;
		int max, min;

		for (i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력: ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		max = arr[0];
		min = arr[0];
		for (i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("--------------");
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("total: " + sum);
		System.out.println("average: " + (double) sum / arr.length);
	}
}