package part1;

public class Ex03 {
	public static void main(String[] args) {
		// 자료형(type) 변수(variable) <--> 상수(constant)
//		int num=100;
//		num=200;
//		//메모리    {  4Byte == 32bit  }
//		System.out.println("num="+num);
//		num=300;  // num=300.3; |double 300.3, 8B|
//		
//		System.out.println("num="+num);
//		double num2=300.3;
//				System.out.println("num2="+num2);

//		int a, b; //= int a=10,b=20;
//		a=10; b=20;
//		System.out.println(a+","+b);
//		System.out.println("a+b="+(a+b));  //a+b=30
//		
//		int result=a+b;
//		System.out.println("a+b="+result); //a+b=30

		// 실수형 float, double
//		float x, y, result;
//		//x=1.0000001;  // x는 4B , 1.0000001는 8B / 1.0000001뒤에 F 붙히면 플룻 으로 변함
//		x=1.0000001F;
//		y=2.0000001F;
//		result=x+y;
//		System.out.println(result);

//		double x, y, result;
//		x=1.0000001;
//		y=2.0000001;
//		result=x+y;
//		System.out.println(result);

		
		// 자동형변환
//		int kor = 70, eng = 71;
//		int tot = kor + eng;
//		System.out.println("평균:" + tot / 2); //실수 로 보려면
//		System.out.println("평균:" + tot / 2.); // 평균: 70.5
//		// 형(type) 변환
//		System.out.println(10 / 3); // 3.3333.. 여기선 3나옴 정수 연산 결과는 정수
//		System.out.println(10.0 / 3.); // 3.3333.. 실수 연산 결과는 실수
//		System.out.println(10 / 3.); // int --> double 자동형변환 _ 정수랑 실수랑 붙으면 실수가 이김, 같은 타입끼리 붙으면 바이트가 큰 쪽이 이김
//		System.out.println(10 + 3.); // int --> double 자동형변환
		// 강제형변환(casting)
//		int kor = 70, eng = 71;
//		int tot = kor + eng;
//		int cnt=2; //과목수
//		System.out.println("평균:"+tot/cnt); // 강제캐스팅 하면
//		System.out.println("평균:"+(double)tot/cnt);
//		System.out.println("평균:"+tot/(double)cnt); 
//		System.out.println("평균:"+(double)(tot/cnt)); //괄호 안에 먼져 진행 = 정수 , 그 다음 실수 로 변하면 그냥 70.0
		
//		long val=10000000000; // 100억  // 정수의 기본타입은 int(+-21억) // long(+-922경) 의 L 붙혀
//		long val=10000000000L;
//		System.out.println("val:"+val);
		
		int a = 1000000; // 1백만
		int b = 2000000; // 2백만
		
		long c = (long)a * b; // 2조 / 강제캐스팅 long
		System.out.println(c); //2조
		
		long d = 1000000L * 2000000; // 2조 강제캐스팅도 가능 , L 붙혀
		System.out.println("d="+d);
		
		int e = (int)(1000000L * 1000000 / 1000000); // 1백만 , L 붙혔고 int 넣었고 
//		long e = 1000000L * 1000000 / 1000000; //  long 으로 바꾸고 L 붙혔음
		System.out.println("e="+e);
		
		
		
	}

}
