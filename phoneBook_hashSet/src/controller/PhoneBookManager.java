package controller;

import java.io.IOError;
import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import bean.PhoneCompanyInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import common.Menu;
import common.SubMenu;
import exception.MenuNumException;

//제어 클래스(어렵다)
public class PhoneBookManager {
	// 인스턴스 배열: 각 요소에 인스턴스의 참조값을 저장함.
	//PhoneInfo[] phoneList = new PhoneInfo[100];
	// 0-99
	//int cnt; // =0;인덱스 리스트수
	private HashSet<PhoneInfo> infoStorage=new HashSet<>();
	
	public void inputData() throws MenuNumException {
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");

		System.out.print("선택>>");
		int subMenuNum = Menu.SC.nextInt();
		if (subMenuNum < 1 || subMenuNum > 3) {
			throw new MenuNumException(subMenuNum);
		}

		PhoneInfo info = null;
		switch (subMenuNum) {
		case SubMenu.NORMAL:
			info = normalInputData(); // 이름, 전화번호 PhoneInfo객체 배열저장
			break;
		case SubMenu.UNIV:
			info = univInputData();// 이름,전화번호,전공,학년 PhoneUnivInfo객체 배열저장
			break;
		case SubMenu.COM:
			info = companyInputData();// 이름,전화번호,회사명 PhoneCompanyInfo객체 배열저장
			break;
		}
		boolean result = infoStorage.add(info); // HashSet에 저장
		if(result) {
			System.out.println("데이터 입력이 완료됨!!!");
		}else {
			System.out.println("이미 저장된 데이터입니다.");
		}
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

//	private int searchIdx(String name) {
//		for (int i = 0; i < cnt; i++) {
//			if (phoneList[i].getName().equals(name)) {
//				return i; // 검색된 인덱스 반환
//			}
//		}
//		return -1; // 검색 실패
//	}
	private PhoneInfo search(String name) {
		Iterator<PhoneInfo> it = infoStorage.iterator();
		while(it.hasNext()) {
			PhoneInfo curInfo = it.next();
			if(curInfo.getName().equals(name)) {
				return curInfo;
			}
		}
		return null;  //검색 실패
}
	public void searchData() {
		System.out.println("검색을 시작합니다.");
		System.out.print("이름: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next(); // bbb
		// 수정할 데이터의 인덱스 검색, 실패시 -1리턴
		//int idx = searchIdx(name);
//		if (idx != -1) {
//			phoneList[idx].showPhoneInfo();
//			System.out.println("검색이 완료됨!!");
//			return;
//		}
		PhoneInfo info = search(name);
		if(info==null) {
			System.out.println("검색할 데이터가 없습니다.");
		}else {
			info.showPhoneInfo();
		}
	}

	public void deleteData() {
		System.out.println("삭제를 시작합니다.");
		System.out.print("이름: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next(); // bbb
//		int idx = searchIdx(name);
//		if (idx != -1) {
//			phoneList[idx] = phoneList[cnt - 1];
//			cnt--;
//			// phoneList[cnt-1]=null;
//			System.out.println("삭제가 완료됨!!");
//			return; // 동명이인 없음
//		}
		//search 메소드 이용하여 구현
//		PhoneInfo info = search(name);
//		if(info==null) {
//			System.out.println("삭제할 데이터가 없습니다.");
//		}else {
//			infoStorage.remove(info); //hashSet에서 삭제
//			System.out.println("데이터 삭제가 완료되었습니다.");
//		}
		//직접 구현
		Iterator<PhoneInfo> it = infoStorage.iterator();
		while(it.hasNext()) {
			PhoneInfo curInfo = it.next();
			if(curInfo.getName().equals(name)) {
				it.remove();  //권장
				//infoStorage.remove(curInfo);
				System.out.println("데이터 삭제가 완료되었습니다.");
				return;
			}
		}
		System.out.println("삭제할 데이터가 없습니다.");
	}
	public void showAllData() {
		System.out.println("전화번호 전체를 출력합니다.");
//		for (int i = 0; i < cnt; i++) {
//			phoneList[i].showPhoneInfo();
//			System.out.println("----------------");
//		}
		Iterator<PhoneInfo> it = infoStorage.iterator();
		while(it.hasNext()) {
			it.next().showPhoneInfo();
			System.out.println("-------------------");
		}
		System.out.println("전체를 출력을 종료합니다.");
	}
}// class End
