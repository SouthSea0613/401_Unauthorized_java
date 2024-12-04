package video;

public class Video {
	
	private int price;
	private int rental;
	
	public Video(int price, int rental) {
		this.price = price;
		this.rental = rental;
	}
	
	public void showInfo(){
		System.out.println("가격: "+price+"원, 대여기간: "+rental+"일" );
	}
}
