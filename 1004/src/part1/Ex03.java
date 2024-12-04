package part1;

public class Ex03 {
	//필드
	//1.인스턴스 변수
	private String name;
	
	public static void main(String[] args) {
		//변수의 유효범위(scope)//지역변수(매개변수)
		boolean scope=false;
		if(scope) {
			int num2=10;
			num2++;
			System.out.println(num2);
		} else {
			int num3=20;
			System.out.println(num3);
		}
		//System.out.println(num2); 에러
		shownum();
		
	}//main end
	private static void shownum() {
		int num=0;
		System.out.println(++num);
	}
	
	
}
