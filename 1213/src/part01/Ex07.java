package part01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex07 {
	public static void print(Predicate<Double> p, List<Double> lst) {
		for(Double n : lst) {
			if(p.test(n))
				System.out.println(n+",");
		}
	}
	public static void main(String[] args) {
		List<Double> list2 = Arrays.asList(-1.2, 3.5 ,-2.4, 9.5);
		// print(x -> {return x % 2 == 0;}, list1);
		print(n -> n > 0.0, list2);	// 0.0보다 큰 수만 출력
	}
}
