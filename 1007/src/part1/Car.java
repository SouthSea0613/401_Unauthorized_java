package part1;

public class Car {
	private String color;
	private String gearType; // auto or stick
	private int door; // 4 or 2

	private static final String BRAND="현대";
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		if (door < 1 || door > 4) {
			System.err.println("setDoor , 문은 1~4개 입니다.");
			this.door = 4;
			return;
		}
		this.door = door;
	}

	public Car(String color, int door) {
		this.color = color;
		this.gearType = "auto";
		setDoor(door);
	}

	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		setDoor(door);
	}

	public void showInfo() {
		System.out.println("brand : " + BRAND);
		System.out.println("color : " + color);
		System.out.println("gearType : " + gearType);
		System.out.println("door : " + door);
		System.out.println("--------------");
	}

}
