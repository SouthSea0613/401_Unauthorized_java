package Part3;

public class Point implements UpperPrintable { //모든 클래스에 부모가 없다면, 눈에 보이지 않는 부모(기본값) = Object
	private int x,y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point클래스 x: " +x+ ", y: " +y;
	}
	
}
