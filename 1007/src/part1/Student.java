package part1;

public class Student {
	//필드
	//1. 인스턴스 변수(많이)
	private String name; //객체마다 할당
	private final int SNO;
	//private String sName;
	//2. 클래스 변수(적게 사용) : 클래스당 1개만 할당되는 변수
	public static final String SNAME="인천대학교"; // 권장
	
	//생성자는 인스턴스변수 초기화
	public Student(String name, int sNo, String sName) {
		//super();
		this.name = name;
		this.SNO= sNo;
		//this.sName = sName;
	}
	//1. 인스턴스 메소드 : 인스턴스와 관련된 일을 함.
	public void showInfo() {
		System.out.println("name : "+name);
		System.out.println("sNo : "+SNO);
		System.out.println("sName : "+SNAME); //sName 클래스 변수
		System.out.println("-----------------");
	}
	//2. 클래스 메소드 : 인스턴스와 관련되지 않는 일을 함.(적게)
	public static void showTitle() { //static 붙으면 클래스 
		System.out.println("====================");
		System.out.println("===="+SNAME+"학생명단====");
		System.out.println("====================");
		//showInfo(); //에러 showInfo는 인스턴스 메소드 이기때문에 인스턴스와 관련되지않은 일을 해야
	}
}
