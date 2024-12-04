package part3;

public class Point implements UpperPrintable{ //extends Object
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point클래스 x: "+x+", y: "+y;
	}
	
}
