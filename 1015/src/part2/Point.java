package part2;

public class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public Point() {
		// TODO Auto-generated constructor stub
	}
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
	}
	@Override
	public boolean equals(Object obj) {
		Point cmp=((Point)obj);
		if(xPos==cmp.xPos && yPos==cmp.yPos)
			return true;
		return false;
	}
}
