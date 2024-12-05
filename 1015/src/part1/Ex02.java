package part1;

import java.net.MulticastSocket;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		String str = "aaa";

		try {
			int len = str.length();
			System.out.println("len : " + len);
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) { //한줄로 사용할땐 조상타입 쓰면 안됨
			//첫번째 catch 에 Exception 만 쓰면 첫번째예외 줄에서 끝나버림
			//자식타입 Exception 먼저 사용하고 부모 Exception 써야함
			System.out.println("인덱스 범위 예외 또는 널포인트 예외");
			System.out.println(e);
			e.printStackTrace();
//		} catch (NullPointerException e) { 
//			System.out.println("널포인터 예외");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		System.out.println("정상진행...");
	}
}
}