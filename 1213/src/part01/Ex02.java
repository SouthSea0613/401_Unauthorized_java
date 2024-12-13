package part01;

//자바에서 제공하는 인터페이스 사용예정
interface Printable{
	void print(String s);
//	void print(); 면 아래 도 그냥 ()로
}

public class Ex02 {
	public static void main(String[] args) {
//		Printable prn = (s) -> { //출력할게 1개면 {}도 생략가능. / 위 변수명 과 아래 변수명 달라도 됨(타입은같아)
//			System.out.println(s);
//			System.out.println(s.length());
//			};
		fct( s -> System.out.println(s)); //익명클래스 객체1
		fct( s -> System.out.println(s)); //객체2
		
	}

	private static void fct(Printable prn) {
		System.out.println(prn);
		prn.print("aaaaa");	
	}	
}