package part1;

public class Ex06 {
	public static void main(String[] args) {
		String n = "b";
		if(n.equals("A") || n.equals("a")) {
			System.out.println("맥북 프로");
		}else if(n.equals("B") || n.equals("b")) {
			System.out.println("노트북");
		}else {
			System.out.println("휴지");
		}
		boolean result=n.equals("B"); //자료형 자리에 기본형 8가지 이외에 참조형 들어갈수 있음 java 에서는 내용비교 할때 무조건 n.equals 사용
									  //자바에서는 "==" 비교 함수 사용하지않음
		System.out.println(result);
			
//		switch (n) { //정수(문자) 또는 문자열
//		case "A": case "a" : 
//			System.out.println("One");
//			break;
//		case "B": case "b" :
//			System.out.println("Two");
//			break;
//		case "C":
//			System.out.println("Three");
//			break; //반복문, switch 반복문 탈출
//		default:
//			System.out.println("Etc");
//		}
//		System.out.println("End");
		
		
		//switch 문으로 성적 처리 바꿔보기 (숙제)
	}
}
