package part1;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showData() {
		double height = 180.5;
		System.out.printf("%s %d %.2f\n", name, age, height);
	}

	@Override // 정렬 기준: 나이순
	public int compareTo(Person p) {
		// 얘가 정석이야!!!!!!!if가!!!!!!재미로 싫어!!!!!!!
		if (age < p.age)
			return 1;
		else if (age > p.age)
			return -1;
		else
			return 0;

		// 요거는 심화과정!!!!!!!!!!
		// return age - p.age;
//
//	@Override // 정렬 기준: 이름순
//	public int compareTo(Person p) { //compareTo는 타입이 String일 때 사용 가능
//		if (name.compareTo(p.name)>0)
//			return 1;
//		else if (name.compareTo(p.name)<0)
//			return -1;
//		else // else if(name.equals(p.name))!!
//			return 0;
//		
//		//Test : 이름 길이순으로 오름 정렬 , 단 이름길이가 같으면 나이순으로 정렬 시바 진짜 그만하자
//	public int compareTo(Person p) {
//		if (name.length() > p.name.length())  //약식으로 return name.length() - p.name.length();
//			return 1;
//		else if (name.length() < p.name.length())
//			return -1;
//		else
//			return age - p.age;  //이름길이가 같으면 나이순으로 정렬
//	}
	}
}
