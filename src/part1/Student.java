package part1;

//Student(후손, 자식 클래스) 가 Person(부모, 조상 클래스) 를 상속한다.
//get set 은 무조건적으로 만들필요없음
public class Student extends Person {
	private int sNo;
	Person p = new Person();

	// 자식 객체 생성 -> 부모생성자 실행 -> 자식생성자 실행 -> 자식객체 생성
	// 눈에 보이지 않는 상속관계가 따로있었음
	// Person() 첫줄 자동삽입, 생략가능 super 는 상위의라는 뜻

	public Student(String name, int age, int sNo) {
		super(name, age); 
		// this.name=name; // 상속 < 정보은닉
		// this.age=age;
		this.sNo = sNo;
		//선물세트안에 수퍼(부모가 가지고 있는 생성자)라는 세트하나넣고 번호만 따로 넣어준것
		//생성자는 보통 퍼블릭
		
	}

	@Override
	public void sleep() {
		super.sleep(); //8시간을 자되
		System.out.println("game or 유튜브 안봄 ");
	}
	

	public void study() {
		System.out.println("학생은 공부를 한다.");

	}

	public void exam() {
		System.out.println("학생은 시험을 본다.");
	}
	// 재정의

	@Override
	public void showInfo() { // 하나의 타입으로 묶을 수 있어서 편리하게 사용하기 위해서 씀
		super.showInfo(); //Person name, age 출력
		//부모랑 똑같은 기능을 하되 덮어씌움
		System.out.println("sNo : "+ sNo);
	}
	
//	public void showInfo() { //재귀함수, 재귀호출
//		super.showInfo(); // Person 클래스에 정의
//		System.out.println("sNo : " + sNo);
//	}
}
