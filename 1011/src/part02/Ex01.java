package part02;

public class Ex01 {
	public static void main(String[] args) {
		Data data = createInstance(10, 20);
		data.showData();
		
		data.setData1(100);
		data.setData2(200);
		data.showData();
		
		data.setData1(data.getData1() + 1);
		data.setData2(data.getData2() + 1);
		data.showData();
	}

	private static Data createInstance(int data1, int data2) {
		return new Data(data1, data2);
	}
}
