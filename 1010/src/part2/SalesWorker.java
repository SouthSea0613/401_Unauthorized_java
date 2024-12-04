package part2;

public class SalesWorker extends PermanentWorker {
	private int salesResult;
	private double bonusRatio;
	
	public SalesWorker(String name, int salary, double ratio) {
		super(name, salary);
		salesResult=0;
		bonusRatio=ratio;
	}
	public void addSalesResult(int value) {
		salesResult+=value;
	}
	@Override
	public int getPay() {
		return super.getPay()+(int)(salesResult*bonusRatio);
	}
	@Override
	public void showSalaryInfo() {
		showYourName();
		System.out.println("영업직 급여: "+getPay());
		// TODO Auto-generated method stub
	}
}
