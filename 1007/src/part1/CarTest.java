package part1;

public class CarTest {
	public static void main(String[] args) {
		Car c1=new Car("red", "auto", 4);
		Car c2=new Car("blue", 2); //auto 생략
		//door는 1~4개가 아니면 에러메세지 출력후 4개로 설정
		Car c3=new Car("white", 5); //auto 생략
		
		c1.setDoor(4); //2 --> 4     
		System.out.println("after door: "+c1.getDoor());
		
		
		c1.showCarInfo(); //color: red, gearType: stick, door: 4
		c2.showCarInfo(); //color: blue, gearType: auto, door: 2
		c3.showCarInfo(); //color: white, gearType: auto, door: 4
	}
}