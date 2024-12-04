package namhae01;

import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("a1");
		list.add("b2");
		list.add("c3");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println("-----------");

		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println("--------");

		list.add(1, "d4");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}
}
