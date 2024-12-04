package part01;

import java.math.BigDecimal;

public class Ex02 {
	public static void main(String[] args) {
		System.out.printf("%d\n", Long.MAX_VALUE);
		System.out.printf("%d\n", Integer.MIN_VALUE);
		
		BigDecimal a = new BigDecimal("10.1");
		BigDecimal b = new BigDecimal("20.2");
		System.out.printf("%s\n", a.subtract(b));
	}
}
