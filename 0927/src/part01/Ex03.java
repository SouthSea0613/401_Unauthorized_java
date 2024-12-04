package part01;

// 한줄 삭제 ctrl + d
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자료형(type) 변수(variable) = 상수(constant);
		int num1 = 1;
		num1 = 2;
		System.out.println("num1 = " + num1);
		double num2 = 3.4;
		System.out.println(num2);
		
		int a = 10;
		int b = 20;
		System.out.println("a + b = " + (a + b));
		
		// float 잘 안씀
		double x, y, z;
		x = 1.1;
		y = 2.2;
		z = x + y;
		System.out.println(z);
		
		// 자동 type 변환
		System.out.println(10 / 3);
		System.out.println(10.0 / 3);
		int kor = 70;
		int eng = 71;
		int sub = 2;
		System.out.println("평균 : " + (kor + eng) / 2.0);
		
		// 강제 type 변환(casting)
		System.out.println("평균 : " + (double)(kor + eng) / sub);
		System.out.println("평균 : " + (kor + eng) / (double)sub);
		
		// 상수의 정수값 기본타입은 int이므로 상수 21억+는 오류발생
		// long타입으로 접미문자 명시
		long val = 10000000000l;
		System.out.println(val);
		
		System.out.println(1000000l * 2000000);
		System.out.println((int)(1000000l * 1000000 / 1000000));
		System.out.println(1000000 / 1000000 * 1000000);
	}

}
