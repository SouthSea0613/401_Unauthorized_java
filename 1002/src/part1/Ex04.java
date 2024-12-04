package part1;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		//문제
		Scanner sc=new Scanner(System.in);
		System.out.print("전체 층 수 입력: ");
		int floor = sc.nextInt();
		System.out.print("층당 가구 수 입력: ");
		int ho = sc.nextInt();
		int[][] villa = new int[floor][ho];
		int sum = 0;
		for (int i = 0; i < villa.length; i++) {
			for (int j = 0; j < villa[i].length; j++) {
				System.out.print((i+1)+"층 " +(j+1)+"호 인원 수: ");
				villa[i][j] = sc.nextInt();
				sum+=villa[i][j];
			}
			System.out.println((i+1)+"층 총 인원: "+sum);
			sum = 0;
			System.out.println("-----------------");
		}
		int tot = 0;
		for (int i = 0; i < villa.length; i++) {
			for (int j = 0; j < villa[i].length; j++) {
				tot+=villa[i][j];
			}
		}
		System.out.println("공동주택 총 인원: "+tot);
	}

}
