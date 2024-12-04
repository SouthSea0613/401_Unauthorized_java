package part1;
//연산자
//1. 단항연산자: (cast), -, +, !(논리연산자), ~, ++, --

//2. 이항연산자: * / %  , + - (앞에 3개가 더 높음)
   //2-1. 산술연산자
   //2-2. 비교(관계) 연산자: >, <, >=, <=, ==(같니?), !=(같지않니?)
   //2-3. 논리 연산자: &&, ||

//3. 삼항연산자: ? :

//4. 대입연산자: =, +=, -=, *=, /=, %=

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println((double)3*4); // 단항이 더 높음
//		System.out.println((double)-3*4); // 여기선 - 부호임
//		System.out.println((double)((-1)*3*4); // 위와 같은거임
		
//		int a=10, b=3;
//		System.out.println("a+b="+(a+b)); 
//		System.out.println("a-b="+(a-b));
//		System.out.println("a*b="+(a*b));
//		System.out.println("a/b="+(a/b));
//		System.out.println("a%b="+(a%b));
	
//		int kor, eng;  //kor{?}, eng{??}
//		int tot=0;       //tot{???}   /  tot에 = 0 하면 차례차례 
//		kor=71;   	   //kor{71}
//		tot+=kor; //tot=kor;       //tot{71}
//		eng=70;        //eng{70}
//		tot+=eng; //tot=tot+eng;   //tot{141}
//		int mat=100;
//		tot+=mat; //tot=tot+mat;   //tot{241}
//		System.out.println("tot="+tot);
		
		//퀴즈 12340
//		int money=12340;
//		
//		//실행결과 --> 만원은 1장 , 5천원은 0장 , 1천원은 2장 , 5백원은 0개 , 100원은 3개 , 50원은 0개 , 10원은 4개
//		
//		System.out.println("만원"+money/10000+"장");
//		money%=10000; //money=money%10000
//		System.out.println("오천원"+money/5000+"장");
//		money%=5000;
//		System.out.println("천원"+money/1000+"장");
//		money%=1000;
//		System.out.println("오백원"+money/500+"개");
//		money%=500;
//		System.out.println("백원"+money/100+"개");
//		money%=100;
//		System.out.println("오십원"+money/50+"개");
//		money%=50;
//		System.out.println("십원"+money/10+"개");  
//		money%=10;
		
		//비교(관계) 연산자
//		System.out.println(3>=5);  //boolean값 : true, false
//		System.out.println(3<=5);
//		boolean result=(3==5);
//		System.out.println(3==5);
//		System.out.println(3!=5);
//		System.out.println("result="+result);
		
		//논리 연산자, !(not,부정) > &&(and,논리곱) > ||(or,논리합)
//		false && false => false    //false : 0 , true : 1
//		false && true => false
//		true && false => false
//		true && true => true
		
//		false || false => false    //false : 0 , true : 1
//		false || true => true
//		true || false => true
//		true || true => true
		
		
//		int kor=90;
//		int eng=80;
//		boolean result= (kor>=90) && (eng>=90); //true && false   , ||하나만 참 이면 참 , &&는 다 참 이여야 참 , (eng>=90) 앞에 !로도 뒤집을 수 있
//		System.out.println(result);
//		System.out.println(!result); // ! 로 뒤집었다
		
		//증감 연산자 ++ , --
		
		//삼항 연산자 ? , :
		
	}

}
