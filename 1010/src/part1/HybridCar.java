package part1;

public class HybridCar extends Car {
	//가솔린+전기
	private int elec; //전기
	
	//생성자..
	public HybridCar(int gas, int elec) {
		super(gas);
		this.elec=elec;
	}

	
	public void showHybridGauge() {
		showCarGauge(); // 부모 메소드 재활용
		System.out.println("elec: "+elec);
	}
}
