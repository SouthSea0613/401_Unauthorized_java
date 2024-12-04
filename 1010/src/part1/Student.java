package part1;

//Student 클래스가 Person 클래스를 상속한다
public class Student extends Person {
//	Person person=new Person(); //Person 클래스에 기본 정보가 있으므로 가져다쓰기!
	private int sNo;
	
	
	public Student(String name, int age, int sNo) {
		super(name,age); //Person(name, age);
//		this.name=name;  //상속<정보은닉(private)
//		this.age=age;
		this.sNo=sNo;
	}
	//자식 객체 생성: 부모생성자 실행-->자식생성자 실행-->자식객체 생성
	public Student() {
		super(); //첫줄 자동삽입, 생략가능 ★상속 시 슈퍼클래스(부모생성자)먼저 호출
		System.out.println("Student 기본생성자");
	}
	@Override
	public void sleep() {
		super.sleep(); // Person.sleep() // 8시간
		System.out.println("game or youtube 안봄");
	}
	public void study() {
		System.out.println("학생은 공부를 한다.");
	}
	public void exam() {
		System.out.println("학생은 시험을 본다.");
	}

	//재정의
	@Override //없어도 되지만 사용하는게 좋음 오류를 잘 봐줌
	public void showInfo() {
		super.showInfo();
		System.out.println("sNo: "+sNo);
	}
//	public void showInfo() {  //재귀함수, 재귀호출
//		super.showInfo();  //Person에 정의
//		System.out.println("name: "+name);
//		System.out.println("age: "+age);
//		System.out.println("sNo: "+sNo);
		
}
