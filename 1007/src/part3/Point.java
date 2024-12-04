package part3;

public class Point {
	private int x;  //0~100
	private int y;  //0~100
	
	

	public int getX() {
		return x;
	}
	public void setX(int x) {
		if(0>x || x>100)
			return;
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if(0>y || y>100)
			return;
		this.y = y;
	}
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	public void showPointInfo() {
		System.out.println("===중심 좌표===");
		System.out.println("x: "+x+", y: "+y);
		
	}

}
