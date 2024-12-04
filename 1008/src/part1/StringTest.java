package part1;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		//java는 문자인코딩시: unicode
		
		Scanner sc=new Scanner(System.in);
		String str="대한민국"; //""문자열 인스턴스 //원래는 new String, 뉴 생략
//		System.out.println(str+="만세");
//		System.out.println(str);
//		System.out.println("만세".length());
		String str2=sc.next();
		//문자열 내용 비교
		if(str.equals(str2)) { //내용비교 equals _boolean
			
			System.out.println("문자열 내용이 같다"); //인스턴스 가 같으면 굳이 2개로 안 만듦, str2=대한민국 이면 참조값이 같다.
		}else {
			System.out.println("문자열 내용이 다르다");
		}
	}
}
