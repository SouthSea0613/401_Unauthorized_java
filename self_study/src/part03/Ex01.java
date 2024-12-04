package part03;

class Chars {
	char[] chars;
	
	public Chars(char[] chars) {
		
	}
	
	public Chars(String string) {
		
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		String string = "abc";
		char[] chars = {'a', 'b', 'c'};
		
		System.out.printf("%s\n", string.toString());
		System.out.printf("%s\n", chars);
	}
}
