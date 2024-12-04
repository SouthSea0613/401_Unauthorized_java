package part1;

public class Car {
	private String color;
	private String gearType; //auto or manual
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
		if(door>4) {
			System.err.println("setDoor, 문은 1~4개입니다.");
			this.door = 4;
			return;
		}
		this.door = door;
		
	}

	public Car(String color, String gearType, int door) {
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
	public Car(String color, int door) {
		this.color=color;
		this.door=door;
	}
	public void showInfo() {
		System.out.println("브랜드: "+BRAND);
		System.out.println("컬러: "+color);
		if(gearType!=null) {
			System.out.println("타입: "+gearType);
		} else {
			System.out.println("타입: "+"auto");
		}
		if(door<=4) {
			System.out.println("도어: "+door);
		} else {
			System.err.println("문은 1~4개 입니다.");
			System.out.println("도어: "+"4");
		}
		System.out.println("------------------");
	}
	public static void showTitle() {
		System.out.println("===================");
		System.out.println("    자동차 구입명단    ");
		System.out.println("===================");
	}
}
