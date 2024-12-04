package part03;

public class Point {
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPointInfo() {
		System.out.printf("좌표 : (%d, %d)\n", x, y);
	}
}
