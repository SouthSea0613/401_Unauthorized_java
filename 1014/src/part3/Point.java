package part3;

public class Point implements UpperPrintable{ //인터페이스로 마킹
	//인터페이스는 두개이상 구현가능 (다중 구현)
	//같은 인터페이스끼리는 상속가능 extends
	//extends Object ,  
	//기본값 상속값이 안적혀있다면 기본값인 오브젝트가 숨겨져있는것
	private int x,y ;
	
	public Point(int x , int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		
		return "Point 클래스 x : " +x+" , y : "+y;
	}
}
