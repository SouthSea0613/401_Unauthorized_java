package part1;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

//	String[] score = new String[50];
//	for (int i = 0; i < score.length; i++) {
//		
//	}
////	double[] score=new double[50];
////	for (int i = 0; i < score.length; i++) {
////
////	}
////	길이가3인 정수 배열 선언후 키보드로 정수를 입력받아서 배열에 저장한다. 배열의 모든 요소의 합, 평균(소수점)을 구해서 출력한다
//		int[] arr = new int[5];
//		//int[] arr = new int[] {10,20,30,40,50}; 자동으로 5개 인지 인식함, (1개씩 값 입력해서 출력하고싶을때)
//		// = int[] arr = {10,20,30,40,50}; (초기값이 있으면 생략도 가능하다)
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < arr.length; i++) {
//			//i = i+1; = i+=1;
//			System.out.println((i + 1) + "번째 입력:");
//			arr[i] = sc.nextInt();
//		}
//		
//		
//		
//		
//		
//		for (int i= 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		// 합
		/*
		 * int sum = 0; for (int i = 0; i < arr.length; i++) { sum += arr[i]; } // 평균
		 * System.out.println("sum: " + sum); System.out.println("avg: " + (double) sum
		 * / arr.length); // 아니면 (double) 추가 3.0
		 */
		int[] score = new int[50]; // 배열의 길이 50개
		for (int i = 0; i < score.length; i++) {
			score[i] = i+1;
			System.out.println(score[i]);  //다시 체크 늘어나는 숫자여야함
		}
	}// main
}// class
