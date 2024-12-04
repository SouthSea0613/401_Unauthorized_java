package video;

public class Drama extends Video {
	private String title;
	private int total;
	
	public Drama(int price, int rental, String title, int total) {
		super(price * total, rental);
		this.title = title;
		this.total = total;
	}

	@Override
	public void showInfo() {
		System.out.println("드라마 제목: "+title+" 총 편수: "+total);
		super.showInfo();
	}
	
}
