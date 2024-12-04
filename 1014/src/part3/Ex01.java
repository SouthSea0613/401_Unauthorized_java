package part3;

public class Ex01 {
	public static void main(String[] args) {
		showData(new Point(1,2));
		showData(new Point2(10,20));
		
	}
	private static void showData(Object obj) {
		String str = obj.toString();
		if (obj instanceof UpperPrintable) {
			str = str.toUpperCase();
		}
		System.out.println(str);
	}
}