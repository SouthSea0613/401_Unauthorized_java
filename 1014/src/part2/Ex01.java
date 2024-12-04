package part2;

//자료형(Type)
//기본(Primitive) 형: int, double.....boolean  --> 값 을 저장
//참조(Reference) 형: 배열, 클래스, 인터페이스,  enum --> 참조값 을 저장
public class Ex01 {
	public static void main(String[] args) {
		Print pnt=new PrintImpl();
		pnt.show("aaaaa"); //오버라이딩
		pnt.print(100); //오버라이딩
		
		pnt=method();
		pnt.show("bbbbb");
		pnt.print(10000);
		method2(pnt);
	}

//매개변수 참조형(클래스, 인터페이스)
private static void method2(Print pnt) {
		pnt.show("dddd");
		pnt.print(300);
		
	}

//참조(인터페이스)형 반환: 인터페이스를 구현한 클래스 객체를 반환함
//참조(클래스)형 반환: 클래스를 상속한 클래스 객체를 반환함
	private static Print method() {
		//return new PrintImpl(); //--> 인터페이스로 리턴 불가능해, 추상 클래스 이기 때문이야, 그래서 자식 으로 간거야
		return new Printable();
	}
}
