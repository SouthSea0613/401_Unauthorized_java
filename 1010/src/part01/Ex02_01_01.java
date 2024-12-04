package part01;

public class Ex02_01_01 extends Ex02_01 {
	private int schoolNumber;
	// Ex02 ex02 = new Ex02();

	// 자식객체 생성시 : 1. 부모 생성(생성자 실행), 2. 자식 생성(생성자 실행)
	public Ex02_01_01() {
		super(); // 상속시 자동삽입 및 생략가능 >> Ex02 생성자 실행
		System.out.printf("Ex03 default\n");
	}

	public Ex02_01_01(String name, int age, int schoolNumber) {
		// this.name = name; // private(상속보다 우선순위)
		// this.age = age;
		super(name, age); // Ex02(name, age)는 불가능
		this.schoolNumber = schoolNumber;
	}

	public void study() {
		System.out.printf("study\n");
	}

	public void exam() {
		System.out.printf("exam\n");
	}

	public void showStudentInfo1() {
		System.out.printf("%s\n", getName());
		System.out.printf("%d\n", getAge());
		System.out.printf("%d\n", schoolNumber);
	}

	/*
	 * public void showInfo() { super.showInfo(); System.out.printf("%d\n",
	 * schoolNumber); }
	 */

	// 재정의 > override 자동완성
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.printf("%d\n", schoolNumber);
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.printf("6 sleep\n");
	}
}
