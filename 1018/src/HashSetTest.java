import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
//		String str="aaa";
//		String str2="aaa";
//		System.out.println(str.hashCode());
//		System.out.println(str2.hashCode()); //문자열이 같으면 같은 그룹으로 모아줘
		HashSet<Person> hSet = new HashSet<Person>();
		//add => hashCode => equals
		hSet.add(new Person("최순이", 10));
		hSet.add(new Person("최순이", 20));
		hSet.add(new Person("갑돌이", 20));
		hSet.add(new Person("갑돌이", 15));
		hSet.add(new Person("최순이", 20)); //중복
		hSet.add(new Person("갑돌이", 20)); //중복
		System.out.println("데이터 수:" + hSet.size()); 
		Iterator<Person> itr = hSet.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}
