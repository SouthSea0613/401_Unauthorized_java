package controller;

import java.io.IOError;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import bean.PhoneCompanyInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import common.Menu;
import common.SubMenu;
import dao.PhoneBookDao;
import exception.MenuNumException;

//제어 클래스(어렵다)
public class PhoneBookManager {
	// 인스턴스 배열: 각 요소에 인스턴스의 참조값을 저장함.
	PhoneBookDao dao = new PhoneBookDao();
	PhoneInfo[] phoneList = new PhoneInfo[100];
	// 0-99
	int cnt; // =0;인덱스 리스트수

	public void inputData() throws MenuNumException {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");

		System.out.print("선택>>");
		int subMenuNum = Menu.SC.nextInt();
		if (subMenuNum < 1 || subMenuNum > 3) {
			throw new MenuNumException(subMenuNum);
		}

		
		switch (subMenuNum) {
		case SubMenu.NORMAL:
			
			PhoneInfo info = normalInputData();// 이름, 전화번호 PhoneInfo객체 배열저장
			dao.insert(info);
			break;
		case SubMenu.UNIV:
			PhoneUnivInfo infoU = univInputData();
			dao.insertU(infoU);// 이름,전화번호,전공,학년 PhoneUnivInfo객체 배열저장
			break;
		case SubMenu.COM:
			PhoneCompanyInfo infoC = companyInputData();
			dao.insertC(infoC);// 이름,전화번호,회사명 PhoneCompanyInfo객체 배열저장
			break;
		}
		//phoneList[cnt++] = info; // 배열에 저장
		// cnt++;
		System.out.println("데이터 입력을 종료합니다.");
	}// inputData End

	private PhoneInfo normalInputData() {
		System.out.print("이름: ");
		String name = Menu.SC.next();
		System.out.print("전화번호: ");
		String phone = Menu.SC.next();
		// 객체생성
		return new PhoneInfo(name, phone);
	}

	private PhoneUnivInfo univInputData() {
		System.out.print("이름: ");
		String name = Menu.SC.next();
		System.out.print("전화번호: ");
		String phone = Menu.SC.next();
		System.out.print("전공: ");
		String major = Menu.SC.next();
		System.out.print("학년: ");
		int year = Menu.SC.nextInt();
		// 객체생성
		// return null;//실패
		return new PhoneUnivInfo(name, phone, major, year);
	}

	private PhoneCompanyInfo companyInputData() {
		System.out.print("이름: ");
		String name = Menu.SC.next();
		System.out.print("전화번호: ");
		String phone = Menu.SC.next();
		System.out.print("회사: ");
		String company = Menu.SC.next();
		// 객체생성
		return new PhoneCompanyInfo(name, phone, company);
	}

	private int searchIdx(String name) {
		for (int i = 0; i < cnt; i++) {
			if (phoneList[i].getName().equals(name)) {
				return i; // 검색된 인덱스 반환
			}
		}
		return -1; // 검색 실패
	}

	public void searchData() {
		System.out.println("검색을 시작합니다.");
		System.out.print("이름: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next(); // bbb
		// 수정할 데이터의 인덱스 검색, 실패시 -1리턴
		int idx = searchIdx(name);
		if (idx != -1) {
			phoneList[idx].showPhoneInfo();
			System.out.println("검색이 완료됨!!");
			return;
		}
		System.out.println("검색할 데이터가 없습니다.");
	}

	public void deleteData() {
		System.out.println("삭제를 시작합니다.");
		System.out.print("이름: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next(); // bbb
		int idx = searchIdx(name);
		if (idx != -1) {
			phoneList[idx] = phoneList[cnt - 1];
			cnt--;
			// phoneList[cnt-1]=null;
			System.out.println("삭제가 완료됨!!");
			return; // 동명이인 없음
		}
		System.out.println("삭제할 데이터가 없습니다.");
	}

	public void showAllData() {
		System.out.println("전화번호 전체를 출력합니다.");
		for (int i = 0; i < cnt; i++) {
			phoneList[i].showPhoneInfo();
			System.out.println("----------------");
		}
		System.out.println("전체를 출력을 종료합니다.");
	}
}// class End
