package part3;


public class Circle {
	private Point center;
	private double radius;

	public Circle(int x, int y, double r) {
		center=new Point(x,y);
		this.radius=r;
	
	}
	public void showCircleInfo() {
		center.showPointInfo();
		System.out.println("반지름 : "+radius);
		
	}
}
	
