package part3;

public class ShapeTest {
	public static void main(String[] args) {
		Ring ring = new Ring(1, 1, 4.2, 4, 4, 6.5);
		Ring ring2 = new Ring(new Circle(1, 1, 4.2), new Circle(4, 4, 6.5));
		ring.showRingInfo();
		ring2.showRingInfo();
		// inner Circle info..
		// 중심좌표
		// x:1, y:1
		// 반지름 : 4.2
		// outer Circle info...
		// 중심좌표
		// x:4, y:4
		// 반지름 : 6.5
		// Circle cir=new Circle(4,4, 2.5);
		// cir.showCircleInfo();
		// 중심좌표
		// x:4 , y:4
		// 반지름 : 2.5

	}
}
