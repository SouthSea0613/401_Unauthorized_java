package part01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("나이 입력 : ");
		int age = scanner.nextInt();
		System.out.printf("이름 입력 : ");
		scanner.nextLine();	// 엔터를 입력 > 버퍼에 남아있는 \n 삭제
		String name = scanner.nextLine();
		System.out.printf("---\n");
		System.out.printf("%d, %s\n", age, name);
	}

}
