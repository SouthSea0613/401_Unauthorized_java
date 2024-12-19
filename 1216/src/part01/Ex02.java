package part01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Ex02 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
		list = new ArrayList<>(list);
		
		// Consumer<List<Integer>> c = l -> Collections.reverse(l);
		Consumer<List<Integer>> c = Collections::reverse;
		
		c.accept(list);
		System.out.println(list);
	}
}
