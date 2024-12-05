package video;

public class Video {
	private int price;
	private int rentarPeriod;
	public Video (int price , int rentarPeriod) {
		this.price=price;
		this.rentarPeriod=rentarPeriod;
		
	}
	public void showInfo() {
		System.out.println("비디오가격 : " + price +"원");
		System.out.println("대여기간 : " + rentarPeriod +"일");
	}

		
	
}
