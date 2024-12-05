package part1;

import java.util.Scanner;

//반복문 : while
public class Ex04 {
	public static void main(String[] args) {
//		int i=0; //1 , 2 , 3 , 4  반복횟수가 중요한경우엔 직관적으로 입력
//		while(i<5) {
//			System.out.println(i+",I like java");
//			i++;
//			}
//		int i; //횟수가 정해져있는 반복문은 for 문이 좋
//		for (i=0 ; i<5 ; i++) {
//			System.out.println(i+",I like java");
//		}
//		System.out.println(i);
//		i=1 , 1,2,3,4,....N의 합
		// i++;
		// sum=sum+i
//		int i=1, sum=0; //횟수가 정해져있는 반복문은 for 문이 좋음
//		for (i=1 ; i<11 ; i++)  {	
//			sum+=i;		
////		}
//		while(i<=10) {
//			sum+=i++; //후위식은 나중에 계산
//		}
//		System.out.println("1부터"+(i-1)+"까지의 합은 "+sum+" 입니다");

//		Scanner sc=new Scanner(System.in);  //외우기  콘솔창에 입력해 받을수 있음
//		System.out.print("정수 입력 :"); //println -> ln 은 라인이라는 뜻 줄바꾸기 싫으면 지우기
//		int num=sc.nextInt(); 
//		int i, sum=0;
//		for(i=1; i<num+1; i++) {
//			sum+=i;
//		}
//		System.out.println("sum="+sum);
		// 누적합계가 100을 초과하는 최초의 i값, sum값을 출

//		int i=1, sum=0; //for 문은 반복횟수 중요 , while 문은 값이 중
//		while (sum<=100){
//			sum+=i;
//			i++;
//		}
//		i--;
//		System.out.println("i: "+i+", sum: "+sum);
		// 임의 정수를 입력받아 해당 구구단을 출력
//		Scanner sc=new Scanner(System.in);  
//		System.out.print("단 입력 :");  //5 or 6
//		int dan=sc.nextInt(); 
//		for (int i=1; i<10; i++){
//			System.out.println(dan+" * "+i+" = "+dan*i);
//		}
		// 실행 예
		int i;
		for ( i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i + "=홀수");
			} else {
				System.out.println(i + "=짝수");
			}
		}
		System.out.println(i);
		
		
	}
}
