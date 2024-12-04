package part1;

public class StringConcat {
	public static void main(String[] args) {
		
		
//		StringBuilder sb=new StringBuilder(); //아래보다 이게 빠름
//		for(int i=0;i<10;i++) {
//			sb.append("|"+i);
//		}
//		System.out.println(sb.toString());
		
		
		
//		String str="";
//		for(int i=0;i<10;i++) {
//			str+=("|"+i);
//		}
		
		//str+="bbb"; 
		//str+="ccc"; // bbbccc
		
		//System.out.println(str);
		
		
		//문제1> String str = "abcdefghijklmn"; 이렇게 인스턴스를 생성하고,
		//이 문자열을 역순으로 다시 출력하는 프로그램을 작성하자.
		//참고로 StringBuilder 클래스를 이용하면 쉽게 해결된다.
//		String str = "abcdefghijklmn" ;
//		StringBuilder sb=new StringBuilder(str);
		//sb.reverse();  풀이
		//str=sb.toString(); ->반환값을 스트링으로, 빌더 에서
		//System.out.println(str);
//		System.out.println(sb);
//		System.out.println(sb.reverse());
		
		
		
		//문제2> String str = "120101-3012752"; 주민번호를 담고 있는 인스턴스를 생성하고,   ((해독해보자))
		//이 문자열을 이용하여 중간에 삽입된 -를 삭제한 String 인스턴스를 생성해보자.
		//이 문제도 StringBuilder 클래스를 활용해야 한다.
//		String str = "120101301-2752";  //풀이
//		StringBuilder sb=new StringBuilder(str);
//		for(int i=0;i<sb.length();i++) {
//			if(sb.charAt(i)=='-') {
//				sb.deleteCharAt(i); //-삭제완료
//				break; //-삭제후 반복 중단.
//			}
//		}
		String str = "120101301-2752";  //풀이, -찾기
		StringBuilder sb=new StringBuilder(str);
		int idx=sb.lastIndexOf("-");
		if(idx!=-1) {
			sb.deleteCharAt(idx); //-삭제
		}
		str=sb.toString(); 
		System.out.println(str);
		
//		str=sb.toString();
//		System.out.println(str);
	}
}