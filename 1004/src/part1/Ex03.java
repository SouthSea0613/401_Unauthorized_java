package part1;

public class Ex03 {
	//필드
	//1. 인스턴스 변수
	private String name; //ex
	
	public static void main(String[] args) { 
		//변수의 유효범위(scope) //지역변수(매개변수)
		boolean scope=false; //ex scope는 클 필요는 없다
		if(scope) {
			int num=10; //블럭 안에서 만 돌고 끝나면 사라짐
			num++;
			System.out.println(num);
		}else {
			int num=20;
			System.out.println(num);
		}
		//System.out.println(num2); 에러
		showNum();
	}//main

	private static void showNum() {
		int num=0;
		System.out.println(++num);
		
	}
}//class End