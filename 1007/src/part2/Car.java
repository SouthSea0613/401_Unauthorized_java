package part2;

public class Car {

	private String fuel; //연료
	private int wheel; //바퀴수
	
	public Car(String fuel, int wheel) {
		super();
		this.fuel = fuel;
		this.wheel = wheel;
	}
	public void showCarInfo() {
		System.out.println("fuel: "+fuel);
		System.out.println("wheel: "+wheel);
	}
}
