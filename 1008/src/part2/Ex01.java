package part2;

import java.util.Scanner;

class Friend{
	private String name;
	private int age;
	Friend(String name, int age) {
		this.name=name;
		this.age=age;
	}
//	... toString() {}
	@Override
	public String toString() {
		String str="";
		str+="name: "+name;
		str+="\nage: "+age;
		str+="\n----------";
		return str;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name=key.nextLine();
		System.out.println(name);
		//jdk 1.17 1.8 1.5(5.0)
//		Friend friend=new Friend("kim",20);
//		friend.showInfo();
//		System.out.println(friend.toString());
//		System.out.println(friend); //toString() 생략
//		System.out.println("강아지가 \"멍멍\" 짖는다.");
//		System.out.println("C:\\work\\ta.java열기");
		
	}
}
