package controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import bean.PhoneBookDao;
import bean.PhoneCompanyInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import common.Menu;
import common.SubMenu;
import exception.MenuNumException;

//제어 클래스(어렵다)
public class PhoneBookManager {

	// 인스턴스 배열: 각 요소의 인스턴스의 참조값을 저장함.
	//PhoneInfo[] phoneList = new PhoneInfo[100];
	// 0~99
	//int cnt; // =0; =인덱스 리스트수
	
	//HashSet ! 
	private HashSet<PhoneInfo> infoStorage=new HashSet<>();
	PhoneBookDao phoneBookDao = new PhoneBookDao();
	
	public void inputData() throws MenuNumException {
		
		
		
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("1.일반, 2.대학, 3.회사");

		System.out.println("선택>>");
		int subMenuNum = Menu.SC.nextInt();
		if (subMenuNum < 1 || subMenuNum > 3) {
			throw new MenuNumException(subMenuNum);
		}
		
		switch (subMenuNum) {
		case SubMenu.NORMAL:
			PhoneInfo info = normalInputData(); // 이름 , 전화번호 PhoneInfor 객체 배열저장
			phoneBookDao.insert(info);
			break;
		case SubMenu.UNIVERSE:
			PhoneUnivInfo infoU = univInputData(); // 이름, 전화번호, 전공, 학년 PhoneUnivInfo 객체 배열저장
			phoneBookDao.insert(infoU);
			break;
		case SubMenu.COMPANY:
			PhoneCompanyInfo infoC = companyInputData(); // 이름, 전화번호, 회사명 phoneComanyInfo 객체 배열저장
			phoneBookDao.insert(infoC);
			break;
		}
//		if(result) {
//			System.out.println("데이터 입력이 완료됨!");
//		}else {
//			System.out.println("이미 저장된 데이터 입니다.");
//		}
		// 배열에 저장
//		//cnt++;
		System.out.println("데이터 입력을 종료합니다.");

//		System.out.println("전화번호 입력을 시작합니다.");
//		Scanner sc=new Scanner(System.in);
//		System.out.print("이름: ");
//		String name=sc.next();
//		System.out.print("전화번호: ");
//		String phone=sc.next();
////		System.out.print("생년월일: ");
////		String birth=sc.next();
//		//객체생성
//		PhoneInfo info=new PhoneInfo(name, phone);
//		phoneList[cnt++]=info; //배열에 참조값을 저장
//		//cnt++;
//		System.out.println("전화번호 입력을 종료합니다.");
	}// inputData End

	private PhoneCompanyInfo companyInputData() {
		System.out.print("이름: ");
		String name = Menu.SC.next();
		System.out.print("전화번호: ");
		String phone = Menu.SC.next();
		System.out.println("회사: ");
		String company = Menu.SC.next();
		// 객체생성
		return new PhoneCompanyInfo(name, phone, company); // return null->실패
	}

	private PhoneUnivInfo univInputData() {
		System.out.print("이름: ");
		String name = Menu.SC.next();
		System.out.print("전화번호: ");
		String phone = Menu.SC.next();
		System.out.println("학번: ");
		String major = Menu.SC.next();
		System.out.println("학년: ");
		String year = Menu.SC.next();
		// 객체생성
		return new PhoneUnivInfo(name, phone, major, year);
	}

	private PhoneInfo normalInputData() {
		
		System.out.print("이름: ");
		String name = Menu.SC.next();
		System.out.print("전화번호: ");
		String phone = Menu.SC.next();
		// 객체생성
		return new PhoneInfo(name, phone);
	}
	
	
//1018 !!HashSet
	private PhoneInfo search(String name) {
		Iterator<PhoneInfo> it = infoStorage.iterator();
		while(it.hasNext()) {
			PhoneInfo curInfo = it.next();
			if(curInfo.getName().equals(name)) {
				return curInfo;
			}
		}
		return null; //검색실패
	}	
//searchData!!!		
	public void searchData() {
		// 이름으로 검색 - > name~ phone~ birth~ 데이터 검색이 완료되었습니다 / 홍길동이란 데이터가 없습니다.
		System.out.println("검색을 시작합니다.");
		System.out.print("이름: ");

		String name = Menu.SC.next(); // bbb

		// 수정 할 데이터의 인덱스를 검색, 실패시 -1로 리턴
//		int idx = searchIdx(name);
//		if (idx != -1) {
//			phoneList[idx].showPhoneInfo();
//			System.out.println("검색이 완료 되었습니다.");
//			return; // 리턴은 해당 반복문을 종료.
//		}
//		System.out.println("검색할 데이터가 없습니다.");
//	}
//
//	private int searchIdx(String name) {
//		for (int i = 0; i < cnt; i++) {
//			if (phoneList[i].getName().equals(name)) {
//				return i;
//			}
//		}
//		return -1; // 에러의 의미
		
		ArrayList<PhoneInfo> Plist = phoneBookDao.search(name);
		for (PhoneInfo phoneInfo : Plist) {
			phoneInfo.showPhoneInfo();
		}
		
	}

	
	
//deleteData!!!	
	public void deleteData() { // 데이터 삭제를 시작합니다.. -> 이름: 홍길동 -> 데이터가 삭제되었습니다.
		
		
		
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.println("삭제할 데이터의 전화번호를 입력하세요.");
		System.out.println("전화번호: ");
		String phone = Menu.SC.next();
		
		phoneBookDao.delect(phone);
		
//		int idx = searchIdx(name);
//		if (idx != -1) {
//			phoneList[idx] = phoneList[cnt - 1];
//			cnt--;
//			// phoneList[cnt-1]=null;
//			System.out.println("데이터가 삭제 되었습니다.");
//			return; // 동명이인 없음
//		}
//		System.out.println("삭제할 데이터가 없습니다.");
		
//		Iterator<PhoneInfo> it = infoStorage.iterator();
//		while(it.hasNext()) {
//			PhoneInfo curInfo = it.next();
//			if(curInfo.getName().equals(name)) {
//				it.remove(); //권장
//				//imfoStorage.remove(curInfo);
//				System.out.println("데이터 삭제가 완료되었습니다.");
//				return;
//			}
//		}
		System.out.println("삭제할 데이터가 없습니다.");
	}


//showAllData!!!
	public void showAllData() {
		ArrayList<PhoneInfo> pList=phoneBookDao.showAll();
		System.out.println("전화번호 전체를 출력합니다.");
		for (PhoneInfo phoneInfo : pList) {
			phoneInfo.showPhoneInfo();
		}
		}
//		for (int i = 0; i < cnt; i++) {
//			phoneList[i].showPhoneInfo();
//		}
//		System.out.println("전화번호 전체출력을 종료합니다.");
//	}

	// 전화번호부 입력, 출력, 삭제, 수정...
		
//		Iterator<PhoneInfo> it = infoStorage.iterator();
//		while(it.hasNext()) {
//			it.next().showPhoneInfo();
//			System.out.println("-----------------------");
//		}
//		System.out.println("전체 출력을 종료합니다.");
//	}

	public void updateData() {
		
		
	}
}//class End
