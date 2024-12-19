package part02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Person {
	// Class class; 클래스 정보를 담는 객체의 참조변수
	private String name;
	private int age;
	
	public void sleep() {
		
	}
}

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(ClassTest.class);
		System.out.println(Person.class);
		
		Class c = Class.forName("part2.Person"); // 오타시 예외발생
		Constructor[] cons = c.getConstructors();
		for(Constructor co:cons) {
			System.out.println(co);
		}

		Method[] m = c.getMethods();
		for(Method mth:m) {
			System.out.println(mth);
		}
		
		fct(String.class);
	}

	private static void fct(Class<String> class1) {
		Constructor<?>[] cons = class1.getConstructors();
		for (Constructor<?> constructor : cons) {
			System.out.println(constructor);
		}
	}
}
