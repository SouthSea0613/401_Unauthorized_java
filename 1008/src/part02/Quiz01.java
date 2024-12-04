package part02;

public class Quiz01 {
	public static void main(String[] args) {
		// quiz01. 문자열 역순
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		// 1. StringBuilder 비사용
		for (int i = str.length() - 1; i >= 0; i--) System.out.printf("%c", str.charAt(i));
		
		System.out.printf("\n");	// 줄바꿈
		
		// 2. StringBuilder 사용
		System.out.printf("%s\n", (new StringBuilder(str)).reverse());
	}
}
