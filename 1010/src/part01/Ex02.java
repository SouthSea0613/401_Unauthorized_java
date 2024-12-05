package part01;

public class Ex02 {
	private static void method(Ex02_01 ex) {
		ex.showInfo();;
		// ((Ex02_01_01)ex).showInfo();
		ex.sleep();
	}
	
	public static void main(String[] args) {
		Ex02_01_01_01 ex02 = new Ex02_01_01_01("김남해", 26, 13, 10, 10000);
		ex02.eat();
		ex02.study();
		ex02.showInfo();
		ex02.showStudentInfo1();
		ex02.showInfo();
		ex02.showInfo();

		// 암기) 조상타입의 참조변수는 후선 인스턴스를 참조 가능
		Ex02_01 ex1 = new Ex02_01_01_01("김남해", 10, 10, 10, 10);
		// 암기) 사기꾼 눈에는 사기꾼만 있음
		// Ex02_01의 참조변수이므로 ex02_01의 함수만 사용가능
		ex1.showInfo();
		// 기끔나옴, 참조변수로 접근불가한 하위 메소드 접근 방법 > 형변환 응용
		((Ex02_01_01_01)ex1).showInfo();
		
		Ex02_01 tmp1 = new Ex02_01("김남해", 10);
		Ex02_01_01 tmp2 = new Ex02_01_01("김남해", 10, 10);
		Ex02_01_01_01 tmp3 = new Ex02_01_01_01("김남해", 10, 10, 10, 10);
		
		method(tmp1);
		method(tmp2);
		method(tmp3);
	}
}
