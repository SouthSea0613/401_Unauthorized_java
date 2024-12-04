package part1;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(Math.PI);   //인스턴스와 상관 없으니 맘디루 갖다 쓰세여
		System.out.println(Math.abs(-50));
		System.out.println(Math.pow(2.5, 3));
		System.out.println(power(2.1, 11));
		
		//조상참조변수는 후손 인스턴스를 참조 가능하다.
		//Student.sName="인천대"; //요 시점에 인천대로 다 바꿔버려야지 , 인스턴스랑 노상관 , 퍼블릭 으로 바꿔서 가능
		Student.title(); //클래스 메소드_인스턴스 생성없이 호출가능
		Student s=new Student("lee",15,"서울",false,11);
		process(s);
		s=new Student("kim",25,"서울",true,12);
		process(s);
//		Person p=new Person("kim",10,"인천",false);
//		process(p);
	//	process(new Person("kim",10,"인천",false)); 요롷게도 가능.
		
		
		
//		p.showInfo(); //Student의 showInfo() 호출
//		p.sleep(); //재정의 _ Student의 sleep
//		((Student)p).study();
//		System.out.println("==========================");
//		p=new Person("kim",10,"인천",false);
//		p.showInfo(); //Person의 showInfo() 호출
//		p.sleep();
		//((Student)p).showStudentInfo(); //참조값.인스턴스 메소드()
		//Student.showStudentInfo(); //클래스명. 클래스 메소드()
		
		
	}

	private static double power(double val, int cnt) {
		double total=1;
		for(int i=0; i<cnt; i++) {
			//total=total*val;
			total*=val;
		}
		return total;
	}

	private static void process(Person p) {
		p.sleep();  //상속 --> 오버라이딩 --> 다형성 코드
		p.showInfo();
		//Student 상속하는 객체라면 true
		if(p instanceof Student) {
			((Student)p).study();
			((Student)p).exam();
		}else { //Person상속하는 객체라면 
			p.eat();
		}
	}
}
