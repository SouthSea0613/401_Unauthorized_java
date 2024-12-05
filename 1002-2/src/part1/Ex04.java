package part1;


import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전체 층수 입력:");
		int floor = sc.nextInt();
		System.out.print("층당 가구수 입력: ");
		int ho = sc.nextInt();
		int[][] villa = new int[floor][ho];

		for (int i = 0; i < villa.length; i++) {
			for (int j = 0; j < villa[i].length; j++) {
				System.out.print((i + 1) + "층 " + (j + 1) + "호:");
				villa[i][j] = sc.nextInt();
			}
		}
		//showVillaInfo(villa);
		int totalSum = 0;
		for (int i = 0; i < villa.length; i++) {
			int floorSum=0;
			//floorSum = 0; // 매번 초기화
			for (int j = 0; j < villa[i].length; j++) {
				floorSum += villa[i][j];
			}
			System.out.println((i + 1) + "층 인원:" + floorSum);
			totalSum += floorSum;
		}
		System.out.println("공동주택 총 인원: " + totalSum);
	}//main
	
	
	
	
	

	public static void showVillaInfo(int[][] v) {
		
	}

}
