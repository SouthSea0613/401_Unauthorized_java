package part1;


public class Ex01 {
	public static void main(String[] args) {
		// 오버리딩
		Person person = new Person("cha", 10, "인천송도", false);
		person.setAge(person.getAge()+10);
		person.setAdult(true);
		
		showData(person ,3);
		showData(10);
		showData(10, 20);
		showData("aaa");

		// 오버 라이딩(상속)

	}

	private static void showData(Person person , int cnt) {
		for(int i=0; i<cnt; i++) {
			person.showInfo();
		}
	}

	private static void showData(String string) {
		System.out.println(string);

	}

	private static void showData(int i, int j) {
		System.out.println(i + "," + j);

	}

	private static void showData(int i) {
		System.out.println("i=" + i);

	}
}
