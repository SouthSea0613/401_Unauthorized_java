package part3;

public class Ring {
	private Circle inner;
	private Circle outer;
	
	
	public Ring(int inX, int inY, double inR, int outX, int outY, double outR) {
		inner=new Circle(inX,inY,inR);
		outer=new Circle(outX,outY,outR);
		
	}
	public Ring(Circle innerCir, Circle outerCir) {
		this.inner=innerCir;
		this.outer=outerCir;
	}
	public void showRingInfo() {
		System.out.println("inner Circle info..");
		inner.showCircleInfo();
		System.out.println("outer Circle info...");
		outer.showCircleInfo();
		
	}
	

}
