package part2;

//자료형(Type)
//기본(Primitive) 형: int, double.....boolean(값)
//참조(Reference) 형: 배열, 클래스, 인터페이스, enum(참조값)
public class Ex01 {
	public static void main(String[] args) {
		Print pnt = new PrintImpl(); // 다형적 변수
		pnt.show("aaaa");
		pnt.print(100);

		Print pnt2 = method();
		pnt2.show("bbbb");
		pnt2.print(100000);
		method2(pnt);
	}

	private static void method2(Print pnt) {
		pnt.show("dddd");
		pnt.print(250000);
	}

//참조(인터페이스)형 반환: 인터페이스를 구현한 클래스 객체를 바환함
//참조(클래스)형 반환: 해당 클래스 객체 또는 상속한 클래스 객체를 반환함
	private static Print method() {
		return new Printable();

	}

}
