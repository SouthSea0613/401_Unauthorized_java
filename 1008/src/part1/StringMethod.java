package part1;

public class StringMethod {
	public static void main(String[] args) {
		
		String str="hello java";
		
		System.out.println(str.equals("hello java"));
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		char ch=str.charAt(0); //ch='h'
		System.out.println("ch:"+ch);
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf('o')); // lastIndexOf 는 뒤에서 부터 
		System.out.println(str.indexOf("o j")); //문자열 시작 인덱스
		System.out.println(str.indexOf("java1")); //실패: -1 (에러의 의미)
		System.out.println(str.contains("java")); //java 문자를 포함하고 있니? T/F
		System.out.println(str.startsWith("java")); //java로 시작하니?
		System.out.println(str.endsWith("java")); //java로 끝나니?
		System.out.println("".isEmpty()); //비어있닝?
		str=str.replace("java","c++"); //hello c++ 새로 생성
		System.out.println(str);
		System.out.println(str.substring(1,3)); //인덱스 1 부터 3미만 까지 문자 반환
		System.out.println(str.substring(1)); //인덱스 1 부터 끝까지 문자 반환
		System.out.println(str.toUpperCase()); //대문자로 변환  //리턴함. (lower도) 원본은 그대로.
		System.out.println(str.toLowerCase()); //소문자로 변환
		str="    java    ";
		System.out.println(str.trim()); //공백제거
		
		//변수 자동 생성: C+1
		str="aa,bb,cc";
		String[] arr=str.split(","); //,를 기준으로 구분좀 해줘
		for(String s: arr) {
			System.out.println(s);
		}
	}
}
