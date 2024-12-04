package part2;

public class Car {
	private String fuel;
	private int wheel;
	
	public Car(String fuel, int wheel) {
		this.fuel=fuel;
		this.wheel=wheel;
	}

	public void showCarInfo() {
		System.out.println("fuel: "+fuel);
		System.out.println("wheel: "+wheel);		
		System.out.println("------------------");
	}
}