package practice;

public class Video {
	private int price;
	private int period;
		
	public Video(int price, int period) {
		this.setPrice(price);
		this.period = period;
	}
	
	public void showInfo() {
		System.out.println("개 당 가격: "+getPrice());
		System.out.println("대여기간: "+period);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
