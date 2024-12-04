package part1;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열 정수: ");
		String strVal=sc.next();
		
		int val=Integer.parseInt(strVal); // "200" => 200
		System.out.println(++val);
		
//		Integer num=100; 
//		Integer num2=100; 
//		if(num.equals(num2)) { //동등비교 이퀄스(내용비교)
//			System.out.println("값이 같음");
//		}else {
//			System.out.println("값이 다름");
//		}
//		System.out.println(System.identityHashCode(num));
//		System.out.println(System.identityHashCode(num2));
		//showData(new Integer(100)); //줄 간건 비권장 하긴 해~ 
//		showData(num); //권장 , autoBoxing 자동으로 자바가 아래것 처럼 만들어줌 / (100)은 상수
		//showData(new Integer(100));
		
	}

	private static void showData(Integer integer) { // 오브젝트 로 돌려도 돌아감
		System.out.println(integer.intValue()+1); // 인트에 문자열을 붙이는 기능을 위해서.
		System.out.println(integer+1); //투스트링 이 오버라이딩 돼 있다~ / 자동으로 언방식 도 해 줌~
		
		System.out.println(integer++);
		System.out.println(integer);
		
	}
}
