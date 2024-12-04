package part1;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
//		java는 문자인코딩 시: unicode
		Scanner sc=new Scanner(System.in);
		String str="대한민국";//""문자열 인스턴스
//		String str=new String("대한민국");//""문자열 인스턴스
//		System.out.println(str.hashCode());
//		str+="만세";
//		System.out.println(str);
//		System.out.println(str.hashCode());
//
//		System.out.println("만세".length());
		String str2=sc.next();
		//문자열 내용 비교
		if(str.equals(str2)) { //equal 반환 값은 boolean
			System.out.println("문자열 내용이 같다");
		} else {
			System.out.println("문자열 내용이 다르다");
		}
	}
}
