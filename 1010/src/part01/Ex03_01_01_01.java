package part01;

public class Ex03_01_01_01 extends Ex03_01_01{
	private int water;
	
	public Ex03_01_01_01(int fuel, int elec, int water) {
		super(fuel, elec);
		this.water = water;
	}
	
	public void showFuelElecWater() {
		showFuelElec();
		System.out.printf("%d\n", water);
	}
}