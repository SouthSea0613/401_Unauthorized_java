package part01;

/* 자료형(Type)
 * 기본(Primitive)형 : int, double...
 * 참조(Reference)형 : 배열, 클래스 ,인터페이스, enum
 */

public class Ex02 {
	private static Print method() {
		return new PrintImpl();
	}
	
	private static void method2(Print pnt) {
		// TODO Auto-generated method stub
		pnt.show("ccc");
		pnt.print(789);
	}
	
	public static void main(String[] args) {
		Print pnt = new PrintImpl();
		
		pnt.show("aaa");
		pnt.print(123);
		
		Print pnt2 = method();
		pnt2.show("bbb");
		pnt2.print(456);
		
		method2(pnt);
	}
}
