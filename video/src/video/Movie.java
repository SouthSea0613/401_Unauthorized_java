package video;

public class Movie extends Video {
	private String title;
	
	public Movie(int price, int rental, String title) {
		super(price, rental);
		this.title = title;
	}

	@Override
	public void showInfo() {
		System.out.println("영화제목: "+title);
		super.showInfo();
	}
	
}
