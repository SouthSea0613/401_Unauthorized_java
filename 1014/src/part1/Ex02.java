package part1;

public class Ex02 {
	public static void main(String[] args) {
		//조상 참조변수는 후손 인스턴스를 참조가능
//		Student.SNAME = "인천대";
//		Student.SNAME = "인천대"; //상수 변수일 경우 변경 절대 불가
		
		//Math 클래스는 static이 기본적으로 붙어있다고 생각하면 됨
//		//new라고 새로 만들지 않아도 얼마든지 사용 가능(static)
//		System.out.println(Math.PI);
//		System.out.println(Math.abs(-50));
//		System.out.println(Math.pow(2.5, 3));
		System.out.println(power(2.5, 3));
		
		
	System.out.println("===================");
		Student.title();
		Student s = new Student("lee",15,"서울",false,11);
		process(s);
		s = new Student("kim",25,"서울",true,12);
		process(s);
//		Person p = new Person("kim",10,"인천",false);
//		process(p);
		
		
		
//		p.showInfo(); //Student의 showInfo()
//		p.sleep();
//		((Student)p).study();  //재정의해서 6시간으로 수정
//		System.out.println("========================");
//		
//		p.showInfo(); //Person의 showInfo();
//		p.sleep();
		//((Student)p).showStudentInfo();  //
		//Student.showStudentInfo();  //클래스명, 클래스 메소드()	
	}
	private static double power(double d, int cnt) {
		double total = 1;
			for (int i=0; i<cnt; i++) {
				total *= d;
		}
		return total;
	}
	private static void process(Person p) {
		p.showInfo();
		p.sleep();
		if(p instanceof Student) {
			((Student)p).study();
			((Student)p).exam();
		} else {
			p.eat();
		}
	}
}
