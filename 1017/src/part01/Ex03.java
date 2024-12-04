package part01;

import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("a1");
		list.add("b2");
		list.add("c3");

		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
		}
		System.out.printf("\n");
		System.out.printf("---\n");

		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
		}
		System.out.printf("\n");
		System.out.printf("---\n");

		list.add("d4");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%s ", list.get(i));
		}
		System.out.printf("\n");
	}
}
