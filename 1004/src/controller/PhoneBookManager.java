package controller;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import bean.PhoneCompanyInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import common.Menu;
import common.SubMenu;
import exception.MenuInputException;

public class PhoneBookManager {
	private String[] inputDataDefault() {
		String[] tmp = new String[2];

		System.out.printf("이름 : ");
		tmp[0] = Menu.SCANNER.next();
		System.out.printf("전화번호 : ");
		tmp[1] = Menu.SCANNER.next();

		return tmp;
	}

	private PhoneInfo inputDataBasic() {
		String[] tmp = inputDataDefault();

		return new PhoneInfo(tmp[0], tmp[1]);
	}

	private PhoneInfo inputDataUniv() {
		String[] tmp = inputDataDefault();
		System.out.printf("전공 : ");
		String major = Menu.SCANNER.next();
		System.out.printf("학년 : ");
		int grade = Menu.SCANNER.nextInt();

		return new PhoneUnivInfo(tmp[0], tmp[1], major, grade);
	}

	private PhoneInfo inputDataCompany() {
		String[] tmp = inputDataDefault();
		System.out.printf("회사 : ");
		String company = Menu.SCANNER.next();

		return new PhoneCompanyInfo(tmp[0], tmp[1], company);
	}

	public void inputData() {
		PhoneDao phoneDao = new PhoneDao();
		
		System.out.printf("메뉴를 선택하세요\n");
		System.out.printf("1. 일반\n");
		System.out.printf("2. 대학\n");
		System.out.printf("3. 회사\n");
		System.out.printf("\n");
		System.out.printf("메뉴 선택 : ");

		try {
			int menuChoice = MenuInputException.readSubMenu();
			switch (menuChoice) {
			case SubMenu.NORMAL: {
				phoneDao.insert(inputDataBasic());
				break;
			}
			case SubMenu.UNIVERSE: {
				phoneInfoHash.add(inputDataUniv());
				break;
			}
			case SubMenu.COMPANY: {
				phoneInfoHash.add(inputDataCompany());
				break;
			}
			default:
			}
		} catch (InputMismatchException | MenuInputException e) {
			e.printStackTrace();
		}
	}

	public void searchData() {
		System.out.printf("검색할 이름 입력 : ");
		String name = Menu.SCANNER.next();
		Iterator<PhoneInfo> iterator = phoneInfoHash.iterator();
		while (iterator.hasNext()) {
			PhoneInfo tmp = iterator.next();
			if (tmp.getName().equals(name)) {
				System.out.printf("%s\n", tmp);
			}
		}
	}

	public void showAllData() {
		Iterator<PhoneInfo> iterator = phoneInfoHash.iterator();
		while (iterator.hasNext()) {
			System.out.printf("%s\n", iterator.next());
		}
	}

	public void deleteData() {
		System.out.printf("삭제할 이름 입력 : ");
		String name = Menu.SCANNER.next();
		
		System.out.printf("삭제할 데이터가 없습니다.\n");
	}
}