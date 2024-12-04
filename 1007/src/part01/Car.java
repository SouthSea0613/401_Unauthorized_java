package part01;

public class Car {
	private String color;
	private boolean isAuto;	// auto
	private int door;
	private static String BRAND = "현대";
	
	public void setDoor(int door) {
		if (1 <= door && door <= 4) {
			this.door = door;
		}
		else {
			System.err.printf("문은 1~4개 사이이어야 합니다.\n");
			this.door = 4;
		}
	}

	public Car(String color, boolean isAuto, int door) {
		this.color = color;
		this.isAuto = isAuto;
		this.setDoor(door);
	}
	
	public Car(String color, int door) {
		this.color = color;
		this.setDoor(door);
	}
	
	public void showCarInfo() {
		System.out.printf("brand : %s, color : %s, Auto? : %b, doors : %d\n", BRAND, color, isAuto, door);
	}
}
