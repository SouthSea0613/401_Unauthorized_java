package part1;

public class CarTest {
	public static void main(String[] args) {
		Car c1=new Car("red","auto",4);
		Car c2=new Car("blue", 2); //auto 생략
		//door는 1~4개가 아니면 error메시지 출력 후 4개로 설정
		Car c3=new Car("white", 5);
		
		Car.showTitle();
		c1.setDoor(20);
		System.out.println("after: "+c1.getDoor());
		c1.showInfo();
		c2.setDoor(2);
		System.out.println("after: "+c2.getDoor());
		c2.showInfo();
		c3.setDoor(3);
		System.out.println("after: "+c3.getDoor());
		c3.showInfo();
	}
}
