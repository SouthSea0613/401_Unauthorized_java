package part2;

//Student.java
//현실세계의 유무의 사물(ex: 학생, 교수, 컴퓨터, 계좌, 급여 등...) 를 class로 만들 수 있다.
class Account{ //설계도
	String no;
	String name;
	int balance; // =0; 기본값 으로 세팅 돼 있음
	//입금, 출금,등 메소드로 만들 수 있다
	void input(int money) { //매개변수
		int a; //지역변수 (local variable)
		balance+=money;
	}
	void output(int money) {
		balance-=money;
	}
	public static void main(String[] args) {
		Account acc = new Account().input(100); //객체 //인자, 인수, 파라미터 //Account = 참조형_참조하고있으면 줄 바껴도 안 사라짐.
		acc.input(10);
		acc.output(100); //주인공은 new Account
	}
}

public class Student {
	// 학생의 특성 : 멤버 변수 = 필드
	// 1.인스턴스 변수
	// 2.클래스 변수 (예정)
	private String name; //private 내부조건, 외부에선 접근불가 //public 은 외부 내부 접근 가능. //참조형 변수는 기본값 =null;
	private int schoolNum; // camelCase or school_num (snakeCase) / ex) 학번이 1~100
	private String addr;
	
	//메소드
	//public Student(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	

	public void setName(String name) {
		this.name = name;
	}
		public void setSchoolNum(int sNo) {
			this.schoolNum=sNo;
		}
//		public void setAddr(String addr) {
//			this.setAddr=addr;
//		}
	
	// 생성자 Constructor는 주로 인스턴스 변수 초기화 용도
	  //(매개 변수)
	public Student(String name, int schoolNum, String addr) {
		this.name=name; //this.인스턴스 변수 가 온다.  / this: 현재 실행중인 인스턴스(객체)의 참조 변수
		this.schoolNum=schoolNum;
		this.addr=addr;
	}
	
	// 기본 생성자 

	public Student() {
		this.name="noname";
		this.schoolNum=1;
		//this.addr="이사중";
//		System.out.println("디폴트 생성자");
	}

	// 학생의 정보 출력 메소드
	public void showInfo() {
		System.out.println("name: " + name);
		System.out.println("schoolNum: " + schoolNum);
		if(addr!=null) {
			System.out.println("addr: "+addr);
		}
		System.out.println("---------");
	}

	// 행위 : 메소드(함수)method
	public void study() {
		System.out.println(name + "학생은 공부를 한다.");
	}

	public void exam() {
		System.out.println(name + "시험을 치른다.");
	}
	public void setAddr(String string) {
		// TODO Auto-generated method stub
		
	

		
	}
}
