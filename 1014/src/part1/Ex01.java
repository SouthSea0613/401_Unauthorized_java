package part1; //복습

public class Ex01 {
	public static void main(String[] args) {
		//메소드 오버로딩_다중정의 (상속 상관X)
		Person person = new Person("cha",10,"인천송도",false);
		person.setAge(person.getAge()+10);
		person.setAdult(true);
		
		showData(person,3); //힙에 할당
		showData();
		showData(10);
		showData(10,20);
		showData("aaaa");
		
		//오버라이딩 (상속)
	}
	private static void showData(Person person, int cnt) {
		for(int i=0; i<cnt; i++) {
		person.showInfo();
		}
		
	}
	private static void showData() {
		System.out.println("파라미티 없음");
		
	}
	private static void showData(int i) {
		System.out.println("i="+i);
		
	}
	private static void showData(String string) {
		System.out.println(string);
		
	}
	private static void showData(int i, int j) {
		System.out.println(i+","+j);
	}
}
