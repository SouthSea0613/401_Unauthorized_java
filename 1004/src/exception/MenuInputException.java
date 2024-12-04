package exception;

import common.MainMenu;
import common.Menu;
import common.SubMenu;

public class MenuInputException extends Exception{
	public MenuInputException() {
		super("존재하지 않는 메뉴입니다.");
	}
	
	public static int readMainMenu() throws MenuInputException {
		int menuChoice = Menu.SCANNER.nextInt();
		if (menuChoice < MainMenu.INPUT || MainMenu.EXIT < menuChoice) {
			throw new MenuInputException();
		}
		else {
			return menuChoice;
		}
	}
	
	public static int readSubMenu() throws MenuInputException {
		int menuChoice = Menu.SCANNER.nextInt();
		if (menuChoice < SubMenu.NORMAL || SubMenu.COMPANY < menuChoice) {
			throw new MenuInputException();
		} else {
			return menuChoice;
		}
	}
}
