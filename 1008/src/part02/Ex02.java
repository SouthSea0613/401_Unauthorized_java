package part02;

public class Ex02 {
	public static void main(String[] args) {
		String str = "안녕하세요. 감사해요. 잘있어요. 다시 만나요.";
		
		System.out.printf("%b / ", str.equals("안녕하세요. 감사해요. 잘있어요. 다시 만나요."));
		System.out.printf("%b\n", str.equals("안녕하세요. 감사해요. 잘있어요. 다시 만나요"));
		
		System.out.printf("%d\n", str.length());
		
		System.out.printf("%c / ", str.charAt(0));
		System.out.printf("%c\n", str.charAt(1));
		
		System.out.printf("%d / ", str.indexOf("나"));
		System.out.printf("%d / ", str.lastIndexOf("나"));
		System.out.printf("%d / ", str.indexOf("다시"));
		System.out.printf("%d / ", str.lastIndexOf("다시"));
		System.out.printf("%d\n", str.indexOf("a"));
		
		System.out.printf("%b / ", str.contains("감사해요"));
		System.out.printf("%b\n", str.contains("뭐요"));
		
		System.out.printf("%b / ", str.startsWith("안녕하세요."));
		System.out.printf("%b\n", str.startsWith("다시 만나요."));
		
		System.out.printf("%b / ", str.endsWith("안녕하세요."));
		System.out.printf("%b\n", str.endsWith("다시 만나요."));
		
		System.out.printf("%b / ", "".isEmpty());
		System.out.printf("%b\n", str.isEmpty());
		
		System.out.printf("%s / ", str.replace("다시 만나요", "뭐요"));
		System.out.printf("%s\n", str);
		
		System.out.printf("%s / ", str.substring(0, 5));
		System.out.printf("%s\n", str.substring(19));
		
		System.out.printf("%s / ", "abc".toUpperCase());
		System.out.printf("%s\n", "ABC".toLowerCase());
		
		System.out.printf("%s\n", "   abc   ".trim());
		
		String[] arr = str.split(" ");
		System.out.printf("%s, %s, %s, %s, %s\n", arr[0], arr[1], arr[2], arr[3], arr[4]);
	}
}
