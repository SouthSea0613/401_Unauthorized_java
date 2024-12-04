package part1;

public class Ex02 {
	public static void main(String[] args) {
		//조상생성자 실행-->=부모생성자 실행-->자식새성자 실행-->객체
		//★암기★ 조상타입의 참조변수는 후손 인스턴스를 참조 가능
		//★암기★ 사기꾼 눈에는 사기꾼만 보인다
		//Person 참조변수는 Person 클래스의 멤버만 접근 가능(컴파일러 한계)		
//		PartTimeStd pts=new PartTimeStd("kim",20,1,9860,8);
//		pts.showPartTimeStdInfo();

		//↓다형적(성) 변수
		Person person=new Person("park",30);
		Student std=new Student("lee",20,11);
		PartTimeStd pts=new PartTimeStd("kim",20,1,9860,8);
		method(pts);
		System.out.println("-------------------");
		method(std);
		System.out.println("-------------------");
		method(person);
		System.out.println("-------------------");
		method(new Student("cha",21,11));
//		Student pts=new PartTimeStd("kim",20,1,9860,8);
//		pts.showStudentInfo();
//		System.out.println("-------------------");
//		PartTimeStd p =(PartTimeStd)pts;
//		p.showPartTimeStdInfo();
//		System.out.println("-------------------");
//		((PartTimeStd)pts).showPartTimeStdInfo();
//		HybridWaterCar car=new HybridWaterCar(50,1000,80); // 50L,1000kw
//		car.showHybridWaterCarGauge();
//		Student std=new Student("kim",20,1);
//		std.showStudentInfo();
//		std.eat();
//		std.sleep();
//		std.exam();
//		std.study();
	}
	
	//↓메소드 오버로딩
//	private static void method(Person person) {
//		
//	}
//	private static void method(Student std) {
//		
//	}
//	private static void method(PartTimeStd pts) {
//		pts.showPartTimeStdInfo();
//	}
	//다형성 변수(위의 세가지 메소드를 상속최고 변수가 다 실행할 수 있음)
	private static void method(Person person) {
		person.showInfo();  //다형성 활용 코딩: 상속의 목적
		person.sleep();
//		((Student)person).showInfo();
	}
}