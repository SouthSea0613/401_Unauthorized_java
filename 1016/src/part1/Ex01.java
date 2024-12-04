package part1;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		//<input type = "text" id = "id"> |100|==>"100"+1===>"1001"
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 정수");
		String strVal=sc.next();
		
		int val = Integer.parseInt(strVal); // "200"-->200
		System.out.println(++val);
		//Integer num = 200;
		//Integer num2 = 200;
		//if(num.equals(num2)) {
		//	System.out.println("값이 같음");
		//} else {
		//	System.out.println("값이 다름");
		//}
		//System.out.println(System.identityHashCode(num));
		//System.out.println(System.identityHashCode(num2));
		//showData(new Integer(100)); 비권장 
		//showData(num); // 권장,autoBoxing, jdk1.8
		//showData(new Integer(200));
	}

	private static void showData(Integer integer) {
		System.out.println(integer++);
		System.out.println(integer);
		//System.out.println(new Integer(integer.intValue()+1));
	}
}
