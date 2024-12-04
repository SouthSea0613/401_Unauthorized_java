package part2;

public class Ex01 {
	public static void main(String[] args) {

		Member member = createMember("aaa", "1111", "남자", 10);
		member.showInfo();
		boolean result = join(member);
//		System.out.println("result: " + result);
	
		if(result) {
////			login(member);
			result=login(member.getId(), member.getPw());
			if(result) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}
	private static boolean join(Member member) {
		if (member.getId().equals("aaa")) {
			if (member.getPw().equals("1111")) {
				return true;
			}
		}
		return false;
	}
	private static boolean login(String id, String pw) {
		if(id.equals("aaa")) {
			if(pw.equals("1111")) {
				return true;
			}		
		}
		return false;
	}

	private static Member createMember(String id, String pw, String gender, int age) {
		Member mb = new Member();
		mb.setId(id);
		mb.setPw(pw);
		mb.setGender(gender);
		mb.setAge(age);
		return mb;
	}
	
}
