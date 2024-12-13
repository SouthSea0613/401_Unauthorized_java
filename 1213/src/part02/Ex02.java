package part02;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		Arrays.asList("ccc", "a", "bb").stream().sorted().map(m -> m.length()).forEach(s -> System.out.printf("%s ", s));
		
		System.out.printf("\n\n");
		
		Arrays.asList("ccc", "a", "bb").stream().filter(m -> m.length() > 1).sorted().forEach(s -> System.out.printf("%s ", s));
		
		System.out.printf("\n\n");
		
		System.out.printf("%d", Arrays.asList(1, 2, 3, 4, 5).stream().mapToInt(m -> m).sum());
	}
}
