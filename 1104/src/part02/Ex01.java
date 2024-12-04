package part02;

import java.util.Scanner;

public class Ex01 {
	static Scanner scanner = new Scanner(System.in);
	
	/*
	private static Members getMembersInfo() {
		Members members = new Members();
				
		System.out.printf("아이디 입력 : ");
		members.setId(scanner.next());
		System.out.printf("이름 입력 : ");
		members.setName(scanner.next());
		System.out.printf("성별 입력 : ");
		members.setGender(scanner.next());
		System.out.printf("나이 입력 : ");
		members.setAge(scanner.nextInt());
		
		System.out.printf("%s\n", members);
		
		return members;
	}
	*/
	
	public static void main(String[] args) {
		MembersDao membersDao = new MembersDao();
		
		/*
		// 전체출력
		ArrayList<Members> membersList = membersDao.showAllMembers();
		for (Members members : membersList) {
			System.out.printf("%s\n", members);
		}
		*/
		
		/*
		// 회원가입
		Members members = getMembersInfo();
		boolean result = membersDao.join(members);
		if (result) {
			System.out.printf("회원가입 성공\n");
		}
		else {
			System.out.printf("회원가입 실패\n");
		}
		*/
		
		/*
		// 관리자 구별 로그인
		while(true) {
			System.out.printf("\n");
			System.out.printf("아이디 입력 : ");
			String id = scanner.next();
			System.out.printf("이름 입력 : ");
			String name = scanner.next();
			ArrayList<Members> membersList2 = membersDao.getAdminLoginInfo(id, name);
			if (membersList2.size() != 0) {
				System.out.printf("\n로그인 성공\n");
				for (Members members : membersList2) {
					System.out.printf("%s\n", members);
				}
				break;
			}
			else {
				System.out.printf("\n로그인 실패\n");
			}
		}
		*/
		
		/*
		// update 수정
		System.out.printf("\n");
		System.out.printf("수정대상 아이디 입력 : ");
		String id = scanner.next();
		System.out.printf("수정할 대상 입력 : ");
		String column = scanner.next();
		System.out.printf("수정한 정보 입력 : ");
		String information = scanner.next();
		Members members = membersDao.update(id, column, information);
		if (members != null) {
			System.out.printf("\nUPDATE SUCCESSED");
			System.out.printf("%s\n", members);
		}
		else {
			System.out.printf("\nUPDATE FAILED\n");
		}
		*/
		
		boolean result = membersDao.sendMoney("AAA", "BBB", 1000);
		if (result) {
			System.out.printf("TRANSACTION SUCCESS\n");
		}
		else {
			System.out.printf("TRANSACTION FAILED\n");
		}
	}
}