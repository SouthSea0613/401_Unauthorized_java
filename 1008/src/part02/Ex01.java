package part02;

import java.util.Scanner;

// java는 uni-code
public class Ex01 {
	public static void main(String[] args) {
		// String str = new String("대한민국");
		String str1 = "안녕하세요.";	// "" : String 인스턴스, '' : character
		System.out.printf("%s\n", str1);
		System.out.printf("%d\n", str1.length());
		System.out.printf("%d\n", "감사해요.".length());
		System.out.printf("%s\n", str1 + " 감사해요. 잘있어요. 다시 만나요.");
		
		String str2 = "안녕하세요.";
		if(str1 == str2) {
			System.out.printf("참조값 같음\n");
		}
		else {
			System.out.printf("참조값 다름\n");
		}
		
		Scanner scanner = new Scanner(System.in);
		str1 = "안녕하세요.";
		str2 = scanner.nextLine();
		if(str1 == str2) {
			System.out.printf("참조값 같음\n");
		}
		else {
			System.out.printf("참조값 다름\n");
		}
		
		if(str1.equals(str2)) {
			System.out.printf("내용 같음\n");
		}
		else {
			System.out.printf("내용 다름\n");
		}
	}
}
