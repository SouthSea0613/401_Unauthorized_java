package common;

import java.util.Scanner;

public class Menu {
	// 싱글톤
	public static final Scanner SC = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("----------------");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.데이터 전체출력");
		System.out.println("5.프로그램 종료");
		System.out.println("---------------");
		System.out.print("선택:");
	}
}
