package part2;

import java.util.Scanner;

//복습
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Member member=createmember("aaa","1111",30,"남자");
		if(member!=null) {
			member.showInfo();
		}
		//member.showInfo();
		boolean result = join(member);
		if(result) {
			System.out.println("회원가입 성공"); // result 기본 성공.
			//login(member);
			while(true) {
				System.out.println("아이디 입력: ");
				String id=sc.next();
				System.out.println("비번 입력: ");
				String pw=sc.next();
				result=login(id,pw);
				if(result) { //로그인성공
					System.out.println(id+"환영해요, 프로그램 종료");
					return;
				}
				System.out.println("아이디 또는 비번 오류입니다.");
			}
			//
		}else {
			System.out.println("회원가입 실패");
		}
		
//		if(cir!=null) {
//			data.showCircleInfo(); //10,20,5.5
//		}else { //data==null
//			System.out.println("아무것도 참조하지 않아");
//			System.out.println("data: "+data);
//			return;
		
//		
//		data.setNum1(data.getNum1()+1);
//		data.setNum2(data.getNum2()+1);
//		data.showData(); //11,21
	}

	private static boolean login(String id, String pw) {
		if(id.equals("aaa")) {
			 if (pw.equals("1111")) {
				 return true; //로그인 성공
			}
		}
		return false; //로그인 실패
	}

	private static boolean join(Member member) {
		if(member.getAge() < 20) {
			return false;
		}
		System.out.println("db에 회원정보 저장 완료");
		return true;
	}
	private static Member createmember(String id, String pw, int age, String gender) {
		Member mb=new Member();
		mb.setId(id);
		mb.setPw(pw);
		mb.setAge(age);
		mb.setGender(gender);
		return mb;
	}

	private static Data createIntance(int i, int j) {
		if(i<10) {
			return null;
		}
		//Data data=new Data(i,j);
		//return data;
		return new Data(i,j);
	}

}
