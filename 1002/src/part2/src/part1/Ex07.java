package part1;

import java.util.Scanner;

public class Ex07 {
	//인스턴스 배열: 각 요소에 인스턴스의 참조값을 저장함.
	public static void main(String[] args) { //String[] args 보이면 참조변수야,, 생각 나야함
		//System.out.println(new String[3].length); // 줄이 바뀌면 사라져
		String[] names = new String[] { "kim", "lee", "cha" }; //인스턴스 문자
		Scanner sc = new Scanner(System.in);
		//배열의 첫째 요소와 세번째 요소를 swap
		String temp=names[0]; //4B //temp라는 변수 
		names[0]=names[2];    //4B
		names[2]=temp;        //4B

//				for (int i = 0; i < names.length; i++) {
//			System.out.print("이름 입력");
//			names[i] = sc.next();
		for (String str: names) { //각각의 참조값이 복사가 돼서 출력
			System.out.println(str);
		}
//		}
//		for (int i = 0; i < names.length; i++) {
//			System.out.println("names[" + i + "]:" + names[i]);
//		}
	}
}
