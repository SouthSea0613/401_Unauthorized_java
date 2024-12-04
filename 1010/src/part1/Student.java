package part1;

//Student 클래스 Person 클라스 를 상속한다. -> Person 이 부모,조상 / Student 가 자식,후손
public class Student extends Person {

	private int sNo;
	
	//부모 생성자가 먼져 실행 --> 자식 생성자 실행 --> 자식 객체 생성
	public Student() { //디폴트생성자
		super(); //첫줄에 자동삽입, 생략가능 (상속시) / super: 상위 (Person()) 반드시 부모 생성자를 먼져 실행한다. //Person(name, age);
		System.out.println("Student 기본 생성자");
	}
	@Override
	public void sleep() {
		super.sleep(); //Person.sleep() // 8시간
		System.out.println("game or 유튜브 안봄");
	}
	public Student(String name, int age, int sNo) { //인자를 사용함, 그럼 이것만 임.
		super(name,age);
		//this.name=name;  //상속 보다 우선시 는 정보은닉
		//this.age=age;
		this.sNo=sNo;
	}
	public void study() {
		System.out.println("학생은 공부를 한다.");
	}
	public void exam() {
		System.out.println("학생은 시험을 본다.");
	}
	//재정의
	@Override
	public void showInfo() {
		super.showInfo(); //Person name, age 출력
		System.out.println("sNo: "+sNo);
	}
	
//	public void showInfo() { //재귀함수, 재귀호출
//		super.showInfo(); //Person에 정의 , super: 조상~
//		System.out.println("sNo: "+sNo);
		
	}	
	

	
