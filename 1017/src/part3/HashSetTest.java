package part3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class SimpleNumber {
	private int num;

	public SimpleNumber(int n) {
		num = n;
	}

	@Override
	public String toString() {
		// return num+" ";
		return String.valueOf(num);
	}
	@Override
	public int hashCode() {
		return num%3;
	}
	@Override
	public boolean equals(Object obj) {
		SimpleNumber cmp=(SimpleNumber)obj;
		if(num==cmp.num) {
		return true;
	}
	return false;

	}
}
public class HashSetTest {
	public static void main(String[] args) {
		Set<SimpleNumber> hSet = new HashSet<>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(30));
		System.out.println("데이터 수 : " + hSet.size());
		Iterator<SimpleNumber> it = hSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
