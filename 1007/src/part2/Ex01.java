package part2;


//import part1.Car;
//import part1.Student;
import part1.*; //part1 전부 가져옴 , 근데 위에 2줄이 더 잘 쓰임 왜냐면 갖고오고싶은 애들만 가져올 수 있어서.


public class Ex01 {
	public static void main(String[] args) {
		part2.Car c1=new part2.Car("LPG",4);
		c1.showCarInfo();
		System.out.println("===========");
		part1.Car c2=new part1.Car("red", "auto", 4);
		c2.showCarInfo();
		
		Car c3=new Car("black",2);
		c3.showCarInfo();
		Student kim=new Student("kim", 10, "인천대");
		kim.showInfo();
	}
}
