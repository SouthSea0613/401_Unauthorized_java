package part1;

public class Ex02 {
	public static void main(String[] args) {
		//조상 생성자 실행 --> 부모 생성자 실행 --> 자식 생성자 실행 --> 객체
		
//		HybridWaterCar car=new HybridWaterCar(50, 1000, 80); //50L, 1000kw, 80L
//		car.showHybridWaterGauge(); //잔여량 출력
		
		//암기) 조상 타입의 참조변수는 후손 인스턴스를 참조 할 수 있다.
		//다형성 변수
		Person person=new Person("park",30);
		Student std=new Student("lee",20,11);
		PartTimeStd pts=new PartTimeStd("kim",20,1,9860,8);
		method(pts);
		System.out.println("-----------------");
		method(std);
		System.out.println("-----------------");
		method(person);
		System.out.println("-----------------");
		method(new Student("cha",21,11));
				
//		Person pts=new PartTimeStd("kim",20,1,9860,8); //형변환 생략가능 (Person)new... 이 생략 돼 있음
		//암기) 사기꾼 눈에는 사기꾼만 보인다. = Person 참조변수는 Person 클래스의 멤버만 접근가능.
//		pts.showPersonInfo();
//		System.out.println("---------------");
		//가끔나옴, 참조변수로 접근불가한 하위 메소드 접근 방법.
//		((PartTimeStd)pts).showPartTimeStdInfo();
		
//		System.out.println("---------------");
//		PartTimeStd p = (PartTimeStd)pts;
//		p.showPartTimeStdInfo();
		
//		std.eat();
//		std.sleep();
//		std.study();
//		std.exam();
	}
	
	//다형성 변수 
	private static void method(Person person) {
		person.showInfo(); //다형성 활용 코딩: 상속의 목적.
		person.sleep();
		//((Student)person).showStudentInfo();
		
		
	}
		
}
