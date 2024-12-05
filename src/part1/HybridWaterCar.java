package part1;

public class HybridWaterCar extends HybridCar {

	private int water;

	public HybridWaterCar(int gas, int elec, int water) {
		super(gas, elec);
		this.water = water;
	}

	public void showybridWaterGauge() {
		showHybridGauge();
		System.out.println("water : " + water);
	}
}
