package part01;

public class Ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Ex02_01 person = new Ex02_01("김남해", 26);
		Ex02_01_01 std = (Ex02_01_01)person;
		
		std.sleep(); */
		
		method(new Ex02_01_01_01("김남해", 26, 80, 9000, 8));
		method(new Ex02_01_01("김남해", 26, 100));
		method(new Ex02_01("김남해", 26));
	}
	private static void method(Ex02_01 ex) {
		ex.eat();
		// ex.study();
		///person.work();
		
		if (ex instanceof Ex02_01_01_01) {
			method(new Ex02_01("김남해", 26));
		} 
		else if (ex instanceof Ex02_01_01) {
			
		}
		else {
			
		}
	}
}