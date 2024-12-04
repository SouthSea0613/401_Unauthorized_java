package part2;

public class TemporaryWorker extends Employee{
	private int workTime=0;
	private int payPerHour;
	
	public TemporaryWorker(String name, int pay) {
		super(name);
		payPerHour=pay;
	}
	public void addWorkTime(int time) {
		workTime+=time;
	}
	@Override
	public int getPay() {
		return workTime*payPerHour;
	}
	@Override
	public void showSalaryInfo() {
		showYourName();
		System.out.println("비정규직 급여: "+getPay());
	}
	
}
