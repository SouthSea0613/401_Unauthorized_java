package part1;

public class StringConcat {
	public static void main(String[] args) {
//		String str="";
//		String str="null";  //nullbbbccc < null도 문자화
//		for(int i=0;i<10; i++) {
//			str+=("|"+i);
//		}
//		StringBuilder sb=new StringBuilder();
//		for(int i=0; i<10; i++) {
//			sb.append("|"+i);
//		}
//		System.out.println(sb.toString());
//		문제1> String str= "abcdefghijklmn";
//		이 문자열을 역순으로 다시 출력하는 프로그램 작성
		// 참고로 String 클래스를 이용하면 쉽게 해결
		String str = "abcdefghijklmn...z";
		StringBuilder sb = new StringBuilder(str);
//		sb.append(str); // 버퍼에 순차적으로 저장
		sb.reverse(); // 버퍼내용이 역순저장
		str = sb.toString();
		System.out.println(str);
		// str="z....a";
		// 문제2>String str= "120101-3012752"; 주민번호를 담고 있는 인스턴스를 생성하고,
		// 이 문자열을 이용하여 중간에 삽입된 -를 삭제한 String 인스턴스를 생성해보자.
		// 이 문제도 StringBuilder 클래스를 활용해야 한다.
//		String str1="120101301-2752";
//		StringBuffer sb1 = new StringBuffer(str1);
//		sb1.append(str1);
//		sb1.deleteCharAt(9);
//		str1=sb1.toString();
//			for(int i=0; i<sb1.length(); i++) {
//				if(sb1.charAt(i)=='-') {
//					sb1.deleteCharAt(i);
//				}
//			}
//			str1=sb1.toString();
//			System.out.println(str1);
		
		String str1 = "120101301-2752";
		StringBuffer sb1 = new StringBuffer(str1);
		int idx = sb1.lastIndexOf("-");
		if (idx != -1) {
			sb1.deleteCharAt(idx);
		}
		str1 = sb1.toString();
		System.out.println(str1);
		// str1="1201013012752"
	}
}