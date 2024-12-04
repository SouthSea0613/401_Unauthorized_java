package part2;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// 길이가 3인 정수 배열 선언 후
		// 키보드로 정수를 입력받아서 배열에 저장한다.
		// 배열의 모든 요소의 합, 평균(소수점)을 구해서 출력한다.
		int[] arr = new int[3]; //< 정석
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 입력");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum: " + sum);
//		 or System.out.println("avg: " + (sum / 3.0));
		System.out.println("avg: " + (double)sum /arr.length);
//		int[] arr = new int[3];
//		int sum = 0;
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "번째 입력");
//			arr[i] = sc.nextInt();
//			sum += arr[i];
//		}
//		System.out.println("sum: " + sum);
//		System.out.println("avg: " + (sum / 3.0));
		// int[] score = new int[3], sum; < 내가 짠 망한거
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num=sc.nextInt();
//			for(int i=0; i<score.length; i++) {
//			score[i]=num+i;
//		}
//		System.out.println("sum: "+score[i]);
//		

//		int[] score = new int[50]; // 배열의 길이 5개
//		score[0] = 100;
//		score[1] = 100;
//		score[2] = 100;
//		score[3] = 100;
//		score[4] = 100;

//		for(int i=0; i<score.length; i++) {
//			score[i]=60+i;
//		}

//		System.out.println(1+"번 점수:"+score[0]);
//		System.out.println(2+"번 점수:"+score[1]);
//		System.out.println(3+"번 점수:"+score[2]);
//		System.out.println(4+"번 점수:"+score[3]);
//		System.out.println(5+"번 점수:"+score[4]);
//
//		for(int i=0; i<score.length; i++) {
//			String grade=null; // 참조형
//			if(score[i]>=90) {
//				grade="A학점";
//			} else if(score[i]>=80) {
//				grade="B학점";
//			} else if(score[i]>=70) {
//				grade="C학점";
//			} else if(score[i]>=60) {
//				grade="D학점";
//			} else {
//				grade="F학점";
//			}
//			System.out.println(i + "번째 요소 점수:" + score[i]);
//			System.out.println(i + "번째 학점:" + grade);
//			System.out.println("------------");

	}
}
