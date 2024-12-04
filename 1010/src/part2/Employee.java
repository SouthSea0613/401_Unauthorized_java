package part2;

//추상 클래스--->인스턴스 생성 불가
public abstract class Employee {
	private String name;
	
	public Employee(String name) {
		this.name=name;
	}
	public void showYourName() {
		System.out.println("이름: "+name);
	}
	
	//추상메소드는 추상클래스에서 선언
	public abstract int getPay();
	public abstract void showSalaryInfo();
}	
