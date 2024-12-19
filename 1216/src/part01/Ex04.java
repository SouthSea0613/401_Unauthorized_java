package part01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex04 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "bb");
		list.forEach(System.out::println);
	}
}
