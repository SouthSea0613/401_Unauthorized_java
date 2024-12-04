package part02;

public class Quiz02 {
	public static void main(String[] args) {
		// quiz02. -제거
		String str = "12-3456-987-6543";
		
		// 1. StringBuilder 비사용
		for (String s : str.split("-")) System.out.printf("%s", s);
	}
}
