package part1;

public class PartTimeStd extends Student {
	private int pay;
	private int workTime;

	public PartTimeStd(String name, int age, int sNo, int pay, int time) {
		super(name, age, sNo);
		this.pay = pay;
		this.workTime = time;
	}

	@Override
	public void sleep() {
		System.out.println("pts학생은 4시간 잔다.");
	}

	@Override // 재정의 _우클릭 소스
	public void showInfo() {
		super.showInfo(); // Student name, agd, sNo
		System.out.println("pat: " + pay);
		System.out.println("time: " + workTime);
	}

	public void work() {
		System.out.println("pts학생 일도 한다.");
	}

//	public void showInfo() {
//		super.showInfo();
//		System.out.println("일당:"+(pay*workTime));
//		
//	}

}
