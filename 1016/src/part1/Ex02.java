package part1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("실수 1 입력 : ");
		String num1=sc.next();
		System.out.println("실수 2 입력 : ");
		String num2=sc.next();
		BigDecimal a =new BigDecimal(num1);
		BigDecimal b =new BigDecimal(num2);
		BigDecimal result= a.subtract(b);
		System.out.println(result);
		System.out.println("두 실수의 절대 값 : "+result.abs());
		


//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Long.MIN_VALUE);
//		System.out.println(Long.MAX_VALUE);
	}
}
