package part2;

public class PermanentWorker extends Employee {
	private int salary;
	
	public PermanentWorker(String name, int money) {
		super(name);
		salary=money;
	}
	@Override
	public int getPay() {
		return salary;
	}
	@Override
	public void showSalaryInfo() {
		super.showYourName();
		System.out.println("정규직 급여: "+getPay());
	}
	
}
