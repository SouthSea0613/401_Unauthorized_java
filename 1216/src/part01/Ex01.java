package part01;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {
	@Override
	public String apply(String string1, String string2) {
		if(string1.getBytes().length >= string2.getBytes().length) {
			return string1;
		}
		else {
			return string2;
		}
	}
}

public class Ex01 {
	public static void main(String[] args) {
		List<String> greetings = Arrays.asList("a", "bbb", "cc");
		
		System.out.println(greetings.stream().reduce("", (string1 ,string2) -> {
			if(string1.getBytes().length >= string2.getBytes().length) {
				return string1;
			}
			else {
				return string2;
			}
		}));
		
		System.out.println(greetings.stream().reduce((string1 ,string2) -> {
			if(string1.getBytes().length >= string2.getBytes().length) {
				return string1;
			}
			else {
				return string2;
			}
		}).get());
	}
}
