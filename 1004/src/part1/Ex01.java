package part1;
public class Ex01 {
	//인스턴스 변수
	//메소드 올 수 있음
	public static void main(String[] args) {
		double height=180.5;
		showMyInfo(40, height,"cha"); //( ) 인자 파라미터
		String name="hong";
		showMyInfo(30, 190, name);
		showMyInfo(40, height, name);
		
		
		/////////////////////////////////
		int total=sumAgeHeight(30, 170);
		System.out.println("total:"+total);  // 담아놓고 여러번
//		System.out.println("total:"+sumAgeHeight(20, 190)); //일회성
		
	}

	private static int sumAgeHeight(int age, int h) {  //int 자리 _void(리턴값 없어요) , String 여긴 리턴값의 타입(자료형)
		//int total=age+h;
		return age+h; //return total;  //total리턴후 메소드 종료
	}

	private static void showMyInfo(int age, double height, String name) {
		System.out.println("age: "+age);
		System.out.println("height: "+height);
		System.out.println("name: "+name);
		System.out.println("-------");
		//return; 생략 돼 있음
		
	}
}
