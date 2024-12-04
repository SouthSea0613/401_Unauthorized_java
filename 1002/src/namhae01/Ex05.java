package namhae01;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 인스턴스 배열 : 각 요소에 인스턴스값의 주조(참조값)을 저장
		String[] names = new String[3];
		for (int i = 0; i < names.length; i++){
			System.out.print("이름 입력 : ");
			names[i] = scanner.next();
		}
		
		for (String i:names) {
			System.out.println(i);
		}
		
		// swap
		String temp = names[0];
		names[0] = names[2];
		names[2] = temp;
		
		for (String i:names) {
			System.out.println(i);
		}
	}
}
