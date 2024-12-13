package part01;

@FunctionalInterface //메소드가 1개인 인터페이스
interface HowLong{
	int len(String s);
}
public class Ex05 {
	public static void main(String[] args) {
		HowLong hl = (s) -> s.length();
		System.out.println(hl.len("hello")); //5
		fct(hl, "java");
		hl = retFct();
		System.out.println(hl.len("javaScript"));
	}

	private static HowLong retFct() {
		return (s) -> s.length();
	}

	private static void fct(HowLong hl, String str) {
		System.out.println(hl.len(str)); //4
		
	}
}
