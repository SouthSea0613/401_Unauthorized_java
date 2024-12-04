package namhae02;

import java.util.HashSet;
import java.util.Set;

class SimpleNumber {
	private int num;
	
	public SimpleNumber(int num) {
		this.num = num;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Set<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(1));
		hSet.add(new SimpleNumber(2));
		hSet.add(new SimpleNumber(3));
		hSet.add(new SimpleNumber(1));
	}
}
