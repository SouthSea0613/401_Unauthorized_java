package part1;

public class Ex01 {
	public static void main(String[] args) {
		//단항 > 이항(산술>관계(비교)>논리) > 삼항 > 대입
		//증감연산자 ++, --
		int num=10;
		//num++;//num+=1;//num=num+1; 
		System.out.println(++num);
		//		후위식(postFix)	전위식(preFix)		
		//a=10		a++		>		++a		a+=1
		//b=10		b--				--b		b-=1
		int a=10, b=100, c=50;
		//a{11}		b{44}
		//b=++a*4;
		//b=a++*4; a{11} b{40} 후위식연산자가 있다면 후위식을 가장 늦게!!!!!!!!
//		a++;
//		//++a;
//		System.out.println("a="+ a++);
//		System.out.println("a="+ a);
//		b= (--a) +5;
//		b=a+5;
//		a--;
		System.out.println("a="+ a );
		System.out.println("b="+ b );
		//삼항(조건,true or false)연산자   ? :
		//a>b 참, a<=b 거짓
		//max=(a>b) ? a : b;
		//int max=(a>b) ? (a>c)?a:c : (b>c)?b:c;
		int max=-9999999;
		if(a>b) {
			max=(a>c)?a:c;
		}
		if (a<=b) {
			max=(b>c)?b:c;
		}
		System.out.println("max="+max);
	}
}
