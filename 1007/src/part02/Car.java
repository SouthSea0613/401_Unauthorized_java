package part02;

public class Car {
	private String fuel;
	private int wheel;
	
	public Car(String fuel, int wheel) {
		this.fuel = fuel;
		this.wheel = wheel;
	}
	
	public void showCarInfo() {
		System.out.printf("fuel : %s, wheel : %d", fuel, wheel);
	}
}
