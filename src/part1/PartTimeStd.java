package part1;

public class PartTimeStd extends Student {
	private int pay;
	private int workTime;

	public PartTimeStd(String name, int age, int sNo, int pay, int time) {
		super(name, age, sNo); // 상속에 상속을 하면 super.super; super.super 은 쓸일이 별로없음
		this.pay = pay;
		this.workTime = time;
	}

	@Override
	public void sleep() {
		System.out.println("pts 학생은 4시간잔다.");
	}

	@Override
	public void showInfo() {
		super.showInfo(); //Student name, age, sNo
		System.out.println("pay : "+pay);
		System.out.println("time : "+workTime);
	}
	public void work() {
		System.out.println("pts학생은 일도 한다.");
	}

//	public void showInfo() {
//		super.showInfo(); // Student 의 showInfo name, age, sNo
//		System.out.println("일당 : " + (pay * workTime));
//
//	}

}
