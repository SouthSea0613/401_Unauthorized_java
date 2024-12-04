package part1;

public class HybridWaterCar extends HybridCar {
	//가솔린,전기,물
	private int water;
	//생성자
	public HybridWaterCar(int gas, int elec, int water) {
		super(gas, elec);
		this.water=water;
	}
	public void showHybridWaterCarGauge() {
		showHybridGauge(); //가솔린, 전기 출력
		System.out.println("water: "+water);
	}
}
