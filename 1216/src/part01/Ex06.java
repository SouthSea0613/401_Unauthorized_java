package part01;

import java.util.function.Function;

public class Ex06 {
	public static void main(String[] args) {
		/*
		Function<char[], String> f = ar -> {
			return new String(ar);
		};
		*/
		
		Function<char[], String> f = String::new;
		
		char[] src = {'h', 'e', 'l', 'l', 'o'};
		
		String string = f.apply(src);
		System.out.println(src);
	}
}
