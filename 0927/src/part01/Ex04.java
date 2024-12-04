/*
 * 0. 괄호
 * 1. 단항
 * 2. 이항
 * 	-1. 산술
 * 	-2. 비교
 * 	-3. 논리
 * 3. 삼항 : ? :
 * 4. 대입
 */

package part01;

public class Ex04 {
	// 연산자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + a * b);
		System.out.println("a / b = " + a / b);
		System.out.println("a % b = " + a % b);
		
		int sum = 0;
		sum += 1;
		System.out.println(sum);
		sum += 2;
		System.out.println(sum);
		sum += 3;
		System.out.println(sum);
		
		int money = 98760;
		System.out.println("50000원 : " + money / 50000 + "장");
		System.out.println("10000원 : " + (money % 50000) / 10000 + "장");
		System.out.println("5000원 : " + (money % 10000) / 5000 + "장");
		System.out.println("1000원 : " + (money % 5000) / 1000 + "장");
		System.out.println("500원 : " + (money % 1000) / 500 + "장");
		System.out.println("100원 : " + (money % 500) / 100 + "장");
		System.out.println("50원 : " + (money % 100) / 50 + "장");
		System.out.println("10원 : " + (money % 50) / 10 + "장");
		
		// 비교 연산자
		System.out.println(3 > 5);
		System.out.println(3 < 5);
		System.out.println(3 == 5);
		System.out.println(3 != 5);
		
		boolean result = (3 <= 5);
		System.out.println(result);
		
		// 논리 연산자
		int kor = 90;
		int eng = 80;
		System.out.println((kor >= 90) && (eng >= 90));
		System.out.println((kor >= 90) || (eng >= 90));
		
		// 증감 연산자 ++, --
	}

}
