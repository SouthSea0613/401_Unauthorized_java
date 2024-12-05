package part1;
//1. 단항연산자 : (cast),-,+,!(논리연산자),~,++,-- 
//2. 이항연산자 : 
 // 2-1. 산술연산자 : *,/,%,>,+,-
 // 2-2. 비교( 관계 )연산자 : >,<,>=,<=,==,!=
 // 2-3. 논리 연산자 : && ||
//3. 삼항연산자 : ? :
//4. 대입연산자 : =, +=, -=, *=, /=, %= // 오른쪽부터 계산
		
public class Ex04 {

	public static void main(String[] args) {
		int x, y, z; //최초값 넣어주기
		x=y=z=10; 
		x+=10;  //x=x+10
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
//		int a=10, b=3;
//		System.out.println((double)3*4); //double 은 단항연산자 , 3*4 는 이항연산자 단항 > 이항 단항이 우선순위가 높음
//		System.out.println("a+b="+(a+b));
//		System.out.println("a+b="+(a-b));
//		System.out.println("a+b="+(a*b));
//		System.out.println("a+b="+(a/b));
//		System.out.println("a+b="+(a%b));
//		
//		int kor, eng; 
//		int tot=0;
//		kor = 71;
//		tot+=kor;
//		eng=70;
//		tot+=eng;
//		int mat=100;
//		tot%=mat;
//		System.out.println("tot="+tot);
		
		int money=12340;
			System.out.println("만원"+ money / 10000+"장");
				money%=10000;
			System.out.println("오천원"+ money / 5000+"장");
				money%=5000;
			System.out.println("천원"+ money / 1000+"장");
				money%=1000;
			System.out.println("오백원"+ money / 500+"개");
				money%=500;	
			System.out.println("백원"+ money / 100+"개");
				money%=100;
			System.out.println("오십원"+ money /50+"개");
			 	money%=50;
			System.out.println("십원"+ money / 10+"개");
				money%=10;
				
			//실핼결과
				//만원1장
				//오천원0장
				//천원2장
				//오백원0개
				//백원3개
				//오십원0개
				//십원4개
				
		//비교연산자
//			System.out.println(3>5); // boolean 값 : true, false
//			System.out.println(3<5);
//			boolean result=(3==5);
//			System.out.println(3==5);
//			System.out.println(3!=5);
//			System.out.println("result="+result);
			
		//논리연산자 , !(not, 부정) > &&(and, 논리곱) > || (or, 논리합) 못외우면 ( ) 씌우기
//			false : 0 && false : 0 = false = 0 
//			false : 0 && true : 1 = false = 0 
//			true : 1 && false : 0 = false = 0 
//			true : 1 && true : 1 = true = 1
//			false : 0 || false : 0 = false = 0 
//			false : 0 || true : 1 = true = 1
//			true : 1 || false : 0 = true = 1 
//			true : 1 || true : 1 = true =1
			
			
//			int kor =90;
//			int eng =80;
//			int mat =80;
//			boolean result = (kor>=90) && (eng>=90) && (mat>=80);// true && false, 모든식이 참이 되어야 true
//			System.out.println(result);
//			System.out.println(!result);
//			
			
				
		
	}

}
