package namhae01;

import java.util.ArrayList;


//ArrayList 는 중복 값 허용, 순차적으로 저장, 중간 개입 가능(용량↑)
public class Ex02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("a1");
		list.add("b2");
		list.add("c3");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println();
	
		list.remove(0);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println();
		
		list.add("d4");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
	}
}
