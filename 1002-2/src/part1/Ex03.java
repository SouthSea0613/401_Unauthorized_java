package part1;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("시험 응시 인원수:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("배열의 길이:"+arr.length);
		// 2차원 배열 , 3행 4열
//		int[][] arr = { 
//			{ 1, 2, 3, 4 }, 
//			{ 5, 6, 7, 8 }, 
//			{ 9, 10, 11, 12 } 
//		};
		// i=0~2, 3번
//		for(int i=0;i<arr.length;i++) {
//			//j=0~3, 4번
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=i+j;
//			}
//		}
		// 출력
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "  ");
//			}
//			System.out.println(); // 줄바꿈
//			// System.out.println(""); //줄바꿈
//		}
	}
}
