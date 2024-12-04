package prart3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class SimpleNumber{
	private int num;
	public SimpleNumber(int n) {
		num=n;
	}
	@Override
	public String toString() {
		//return num+"";
		return String.valueOf(num);
	}
	
	@Override //동등비교 이퀄스 랑 짝궁 해시코드
	public int hashCode() {
		return num%3; //3으로 나눠서 해시값을 나눠놓는거야..... 뭐든 내 맘대로 정해놔두 돼...
	}
	@Override //동등비교
	public boolean equals(Object obj) {
		SimpleNumber cmp = (SimpleNumber)obj;
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
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		System.out.println("데이터 수: "+hSet.size());
		Iterator<SimpleNumber> it = hSet.iterator(); //리모컨
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
