package part02;

public class Ex03 {
	public static void main(String[] args) {
		String str = "aaa";
		str += "bbb";
		str += "ccc";
		System.out.printf("%s\n", str);
		
		str = null;
		str += "bbb";
		str += "ccc";
		System.out.printf("%s\n", str);
		
		str = "";
		str += "bbb";
		str += "ccc";
		System.out.printf("%s\n", str);
		
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		System.out.printf("%s\n", sb.toString());
		System.out.printf("%s\n", sb);
	}
}
