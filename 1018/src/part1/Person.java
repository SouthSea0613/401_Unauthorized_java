package part1;

//정렬 기준: Comparable인터페이스 compareTo에 구현
public class Person implements Comparable<Person> {
	private String name;
	private int age;
	

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void showData() {
		double height=180.5;
		System.out.printf("%s %d %.2f \n",name,age,height); //printf 에서 f포멧 / tring의 약자 s, 10진수 decimal의 약자 d, 소수 float의 약자 f 
		//.2 는 소수점 2째자리 까지 해줘
	}
	@Override 
	public int compareTo(Person p) { //이름 길이순으로 오름정렬, 단 이름길이 같으면 나이순
		if(name.length()>p.name.length())
			return 1;
		else if(name.length()<p.name.length())
			return -1;
		else {
			return age-p.age;
		}
		
//		return name.length()-p.name.length(); //이름 길이 순으로 오름정렬
		
	
//		if(name.compareTo(p.name)>0) //이름차순 //이름 같았더니 중복 빼버림..(나이가 다른데..)
//			return 1;
//		else if(name.compareTo(p.name)<0)
//			return -1;
//		else {
//			return age-p.age;
		}
		//else if(name.equals(p.name)) //같냐 비교
			
		//return 0;
		
		
//		return age-p.age;  //정렬기준: 나이순 //나이 기준으로 잡아서, 나이가 같으면 중복 빼버림 (이름이 다른데..)
//		if(age>p.age) 
//			return 1;
//		else if(age<p.age)
//			return -1;
//		else
//			return 0;
	}
