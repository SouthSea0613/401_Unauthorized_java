package part1;

public class Student extends Person {
	
	//static 클래스 변수 (클래스당 1번 할당)
	//모든 객체가 공유하는 변수
	public static String sName="인하대";  //final을 넣게되면 변경 불가능 대문자로=SNAME 상수변수니까 뒤에서 변경 불가능.
	private int sNo; //인스턴스 변수 (인스턴스 마다 할당)
	
	
	public Student(String name, int age, String addr, boolean adult, int sNo) {
		super(name, age, addr, adult);
		this.sNo=sNo;
	}
	public void study() {
		System.out.println(sNo+"번 학생은 공부를 한다."); //지역변수 는 잠깐쓰고 없어지고, 인스턴스 변수에 올려두면 계속 쓴다. /int sNo=(잠깐쓰기)
	}
	public void exam() {
		System.out.println(sNo+"번 학생은 시험을 본다.");
	}
	
	
	@Override //재정의
	public void showInfo() {
		System.out.println("sNo:"+sNo);
		System.out.println("sName: "+sName);
		super.showInfo(); //Person (재활용)
		System.out.println("--------------");
	}
	@Override //재정의
	public void sleep() {
		super.sleep(); //얘는 Person 임 
		System.out.println("game or youtube 금지");
	}
	//클래스 메소드: 인스턴스와 상관없는 일을 해요.
	public static void title() {
		//System.out.println(sNo); 에러
		System.out.println("=====title====");
		System.out.println("====="+sName+"=====");
	}
	
	
	//메소드 오버라이딩(재정의)
//	@Override //오버라이딩 잘 하는지 감시, 에러 감지
//	public void showInfo() {  //부모랑 스타트 똑같아야함
//		System.out.println("sNo:"+sNo);
//		showPersonInfo(); //이름, 나이, 주소... 성년여부 (재활용)
//		System.out.println("--------------------");
//	}
}
