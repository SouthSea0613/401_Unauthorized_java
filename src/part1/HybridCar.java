package part1;

public class HybridCar extends Car {
	// 가솔린 + 전기
	private int elec;

	public HybridCar(int gas, int elec) {
		super(gas);
		this.elec = elec;

	}

	public void showHybridGauge() {
		showCarGauge();
		System.out.println("elec : " + elec);
	}
}
