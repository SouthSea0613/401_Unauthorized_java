package practice;

public class Movie extends Video {
	private String title;
	
	public Movie(int price, int period, String title) {
		super(price, period);
		this.title = title;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("영화 제목: "+title);
	}
}
