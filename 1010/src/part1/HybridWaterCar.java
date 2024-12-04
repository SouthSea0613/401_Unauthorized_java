package part1;

public class HybridWaterCar extends HybridCar{
	public HybridWaterCar(int gas, int elec, int water) {
		super(gas, elec);
		this.water=water;
	}
	//가솔린, 전기, 물 
	private int water;
	//생성자...
	
	public void showHybridWaterGauge() {
		showHybridGauge(); //가솔린, 전기 // 부모 메소드 재활용
		System.out.println("water: "+water);
	}

}
