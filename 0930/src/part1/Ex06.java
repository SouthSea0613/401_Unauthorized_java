package part1;

public class Ex06 {
	public static void main(String[] args) {
		//참조형 변수명=값
		String n ="b";
		if(n.equals("A") || n.equals("a")) {
			System.out.println("맥북 프로");
		} else if (n.equals("B") || n.equals("b")) {
			System.out.println("노트북");
		} else {
			System.out.println("휴지");
		}
//		switch (n) { //정수(문자) 또는 문자열
//		case "A": case "a":
//			System.out.println("맥북 프로");
//			break;
//		case "B": case "b":
//			System.out.println("노트북");
//			break;
//		case "C": case "c" : case "x":
//			System.out.println("공책");
//			break; //반복문, switch case문 탈출
//		default: 
//			System.out.println("휴지");
//		}
//		System.out.println("End");
	}
}
