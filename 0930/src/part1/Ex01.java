package part1;

// 소스파일 Ex01.java
public class Ex01 {

	public static void main(String[] args) {
		//단항 > 이항(산술>관계(비교)>논리) > 삼항 > 대입
		//증감연산자 ++, --(단항연산자)
		      //후위식 (postFix) 전위식 (preFix)
		//a=10   a++     >      ++a     a+=1 
		//b=10   b--            --b
		int a=10, b=100, c=50; 
		//b=++a*4; //*!중요!* a++ 이 되면 a{11}  b{40} 연산식이 후위식(a++)이면 후위식인 부분은 맨나중에 계산 
		//a{11}  b{44}
		//b= (a--) +5; 
//		b=(--a) +5;
//		b=a+5;
//		a--;
		//++a; 전위식보다 후위식을 많이씀
//		System.out.println("a="+ a++);
//		System.out.println("a="+ b);
		
		//삼항( 조건, true or false )연산자    ?  :   //비교대상자가 둘일땐 삼항연산자사용, 비교대상자가 여러개일땐 if문과 함께 사
		//a>b 참,  a<=b 거짓
		// max=(a>b) ? a : b ; 
		int max=-99999999;
		if (a>b) {
			max=(a>c)? a : c ;
		}
		if (a<=b) {
			max=(b>c)? b : c ;
		}
		System.out.println("max="+ max);
		
		//int num=10;
		//num++; //num+=1;  //num=num+1; //num--;
		//System.out.println(num++); 
	}

}
