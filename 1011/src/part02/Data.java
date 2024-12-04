package part02;

public class Data {
	private int data1;
	private int data2;
	
	public Data(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public void setData1(int data) {
		data1 = data;
	}
	
	public int getData1() {
		return data1;
	}
	
	public void setData2(int data) {
		data2 = data;
	}
	
	public int getData2() {
		return data2;
	}
	
	public void showData() {
		System.out.printf("data1 : %d\n", data1);
		System.out.printf("data2 : %d\n", data2);
		System.out.printf("\n");
	}
}
