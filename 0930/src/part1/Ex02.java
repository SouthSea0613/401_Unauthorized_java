package part1;

//제어문: 실행흐름을 제어하는 문
//1.조건문: if문, if~else문,....
//2.반복문: while문, for문, do~while문
public class Ex02 {
	public static void main(String[] args) {
//		int num=10; //+10, 0, -10
//		if(num<0) {
//			System.out.println("음수");
//		} else if(num>0) {
//			System.out.println("양수");
//		} else {
//			System.out.println("제로");
//		}
		int kor=55;  // 0~100사이
		//90점 이상: A학점
		//80점 이상: B학점
		//70점 이상: C학점
		//60점 이상: D학점
		//60점 미만: F학점이 출력되도록 if문 작성
		//if(90<=kor && kor<=100)
		//String grade="F"; // 참조형
		String grade=null; // 참조형
		if(kor>=90) {
			grade="A학점";
		} else if(kor>=80) {
			grade="B학점";
		} else if(kor>=70) {
			grade="C학점";
		} else if(kor>=60) {
			grade="D학점";
		} else {
			grade="F학점";
		}
		System.out.println("당신의 학점은 "+grade);
//		System.out.println("program end");
	}

}
