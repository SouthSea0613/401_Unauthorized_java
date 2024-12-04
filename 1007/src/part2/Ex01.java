package part2;

//import part1.Car;
//import part1.Student;
import part1.*;

public class Ex01 {
	public static void main(String[] args) {
	part2.Car c1=new part2.Car("LPG",4);
	c1.showCarInfo();
	System.out.println("===============");
	part1.Car c2=new part1.Car("red","auto",4);
	c2.showInfo();
	
	Car c3=new Car("black",2);
	c3.showCarInfo();
	part1.Student kim=new part1.Student("kim",10,"메롱대학교");
	kim.showInfo();
	}
}