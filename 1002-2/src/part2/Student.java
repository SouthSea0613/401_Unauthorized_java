package part2;
//Student.java
public class Student{
	//멤버 변수(필드)
	  //1.인스턴스 변수
	  //[2.클래스 변수]
	private String name=null;
	private int schoolNum=0; //1-100
	private String addr;
	//생성자 Constructor는 주로 인스턴스 변수 초기화 용도
	  // (매개 변수)
	public Student(String name, int schoolNum,String addr) {
		//this: 현재 실행중인 인스턴스의 참조 변수
		//this.인스턴스 변수
		this.name=name;
		this.schoolNum=schoolNum;
		this.addr=addr;
	}
	//기본 생성자 
	public Student() {
		this.name="noname";
		this.schoolNum=1;
	}
	//학생의 정보 출력 메소드
	public void showInfo() {
		System.out.println("name: "+name);
		System.out.println("schoolNum: "+schoolNum);
		if(addr!=null) {
			System.out.println("addr: "+addr);
		}
		System.out.println("-------------");
	}
	//메소드 method
	public void study() {
		System.out.println(name+"학생은 공부를 한다.");
	}
	public void exam() {
		System.out.println(name+"시험을 치른다.");
	}
}
