package part01;

public class Ex10 {

	public static void main(String[] args) {
		char chr = 'a';
		switch (chr) {	// 실수 불가능
		case 'A':
		case 'a':
			System.out.println("alpha");
			break;
		case 'B':
		case 'b':
			System.out.println("bravo");
			break;
		case 'C':
		case 'c':
			System.out.println("charlie");
			break;
		default:
			System.out.println("etc");
		}
		System.out.println("end");
		
		String str = "a";
		if (str.equals("A") || str.equals("a")) {
			System.out.println("alpha");
		}
		else if (str.equals("B") || str.equals("b")) {
			System.out.println("bravo");
		}
		else if (str.equals("C") || str.equals("c")) {
			System.out.println("charlie");
		}
		else {
			System.out.println("etc");
		}
	}

}
