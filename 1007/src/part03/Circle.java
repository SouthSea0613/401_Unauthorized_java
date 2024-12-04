package part03;

public class Circle {
	private Point point;
	private double radius;
	
	public Point getPoint() {
		return point;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public Circle(int x, int y, double radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public void showCircleInfo() {
		point.showPointInfo();
		System.out.printf("반지름 : %.2f\n", radius);
	}
}
