package part1;

public class PartTimeStd extends Student {
	private int pay;
	private int workTime;

	public PartTimeStd(String name, int age, int sNo,
			int pay, int workTime) {
		super(name,age,sNo);
		this.pay=pay;
		this.workTime=workTime;
	}

	@Override
	public void sleep() {
		System.out.println("pts학생은 4시간 잔다.");
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("pay: "+pay);
		System.out.println("time: "+workTime);
	}
	public void work() {
		System.out.println("pts학생은 일도 한다.");
	}
//	public void showdInfo() {
//		super.showInfo(); //name,age,sNo
//		System.out.println("일당: "+(pay*workTime));		
//	}
}
