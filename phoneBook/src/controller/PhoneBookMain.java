package controller;

import java.util.InputMismatchException;

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
				menuNum = Menu.SC.nextInt();
				if (menuNum < 1 || menuNum > 6) {
					throw new MenuNumException(menuNum);
				}
				switch (menuNum) {
				case MainMenu.INPUT:
					manager.inputData(); // 이름, 전화, 생일 입력후 인스턴스 생성
					break;
				case MainMenu.SEARCH:
					manager.searchData(); // 검색
					break;
				case MainMenu.DELETE:
					manager.deleteData(); // 삭제
					break;
				case MainMenu.UPDATE:
					manager.updateData(); // 수정
					break;
				case MainMenu.SHOWALL:
					manager.showAllData(); // 전체출력
					break;
				case MainMenu.EXIT:
					System.out.println("프로그램을 종료합니다.");
					return; // System.exit(0); -> 프로그램을 강제종료
				// default:

				}// switch end
			} catch (InputMismatchException e) {
				System.out.println("메뉴는 정수만 가능합니다.!");
				Menu.SC.nextLine();
			} catch (MenuNumException e) {
				e.showWrongNum();
				// System.out.println(e);
				e.printStackTrace();
			}
		} // while end
	}// main end

	// PhoneInfo클래스를 bean패키지에 정의할것. 1007

	// 생성자(contructor) 호출 --> 인스턴스 변수를 초기화 --> 객체(인스턴스) 생성
//		PhoneInfo pInfo1=new PhoneInfo("이순신","1111-2222","90/10/10"); //(인자,파라미터)
//		PhoneInfo pInfo2=new PhoneInfo("홍길동","2222-3333");
//		pInfo1.showPhoneInfo();
//		pInfo2.showPhoneInfo();
	// 실행예
	// 이름: 이순신, 전화번호: 1111-2222, 생일: 90/10/10
	// 이름: 홍길동, 전화번호: 2222-3333

}// class end
