package part3;

public class Ring {

//	private Circle innerCir;
//	private Circle outerCir;
//
//	public Ring (int x, int y, double r, int x1, int y1, double r1) {
//		innerCir = new Circle(x, y, r);
//		outerCir = new Circle(x1, y1, r1);
//	}
//	public Ring(Circle innercir, Circle outercir) {
//		this.innerCir=innerCir;
//		this.outerCir=outerCir;
//		
//	}
//	
//	public void showRingInfo() {
//		System.out.println("inner Circle info...");
//		innerCir.showCircleInfo();
//		System.out.println("outer Circle info...");
//		outerCir.showCircleInfo();
//		
//	}
	private Circle innercir;
	private Circle outercir;
	
	public Ring(int x, int y, double r, int x1, int y1, double r1) {
		innercir=new Circle(x,y,r);
		outercir=new Circle(x1,y1,r1);
	}

	public void showRingInfo() {
		innercir.showCircleInfo();
		outercir.showCircleInfo();
	}
}
