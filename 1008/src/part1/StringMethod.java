package part1;

public class StringMethod {
	public static void main(String[] args) {
		String str="hello java";
		System.out.println(str.equals("hello java"));
		System.out.println(str.length());
		char ch=str.charAt(0); //ch='h'
		System.out.println("ch:"+ch);
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf('o'));
		System.out.println(str.lastIndexOf('o'));
		System.out.println(str.indexOf("java"));  //문자열시작인덱스
		System.out.println(str.indexOf("java1")); //실패:-1
		System.out.println(str.contains("java")); //boolean값 
		System.out.println(str.startsWith("java"));
		System.out.println(str.endsWith("java")); 
		System.out.println("".length()); 		
		System.out.println("".isEmpty()); 		
		str=str.replace("java", "c++");
			//hello c++ 새로 생성
		System.out.println(str);
		System.out.println(str.substring(1,3)); //1~3미만
		System.out.println(str.substring(1)); //1~끝까지
		System.out.println("".isEmpty());
		System.out.println(str.toLowerCase()); 
		System.out.println(str.toUpperCase()); 
		System.out.println(str);
		str="    java     ";
		System.out.println(str.trim());
		str="aa,bb,cc";
		//변수 자동 생성:Ctrl+1
		String[] arr = str.split(",");
		for (String s: arr) {
			System.out.println(s);
		}
	}
}
