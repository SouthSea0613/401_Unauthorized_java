package part1;

public class Ex01 {
	//인스턴스 변수
	//메소드 
	public static void main(String[] args) { 
		double height=180.5;
		showMyInfo(40, height, "cha"); //메개변수가 두개면 자료형도 두개여야함 , 정수인지 실수인지도 맞춰야함
		String name = "hong"; // 실수는 정수를 포함하지만 정수는 실수를 포함하지않음
		showMyInfo(30, 190, name);
		showMyInfo(40, height, name); 
		
//		int total=sumAgeHeight(30, 170); //호출 , total 이라는 변수에 저장 200리턴 // 여러번 출력시
//		System.out.println("total :"+total);
		System.out.println("total :"+sumAgeHeight(20, 190)); //1회성 출력
	}
	private static int sumAgeHeight(int age, int h) {//리턴값이 정수면 int , 실수면 double, 문자면 String, 리턴값이 없으면  void(noting)
		//int total=age+h; //리턴값이 있는지 없는지 먼저 확인
		return age+h; //total(결과값) 리턴 후 메소드 종료
		
	}
	private static void showMyInfo(int age, double height, String name) { //인자를 가져와서 호출
		System.out.println("age : "+ age);
		System.out.println("height : "+ height);
		System.out.println("name : "+ name);
		System.out.println("---------------");
	}
}
