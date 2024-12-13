package part01;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class Ex09 {
	public static ArrayList<Integer> makeIntList(Supplier<Integer> s, int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(s.get());
		}
		return list;
	}
	
	public static void main(String[] args) {
		Supplier<Integer> spr = () -> (new Random()).nextInt(1, 46);

		System.out.println(makeIntList(spr, 6));
	}
}
