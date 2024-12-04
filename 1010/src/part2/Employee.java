package part2;
//abstrant 추상 클래스 -> 인스턴스생성 불가.
public abstract class Employee // 근로자
{
	private String name;

	public Employee(String name) {
		this.name = name;
	}
	public void showYourName() {
		System.out.println("이름:" + name);
	}
    //오버라이딩 대상
	//추상 메소드는 추상 클래스에 선언.
	public abstract int getPay();
	public abstract void showSalaryInfo();
}

//추상 메소드가 확장된게 인터페이스.