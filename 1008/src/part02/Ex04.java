package part02;

class Friend {
	private String name;
	private int age;
	
	public Friend(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// return super.toString();	//원본
		return "name : " + name + "\nage : " + age;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Friend friend1 = new Friend("남해", 25);
		// System.out.printf("%s\n", friend1.toString());
		System.out.printf("%s\n", friend1);
		System.out.printf("큰 따옴표 : \"\n");
		System.out.printf("역슬래쉬 : \\\n");
	}
}
