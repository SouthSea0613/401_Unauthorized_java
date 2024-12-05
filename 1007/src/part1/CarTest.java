package part1;

public class CarTest {
	public static void main(String[] args) {
		Car c1=new Car("red" , "stick" , 4);
		Car c2=new Car("blue" , 2);
		Car c3=new Car("white" , 5);
		
		c1.setDoor(20);
		System.out.println("after : " + c1.getDoor());
		
		c1.showInfo();
		c2.showInfo();
		c3.showInfo();
		
	}
}
