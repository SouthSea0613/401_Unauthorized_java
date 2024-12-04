package part1;


import java.math.BigDecimal;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("실수1 입력: ");
		String e1=sc.next();
		System.out.println("실수2 입력: ");
		String e2=sc.next();
		
		BigDecimal e3=new BigDecimal(e1);
		BigDecimal e4=new BigDecimal(e2);
		BigDecimal result = e3.subtract(e4);
		System.out.println(result);
		System.out.println("차의 절대값= "+result.abs()); //abs 절대값표시
		
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		
//		double sum=0;
//		for(int i=0; i<100; i++) {
//			sum+=0.01;
//		}
//		System.out.println(sum);
	}
}
