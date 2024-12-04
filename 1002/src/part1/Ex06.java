package part1;

import java.util.Scanner;

public class Ex06 {
	// 인스턴스 배열: 각 요소에 인스턴스의 참조값을 저장함.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[] {"kim","lee","cha"};
		// 첫째 요소와 세번재 요소를 swap
		String temp = names[0]; //4B
		names[0] = names[2];	//4B
		names[2] = temp;		//4B
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 입력: ");
			names[i] = sc.next();
		}
//		for (String str : names) {
//			System.out.print("이름 입력: ");
//			str = sc.next();
//		}
		for (String str : names) {
			System.out.print(str);
		}
//		for (int i = 0; i < names.length; i++) {
//			System.out.println("names["+i+"]:"+names[i]);
//		}
	}	 
}
