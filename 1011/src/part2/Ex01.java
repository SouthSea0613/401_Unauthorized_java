package part2;

import java.util.Scanner;

public class Ex01 {
	
	private static Member member ;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Member member = createMember("aaa", "1111", "남자", 30);
		if (member != null) {
			member.showInfo();
		}
		boolean result = join(member);
		if (result) { // true or false
			System.out.println("회원가입 성공");
			// login(member);
			while (true) {
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw= sc.next();
				Member mb=null;
				mb=login(id, pw);
				if(result) {//로그인 성공
					System.out.println(id+"환영해요, 프로그램 종료");
					return;
					//break;
				}
				System.out.println("아이디 또는 비밀번호 오류입니다.");
			}//while end
			
//			result = login(member.getId(), member.getPw());
//			if (result) {
//				System.out.println("로그인 성공");
//			} else {
//				System.out.println("로그인 실패");
//			}
		} else {
			System.out.println("회원가입 실패");
		}
//
//		if (cir != null) {
////			data.setNum1(cir.getNum1() + 1);
////			data.setNum2(cir.getNum2() + 1);
//			data.showCircleInfo();
//		} else { // data==null
//			System.out.println("아무것도 참조하지 않음");
//			System.out.println("data : "+data);
//			return;
	}

	private static boolean join(Member member) {
		if (member.getAge() < 20) {
			return false;
		}
		System.out.println("db에 모든 회원정보 저장완료");
		return true;
	}

	private static Member login(String id, String pw) {
		if (id.equals("aaa") && pw.equals("1111")) {
			return member;
		}
		return null;

	}

	private static Member createMember(String id, String pw, String gender, int age) {

		Member mb = new Member();
		mb.setId(id);
		mb.setPw(pw);
		mb.setAge(age);
		mb.setGender(gender);
		return mb;

	}

	private static Data createIntence(int i, int j) {
		if (i < 0) {
			return null; // null 값 : 어떤 인스턴스값도 참조하고 있지않음
		}
		return new Data(i, j);

	}

}
