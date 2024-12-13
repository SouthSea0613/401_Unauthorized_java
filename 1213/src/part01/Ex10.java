package part01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex10 {
	public static void main(String[] args) {
		Consumer<String> comsumer = (string) -> System.out.printf("%s ", string);
		
		comsumer.accept("alpha1");
		
		System.out.printf("\n\n");
		
		List<String> list = Arrays.asList("a", "bb", "ccc");
		for (String string : list) {
			comsumer.accept(string);
		}
		
		System.out.printf("\n\n");
		
		list.forEach(comsumer);
		
		System.out.printf("\n\n");
		
		list.forEach((string) -> System.out.printf("%s ", string));
		
		System.out.printf("\n\n");
		
		list.stream().map(s -> s.length()).forEach(s -> System.out.printf("%s ", s));
	}
}
