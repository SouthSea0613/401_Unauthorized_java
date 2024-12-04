package part1;

public class HybridCar extends Car{
	//가솔린+전기
	private int elec; // 전기
	public HybridCar(int gas, int elec){
		super(gas);
		this.elec=elec;
		
	}
	//생성자...
	public void showHybridGauge() {
		showCarGauge();
		System.out.println("elec: "+elec);
	}
}

