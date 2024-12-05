package part2;

public class Rectangle extends Point {//상속
	private Point upperLeft, lowerRight;

	public Rectangle(int x1, int y1, int x2, int y2) {
		//super(); //Point()생성
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	@Override
	public boolean equals(Object obj) {
		Rectangle cmp=((Rectangle)obj);
		if(upperLeft.equals(cmp.upperLeft))
			if(lowerRight.equals(cmp.lowerRight))
				return true;
		return false;
	}
	public void showPosition() {
		System.out.println("직사각형 위치정보...");
		System.out.print("좌 상단: ");
		upperLeft.showPosition();
		System.out.println("");
		System.out.print("우 하단: ");
		lowerRight.showPosition();
		System.out.println("\n");
	}
}
