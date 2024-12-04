package part1;

import java.util.Scanner;

//반복문: while !for문 form과 while문 form은 다르고 꼭 기억할 것!
public class Ex04 {
	public static void main(String[] args) {
//		int i=0;  //1,··,5
//		while (i<5) {
//			System.out.println(i+",I Like java");
//			i++; //i+=1
//		}
		// 횟수가 정해진 단순 반복문 추천(for문)
		// i=1,1,2,.....100의 합 5,050
//		int i=1;
//		int sum=0;
//		for문
//		for(i=1; i<=100; i++) {
//			sum+=i;//sum=sum+i;
//		}
		// 1~100까지의 합은 5,050입니다.
//		int i;
//		for(i=0;i<5;i++) {
//			System.out.println(i+",I Like java");
//		}
//		System.out.println(sum); 
//		System.out.println("1부터 "+(i-1)+"까지 합은 "+sum);
//		while문
//		while(i<=100) {
//			sum+=i++;
//			//i++;
//		}
//		System.out.println(sum);
//		Scanner sc=new Scanner(System.in); //sc부분만 변경 가능(공식처럼 외우기)
//		System.out.print("정수 입력:");
//		int num=sc.nextInt(); //<키보드로부터 정수를 입력할 수 있는 메소드
//		int i, sum=0;
//		for(i=1; i<=num; i++) {
//			sum+=i;
//		}
//		System.out.println("sum:"+sum);
		// 합계가 100을 초과하는 최초의 i값, sum값 출력
//		10,11,12,13   91
//		int i=1, sum=0;
//		while(sum<=100) {
//			sum+=i; //i=14, sum=105
//			i++; //15
//		}
//		i--;
//		System.out.println("i값은 "+(i-1)+",sum 값은 "+sum);
		// 임의 정수를 입력받아 해당 구구단을 출력하시오
//		Scanner sc=new Scanner(System.in); //sc부분만 변경 가능(공식처럼 외우기)
//		System.out.print("단:");
//		int dan=sc.nextInt();  //5 or 6
//		//for
//		//실행예
//		int i;
//		for(i=1; i<=9; i++) {
//			System.out.println(dan+"*"+i+"="+dan*i);	
		// 실행 예
		Scanner sc = new Scanner(System.in); // sc부분만 변경 가능(공식처럼 외우기)
		System.out.print("숫자 입력:");
		int i = sc.nextInt();
		for (i = 1; i <= 10; i++) {
			System.out.print(i);
			if (i % 2 == 0) {
				System.out.println(": 짝수입니다.");
			} else {
				System.out.println(": 홀수입니다.");
			}
		}
	}
}
