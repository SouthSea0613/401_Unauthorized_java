package part02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("이름 입력 : ");
		String name1 = scanner.next();
		System.out.printf("%s\n", name1);
		
		// 이거 왜 안될까 생각
		System.out.printf("이름 입력 : ");
		String name2 = scanner.nextLine();
		System.out.printf("%s\n", name2);
	}
}
