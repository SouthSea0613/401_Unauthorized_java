package part1;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//길이가 3인 정수 배열 선언후
		//키보드로 정수를 입력받아서 배열에 저장한다.
		//배열의 모든 요소의 합, 평균(소수점)을 구해서 출력한다.
		//int[] arr=new int[]{20,30,40,50};
		int[] arr={20,30,40,50};
		
		int sum=0;
//		Scanner sc=new Scanner(System.in);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i+1)+"번째 입력:"); 
//			arr[i]=sc.nextInt();
//			//sum+=arr[i];
//		}
		//합
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println("sum: "+sum);
		System.out.println("avg: "+ (double)sum/arr.length);
		
		
//		int[] score=new int[50]; //배열의 길이 50개
//		for (int i = 0; i < score.length; i++) {
//			score[i]=10+i;
//			System.out.println(score[i]);
//		}
//		for(int i=0;i<score.length;i++) {
//			score[i]=60+i;
//		}
//		for(int i=0;i<score.length;i++) {
//			String grade=null;  //empty String 참조형
//			if (score[i] >= 90 ) {
//				grade="A학점";
//			} else if (score[i] >= 80) {
//				grade="B학점";
//			} else if (score[i] >= 70) {
//				grade="C학점";
//			} else if (score[i] >= 60) {
//				grade="D학점";
//			} else {
//				grade="F학점";
//			}
//			System.out.println(i+1+"번째 요소 점수:"+score[i]);
//			System.out.println(i+1+"번째 요소 학점:"+grade);
//			System.out.println("----------------");
//		}
		
	}//main
}//class
