package part3;

public class Rectangle {
	private Point upperLeft;
	private Point lowerRight;

	public Rectangle(int a, int b, int c, int d) {
		upperLeft = new Point(a, b);
		lowerRight = new Point(c, d);
	}
	
	public void showRecInfo() {
		System.out.println("사각형의 좌표는...");
		upperLeft.showPointInfo();
		lowerRight.showPointInfo();
	}
}
