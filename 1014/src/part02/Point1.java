package part02;

// 모든 method는 extends Object 생략되어 있음
public class Point1 extends Object implements UpperPrintable {
	private int x;
	private int y;
	
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Point클래스 x : " + x + ", y : " + y;
	}
}
