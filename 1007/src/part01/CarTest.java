package part01;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("red", false, 4);
		Car c2 = new Car("blue", 2);
		Car c3 = new Car("white", 5);	// door는 1~4개, 에러 출력 후 4개로 설정
		
		c1.setDoor(5);
		
		c1.showCarInfo();
		c2.showCarInfo();
		c3.showCarInfo();
	}
}
