package part1;

public class Car {
	private int gasoline;
	
	public Car (int gas) {
		this.gasoline=gas;
	}
	
	public void showCarGauge() {
		System.out.println("gasoline : "+gasoline);
	}
}
