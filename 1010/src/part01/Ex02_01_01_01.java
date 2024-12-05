package part01;

public class Ex02_01_01_01 extends Ex02_01_01{
	private int pay;
	private int workTime;
	
	public Ex02_01_01_01(String name, int age, int schoolNumber, int pay, int workTime) {
		super(name, age, schoolNumber);
		this.pay = pay;
		this.workTime = workTime;
	}
	
	/*public void showInfo() {
		super.showInfo();
		System.out.printf("%d\n", pay * workTime);
	} */
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();	// 다형성
		System.out.printf("%d\n", pay * workTime);
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.printf("4 sleep\n");
	}
}