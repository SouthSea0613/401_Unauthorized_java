package part01;

public class Ex03_01_01 extends Ex03_01 {
	private int elec;
	
	public Ex03_01_01(int fuel, int elec) {
		super(fuel);
		this.elec = elec;
	}
	
	public void showFuelElec() {
		showFuel();
		System.out.printf("%d\n", elec);
	}
}