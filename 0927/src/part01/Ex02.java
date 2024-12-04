package part01;

public class Ex02 {
	// 자동 들여쓰기 ctrl + shift + f
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자동 위아래 복사 ctrl + alt + 방향키
		/* 블럭 주석 */
		System.out.println(123);
		System.out.println(1.23);
		System.out.println('a');
		System.out.println("abc");
		System.out.println("abc" + 123);
		System.out.println(1 + 2);
		System.out.println(10 + 20);
		System.out.println("abc" + 10 + 20);
		
		// 공백문자열
		System.out.println("" + 10 + 20);
		// 컴파일 우선순위
		System.out.println("abc" + (10 + 20));
		
		// 25를 여러방법으로
		System.out.println(25);
		System.out.println("25");
		System.out.println("" + 2 + 5);
		System.out.println("2" + 5);
		System.out.println(2 + "5");
	}

}
