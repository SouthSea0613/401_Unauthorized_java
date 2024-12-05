package video;

public class Drama extends Video{
	
	private String title;
	private int totalEp;
	
	public Drama(int price, int rentarPeriod, String title, int totalEp) {
		super(price*totalEp, rentarPeriod);
		this.title=title;
		this.totalEp=totalEp;
		
		
	}
	@Override
	public void showInfo() {
		System.out.println("드라마 제목 : "+title);
		super.showInfo();
		
	}
}
