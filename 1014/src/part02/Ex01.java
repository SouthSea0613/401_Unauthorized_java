package part02;

public class Ex01 {
	private static void showData(Object object) {
		// TODO Auto-generated method stub
		String str = object.toString();
		if(object instanceof UpperPrintable) {
			str = str.toUpperCase();
		}
		System.out.printf("%s\n", str);
	}
	
	public static void main(String[] args) {
		showData(new Point1(1, 2));
		showData(new Point2(10, 20));
	}
}
