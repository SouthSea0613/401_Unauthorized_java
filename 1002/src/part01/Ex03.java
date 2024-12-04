package part01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* quiz_03
		 * 2차원 배열 아파트 인원 총합 및 층별 합
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("전체 층수 입력 : ");
		int floor = scanner.nextInt();
		System.out.print("층당 가구수 입력 : ");
		int house = scanner.nextInt();
		int[][] apt = new int[floor][house];
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				System.out.print((i+1) + "층 " + (j+1) + "호 : ");
				apt[i][j] = scanner.nextInt();
			}
		}
		
		int[] floor_sum = new int[apt.length];
		int sum_all = 0;
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				floor_sum[i] += apt[i][j];
			}
			sum_all += floor_sum[i];
			System.out.println((i + 1) + "층 인원 : " + floor_sum[i]);
		}
		System.out.println("공동주택 총 인원 : " + sum_all);
	}

}
