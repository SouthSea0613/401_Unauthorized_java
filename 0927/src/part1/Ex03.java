package part1;

public class Ex03 {
	public static void main(String[] args) {
		//자료형(type) 변수(variable)<---->상수(constant)
//		int num=100;
//		//메모리 { 4Byte==32bit } {100, 4B, 변수}
//		System.out.println("num="+num);
//		num=300;
//		System.out.println(num);
//		double num2=300.3; // |double 300.3, 8B|
//		System.out.println("num2="+num2);
//		int a, b; //a=10, b 이렇게 써도 가능함
//		a=10; b=20;
//		int result=a+b; //반복적으로 연산의 결과를 사용하면 result 사용, 복잡한 계산의 식은 따로 사용
//		System.out.println("a+b="+result);
		//실수형 float, double
		double x, y, result;// 정수는 오차가 없지만 실수는 오차가 발생하는것이 자연스러움
		x=1.0000001F; //x는 4B, 1.0000001은 8B, 1.0000001을 float 로 바꾸려면 1.0000001F F를 붙여줌
		y=2.0000001F;
		result=x+y;
		System.out.println(result);
		//자동형 (type) 변환 
		int kor=70, eng= 71;
		int tot = kor + eng;
		int cnt=2;
		//System.out.println("평균:"+(tot/2.0));//70.5
		//강제형변환(casting)
		System.out.println("평균 :"+(double) tot/cnt); //double 은 캐스팅 연산
		System.out.println("평균 :"+ tot/(double) cnt);
		System.out.println("평균 :"+(double)(tot/cnt)); //( )먼저 실행
		
		long val=10000000000L; //100억 //정수의 기본타입 int (+- 21억) , 정수의 long 형변환 (+-922경)
		System.out.println("val:"+val);
		int a= 1000000;
		int b= 2000000;
		long c=(long) a * b;
		System.out.println("c="+c);
		
//		long d= (long)1000000 * 2000000;
		long d= 1000000L * 2000000;
		System.out.println("d="+d);
		
		//long e= 1000000L * 1000000 / 1000000;
		int e = (int) (1000000L * 1000000 / 1000000);
		System.out.println("e="+e);
		
		System.out.println(10 / 3); // 3
		System.out.println(10 / 3.); // int--> double 자동형변환
		System.out.println(10.0 / 3); // 3.3333
		System.out.println(10 + 3); // int --> double 자동형변환 
		
		
				
	}

}
