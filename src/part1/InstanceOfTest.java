package part1;

public class InstanceOfTest {
	public static void main(String[] args) {
//		Person person = new PartTimeStd("kim",30,1,9000,10);
//		Student std=(Student)person;
//		std.sleep();
		method(new PartTimeStd("kim",30,1,9000,10));
		method(new Student("choi",31,2));
		method(new Person("park",32));
		
	}

	private static void method(Person person) {
		//person.sleep(); //다형성 : 생긴건 같지만 하는일이 다름 
		if(person instanceof PartTimeStd) {
			((PartTimeStd)person).work();
		}else if(person instanceof Student) {
			((Student)person).study();
		}else {
			person.eat();
		}
	}
}
