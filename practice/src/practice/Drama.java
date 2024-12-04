package practice;

public class Drama extends Video {
	private String dTitle;
	private int series;
		
	public Drama(int price, int period, String dTitle, int series) {
		super(price, period);
		this.dTitle = dTitle;
		this.series = series;

	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("가격: "+getPrice()*series);
		System.out.println("드라마 제목: "+dTitle);
		System.out.println("편수: "+series);
	}
}
