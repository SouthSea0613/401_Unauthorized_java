package part2;
//자료형 (Type)
//기본(Primitive Type) 자료형 : int, double....boolean
//참조(Reference Type) 자료형 : 배열, 클래스, 인터페이스, enum
public class Ex01 {

	public static void main(String[] args) {
		Print pnt=new PrintImpl();
		pnt.show("aaaaaa");// 오버라이딩
		pnt.print(100); // 오버라이딩
		
//		Print pnt2=method();
//		pnt2.show("bbbbbbb");
//		pnt2.print(10000);
		pnt=method();
		pnt.show("cccc");
		pnt.print(200);
		method2(pnt);
	}
	//매개변수 참조형(클래스, 인터페이스)
	private static void method2(Print pnt) {
		pnt.show("ddddd");
		pnt.print(300);
		
	}
	//참조(인터페이스)형 반환 : 인터페이스를 구현한 클래스 객체를 반환함
	//참조(클래스)형 반환 : 해당 클래스 객체 또는 상속한 클래스 객체를 반환함
	private static Print method() {
		//인터페이스는 인스턴스 메소드 생성 안됨, 
		//하지만 부모클래스와 같은 역할 할수 있음
		//인터페이스를 구현하고 있는 클래스 
		//인터페이스는 new 사용 불가능 
		//return new PrintImpl();
		return new Printable();
	}
}
