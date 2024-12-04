package part03;

public class Rectangle {
	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	
	public void showRectangle() {
		upperLeft.showPointInfo();
		lowerRight.showPointInfo();
	}
}
