package part03;

public class Ring {
	private Circle inner;
	private Circle outer;
	
	public Ring(int x1, int y1, double radius1, int x2, int y2, double radius2) {
		inner = new Circle(x1, y1, radius1);
		outer = new Circle(x2, y2, radius2);
	}
	
	public Ring(Circle inner, Circle outer) {
		this.inner = inner;
		this.outer = outer;
	}
	
	public Circle getInner() {
		return inner;
	}
	
	public Circle getOuter() {
		return outer;
	}
	
	public void showRingInfo() {
		System.out.printf("inner circle info...\n");
		System.out.printf("중심좌표 : (%d, %d), 반지름 : %.2f\n", getInner().getPoint().getX(), getInner().getPoint().getY(), getInner().getRadius());
		System.out.printf("outer Circle info...\n");
		System.out.printf("중심좌표 : (%d, %d), 반지름 : %.2f\n", getOuter().getPoint().getX(), getOuter().getPoint().getY(), getOuter().getRadius());
	}
}
