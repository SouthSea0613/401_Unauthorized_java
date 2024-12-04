package part1;
public class Ex03 {
	public static void main(String[] args) {
		//자료형(type) 변수(variable)<-->상수(constant)
//		int num       =   100;
//		num=200;
////메모리  { 200,4B	}
//		System.out.println("num="+num);
//		double num2=300.3; //|300.3 , 8B|
//		System.out.println("num2="+num2);
//		int a=10, b;
//		b=20;
//		int result=a+b;
//		System.out.println("a+b="+result); //a+b=30
		//실수형 float, double
//		double x, y, result;
//		x=1.0000001;  //x 4B, 1.0000001 4B
//		y=2.0000001;
//		result=x+y;
//		System.out.println(result);
		//형(Type) 변환
//		char ch='B'+32;
//		System.out.println('B'+32);
//		System.out.println("ch="+ch);
		//자동형변환
//		System.out.println(10/3);  //3 < 정수를 연산하게 되면 정수가 됨 ->3
//		System.out.println(10.0/3.);  //3.3333
//		System.out.println(10/3.);  //int-->double 자동형변환
//		System.out.println(10+3.);	//int-->double 자동형변환
//		int kor=70, eng=71;
//		int tot=kor+eng;
//		System.out.println("평균:"+tot/2.);  //70.5
		//강제형변환(casting)
//		int kor=70, eng=71;
//		int tot=kor+eng;
//		int cnt=2;
//		System.out.println("평균:"+(double)tot/cnt);
//		System.out.println("평균:"+tot/(double)cnt);
//		System.out.println("평균:"+(double)(tot/cnt));
//		long val=10000000000L; //100억 //정수의 long(+-922경)
//		System.out.println("val:"+val);
		int a = 1000000; // 1백만
		int b = 2000000; // 2백만
		long c = (long)a * b; // 2조 여기 수정
		System.out.println("c="+c);  // 2조
		
		long d = 1000000L * 2000000; // 2조 여기 수정
		System.out.println("d="+d);
		
		//long e = 1000000L * 1000000 / 1000000;  //1백만 여기 수정
		//int e = (int)(1000000L * 1000000 / 1000000);  //1백만 여기 수정
		int e = (1000000/1000000 * 1000000);  //1백만 여기 수정
		System.out.println("e="+e);
	}

}
