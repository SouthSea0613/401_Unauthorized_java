package part02;

//데이터 클래스
public class PermanentWorker extends Employee	// 정규직
{
	private int salary;	// 연봉

	public PermanentWorker(String name, int money) {
		super(name);
		salary = money;
	}
	
	@Override
	public int getPay() {
		return salary;	//*12-세금..;
	}
	
	@Override
	public void showSalaryInfo() {
		showYourName();	//이름
		System.out.printf("정규직 급여 : %d\n", getPay());
	}
}
