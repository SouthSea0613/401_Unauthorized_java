package part1;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-50));
		// System.out.println(Math.pow(2.5, 3));
		System.out.println(power(2.5, 2));
		System.out.println("===============");
		// 조상참조변수는 후손 인스턴스를 참조가능
		// Person 은 다형적변수
		// Student.sName="인천대";
		// .sName 안뜨면 클래스변수 앞에 public 으로 바꿔줘야함
		Student.title(); // 클래스 메소드, 인스턴스 메소드 생성없이 호출가능
		Student s = new Student("lee", 15, "서울", false, 11);
		// s.showTitle;
		process(s);
		s = new Student("kim", 25, "인천", true, 12);
		process(s);
//		process(new Person("kim", 10, "인천", false));

//		p.showInfo();// Student 의 showInfo()
//		p.sleep(); //재정의 Student 의 sleep()
//		((Student)p).study();
//		p=new Person("kim",10,"인천",false);
//		p.showInfo();
//		p.sleep();
		// p.showPersonInfo();
		// Person의 showInfo () 참조값, 인스턴스 메소드()
		// ((Student)p).showStudentInfo();
		// Student.showStudentInfo(); // 클래스명, 클래스 메소드()

	}

	private static double power(double val, int cnt) {
			double total=1 ;
			for (int i=0; i<cnt;i++) {
				total*=val;
			}
			return total;
	}

	private static void process(Person p) {
		p.sleep(); // 상속시 오버라이딩을 통해서 다형성을 활용한 코드를 작성
		p.showInfo();
		if (p instanceof Student) {
			((Student) p).study();
			((Student) p).exam();
			// Student 를 상속하는 객체라면 true
		} else { // Person 을 상속하는 객체라면
			p.eat();
		}

	}

}
