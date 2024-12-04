package part02;

import java.util.Random;
import java.util.Scanner;

public class Ex1023_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int max;
		int min;
		double mean;
		
		System.out.printf("배열 갯수 입력 : ");
		int[] arr = new int[scanner.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt();
			System.out.printf("%d ", arr[i]);
		}
		System.out.printf("\n");
		
		max = arr[1];
		min = arr[1];
		mean = arr[1];
		
		for (int i = 1; i <arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			
			if (min > arr[i]) {
				min = arr[i];
			}
			
			mean += arr[i];
		}
		
		System.out.printf("최댓값 : %d, 최솟값 : %d, 평균 : %.2f", max, min, mean);
	}
}
