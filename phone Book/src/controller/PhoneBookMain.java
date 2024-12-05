
package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import bean.PhoneInfo;
import common.MainMenu;
import common.Menu;
import exception.MenuNumException;

public class PhoneBookMain {
	public static void main(String[] args) {

		PhoneBookManager manager = new PhoneBookManager();

		int menuNum;
		while (true) {
			try {
				Menu.showMenu();
				menuNum = Menu.SC.nextInt();// 6엔터 0엔터
				if (menuNum < MainMenu.INPUT || menuNum > MainMenu.EXIT) {
					throw new MenuNumException(menuNum);
				}
				switch (menuNum) {
				case MainMenu.INPUT: // 1
					manager.inputData(); // 이름, 전화, 생일 입력후 인스턴스 생성
					break;
				case MainMenu.SEARCH: // 2
					manager.searchData(); // 검색
					break;
				case MainMenu.DELETE:// 3
					manager.deleteData(); // 삭제
					break;
				case MainMenu.SHOWALL:// 4
					manager.showAllData(); // 전체출력
					break;
				case MainMenu.EXIT:// 5
					System.out.println("프로그램을 종료합니다.");
					return; // System.exit(0);
				// default: //1-5사이가 아님
				// throw new MenuNumException(menuNum);
				}// switch end
			} catch (InputMismatchException e) {
				System.out.println("메뉴는 정수만 가능합니다.");
				Menu.SC.nextLine();
			} catch (MenuNumException e) {
				e.showWrongNum();
				// System.out.println(e);
				e.printStackTrace();
			}
		} // while end
	}// main end

}// class end
