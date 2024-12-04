package part1;

public class Car {
	private int gasoline;
	
	public Car(int gas) {
		this.gasoline=gas;
	}

	//생성자
	public void showCarGauge() {
		System.out.println("gasoline: "+gasoline);
	}
}
