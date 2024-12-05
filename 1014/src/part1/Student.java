package part1;

public class Student extends Person {// 클래스는 부모가 둘이상일 수 없음 java는 다중상속 안됨
	//final 이 붙으면 상수변수 , 문자 전체가 대문자여야함
	public static final String SNAME="인하대";
	// 클래스 변수 (클래스 당 1번 할당)
	// 모든 객체가 공유하는 변수
	private int sNo; 
	// 인스턴스 변수 (인스턴스마다 할당)
	

//	public String getsName() {
//		return sName;
//	}
//
//	public void setsName(String sName) {
//		Student.sName = sName;
//	}

	public Student(String name, int age, String addr, boolean adult, int sNo) {
		super(name, age, addr, adult);
		this.sNo = sNo;
	}

	public void study() { 
		//인스턴스 변수는 인스턴스 값만 할당함, 임시로 사용하는것은 지역변수(int)로 , 오래 쓸거면 필드값변경 (this)
		this.sNo=1000;
		System.out.println(sNo+"번 학생은 공부를 한다.");
	}
	public void exam() {
		System.out.println(sNo+"번 학생은 시험을 본다.");
	}
	

	// 메소드 오버라이딩(재정의)
	
//	public void showInfo() { //부모메소드와 똑같이 시작해야함 , 한 글자라도 달라지면 안됨
//		System.out.println("sNo : " + sNo);
//		showPersonInfo();
//		System.out.println("------------------");
//	}
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("game or youtube 금지");
	}
	
	@Override
	public void showInfo() {
		System.out.println("sNo : "+sNo);
		System.out.println("sName : "+SNAME);
		super.showInfo(); 	//재활용, Person.showInfo()
		System.out.println("----------------");
	}
	//클래스 메소드 : 인스턴스와 상관없는 일을 함.
	public static void title() {
		//System.out.println(sNo); //에러 
		System.out.println("======title======");
		System.out.println("======"+SNAME+"======");
		
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	
}
