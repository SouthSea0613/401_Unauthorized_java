package part1;

public class Ex02 {
	public static void main(String[] args) {
		// 자식 객체 생성 -> 부모생성자 실행 -> 자식생성자 실행 -> 자식객체 생성
		// 암기) 조상타입의 참조변수는 후손 인스턴스를 참조 가능
		Person person = new Person("park", 30);
		Student std = new Student("lee", 20, 11);
		Student pts = new PartTimeStd("kim", 20, 1, 9860, 8);
		method(pts);
		System.out.println("-----------------");
		method(std);
		System.out.println("-----------------");
		method(person);
		System.out.println("-----------------");
		method(new Student("ha", 21, 11));
		// 원칙은 (Person)형변환 타입써야하지만 생략가능
		// 암기) 사기꾼눈에는 사기꾼만 보인다.
		// Person 참조변수는 Person 클래스의 멤버만 접근가능
		// pts.showStudentInfo();
		// System.out.println("-----------------");

		// 가끔나옴, 참조변수로 접근불가한 하위 메소드 접근 방법
		// 후손이 조상의 참조변수로는 받을수 없음. 그 반대는 가능함
		// ((PartTimeStd)pts).showPartTimeStdInfo(); //() 보다 . 연산자가 먼저 실행됨

//		std.study();
//		std.sleep();
//		std.exam();
//		std.study();

	}

	// 다형성 변수
	private static void method(Person person) {
		person.showInfo();//다형성 활용 코딩: 상속의 목적
		person.sleep();
//		((Student)person).showInfo();
	}

}
