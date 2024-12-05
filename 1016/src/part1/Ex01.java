package part1;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("문자열 정수 : ");
	String strVal=sc.next()	;
	
	int val= Integer.parseInt(strVal);  
	// Integer(로 써도됨)  val = Integer.parseInt(strVal);
	//parseInt 외우기 문자열 정수를 받을수 있도록 변환 해주는 문법
	System.out.println(++val);
	
	
	
	Integer num = 100; //autoBoxing = 200
	Integer num2 = 100;
	if(num.equals(num2)) { 
		// Integer 안에서 동등비교 해놓은것(오버라이드함)
		System.out.println("값이 같음");
	}else {
		System.out.println("값이 다름");
	}
	System.out.println(System.identityHashCode(num));
	System.out.println(System.identityHashCode(num2));
	//(new Integer(100));// (비권장)
	//showData(num); //(권장), auto Boxing 
	//System.out.println(new Integer(200));
}

private static void showData(Integer integer) {
	System.out.println(integer++); // integer 안에 수는 상수
	//System.out.println(integer+1); // 이렇게 쓰면 아래 코드처럼 변함 , autoUnboxing
	System.out.println(integer);
	//System.out.println(integer.intValue()+1);
	
}
}
