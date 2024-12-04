package controller;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;

import bean.PhoneCompanyInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import common.Menu;
import common.NumInputException;
import common.SubMenu;

public class PhoneBookManager {

	HashSet<PhoneInfo> die;

	public PhoneBookManager() {
		die = new HashSet<>();
	}

	public void addMember(PhoneInfo pi) {
		die.add(pi);
	}

	public void inputData() {
		while (true) {
			try {
				System.out.println("데이터 입력을 시작합니다.");
				System.out.println("1.일반, 2.대학, 3.회사");
				System.out.println("선택>>");
				int subMenuNum = readNum();
				switch (subMenuNum) {
				case SubMenu.NORMAL:
					die.add(normalInputData());
					break;
				case SubMenu.UNIVERSE:
					die.add(univInputData());
					break;
				case SubMenu.COMPANY:
					die.add(companyInputData());
					break;
				}
				System.out.println("데이터 입력을 종료합니다.");
				return;
			} catch (InputMismatchException | NumInputException e) {
				System.out.println("1~3번까지만 입력 가능합니다.");
				e.printStackTrace();
				Menu.SC.nextLine();
			}
		}
	}

	private int readNum() throws NumInputException {
		int subMenuNum = Menu.SC.nextInt();
		if (subMenuNum < 1 || subMenuNum > 3) {
			System.out.println("정신 챙겨");
			throw new NumInputException();
		}
		return subMenuNum;
	}

	private PhoneInfo normalInputData() {
		System.out.print("이름: ");
		String name = Menu.SC.next();
		System.out.print("전화번호: ");
		String phone = Menu.SC.next();
		return new PhoneInfo(name, phone);
	}

	private PhoneInfo companyInputData() {
		System.out.print("이름: ");
		String name = Menu.SC.next();
		System.out.print("전화번호: ");
		String phone = Menu.SC.next();
		System.out.print("회사: ");
		String company = Menu.SC.next();
		return new PhoneCompanyInfo(name, phone, company);
	}

	private PhoneInfo univInputData() {
		System.out.print("이름: ");
		String name = Menu.SC.next();
		System.out.print("전화번호: ");
		String phone = Menu.SC.next();
		System.out.print("전공: ");
		String major = Menu.SC.next();
		System.out.print("학년: ");
		int grade = Menu.SC.nextInt();
		return new PhoneUnivInfo(name, phone, major, grade);
		}

	public void searchData() {
		System.out.println("전화번호 검색을 시작합니다.");
		System.out.print("이름: ");
		String name = Menu.SC.next();
		Iterator<PhoneInfo> itr = die.iterator();
		while (itr.hasNext()) {
			PhoneInfo a = itr.next();
			if (a.getName().equals(name)) {
				System.out.println(a.toString());
				System.out.println("검색이 완료되었습니다.");
				return;
			}
		}
		System.out.println("검색 할 데이터가 없습니다.");
	}

	public void deleteData() {
		System.out.println("삭제를 시작합니다.");
		System.out.print("이름: ");
		String name = Menu.SC.next();
		Iterator<PhoneInfo> itr = die.iterator();
		while (itr.hasNext()) {
			PhoneInfo a = itr.next();
			if (a.getName().equals(name)) {
				die.remove(a);
				System.out.println("삭제가 완료되었습니다.");
				return;
			}
		}
		System.out.println("삭제할 데이터가 없습니다.");
	}

	public void showAllData() {
		System.out.println("전화번호 출력을 시작합니다.");
		Iterator<PhoneInfo> itr = die.iterator();
		while (itr.hasNext()) {
			System.out.println((itr.next()));
		}
		System.out.println("전화번호 출력을 종료합니다.");
	}
}
