package part2;

import java.util.Scanner;

class Friend{
	private String name;
	private int age;
	Friend(String name, int age){
		this.name=name;
		this.age=age;
	}
	//... toString(){} 배울예정
	@Override
	public String toString() {
		String str="";
		str+="name: "+name;
		str+="\n age: "+age;
		str+="\n----------";
		return str;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		System.out.println("키 입력");
		double height =key.nextDouble();
		System.out.println(height);
//		Friend friend = new Friend("kim",20);
		//friend.showInfo();
		//System.out.println(friend.toString());
//		System.out.println(friend); //toString()생략 , 프린트 메소드 안에다 참조값을 쓰게 되면 생략가능
//		System.out.println("강아지가 '멍멍' 짖는다."); // \역슬레시 넣으면 문자로 인식함 ex) \" \'
//		System.out.println("c:\\work\\aa.java열기"); // \\역슬레시 두개면 문자로 인식.
	}
}
