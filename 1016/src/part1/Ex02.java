package part1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실수1 입력");
		String val1 = sc.next();
		System.out.println("실수2 입력");
		String val2 = sc.next();

		BigDecimal a = new BigDecimal(val1);
		BigDecimal b = new BigDecimal(val2);
		BigDecimal result = a.subtract(b);
		System.out.println(result);
		System.out.println("차의 절대값= "+result.abs());
	}
}
