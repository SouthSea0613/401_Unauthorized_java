package part02;

public abstract class Employee	// 근로자
{
	private String name;

	public Employee(String name) {
		this.name = name;
	}
	
	public void showYourName() {
		System.out.printf("이름 : %s\n", name);
	}
	
    // 오버라이딩 대상
	// 추상메소드(완성되지 않은 메소드)는 추상클래스에 선언 > 추상메소드는 overriding하는데에는 아무 문제도 없음
	public abstract int getPay();
	public abstract void showSalaryInfo();
	
	
}
