package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import bean.PhoneInfo;
import common.MainMenu;
import common.Menu;
import common.NumInputException;

public class PhoneBookMain {
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		while (true) {
			Menu.showMenu();
			try {
				int menuNum = readNum();
				switch (menuNum) {
				case MainMenu.INPUT:
					manager.inputData(); 
					System.out.println("-------------------");
					break;
				case MainMenu.SEARCH:
					manager.searchData();
					System.out.println("-------------------");
					break;
				case MainMenu.DELETE:
					manager.deleteData();
					System.out.println("-------------------");
					break;
				case MainMenu.SHOWALL:
					manager.showAllData();
					System.out.println("-------------------");
					break;
				case MainMenu.EXIT:
					System.out.println("프로그램이 종료되었습니다.");
					return;
				}
				Menu.SC.nextLine();
			} catch (InputMismatchException | NumInputException e) {
				System.out.println("정확하게 입력 바랍니다.");
				Menu.SC.nextLine();
				System.out.println(e);
			}
		}
	}

	private static int readNum() throws NumInputException {
		int menuNum = Menu.SC.nextInt();
		if (menuNum < 1 || menuNum > 5) {
			System.out.println("보기의 숫자를 정확하게 입력하세요.");
			throw new NumInputException();
		}
		return menuNum;
	}
}